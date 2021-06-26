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

    public Optional<Comment> getByid(final Long id){
        return commentRepository.findById(id);
    }

//    public List<Comment> getAll (){
//        final List<Comment> comments =commentRepository.findAll();
//        return  comments;
//    }
}
