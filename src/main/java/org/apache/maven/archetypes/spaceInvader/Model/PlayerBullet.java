package org.apache.maven.archetypes.spaceInvader.Model;

import org.apache.maven.archetypes.spaceInvader.Controller.GameBoard;

public class PlayerBullet extends Bullet implements Friendly{
	
	public PlayerBullet(int x, int y, int width, int height,double speed, int damage) {
		super(x, y, width, height,speed, damage);
		// TODO Auto-generated constructor stub
	}


	public void hitEnemy(Enemy enemy) {
		enemy.loseHP(damage);
		disable();
		GameBoard.getGameBoard().addScore(enemy.getValue());
		GameBoard.getGameBoard().getAudioPlayer().playHitSound();
	}


	public void hitEnemyBullet(EnemyBullet enemyBullet) {
		disable();
		
	}

}
