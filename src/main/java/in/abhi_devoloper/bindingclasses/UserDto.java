package in.abhi_devoloper.bindingclasses;

import lombok.Data;

@Data
public class UserDto {
	private long id;
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
}
