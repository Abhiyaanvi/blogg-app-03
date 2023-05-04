package in.abhi_devoloper.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.abhi_devoloper.bindingclasses.LoginForm;
import in.abhi_devoloper.bindingclasses.UserDto;
import in.abhi_devoloper.entities.User;
import in.abhi_devoloper.repositories.UserRepo;
import in.abhi_devoloper.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDto registerUser(UserDto dto) {
	     User user	= mapToEntity(dto);
	     User newUser = userRepo.save(user);
	     return mapToDTO(newUser);
	
	}

    private UserDto mapToDTO(User user){
    	UserDto dto = new UserDto();
    	dto.setId(user.getId());
    	dto.setFirstName(user.getFirstName());
    	dto.setLastName(user.getLastName());
    	dto.setEmailId(user.getEmailId());
    	dto.setPassword(user.getPassword());
        return dto;
    }

    // convert DTO to entity
    private User mapToEntity(UserDto dto){
        User user = new User();
        user.setId(dto.getId());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        user.setEmailId(dto.getEmailId());
        user.setPassword(dto.getPassword());
        return user;
    }
	

}
