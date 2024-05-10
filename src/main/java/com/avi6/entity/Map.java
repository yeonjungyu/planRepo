package com.avi6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Map {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long mapId;
	
    private String locationX;
    
    private String locationY;
    
    private String address;
    
    private String addressDetail;
    
    private String planImage;
}
