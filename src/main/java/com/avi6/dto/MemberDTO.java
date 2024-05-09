package com.avi6.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberDTO {//회원 DTO

	private Long mid;
	
	private String email;
	
	private String nickname;
	
	private String password;
	
	private LocalDateTime regDate;
	
	
}
//고요한 천재123 그럴리가