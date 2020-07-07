package Model;

import javax.swing.ImageIcon;

import Controller.GameBoard;

public class Player extends Character implements Friendly{
	
	
	
	public Player(int x, int y, int width, int height,double speed, int HP) {
		super(x, y, width, height, speed, HP);
		this.image = new ImageIcon("assets/Image/PlayerSkin.gif").getImage();
		bulletSpeed = 5;
	}

	@Override
	public void shoot() {
		
		Bullet bullet=new PlayerBullet((int)this.x+25,(int)this.y+25,10, 10,bulletSpeed,100);//≤Œ ˝¥Ê“…
		GameBoard.getGameBoard().getPlayerBullets().add((PlayerBullet) bullet);
	}


	
	public void hitEnemy(Enemy enemy) {
		GameBoard.getGameBoard().endGame();
	}

	
	public void hitEnemyBullet(EnemyBullet enemyBullet) {
		loseHP(enemyBullet.damage);
		GameBoard.getGameBoard().getAudioPlayer().playLoseHpSound();
		if(HP<=0)GameBoard.getGameBoard().endGame();
	}

	


}
