package edu.pacific.comp55.starter;

import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GObject;
import acm.graphics.GRect;
import acm.graphics.GRoundRect;

public class Map extends GraphicsPane {

    // Floors position 
    public int floorX, floorY;

    // Size of floor
    public static double width, height;
    
    // Constructor
    public Map(MainApplication app) {
	this.floorX = 0;
	this.floorX = 0;
    }
    
    // Method to return a generate a floor
    public GRect createFloor(double floorX, double floorY, double width, double height) {
	return new GRect(floorX, floorY, width, height);
    }
    
    // Abstract method from GraphicsPane
    @Override
    public void showContents() {
	
    }
    // Abstract method from GraphicsPane
    @Override
    public void hideContents() {

    }

    // Setters/Getters
    public double getFloorX() {
	return floorX;
    }

    public double getFloorY() {
	return floorY;
    }

}
