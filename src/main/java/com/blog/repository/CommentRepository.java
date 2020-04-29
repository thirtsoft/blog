package com.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.model.Comment;
import com.blog.model.Post;
import com.blog.model.User;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
	
	List<Comment> findByPost(Post post);
	List<Comment> findAllByUser(User user);

}
