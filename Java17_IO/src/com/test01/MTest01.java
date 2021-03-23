package com.test01;

import java.io.File;
import java.io.IOException;

public class MTest01 {
	//자바에서 윈도우 운영체제의 폴더를 생성할 수도 있다.
	public static void main(String[] args) {

		// mac:/Users/계정/test_io
		File fi = new File("C:/test_io"); 	// 윈도우는 역슬래시로 잡는데 슬래시도 잡아줌
											// 슬래시로 해야함, 역슬래시 쓸경우 역슬래시 두개\\
		if (fi.exists()) {
			System.out.println("exists");
		} else {
			System.out.println("make directory");	//directory=folder
			fi.mkdirs();							//실행버튼을 누르면 폴더가 생긴다.
		}											
		
		//fi 안에(밑에) AA라는 folder(directory) 생성
		File fiAA= new File(fi, "AA");		//AA폴더 생성
		fiAA.mkdir();
		
		File fiBB= new File("C:\\test_io","BB");		//BB폴더 생성
		fiBB.mkdir();
		//윈도우에서는 역슬래시가 구분자,  \하나만하면 이스케이프가 되어버림
		
		//AA밑에 a.txt 파일 생성
		File aTxt=new File(fiAA,"a.txt");
		
		try {
			//checked exception : java.io는 컴파일단계에서 반드시 예외처리해야하는 예외
			//ioException
			//io=input, output
			aTxt.createNewFile();
		} catch (IOException e) {

			e.printStackTrace();
		}	//Unhandled exception type IOException ->try를 누른다
		
	}
}
