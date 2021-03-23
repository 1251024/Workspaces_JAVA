package com.test01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MTest04 {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress addr = InetAddress.getLocalHost();
		
		System.out.println(addr);
		System.out.println("localhost: "+addr.getHostAddress());
		System.out.println("hostname: "+addr.getHostName());
		
		System.out.println("-----");
		
		InetAddress[] naver = InetAddress.getAllByName("www.naver.com"); //DNS : 도메인 네이밍 서비스
		for (int i = 0; i<naver.length;i++) {
			System.out.println(naver[i].getHostAddress());
			/*
			223.130.195.200		<-IPv4
			223.130.195.95		<-IPv6
			 */
		}
	}
}
