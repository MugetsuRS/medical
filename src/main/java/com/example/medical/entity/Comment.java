package com.example.medical.entity;

import com.example.medical.entity.dto.CommentRequestDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    private Long id;
    private String comment;
    private String dayofadditing;

    public Comment(CommentRequestDTO commentRequestDTO){
        comment = commentRequestDTO.getComment();
        dayofadditing = commentRequestDTO.getDayofadditing();
    }

    public Comment() {
    }

    public Comment(String comment, String dayofadditing) {
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

    @Override
    public String  toString() {
        return "Comment{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", dayofadditing='" + dayofadditing + '\'' +
                '}';
    }
}
