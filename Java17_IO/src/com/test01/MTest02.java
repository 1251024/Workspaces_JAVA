package com.test01;

import java.io.File;

public class MTest02 {

	public static void main(String[] args) {
		File fi = new File("c:\\");
		prnList01(fi);
		prnList02(fi);
	}

	//java.base.io.file
	public static void prnList02(File fi) {
		//파일과 디렉토리를 구분해서 출력하자.
		//filse:swapfile.sys
		//dir:Program Files
		//...
		//폴더의 갯수 :0개
		//파일의 갯수 :0개
		int fileCount=0;
		int dirCount=0;
		
		System.out.println(" ------dir / file 구분------");
		for(File f:fi.listFiles()) {
			if(f.isDirectory()) {
				System.out.println("dir : "+f.getName());
				dirCount++;
			}else if(f.isFile()){
				System.out.println("file:"+f.getName());
				fileCount++;
			}
		}
		System.out.println("-------------");
		System.out.println("file의 갯수:"+fileCount);
		System.out.println("dir의 갯수:"+dirCount);
	}
	
	
	
	public static void prnList01(File fi) {
		for (String list:fi.list()) {
			System.out.println("list - "+list);	//폴더 리스트가 나옴
		}
	}
}
