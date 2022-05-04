package com.ezen.ex01;

public class ShadowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Rectangle org = new Rectangle(1, 1, 8, 8);
		Rectangle cpy;
		
		cpy = (Rectangle)org.clone();
		
		org.changePos(3, 3, 7, 7);
		org.showPostion();
		cpy.showPostion();
	}
}
class Rectangle implements Cloneable{
	private Point2 upperLeft;
	private Point2 lowerRight;

	public Rectangle(int x1, int y1, int x2, int y2) {
		upperLeft = new Point2(x1, y1);
		lowerRight = new Point2(x2, y2);
	}
	
	public void changePos(int x1, int y1, int x2, int y2) {
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x1, y1);
	}

	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public void showPostion() {
		System.out.println("좌측상단");
		upperLeft.ShowPosition();
		
		System.out.println("우측상단");
		lowerRight.ShowPosition();
	}
}
class Point2 implements Cloneable{
	private int xPos;
	private int yPos;

	public Point2 (int x, int y) {
		xPos = x; yPos = y;
	}

	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void ShowPosition() {
		//System.out.println("[" + xPos + "," + yPos + "]");
		System.out.printf("[%d, %d]\n", xPos, yPos);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}