package com.avi6.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class boardDTO {

	private Long bno;

	private String title;

	private String content;

	private String nickname;

	private LocalDateTime regDate;

	private LocalDateTime modDate;

	private int replyCount;

}
