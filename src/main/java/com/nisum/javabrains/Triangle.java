package com.nisum.javabrains;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle {
	
	private Point A;
	private Point B;
	private Point C;
	
	
	
	public Point getA() {
		return A;
	}



	public void setA(Point A) {
		this.A = A;
	}



	public Point getB() {
		return B;
	}



	public void setB(Point B) {
		this.B = B;
	}



	public Point getC() {
		return C;
	}



	public void setC(Point C) {
		this.C = C;
	}



	public void draw() {
		System.out.println(A + " "+ B + " " + C);
	}


	public void myInit() {
		System.out.println("Hey i've been implemented by the Container Explicitly--Init");
	}
	
	public void myDestroy() {
		System.out.println("Hey i've been implemented by the container explicitly--Destroy");
	}

	/*public void afterPropertiesSet() throws Exception {
		System.out.println("Hey i've been executed after the construction method");
	}



	public void destroy() throws Exception {
		System.out.println("Hey i've been executed before the shutdown");
	}*/

	
	
	/*private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	public void draw() {
		for(Point point:points) {
			System.out.println(point);
		}
	}*/
}
