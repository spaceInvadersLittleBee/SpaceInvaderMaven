package Model;

public abstract class Character extends GameObject{
	
	protected int HP;
	protected int bulletSpeed;

	public Character(int x, int y, int width, int height, double speed,int HP) {
		super(x, y, width, height, speed);
		this.HP = HP;
	}

	public int getHP() {
		return HP;
	}

	public void loseHP(int hP) {
		HP -= hP;
	}
	
	public abstract void shoot();

}
