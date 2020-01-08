package lop1k.com.test;

import java.util.Scanner;

import lop1k.com.model.Circle;

public class testCircle {
public static void main(String[] args) {
	
	int n,i;
	System.out.print("Nhập vào số lượng hình tròn: "); 
	Circle[] danhSachCircle ;
	n= new Scanner(System.in).nextInt();
	danhSachCircle = new Circle[n];
	for (i=0;i<n;i++) {
		System.out.println("Hình tròn "+(i+1));
		System.out.print("x = ");
		int x = new Scanner(System.in).nextInt();
		System.out.print("y = ");
		int y = new Scanner(System.in).nextInt();
		System.out.print("Bán kính r = ");
		double radius = new Scanner(System.in).nextDouble();
		Circle circle = new Circle(x, y, radius);
		danhSachCircle[i]= circle;	
	}
	for (i=0;i<n;i++) {
		System.out.println("Hình tròn"+ (i+1) + danhSachCircle[i]);
	}
}
}
