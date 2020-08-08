package org.papermarking.papermarking.model.userModel;

import org.springframework.data.annotation.Id;

public class PaperMarker {
    @Id
    private String id;
    private String instituteName;
    private String position;
    private double rating;
    private double priority;
    private int submissionNumber;
    private int averageResultDate;
    /*

    */

    public PaperMarker(String id , String instituteName, String position, double rating, double priority, int submissionNumber, int averageResultDate) {
        this.id = id;
        this.instituteName = instituteName;
        this.position = position;
        this.rating = rating;
        this.priority = priority;
        this.submissionNumber = submissionNumber;
        this.averageResultDate = averageResultDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPriority() {
        return priority;
    }

    public void setPriority(double priority) {
        this.priority = priority;
    }

    public int getSubmissionNumber() {
        return submissionNumber;
    }

    public void setSubmissionNumber(int submissionNumber) {
        this.submissionNumber = submissionNumber;
    }

    public int getAverageResultDate() {
        return averageResultDate;
    }

    public void setAverageResultDate(int averageResultDate) {
        this.averageResultDate = averageResultDate;
    }
}
