package com.example.medical.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommentRequestDTO {
    @JsonProperty("comment")
    private String comment;

    @JsonProperty("dayofadditing")
    private String dayofadditing;

    public String getComment() {
        return comment;
    }

    public String getDayofadditing() {
        return dayofadditing;
    }
}
