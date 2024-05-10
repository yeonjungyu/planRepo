package com.avi6.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AuthDTO {

	private String email;
	private String name;
	private boolean fromSocial;
	
	public AuthDTO(String id, String password, boolean fromSocial, Collection<? extends GrantedAuthority> authorities) {
		super();

		this.email = id;
		this.fromSocial = fromSocial;
		
	}
}
