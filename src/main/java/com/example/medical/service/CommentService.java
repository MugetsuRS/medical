package com.example.medical.service;

import com.example.medical.entity.Comment;
import com.example.medical.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment getByid(Long id){
        return commentRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("Patient with id: " + id + " not found"));
    }

    public Long editcomment (Comment comment){
        return commentRepository.save(comment).getId();
    }
}
