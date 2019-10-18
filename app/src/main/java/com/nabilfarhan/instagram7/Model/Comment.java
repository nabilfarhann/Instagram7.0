package com.nabilfarhan.instagram7.Model;

public class Comment {

    private String commentId;
    private String comment;
    private String publisher;

    public Comment(String commentId, String comment, String publisher) {
        this.commentId = commentId;
        this.comment = comment;
        this.publisher = publisher;
    }

    public Comment() {
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
