package com.my.spring.web.ch03.ex02;

import lombok.Data;
//mybatis에서 매핑할때 쓰일것이다.
@Data
public class User {
	private String username;
	private int age;
	private String faceFilename;
}
