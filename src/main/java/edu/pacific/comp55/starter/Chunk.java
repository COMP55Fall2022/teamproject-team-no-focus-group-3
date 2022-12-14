package edu.pacific.comp55.starter;

import acm.graphics.GImage;
import acm.graphics.GRect;
import acm.graphics.GRoundRect;

public class Chunk {

	private GImage backgroundIMG;
	private GImage chunkIMG;
	private GImage spikeIMG;
	private GRect chunkGRect;
	private char name;
	private int left;
	private int right;
	private int up;
	private int down;
	

	// Constructor
	public Chunk(char chunkName, String path, int chunkX, int chunkY, int width, int height) {
		name = chunkName;
		left = chunkX - width;
		right = chunkX;
		up = chunkY - height;
		down = chunkY;
		this.backgroundIMG = new GImage(path, chunkX, chunkY);
		this.backgroundIMG.setSize(width, height);

		this.chunkIMG = new GImage(path, chunkX, chunkY);
		this.chunkIMG.setSize(width, height);

		this.spikeIMG = new GImage(path, chunkX, chunkY);
		this.spikeIMG.setSize(width, height);

	}

	// Getters
	public GImage getbackgroundIMG() {
		return backgroundIMG;
	}

	public GImage getChunkIMG() {
		return chunkIMG;
	}
	
	public GRect getChunkGRect() {
		return chunkGRect;
	}

	public GImage getspikeIMG() {
		return spikeIMG;
	}
	
	public int getRight() {
		return right;
	}
	public int getLeft() {
		return left;
	}
	public int getUp() {
		return up;
	}
	public int getDown() {
		return down;
	}
	
	public char getID() {
		return name;
	}
	
}
