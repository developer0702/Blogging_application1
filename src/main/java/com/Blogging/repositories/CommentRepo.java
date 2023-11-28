package com.Blogging.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Blogging.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
