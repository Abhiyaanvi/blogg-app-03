package in.abhi_devoloper.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abhi_devoloper.entities.User;

public interface UserRepo extends JpaRepository<User, Long> {
   
	public User findByEmailIdAndPassword(String emailId,String password);
}
