package com.dto;

//Data Transfer Object : 값 전달 객체, 데이터를 전달해주는 객체, 정보전송 객체
//Value Object
//db table의 row 한개를 저장할 수 있다.
public class MYTestDto {

	private int mno;
	private String mname;
	private String nickname;

	// 기본생성자, 파람 3개짜리 생성자
	public MYTestDto() {

	}

	public MYTestDto(int mno, String mname, String nickname) {
		this.mno = mno;
		this.mname = mname;
		this.nickname = nickname;

	}

	// getter & setter
	public int getMno() {
		return this.mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
}
