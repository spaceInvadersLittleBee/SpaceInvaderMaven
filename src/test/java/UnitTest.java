import static org.junit.Assert.*;

import org.apache.maven.archetypes.spaceInvader.Controller.GameBoard;
import org.apache.maven.archetypes.spaceInvader.Model.Enemy;
import org.apache.maven.archetypes.spaceInvader.Model.MovePattern;
import org.apache.maven.archetypes.spaceInvader.Model.Trace;
import org.junit.Test;


public class UnitTest {
	@Test
	public void testPlayerShoot() {
		GameBoard.initializeGame();
		int expectedBullet= GameBoard.getGameBoard().getPlayerBullets().size()+1;
		GameBoard.getGameBoard().getPlayer().shoot();
		int observedBullet= GameBoard.getGameBoard().getPlayerBullets().size();
		assertEquals(expectedBullet,observedBullet);
	}
	@Test
	public void testEnemyShoot() {
		int expectedBullet= GameBoard.getGameBoard().getEnemyBullets().size()+1;
		GameBoard.getGameBoard().getEnemies().add(new Enemy(165, 50, 50,50,1, 100,100));
		GameBoard.getGameBoard().getEnemies().forEach(e->e.shoot());
		int observedBullet= GameBoard.getGameBoard().getEnemyBullets().size();
		assertEquals(expectedBullet,observedBullet);
	}
	@Test
	public void testSetMovePattern() {
		Enemy enemy=new Enemy(165, 50, 50,50,1, 100,100);
		MovePattern mp=new Trace();
		enemy.setMovePattern(mp);
		assertEquals(mp,enemy.getMovePattern());
	}
}
