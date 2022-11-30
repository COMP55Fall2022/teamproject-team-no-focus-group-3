package edu.pacific.comp55.starter;

import java.awt.Color;
import java.awt.event.KeyEvent;

import javax.swing.Timer;

import acm.console.Console;
import acm.graphics.GImage;
import acm.graphics.GObject;
import acm.graphics.GRect;

public class Player {

	private final int jumpHeight = 60;
	private int jumpStep = 0;

	// For the players image
	private GImage playerIMG;

	/* Key movement flags */
	private boolean isJumping = false;
	private boolean isRightStep = false;
	private boolean isLeftStep = false;

	// Players current position within window
	private int x, y;

	// the active pressed key
	public MoveState moveState = null;

	// Amount player will move by when key event occurs
	public static final int velocityX = 10;
	public static final int velocityY = 10;

	private final int PLAYER_WALK_VELOCITY = 5;

	// Player Constructor
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		playerIMG = new GImage("idle1.png");
		playerIMG.setSize(100, 100);
		playerIMG.setLocation(x, y);
	}

	public void move(double x1, double y1) {

//	switch (moveState) {
//
//	case RIGHT:
//	    playerIMG.move(x, y);
//	    break;
//	case LEFT:
//	    playerIMG.move(-x, y);
//	    break;
//	case SPACE:
//	    playerIMG.move(x, -y);
//	    break;
//	case SPACE_LEFT:
//	    break;
//	case SPACE_RIGHT:
//	    break;
//	case RIGHT_STOP:
//	    playerIMG.move(x, y);
//	    break;
//
//	default:

//	}
		playerIMG.setLocation(x + x1, y + y1);
		
		System.out.println("inside move functon");

		updatePlayerPos();

	}

//	public void releaseKeyFlags() {
//		isJumping = false;
//		isLeftStep = false;
//		isRightStep = false;
//	}
//
//	public void setMoveState(MoveState direction) {
//		moveState = direction;
//	}
//
	public void updatePlayerPos() {
		x = (int) playerIMG.getX();
		y = (int) playerIMG.getY();
	}

	/*
	 * 
	 * Setters & Getters
	 * 
	 */
//	public boolean isJumping() {
//		return isJumping;
//	}
//
//	public void setJumping(boolean isJumping) {
//		this.isJumping = isJumping;
//	}
//
//	public boolean isRightStep() {
//		return isRightStep;
//	}
//
//	public void setRightStep(boolean isRightStep) {
//		this.isRightStep = isRightStep;
//	}
//
//	public boolean isLeftStep() {
//		return isLeftStep;
//	}
//
//	public void setLeftStep(boolean isLeftStep) {
//		this.isLeftStep = isLeftStep;
//	}
//
//	public int getX() {
//		return x;
//	}
//
//	public void setX(int x) {
//		this.x = x;
//	}
//
//	public int getY() {
//		return y;
//	}
//
//	public void setY(int y) {
//		this.y = y;
//	}
//
//	public int getVelocityX() {
//		return velocityX;
//	}
//
//	public int getVelocityY() {
//		return velocityY;
//	}

	public GObject getImage() {
		return playerIMG;
	}

	public GImage getplayerIMG() {
		return playerIMG;
	}

	public void setPlayerImage(String img) {
		GImage newIMGImage = new GImage(img);
		this.playerIMG = newIMGImage;
	}

}