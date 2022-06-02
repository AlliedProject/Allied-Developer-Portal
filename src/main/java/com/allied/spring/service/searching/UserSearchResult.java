package com.allied.spring.service.searching;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import com.allied.spring.web.dto.UserDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserSearchResult {
    private Page<UserDto> userPage;
    private boolean numberFormatException;
	public UserSearchResult(Page<UserDto> userDtoPage, boolean b) {
		// TODO Auto-generated constructor stub
	}
	public UserSearchResult() {
		// TODO Auto-generated constructor stub
	}
	public Page<UserDto> getUserPage() {
		return userPage;
	}
	public void setUserPage(Page<UserDto> userPage) {
		this.userPage = userPage;
	}
	public boolean isNumberFormatException() {
		return numberFormatException;
	}
	public void setNumberFormatException(boolean numberFormatException) {
		this.numberFormatException = numberFormatException;
	}
    
    
    
}
