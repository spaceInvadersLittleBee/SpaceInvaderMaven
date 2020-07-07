package org.apache.maven.archetypes.spaceInvader.Controller;

import java.io.File;

import javax.sound.sampled.*;

public class AudioPlayer {

	private Clip bulletSound;
	// private Clip levelUpSound = new File("src/main/resources/levelUpSound.wav");
	private Clip deathSound;
	private Clip loseHpSound;
	private Clip bonusSound;
	private Clip backgroundMusic;

	public AudioPlayer() {
		try {
			AudioInputStream s = AudioSystem.getAudioInputStream(new File("assets/SoundEffect/BGM.wav"));
			backgroundMusic = AudioSystem.getClip();
			backgroundMusic.open(s);
			AudioInputStream s2 = AudioSystem.getAudioInputStream(new File("assets/SoundEffect/bulletSound.wav"));
			bulletSound = AudioSystem.getClip();
			bulletSound.open(s2);
			AudioInputStream s3 = AudioSystem.getAudioInputStream(new File("assets/SoundEffect/deathSound.wav"));
			deathSound = AudioSystem.getClip();
			deathSound.open(s3);
			AudioInputStream s4 = AudioSystem.getAudioInputStream(new File("assets/SoundEffect/loseHPSound.wav"));
			loseHpSound = AudioSystem.getClip();
			loseHpSound.open(s4);
		} catch (Exception e) {

		}

	}

	public boolean isPlayingbgm() {
		return backgroundMusic.isActive();
	}

	public void playbgm() {
		try {
			AudioInputStream s = AudioSystem.getAudioInputStream(new File("assets/SoundEffect/BGM.wav"));
			backgroundMusic = AudioSystem.getClip();
			backgroundMusic.open(s);
			backgroundMusic.setFramePosition(0);
			backgroundMusic.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void stopMusic() {
		backgroundMusic.stop();
	}

	public void playShootSound() {
		try {
			bulletSound.setFramePosition(0);
			bulletSound.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void playDeathSound() {
		try {
			deathSound.setFramePosition(0);
			deathSound.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void playHitSound() {
		try {
			AudioInputStream s = AudioSystem.getAudioInputStream(new File("assets/SoundEffect/bonusSound.wav"));
			bonusSound = AudioSystem.getClip();
			bonusSound.open(s);
			bonusSound.setFramePosition(0);
			bonusSound.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void playLoseHpSound() {
		try {
			loseHpSound.setFramePosition(0);
			loseHpSound.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
