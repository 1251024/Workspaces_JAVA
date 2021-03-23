package com.test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MTest05 {

	public static void main(String[] args) {
		File fi = new File("b.txt");

		MyOutput(fi);
		MyInput(fi);

	}

	private static void MyInput(File fi) {		//try, catch,finally와 조금 다르게 try with resources는 
		//try with resources						//try(FileReader fr = new FileReader(fi)){내용을 알아서 자동으로 클로즈해줌
		try(FileReader fr = new FileReader(fi)){	//try catch는 무조건 열었으면 닫아줘야함
			int ch;
			while ((ch= fr.read()) != -1) {
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void MyOutput(File fi) {
		FileWriter fw = null;

		try {
			fw = new FileWriter(fi, true);
			fw.write("다시 연습합니다.");
			fw.append("abc\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
