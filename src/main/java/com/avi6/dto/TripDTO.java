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
public class TripDTO {//여행계획 DTO
	
	private Long mid;
	
	private String nickname;

	private String title;
	
	private LocalDateTime startDate, endDate, regDate;
	
	private String place;
	
}
