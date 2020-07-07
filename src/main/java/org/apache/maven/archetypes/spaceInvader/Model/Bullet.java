package Model;

import java.awt.Graphics;

import javax.swing.ImageIcon;

public abstract class Bullet extends GameObject{
	protected int damage;
	public Bullet(int x, int y, int width, int height,double speed, int damage) {
		super(x, y, width,height, speed);
		this.damage = damage;
		this.image = new ImageIcon("assets/Image/bullet.png").getImage();
	}

	
}
