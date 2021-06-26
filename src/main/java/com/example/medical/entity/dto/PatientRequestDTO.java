package com.example.medical.entity.dto;

import com.example.medical.entity.Comment;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PatientRequestDTO {
    @JsonProperty("name")
    private String name;

    @JsonProperty("surrname")
    private String surrname;

    @JsonProperty("dayofbirth")
    private String dayofbirth;

    @JsonProperty("country")
    private String country;

    @JsonProperty("state")
    private String state;

    @JsonProperty("address")
    private String address;

    @JsonProperty("sex")
    private String sex;

    @JsonProperty("comments")
    private List<CommentRequestDTO> comments;

    public String getName() {
        return name;
    }

    public String getSurrname() {
        return surrname;
    }

    public String getDayofbirth() {
        return dayofbirth;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getAddress() {
        return address;
    }

    public String getSex() {
        return sex;
    }

    public List<CommentRequestDTO> getComments() {
        return comments;
    }
}
