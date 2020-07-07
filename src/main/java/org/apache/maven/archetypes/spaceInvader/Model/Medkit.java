package org.apache.maven.archetypes.spaceInvader.Model;

import java.awt.Image;

public interface Medkit {
	public void disable();	
	public boolean isEnabled();	
	public int getX();
	public int getY();	
	public int getWidth();	
	public int getHeight();
	public double getSpeed();
	public Image getImage();
	public boolean onCollisionPlayer();
}
