package com.example.medical.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddcommentDTO {
    @JsonProperty("patientId")
    private Long patientId;

    @JsonProperty("comment")
    private String comment;

    @JsonProperty("dayofediting")
    private String dayofediting;

    public Long getPatientId() {
        return patientId;
    }

    public String getComment() {
        return comment;
    }

    public String getDayofediting() {
        return dayofediting;
    }
}
