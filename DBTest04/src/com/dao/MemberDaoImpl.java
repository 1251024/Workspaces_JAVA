package com.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.MemberDto;

import static com.common.JDBCTemplate.*;

public class MemberDaoImpl implements MemberDao {

	@Override
	public List<MemberDto> selectList() {
		Connection con = getConnection();

		Statement stmt = null;
		ResultSet rs = null;
		List<MemberDto> list = new ArrayList<MemberDto>();

		try {
			// 3.
			stmt = con.createStatement();

			// 4.
			rs = stmt.executeQuery(SELECT_LIST_SQL);
			// 번호, 이름, 나이 성별, 지역,직업,전화번호, 이메일
			while (rs.next()) {
				MemberDto dto = new MemberDto();
				dto.setM_no(rs.getInt(1));
				dto.setM_name(rs.getString(2));
				dto.setM_age(rs.getInt(3));
				dto.setM_gender(rs.getString(4));
				dto.setM_location(rs.getString(5));
				dto.setM_job(rs.getString(6));
				dto.setM_tel(rs.getString(7));
				dto.setM_email(rs.getString(8));

				list.add(dto);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(stmt);
			close(con);

		}

		return list;
	}

	@Override
	public MemberDto selectOne(int m_no) {// 디비와 연결
		Connection con = getConnection();
		PreparedStatement pstm = null; // PreparedStatement sql 임포트
		ResultSet rs = null;
		MemberDto dto = new MemberDto();

		try {
			// 3.
			pstm = con.prepareStatement(SELECT_ONE_SQL);
			pstm.setInt(1, m_no);

			// 4.실행해서 결과 리턴받아야 함
			rs = pstm.executeQuery();
			while (rs.next()) {
				dto.setM_no(rs.getInt(1));
				dto.setM_name(rs.getString(2));
				dto.setM_age(rs.getInt(3));
				dto.setM_gender(rs.getString(4));
				dto.setM_location(rs.getString("M_LOCATION")); // 순서헷갈리면 이름으로//오타헷갈리면 숫자로
				dto.setM_job(rs.getString(6));
				dto.setM_tel(rs.getString(7));
				dto.setM_email(rs.getString(8));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstm);
			close(con);
		}

		return dto;// null이면 안된다
	}

	// 취업 3일차 천국과 지옥 //회사업무는 샘한테 연락하지 말것 //힘들어도 어떻게든 만들어야한다

	@Override
	public int insert(MemberDto dto) {
		Connection con = getConnection();
		PreparedStatement pstm = null;
		int res = 0;

		try {
			// 3.
			pstm = con.prepareStatement(INSERT_SQL);
			pstm.setString(1, dto.getM_name());
			pstm.setInt(2, dto.getM_age());
			pstm.setString(3, dto.getM_gender());
			pstm.setString(4, dto.getM_location());
			pstm.setString(5, dto.getM_job());
			pstm.setString(6, dto.getM_tel());
			pstm.setString(7, dto.getM_email());

			// 4.

			res = pstm.executeUpdate();
			if (res>0) {
				commit(con);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
			close(con);
		}

		return res;
		//인서트 추가실패하는 경우 멤버다오 인서트에 이상이 없는지 확인하고
		//비즈임플에 return이 0이 아닌지 확인해야한다
		//다오랑 연결해줘야한다
	}

	@Override
	public int update(MemberDto dto) {
		
		//1.
		//2.
		Connection con = getConnection();
		PreparedStatement pstm = null;
		
		int res=0;
		
		try {
			//3.
			// M_NAME=?, M_AGE=?, M_GENDER?, M_LOCATION=?, M_JOB=?, M_TEL=?, M_EMAIL=?  WHERE M_NO =?
			pstm = con.prepareStatement(UPDATE_SQL);	//UPDATE_SQL에 마우스 올리면 물음표가 뭔지 확인 가능
			pstm.setString(1,dto.getM_name());		//첫번째 물음표
			pstm.setInt(2,dto.getM_age());			//두번째 물음표
			pstm.setString(3,dto.getM_gender());	//세번째
			pstm.setString(4,dto.getM_location());	//네번째
			pstm.setString(5,dto.getM_job());		//5번째
			pstm.setString(6,dto.getM_tel());		//6번째
			pstm.setString(7,dto.getM_email());		//7번째
			pstm.setInt(8, dto.getM_no());
			
			//4.
			res=pstm.executeUpdate();
			if(res>0) {
				commit(con);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstm);
			close(con);
		}
		
		return res;
	}

	@Override
	public int delete(int m_no) {//JDBC템플릿에 겟커넥션 메소드에 1,2번 한 결과를 리턴, 만들어진 커넥션객체를 가지고온것

		//1.
		//2.		
		Connection con=getConnection(); 
		//1,2번을 겟커넥션 메소드로 빼놓고 겟커넥션 호출해서 커넥션 콘이라는 객체에 담자
		
		//3.
		PreparedStatement pstm = null;
		int res=0;
		try {
			pstm= con.prepareStatement(DELETE_SQL);
			pstm.setInt(1, m_no);
			//컨트롤러 비즈 다오 통해서
			//디비에 전달하기 직전의 상태
			
			//4.
			res=pstm.executeUpdate();
			if(res>0) {
				commit(con);
				//요청되고 리턴되는 상태
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstm);
			close(con);
		}
		
		
		return res;//다오에서 비즈로 컨트롤러로 리턴
	}

}
