package in.abhi_devoloper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abhi_devoloper.entities.Post;

public interface PostRepo  extends JpaRepository<Post, Long> {

}
