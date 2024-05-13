package com.avi6.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import jakarta.persistence.Column;
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

	private String title;
	
	private String address;
	
	private String addressDetail;
    
    private String locationX;
    
    private String locationY;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Member member;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Map map;
	
	
	@CreatedDate
	@Column(name = "startdate")//수정금지, 컬럼명은 regdate로 설정
	private LocalDateTime startDate;
	
	@LastModifiedDate
	@Column(name = "enddate")
	private LocalDateTime endDate;
	

}
