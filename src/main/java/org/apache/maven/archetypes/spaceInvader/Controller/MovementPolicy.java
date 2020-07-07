package org.apache.maven.archetypes.spaceInvader.Controller;

import org.apache.maven.archetypes.spaceInvader.Model.Trace;

public class MovementPolicy {
	
	public void configure(GameBoard gameBoard) {
		if(gameBoard.getNumberOfTrace()==0) {
			int n = new java.util.Random().nextInt(gameBoard.getEnemies().size());
			gameBoard.getEnemies().get(n).setMovePattern(new Trace());
			gameBoard.tracePlus();
		}
	}

}
