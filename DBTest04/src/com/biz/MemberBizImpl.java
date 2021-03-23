package com.biz;

import java.util.List;

import com.dao.MemberDao;
import com.dao.MemberDaoImpl;
import com.dto.MemberDto;

public class MemberBizImpl implements MemberBiz {
	
	private MemberDao dao=new MemberDaoImpl();
	//밑에 채우기가 숙제

	@Override
	public List<MemberDto> selectList() {
		return dao.selectList();
	}

	@Override
	public MemberDto selectOne(int m_no) {
		return dao.selectOne(m_no);//m_no 전달
	}

	@Override
	//주소값을 dto가 가지고있고
	public int insert(MemberDto dto) {
		//M_GENDER에 들어있는 값을 대문자로 바꾸자.
		//dto.setM_gender(dto.getM_gender().toUpperCase());	//아래 두줄과 같은 내용
		String upperGender=dto.getM_gender().toUpperCase();
		dto.setM_gender(upperGender);
		//값을 가지고와서 저장해주자//다오한테 전달
		
		//컨트롤러에서 비즈를 통해서 다오를 통해서 db를 가져오고
		//비즈(연산/처리)와 다오(디비연결)는 모델
		//데이터베이스에 값을 저장해야하는데 특정값을 대문자로 바꿔주는 처리를 해준 것임
		//비즈는 Service 소비자에게 제공하는것 , 서비스로 부르고 비즈라고 씀 
		//두닯정도 지나면 세미프로젝트21.01.13기준
		//모델 뷰 컨트롤러로 짤라서하는것인데 그중 모델인 비즈에서 대문자로 바꿔주는 처리한것
		
		return dao.insert(dto);
		//추가실패하는 경우 여기가 0이 아닌지 확인해야한다
	}

	@Override
	public int update(MemberDto dto) {
		
		dto.setM_gender(dto.getM_gender().toUpperCase());
		/* 같은것
		 String upperGender=dto.getM_gender().toUpperCase();
		 dto.setM_gender(upperGender);
		 */	
		
		return dao.update(dto);
	}

	@Override
	public int delete(int m_no) {
		return dao.delete(m_no);
	}
	

}
//공부하는 방법
/*
 될때까지 한글자 한글자 치는 것
 반복해서 계속 쓰기 헬로월드했던거처럼
 class Hello{
 public static void main (String[]args){
 }
 }
 쓰면서 주석달기
 요청할땐 어쩌구저쩌구
 응답할댄 어쩌구저쩌구
 
 문제만 보고 복사해서 붙여넣고
 치다 보면 된다...
 '''''
 
 */
