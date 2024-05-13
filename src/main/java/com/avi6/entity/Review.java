package com.avi6.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
@Table(name = "t_review")
public class Review {//댓글 Entity
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long reviewNum;
	
	private int reviewCount;
	
	private String text;//리뷰 내용
	
	private int grade;//평점
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Member member;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Trip trip;
	
	public void setText(String text) {
		this.text = text;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
