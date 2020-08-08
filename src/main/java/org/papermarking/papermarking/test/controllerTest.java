package org.papermarking.papermarking.test;


import java.io.IOException;
import java.util.List;

import org.papermarking.papermarking.model.fileModel.File;

import org.papermarking.papermarking.service.impl.FileServiceImpl.FileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;


@RestController
@RequestMapping("/test")
public class controllerTest {

    public String type = "pdf";

    @Autowired
    private FileServiceImpl fileService;

    @PostMapping("/files/add")
    public String addFile(@RequestParam("title") String title,@RequestParam("description") String description ,
                           @RequestParam("file") MultipartFile file, Model model) throws IOException {
        String id = fileService.addFile(title,description ,  file , this.type);
        System.out.print("file Id      " + id.toString());
        return "redirect:/videos/" + id;
    }

    @GetMapping("/files/{id}")
    public String getFile(@PathVariable String id, Model model) throws Exception {
        File fileObject = fileService.getFile(id);
        model.addAttribute("title", fileObject.getTitle());
        model.addAttribute("url", "/videos/stream/" + id);
        return "video";
    }

    @GetMapping("/files/stream/{id}")
    public void streamVideo(@PathVariable String id, HttpServletResponse response) throws Exception {
        File fileObject = fileService.getFile(id);
        FileCopyUtils.copy(fileObject.getStream(), response.getOutputStream());
    }

    @GetMapping("/files/del/{id}")
    public void deleteVideo(@PathVariable String id, HttpServletResponse response) throws Exception {

        fileService.deleteFile(id);

    }


    @GetMapping(value = "/")
    public void getAllStudents() {
        System.out.println(java.time.LocalDate.now().toString());
        UserModeltest.userObjectTest();
    }




}