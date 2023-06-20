package com.cindytech.iautoservice.utils;

public class Sound {
	
	AudioThread audio = new AudioThread();
	
	private final String start = "resource/sound/start.wav";
	private final String welcome = "resource/sound/welcome.wav";
	private final String login = "resource/sound/correct.wav"; 
	private final String click = "resource/sound/hit-sound.wav";
	private final String shutdown = "resource/sound/shutdown.wav";
	private final String error = "resource/sound/error-call-to-attention.wav";
	private final String errorSystem = "resource/sound/windows-error-sound-effect.wav";
	
	public Sound() {}

	public String getStart() {
		return start;
	}
	
	public String getWelcome() {
		return welcome;
	}

	public String getLogin() {
		return login;
	}

	public String getClick() {
		return click;
	}

	public String getShutdown() {
		return shutdown;
	}
	
	public String getError() {
		return error;
	}
	
	public String getSystemError() {
		return errorSystem;
	}

	
	public synchronized void playSound(String sound) {
		audio.run(sound);
	}
	
	public synchronized void stopSound() {
		audio.stopClip();
	}


}
