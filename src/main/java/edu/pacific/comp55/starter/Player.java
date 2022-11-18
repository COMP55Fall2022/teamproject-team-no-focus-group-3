package edu.pacific.comp55.starter;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.Timer;

import acm.console.Console;
import acm.graphics.GImage;
import acm.graphics.GObject;
import acm.graphics.GRect;

public class Player {

    // For the players image
    private GImage playerIMG;

    // Players current position within window
    private int x, y;

    // the active pressed key
    MoveDirection currentDirection = null;

    // Amount player will move by when key event occurs
    public static final int velocityX = 10;
    public static final int velocityY = 10;

    // Player Constructor
    public Player(int x, int y) {
	this.x = x;
	this.y = y;
	this.playerIMG = new GImage("idle1.png");
	this.playerIMG.setSize(100, 100);
	this.playerIMG.setLocation(x, y);
    }

    public void move(int x, int y) {

	switch (currentDirection) {
	
	case RIGHT:
	    playerIMG.move(x, y);
	    updatePlayerPos();
	    break;
	case LEFT:
	    playerIMG.move(-x, y);
	    updatePlayerPos();
	    break;
	case SPACE:
	    break;

	default:

	}

    }

    public void updatePlayerPos() {
	x = (int) playerIMG.getX();
	y = (int) playerIMG.getY();
    }

    // Setters & Getters
    public int getX() {
	return x;
    }

    public void setX(int x) {
	this.x = x;
    }

    public int getY() {
	return y;
    }

    public void setY(int y) {
	this.y = y;
    }

    public int getVelocityX() {
	return velocityX;
    }

    public int getVelocityY() {
	return velocityY;
    }

    public GObject getImage() {
	return playerIMG;
    }

}