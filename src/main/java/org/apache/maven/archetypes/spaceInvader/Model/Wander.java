package org.apache.maven.archetypes.spaceInvader.Model;

public class Wander implements MovePattern{

	private int left;
	private int right;
	private int dir;
	private int radius = 50;
	
	public Wander(int x) {
		this.left = x-radius;
		this.right = x+radius;
		this.dir = 1;
	}
	

	public double getXDir(double x, double y) {
		if(x>=right) {
			dir = -1;
		}
		else if (x<=left) {
			dir = 1;
		}
		return dir;
	}

	public double getYDir(double x, double y) {
		return 0.1;
	}

}
