package com.cindytech.iautoservice.utils;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class AudioThread extends Thread {
	private Clip clip;

	public void run(String sound) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(sound));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);

			clip.start();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	public void stopClip() {
		
		
		if (clip != null && clip.isRunning()) {
			clip.stop();
			clip.close();
		}
	}
}
