package com.example.medical.controller;

import com.example.medical.entity.Comment;
import com.example.medical.entity.Patient;
import com.example.medical.entity.dto.AddcommentDTO;
import com.example.medical.entity.dto.PatientRequestDTO;
import com.example.medical.entity.dto.PatientResponceDTO;
import com.example.medical.repository.PatientRepository;
import com.example.medical.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RequestMapping("/patient")
@RestController
public class PatientController {
    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService, PatientRepository patientRepository) {
        this.patientService = patientService;
        this.patientRepository = patientRepository;
    }

    private final PatientRepository patientRepository;

    //working
    @RequestMapping(value = "/getid/{id}", method = RequestMethod.GET)
    public PatientResponceDTO getbyid(@PathVariable Long id) {
        return new PatientResponceDTO(patientService.findbyid(id));
    }
    //working
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        patientService.delete(id);
        return "Done";

    }

    //working
    @PutMapping("/editpatient")
    public String editpatient(@RequestBody Patient patient) {
        patientService.update(patient);
        return "Success";
    }

    //working
    @GetMapping("/getall")
    public ResponseEntity<List<Patient>> getAllPateints() {
        final List<Patient> patients = patientService.findall();
        return ResponseEntity.ok(patients);
    }

    //working
    @GetMapping("/getname/{name}")
    public ResponseEntity<List<Patient>> findbyname(@PathVariable String name) {
        final List<Patient> patients = patientService.findbyname(name);
//        final List<Patient> patienttest = patients;
//        System.out.println(patienttest);
//        System.out.println(patients);
        return ResponseEntity.ok(patients);
    }

    //working
    @PutMapping("/addcomment")
    public void addcomment(@RequestBody AddcommentDTO addcommentDTO) {
        patientService.addcomment(addcommentDTO.getPatientId(), addcommentDTO.getComment(), addcommentDTO.getDayofediting());
    }

    //working
    @PostMapping("/create")
    public Long create(@RequestBody PatientRequestDTO patientRequestDTO) {
        return patientService.save(patientRequestDTO.getName(), patientRequestDTO.getSurrname(), patientRequestDTO.getDayofbirth(),patientRequestDTO.getCountry(),
                patientRequestDTO.getState(), patientRequestDTO.getAddress(), patientRequestDTO.getSex(),patientRequestDTO.getComments()
                        .stream().map(commentRequestDTO -> new Comment(commentRequestDTO.getComment(), commentRequestDTO.getDayofadditing()))
                        .collect(Collectors.toList()));
    }
}
