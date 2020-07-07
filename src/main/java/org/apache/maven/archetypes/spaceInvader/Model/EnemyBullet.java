package Model;

import javax.swing.ImageIcon;

import Controller.GameBoard;

public class EnemyBullet extends Bullet implements Hostile{
	
	public EnemyBullet(int x, int y, int width, int height,double speed, int damage) {
		super(x, y, width, height,speed, damage);
		// TODO Auto-generated constructor stub
	}


	public void OnCollision(Friendly collider) {
		collider.hitEnemyBullet(this);
		disable();
	}

	


}
