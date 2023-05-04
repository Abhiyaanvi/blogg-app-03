package in.abhi_devoloper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abhi_devoloper.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment, Long>{

}
