package com.example.medical.controller;
import com.example.medical.entity.Comment;
import com.example.medical.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RequestMapping("/comment")
@RestController
public class CommentContoller {
    private final CommentService commentService;

    @Autowired
    public CommentContoller(CommentService commentService) {
        this.commentService = commentService;
    }

    //working
    @GetMapping("/byid/{commentId}")
    public ResponseEntity<Comment> getbyid (@PathVariable final Long commentId){
        final Comment comment = commentService.findbyid(commentId);

        return ResponseEntity.ok(comment);
    }
    //working
    @PutMapping("/someedit")
    public void editcomment (@RequestBody Comment comment){
        commentService.editcomment(comment);
    }

}
