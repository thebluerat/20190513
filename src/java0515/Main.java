package java0515;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		animals 고양이 = new cat();
		animals 멍멍이 = new dog();
		
		System.out.println("품종을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String 품종 = sc.next();
		고양이.cry(품종);
		멍멍이.cry(품종);

	}

}
