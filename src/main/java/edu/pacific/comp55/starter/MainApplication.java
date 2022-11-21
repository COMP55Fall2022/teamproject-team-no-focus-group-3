package edu.pacific.comp55.starter;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import javafx.beans.binding.When;

import java.awt.*;
import java.awt.event.*;

import org.apache.commons.math3.random.ISAACRandom;

public class MainApplication extends GraphicsApplication {

    public static final int WINDOW_WIDTH = 1440;
    public static final int WINDOW_HEIGHT = 850;
    public static final String MUSIC_FOLDER = "sounds";
    private static final String[] SOUND_FILES = { "wesbrook.mp3" };

    private MainGame mainGame;
    private MenuPane menu;
    private SettingsPane settings;
    private PausePane pause;
    private Level level;
    private int count;

    public void init() {
	setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    public void run() {
	level = new Level(this, 1);
	mainGame = new MainGame(this);
	menu = new MenuPane(this);
	settings = new SettingsPane(this);
	pause = new PausePane(this, level);
	setupInteractions();
	switchToMenu();
    }

    // Start Screen
    public void switchToMenu() {
	count++;
	switchToScreen(menu);
    }

    public void switchToLevel() {
	switchToScreen(level);
	playRandomSound();
	
    }

    public void switchToSettings() {
	switchToScreen(settings);
    }
    
    public void switchToPause() {
    	switchToScreen(pause);
        }

    private void playRandomSound() {
	AudioPlayer audio = AudioPlayer.getInstance();
	audio.playSound(MUSIC_FOLDER, SOUND_FILES[count % SOUND_FILES.length]);
    }
    
    public void stopRandomSound() {
    	
    }

    public static void main(String[] args) {
	new MainApplication().start();
    }
}
