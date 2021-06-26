package com.example.medical.entity.dto;

import com.example.medical.entity.Comment;

public class CommentResponceDTO {
    private Long id;
    private String comment;
    private String dayofadditing;

    public CommentResponceDTO (Comment comments){
        id = comments.getId();
        comment = comments.getComment();
        dayofadditing = comments.getComment();
    }

    public CommentResponceDTO(Long id, String comment, String dayofadditing) {
        this.id = id;
        this.comment = comment;
        this.dayofadditing = dayofadditing;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDayofadditing() {
        return dayofadditing;
    }

    public void setDayofadditing(String dayofadditing) {
        this.dayofadditing = dayofadditing;
    }
}
