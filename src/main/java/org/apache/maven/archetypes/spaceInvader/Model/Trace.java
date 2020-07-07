package org.apache.maven.archetypes.spaceInvader.Model;

import org.apache.maven.archetypes.spaceInvader.Controller.GameBoard;

public class Trace implements MovePattern{
	
	

	public double getXDir(double x, double y) {
		int xp = GameBoard.getGameBoard().getPlayer().getX();
		int yp = GameBoard.getGameBoard().getPlayer().getY();
		double n = ((xp - x)/(Math.sqrt((xp-x)*(xp-x)+(yp-y)*(yp-y))));
		return n;
	}

	public double getYDir(double x, double y) {
		int xp = GameBoard.getGameBoard().getPlayer().getX();
		int yp = GameBoard.getGameBoard().getPlayer().getY();
		double n = ((yp - y)/(Math.sqrt((xp-x)*(xp-x)+(yp-y)*(yp-y))));
		return n;
	}

}
