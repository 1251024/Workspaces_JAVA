package com.dao;

import java.util.List;

import com.dto.MemberDto;

public interface MemberDao {	//다오 인터페이스

	//상수로 넣어놓는다. //앞뒤로 띄어쓰기 중요중요!! //에러남
	String SELECT_LIST_SQL=" SELECT M_NO, M_NAME, M_AGE, M_GENDER, M_LOCATION, M_JOB, M_TEL, M_EMAIL "
						  + " FROM TB_MEMBER "
						  +" ORDER BY M_NO DESC";
	//최근 입력한 순서대로 출력
	
	
	String SELECT_ONE_SQL=" SELECT M_NO, M_NAME, M_AGE, M_GENDER, M_LOCATION, M_JOB, M_TEL, M_EMAIL "
						 + " FROM TB_MEMBER "
						 +" WHERE M_NO =? ";
	//내가 원하는 애 전체 출력해올꺼야
	
	
	String INSERT_SQL=" INSERT INTO TB_MEMBER "
					 +" VALUES(MEMBERSEQ.NEXTVAL, ?, ?, ?, ?, ?, ?, ?) ";
	
	String UPDATE_SQL=" UPDATE TB_MEMBER "
					 +" SET M_NAME=?, M_AGE=?, M_GENDER=?, M_LOCATION=?, M_JOB=?, M_TEL=?, M_EMAIL=? "//얘네를 바꿀거야
			//java.sql.SQLSyntaxErrorException: ORA-00927: missing equal sign
			//구문이 잘못되었음 =을 누락함,  M_GENDER=?에서 =빠졌었음..
					 + " WHERE M_NO =? ";	//요조건에 맞는애들의 
	//다오임플로 가서
	
	
	String DELETE_SQL=" DELETE FROM TB_MEMBER "
					 +" WHERE M_NO =? ";
	
	
	//메소드 선언
	//인터페이스에 메소드선언하면 편함 
	
	public List<MemberDto> selectList();
	public MemberDto selectOne(int m_no);
	public int insert(MemberDto dto);
	public int update(MemberDto dto);
	public int delete(int m_no);
}
