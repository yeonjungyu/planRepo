package com.avi6.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
public class TripAuthMember {

	@Id
	private String email;
	
	private String password;
	
	private String name;
	
	private boolean fromSocial;
	
	//Set 을 이용해서 Role 을 적용하도록 선언함.
	//이 객체의 부분셋으로만 사용하도록 설정함.
	@ElementCollection(fetch = FetchType.LAZY)
	@Builder.Default
	Set<TripMemberRole> roleSet = new HashSet<>();
	
	//set 에 Role 을 add 하는 메서드 정의
	public void addRole(TripMemberRole role) {
		roleSet.add(role);
	}
}
