package org.papermarking.papermarking.model.fileModel;

import java.io.InputStream;
import java.util.Date;

public class File {

    private String title;
    private String description;
    private String createdAt;
    private InputStream stream;

    public File(String title, String description, String createdAt, InputStream stream) {
        this.title = title;
        this.description = description;
        this.createdAt = createdAt;
        this.stream = stream;
    }

    public File(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public InputStream getStream() {
        return stream;
    }

    public void setStream(InputStream stream) {
        this.stream = stream;
    }
}
