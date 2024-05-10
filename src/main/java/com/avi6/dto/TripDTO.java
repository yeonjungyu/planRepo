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
	
	private Long memId;
	
	private Long tripId;
	
	private String nickname;

	private String title;
	
	private LocalDateTime startDate, endDate, regDate;
	
	private String place;
	
	private Long mapId;
	
    private String address;
    
    private String addressDetail;
    
    private String locationX;
    
    private String locationY;

}
