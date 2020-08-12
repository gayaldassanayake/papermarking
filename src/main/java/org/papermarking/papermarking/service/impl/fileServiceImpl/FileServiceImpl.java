package org.papermarking.papermarking.service.impl.fileServiceImpl;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.bson.types.ObjectId;
import org.papermarking.papermarking.model.fileModel.File;
import org.papermarking.papermarking.service.fileServices.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private GridFsTemplate gridFsTemplate;

    @Autowired
    private GridFsOperations operations;

    public String addFile(String title,String description , MultipartFile file , String type)  throws IOException {

        DBObject metaData = new BasicDBObject();
        metaData.put("type", type);
        metaData.put("title", title);
        metaData.put("description", description);
        metaData.put("createdAt", java.time.LocalDate.now().toString());
        ObjectId id = gridFsTemplate.store(
                file.getInputStream(), file.getName(), file.getContentType(), metaData);
        return id.toString();
    }

    public File getFile(String id) throws IllegalStateException, IOException,NullPointerException {
        com.mongodb.client.gridfs.model.GridFSFile file = gridFsTemplate.findOne(new Query(Criteria.where("_id").is(id)));
        File fileObject = new File();
        assert file != null;
        assert file.getMetadata() != null;
        fileObject.setTitle(file.getMetadata().get("title").toString());
        fileObject.setDescription(file.getMetadata().get("description").toString());
        fileObject.setCreatedAt(file.getMetadata().get("createdAt").toString());
        fileObject.setStream(operations.getResource(file).getInputStream());
        return fileObject;
    }

    public int deleteFile(String id) throws  IOException{
        gridFsTemplate.delete(new Query(Criteria.where("_id").is(id)));
        return 1;
    }



}
