import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.*;

import org.apache.maven.archetypes.spaceInvader.Controller.GameBoard;
import org.apache.maven.archetypes.spaceInvader.Model.Medkit;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EasyMockRunner.class)
public class TestGameBoard {
	@TestSubject
	private GameBoard gameBoard=GameBoard.getGameBoard();
	@Mock
	private Medkit medkitMock;
	@Test
	public void testGetMedkit() {
		GameBoard.initializeGame();
		int expectedHP=GameBoard.getGameBoard().getPlayer().getHP()+1;
		GameBoard.getGameBoard().getMedkits().add(medkitMock);
		expect(medkitMock.onCollisionPlayer()).andReturn(true);
		replay(medkitMock);
		GameBoard.getGameBoard().hasMedkit();
		assertEquals(expectedHP,GameBoard.getGameBoard().getPlayer().getHP());
	}
	@Test
	public void testMissMedkit() {
		GameBoard.initializeGame();
		int expectedHP=GameBoard.getGameBoard().getPlayer().getHP();
		GameBoard.getGameBoard().getMedkits().add(medkitMock);
		expect(medkitMock.onCollisionPlayer()).andReturn(false);
		replay(medkitMock);
		GameBoard.getGameBoard().hasMedkit();
		assertEquals(expectedHP,GameBoard.getGameBoard().getPlayer().getHP());
	}

}
