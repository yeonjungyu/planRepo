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
public class ReviewDTO {//리뷰 DTO

	private Long reviewNum;
	
	//read.html 에 parameter 로 오기 때문에 매핑만 하면 됨.
	private Long mno;
	
	//member id
	private Long mid;
	
	private String nickname;
	
	private String email;
	
	private int grade;
	
	private String text;
	
	private LocalDateTime regDate, modDate;
	
}
