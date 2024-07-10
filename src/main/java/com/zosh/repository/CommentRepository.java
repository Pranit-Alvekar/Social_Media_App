package com.zosh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.support.Repositories;

import com.zosh.models.Comment;

public interface CommentRepository extends JpaRepository <Comment, Integer> {

	
	
}
