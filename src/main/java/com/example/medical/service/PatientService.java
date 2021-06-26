package com.example.medical.service;

import com.example.medical.entity.Comment;
import com.example.medical.entity.Patient;
import com.example.medical.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient getById (Long patientid){
        return patientRepository.findById(patientid)
                .orElseThrow(() -> new IllegalStateException("Patient with id: " + patientid + " not found"));
    }

    public Long save (String name, String surrname, String dayofbirth, String country, String state, String address, String sex, List<Comment> comments){
        Patient patient = new Patient(name, surrname, dayofbirth, country, state, address, sex,comments);

        return patientRepository.save(patient).getId();
    }

    public void delete (Long patientid){
        patientRepository.deleteById(patientid);
    }

    public Long update (Patient patient){
        return patientRepository.save(patient).getId();
    }

    public List<Patient> getByName(String name){
        final List<Patient> patients = patientRepository.findPatientsByName(name);

        return patients;
    }

    public List<Patient> getAll (){
        final List<Patient> patients = patientRepository.findAll();
        return patients;
    }
}
