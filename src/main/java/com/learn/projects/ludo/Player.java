package com.learn.projects.ludo;

import java.util.Random;

public class Player {
	public Player(String name, int currentPosition) {
		super();
		this.name = name;
		this.currentPosition = currentPosition;
	}

	private String name;
	private int currentPosition;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int playTurn() {
		Random r1 = new Random();
		int num = r1.nextInt(5) + 1;
		return num;
	}

	public int getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}
}
