package com.nisum.javabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Circle implements Shape {
	
	private Point center;
	
	

	public Point getCenter() {
		return center;
	}


	@Autowired
	@Qualifier("a")
	public void setCenter(Point center) {
		this.center = center;
	}

	
	public void postCon() {
		
		System.out.println("QWERTYUIOP");
		
	}
	
	public void preDes() {
		System.out.println("QWERTYU");
	}

	public void draw() {
		System.out.println();
		System.out.println("Circle Draw method-->" + center);
	}

}
