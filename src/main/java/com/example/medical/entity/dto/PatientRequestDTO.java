package com.example.medical.entity.dto;

import com.example.medical.entity.Comment;

import java.util.List;

public class PatientRequestDTO {
    private String name;
    private String surrname;
    private String dayofbirth;
    private String country;
    private String state;
    private String address;
    private String sex;
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
