package com.example.medical.entity.dto;

import com.example.medical.entity.Patient;

import java.util.List;
import java.util.stream.Collectors;

public class PatientResponceDTO {
    private Long id;
    private String name;
    private String surrname;
    private String dayofbirth;
    private String country;
    private String state;
    private String address;
    private String sex;
    private List<CommentResponceDTO> comment;

    public PatientResponceDTO (Patient patient){
        id = patient.getId();
        name = patient.getName();
        surrname = patient.getSurrname();
        dayofbirth = patient.getDayofbirth();
        country = patient.getCountry();
        state = patient.getState();
        address = patient.getAddress();
        sex = patient.getSex();
        comment = patient.getComments().stream()
                .map(CommentResponceDTO::new).collect(Collectors.toList());
    }

    public PatientResponceDTO(Long id, String name, String surrname, String dayofbirth, String country, String state, String address, String sex, List<CommentResponceDTO> comment) {
        this.id = id;
        this.name = name;
        this.surrname = surrname;
        this.dayofbirth = dayofbirth;
        this.country = country;
        this.state = state;
        this.address = address;
        this.sex = sex;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurrname() {
        return surrname;
    }

    public void setSurrname(String surrname) {
        this.surrname = surrname;
    }

    public String getDayofbirth() {
        return dayofbirth;
    }

    public void setDayofbirth(String dayofbirth) {
        this.dayofbirth = dayofbirth;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<CommentResponceDTO> getComment() {
        return comment;
    }

    public void setComment(List<CommentResponceDTO> comment) {
        this.comment = comment;
    }
}
