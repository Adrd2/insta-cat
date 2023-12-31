package com.example.instacat.repository;
import com.example.instacat.entity.Comment;
import com.example.instacat.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByPost(Post post);

   Optional<Comment> findAllByIdAndUserId(Long postId, Long userId);

}


