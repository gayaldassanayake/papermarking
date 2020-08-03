package org.papermarking.papermarking.service.FileServices;

import org.papermarking.papermarking.model.fileModel.File;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {

    String addFile(String title, String description , MultipartFile file , String type) throws IOException;

    File getFile(String id) throws IOException;

    int deleteFile(String id) throws IOException;

}
