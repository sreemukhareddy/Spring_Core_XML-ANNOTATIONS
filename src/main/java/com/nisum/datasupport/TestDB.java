package com.nisum.datasupport;

public class TestDB {
	
	public static void main(String[] args) {
		
		Circle circle= new CircleDAOimpl().getCircle(1);
		System.out.println(circle);
		
	}

}
