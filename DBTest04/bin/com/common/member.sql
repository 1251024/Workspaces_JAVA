--실행은 하나씩 선택해서alt + x

DROP TABLE TB_MEMBER;
DROP SEQUENCE MEMBERSEQ;

CREATE SEQUENCE MEMBERSEQ;

--번호, 이름, 나이, 성별, 지역, 하는일, 전화번호, 이메일
CREATE TABLE TB_MEMBER(
	M_NO NUMBER PRIMARY KEY,
	M_NAME VARCHAR(20) NOT NULL,
	M_AGE NUMBER NOT NULL,
	M_GENDER VARCHAR(2) CHECK(M_GENDER IN ('M','F')) NOT NULL,
	M_LOCATION VARCHAR2(50),
	M_JOB VARCHAR2(20),
	M_TEL VARCHAR2(20),
	M_EMAIL VARCHAR2(20)
);

INSERT INTO TB_MEMBER
VALUES(MEMBERSEQ.NEXTVAL, '관리자',100,'M','서울', '건물관리자','010-1111-1111','ADMIN@ADMIN.COM')
	--번호 자동으로 올라가게 하려고 시퀀스로 만들어 놓은것임, 번호 지정안할라고 MEMBERSEQ.NEXTVAL해놓음
	--'M'이 중요!! / 대소문자 구분해서 MF만 들어가게 되어있음 / M을 소문자로 바꿔줘야함 (컨트롤러에서)
	
SELECT M_NO, M_NAME, M_AGE, M_GENDER, M_LOCATION, M_JOB, M_TEL, M_EMAIL
FROM TB_MEMBER;

SELECT MEMBERSEQ.NEXTVAL, MEMBERSEQ.CURRVAL FROM DUAL;