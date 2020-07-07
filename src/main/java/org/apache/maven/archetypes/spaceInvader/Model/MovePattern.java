package org.apache.maven.archetypes.spaceInvader.Model;

public interface MovePattern {
	double getXDir(double x, double y);
	double getYDir(double x, double y);
}
