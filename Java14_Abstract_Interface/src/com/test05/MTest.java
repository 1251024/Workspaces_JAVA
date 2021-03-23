package com.test05;

import java.net.Socket;

public class MTest {

	public static void main(String[] args) {
		TV ig = new IgTV(); 						// ig tv 구매
		System.out.println(ig.volumeUp()); 			// 1
		System.out.println(ig.volumeUp()); 			// 2
		System.out.println(ig.volumeUp()); 			// 3
		System.out.println(ig.volumeUp()); 			// 4

		System.out.println(ig.volumeDown());		// 3
		System.out.println(ig.volumeDown()); 		// 2
		System.out.println(ig.volumeDown()); 		// 1
		System.out.println(ig.volumeDown()); 		// 0

		TV samsong = new SamsongTV(); 				// SamsongTV 구매
		System.out.println(samsong.volumeUp()); 	// 3
		System.out.println(samsong.volumeUp());		// 6
		System.out.println(samsong.volumeDown());	// 3
		System.out.println(samsong.volumeDown()); 	// 0
	}
}
