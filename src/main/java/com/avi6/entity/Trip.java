package com.avi6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
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
public class Trip extends BaseEntity {//여행 계획 Entity
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long tripId;
	
	private String place;
	
	private String nickname;

	private String title;
	
	private String address;
	
	private String addressDetail;
    
    private String locationX;
    
    private String locationY;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Member member;

}
