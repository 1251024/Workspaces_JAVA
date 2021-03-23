package com.test02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MTest {

	public static void main(String[] args) throws IOException {
		
		String file = "a.jpg";
		//IO는 연속적인 데이터의 흐름
		/*
		FileInputStream fi = new FileInputStream(file);
		BufferedInputStream bi = new BufferedInputStream(fi);
		*/
		
		//위의 두줄을 한줄로		//BufferedStream 뭉텅이로 가져올때 사용
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));//Input, 파일을 가져오는 것
		
		FileOutputStream fo = new FileOutputStream(new File("c.jpg"));//Output, 가져온파일로 새로운 파일을 만듦
		
		int a = 0;
		while((a = bi.read()) != -1){	//하나씩 가져오는 것
			fo.write(a);
		}
		
		//가장 마지막에 연결한 객체를 가장 먼저 닫자!!
		fo.close();	//Output Stream부터 닫자
		bi.close();
		
	}
}
