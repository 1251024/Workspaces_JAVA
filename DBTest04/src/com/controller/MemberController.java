package com.controller;

import java.util.List;
import java.util.Scanner;

import com.biz.MemberBiz;
import com.biz.MemberBizImpl;
import com.dto.MemberDto;

public class MemberController {

	private static Scanner sc= new Scanner(System.in);
	
	public static int getMenu() {
		int select = 0;
		
		StringBuffer sb= new StringBuffer();
		sb.append("**********\n")
		  .append("*1.전체출력*\n")
		  .append("*2.선택출력*\n")
		  .append("*3.추   가*\n")
		  .append("*4.수   정*\n")
		  .append("*5.삭   제*\n")
		  .append("*6.종   료*\n")
		  .append("**********\n")
		  .append("input select: ");
		System.out.println(sb);
		select = sc.nextInt();
		
		return select;

		
	}
	
	
	public static void main(String[] args) {
		int select = 0;
		MemberBiz biz = new MemberBizImpl();
		//타입 변수 = 값;
		
		while (select != 6 ) {
			select=getMenu();
			
			switch(select) {
			case 1:
				List<MemberDto>selectList=biz.selectList();
				for(MemberDto dto:selectList) {
					System.out.println(dto);
				}
				break;
				
				
				//선택출력// mno받으면 컨트롤러 -비즈-다오에서 디비에 연결 /다오에서는 디티오를 담아주고 디티오를 출력
			case 2:
				System.out.println("출력할 번호:");
				int selectM_no = sc.nextInt();
				MemberDto selectOne = biz.selectOne(selectM_no);
				System.out.println(selectOne);//dto에 투스트링을 오버라이드해줬기때문에 출력 //지정해주지않으면 멤버객체의 주소값 리턴
				break;
				
				
				//인서트할 차례	//시퀀스로 넣을것임 //여기서 입력받으면 담아주는 트럭이 dto
			case 3:
				System.out.println("추가할 이름 : ");
				String insertName= sc.next();
				System.out.println("추가할 나이:");
				int insertAge=sc.nextInt();
				System.out.println("추가할 성별(M or F):");
				String insertGender=sc.next();
				System.out.println("추가할 위치:");
				String insertLocation = sc.next();
				System.out.println("추가할 직업:");
				String insertJob=sc.next();
				System.out.println("추가할 전화번호:");
				String insertTel=sc.next();
				System.out.println("추가할 이메일:");
				String insertEmail=sc.next();
				
				MemberDto insertDto = new MemberDto(0, insertName, insertAge,insertGender,insertLocation,insertJob,insertTel,insertEmail);
													//m_no는 시퀀스를 쓰기때문에 무슨 숫자를 넣어도 상관없어서 0으로 넣어둠
				
				int insertRes=biz.insert(insertDto);
				if(insertRes>0) {
					System.out.println("추가성공");
				}else {
					System.out.println("추가실패");
				}
				break;
			case 4://가져오는건 jsp서블릿 할대하기
				System.out.println("수정할 번호:");
				int updateNo=sc.nextInt();
				System.out.println("수정할 이름 : ");
				String updateName= sc.next();
				System.out.println("수정할 나이:");
				int updateAge=sc.nextInt();
				System.out.println("수정할 성별(M or F):");
				String updateGender=sc.next();
				System.out.println("수정할 위치:");
				String updateLocation = sc.next();
				System.out.println("수정할 직업:");
				String updateJob=sc.next();
				System.out.println("수정할 전화번호:");
				String updateTel=sc.next();
				System.out.println("수정할 이메일:");
				String updateEmail=sc.next();
				
				//비즈로 전달해줘야하니까 dto가 필요				
				MemberDto updateDto = new MemberDto(updateNo, updateName, updateAge, updateGender, updateLocation, updateJob, updateTel, updateEmail);
													//여기서 오류나면 멤버 dto에 파라미터 8개짜리 생성자 잘있는지 확인하기
				int updateRes=biz.update(updateDto);
				if(updateRes>0) {
					System.out.println("수정성공");
				}else {
					System.out.println("수정실패");
				}
				break;
				
			case 5:
				//컨트롤러 -비즈-다오-통해서 디비에 삭제해달라고-다오에서 디비에다가 삭제요청하는 쿼리는 딜리트 프롬 tb_멤버 웨어 mno
				System.out.println("삭제할 번호");
				int deleteNo=sc.nextInt();		//입력해준값 받을것
				int deleteRes=biz.delete(deleteNo);	//딜리트로 전달해줄것
				//웨어언더바 mno전달해주는 쿼리
				//디비는 삭제된 로우의 계수를 리턴
				//딜리트했을때 인트가 리턴되게 함
				
				if(deleteRes>0) {			//전달해준값이 0보다 크면 성공 , 아니면 실패
					System.out.println("삭제성공");
				}else {
					System.out.println("삭제실패");
				}
				break;
			case 6:
				break;
			}
		}
		System.out.println("프로그램 종료...");

	}
}
