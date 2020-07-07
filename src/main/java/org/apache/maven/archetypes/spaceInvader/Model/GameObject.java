package Model;

import java.awt.Image;
import java.util.List;

import javax.swing.ImageIcon;

public abstract class GameObject {
	
	protected double x;
	protected double y;
	protected boolean enabled;
	protected int width;
	protected int height;
	protected double speed;
	protected Image image;
	
	public GameObject(int x, int y, int width, int height, double speed) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.speed = speed;
		this.enabled = true; 
	}
	
	public void disable() {
		enabled = false;
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	
	public int getX() {
		return (int)x;
	}
	
	public int getY() {
		return (int)y;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	public double getSpeed() {
		return speed;
	}
	public Image getImage() {
		return image;
	}
	
	public void moveDir(double xDir, double yDir) {
		x = x+xDir*speed;
		y = y+yDir*speed;
	}
	
	//TODO
	public void detectCollision(GameObject obj) {
		
			if((x+width>=obj.getX()&&x<=obj.getX()+obj.getWidth())&&(y+height>=obj.getY()&&y<=obj.getY()+obj.getHeight())) {
				((Hostile) obj).OnCollision((Friendly)this);
			}
		
		
	}
	
	

}
