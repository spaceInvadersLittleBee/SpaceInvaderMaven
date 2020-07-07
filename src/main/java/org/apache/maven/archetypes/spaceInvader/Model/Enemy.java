package org.apache.maven.archetypes.spaceInvader.Model;

import java.awt.Toolkit;

import javax.swing.ImageIcon;

import org.apache.maven.archetypes.spaceInvader.Controller.GameBoard;

public class Enemy extends Character implements Hostile{
	private int value;
	private MovePattern movePattern;
	
	public Enemy(int x, int y, int width, int height, double speed,int HP, int value) {
		super(x, y, width, height, speed,HP);
		this.value = value;
		movePattern = new Wander(x);
		this.image = new ImageIcon("assets/Image/alien1Skin.gif").getImage();
		bulletSpeed = 3;
	}
	public int getValue() {
		return value;
	}

	@Override
	public void shoot() {
		Bullet bullet=new EnemyBullet((int)this.x+30,(int)this.y+100,10, 10,bulletSpeed,1);
		GameBoard.getGameBoard().getEnemyBullets().add((EnemyBullet) bullet);
		
	}

	public void OnCollision(Friendly collider) {
		collider.hitEnemy(this);
		if(movePattern instanceof Trace)GameBoard.getGameBoard().traceMinus();
		disable();
		if(HP<=0) {
			
		}
	}
	
	public void move() {
		moveDir(movePattern.getXDir(x, y),movePattern.getYDir(x, y));
	}
	
	public void setMovePattern(MovePattern movePattern) {
		this.movePattern = movePattern;
	}

	

	
	

}
