package com.jojoldu.book.springboot.web.dto;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter //선언된 모든 변수의 get메소드 생성
@RequiredArgsConstructor //선언된 모든 변수의 생성자 생성
public class HelloResponseDTO {
    private final String name;
    private final int amount;
}
