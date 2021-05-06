package com.test01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MTest03 {

	public static void main(String[] args) {
		
		File fi = new File("a.txt");	//경로 없으면 해당 디렉토리
		//code기준(code가 나일 경우)
		//output:파일에 내용을 자바가 써서 내보내는 것
		//input :자바로 읽어들이는 것
		
		try {	//예외처리해주기
		MyOutput(fi);
		MyInput(fi);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	private static void MyInput(File fi) throws IOException {
		FileInputStream fin = new FileInputStream(fi); //code에서 file로 흘러나간다.
		int res = 0;	
		
		//file의 내용 끝 = -1
		while ((res=fin.read()) != -1) { 	//read 메소드가 하나하나 가져오는 것
											//파일에서 가져오는데 가져온값을 res에 저장
											//더이성 가져올게 없으면 -1이 아닐때까지 리턴하는것
			System.out.println((char)res);
			
		}
		fin.close();
	}
	
	//throws:해당 메소드 내부에서 발생할 수 있는 예외를, 메소드 호출하는 곳으로 위임
	//throw: 예외를 발생
	//throws:예외를 던짐(호출하는 놈한테)
	//IOException이 FileNotFoundException보다 큼
	//자바.io패키지는 거의 다 체크드 익셉션
	
	/*
	stream:흐름
	기본은 byte가 나간다 들어온다.
	나 code<->a.txt
	inputstream : 들어오는 흐름
	outputstream : 나가는 흐름
	*/
	private static void MyOutput(File fi) throws IOException {	
		FileOutputStream fo = new FileOutputStream(fi);
		
		for(int i= 65 ; i < 91 ; i++) {	//코드기준 byte가 기본, 65라는 byte라서 (아스키코드)변환해준것
			fo.write(i);	//입출력에 대한 예외처리 해주기
							//write메소드는 파일에 글씨써주는 메소드
							
		}
		
		//반드시!!!
		fo.close();
		
	}
}
