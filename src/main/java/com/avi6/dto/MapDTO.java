package com.avi6.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MapDTO {

	private Long mapId;
	
    private String locationX;
    
    private String locationY;
    
    private String address;
    
    private String addressDetail;
    
    private String planImage;
}
