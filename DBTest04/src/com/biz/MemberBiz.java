package com.biz;

import java.util.List;

import com.dto.MemberDto;

public interface MemberBiz {
	
	public List<MemberDto>selectList();//DB에서 가져와서 테이블이 리턴됨, 한줄한줄이 dto에 저장 
	
	//21.01.12 오늘 공부할것
	//컨트롤러 모델 
	//비즈역할 다오 역할
	//값이 리턴되는것
	//파라미터와 리턴타입 알아야함

	public MemberDto selectOne(int m_no);
	public int insert(MemberDto dto);
	public int update(MemberDto dto);
	public int delete(int m_no);
}
