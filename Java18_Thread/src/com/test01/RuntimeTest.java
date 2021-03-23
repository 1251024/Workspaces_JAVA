package com.test01;

import java.io.IOException;

public class RuntimeTest {

	public static void main(String[] args) {
		Runtime rt= Runtime.getRuntime();//싱글톤으로 만들어져있음
	
		try {
			//mac : 
			//String[]path = {"/usr/bin/open", "-a","/Applications/fileName.app"}
			//Process prc = rt.exe(path);
			Process prc = rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");	//크롬창 뜸
			//Process																					//("notepad.exe")실행하면 메모장 뜸
			Process prs = rt.exec("notepad.exe");	
		} catch (IOException e) {

			e.printStackTrace();
		}
			
		
	}
}
