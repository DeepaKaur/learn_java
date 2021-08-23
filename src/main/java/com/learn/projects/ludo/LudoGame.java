package com.learn.projects.ludo;

public class LudoGame {

	public static void PlayGame() {
		Player p1 = new Player("P1", 0);
		LudoBoard b1 = new LudoBoard();
		String name = p1.getName();
		System.out.println("Welcome to Ludo " + name);
		int num = 0;
		b1.displayBoard();

		takeTurn(p1);
		b1.updateDisplay(p1);

		takeTurn(p1);
		b1.updateDisplay(p1);

	}

	public static void takeTurn(Player p1) {
		int num = p1.playTurn();
		System.out.println("Player got : " + num);
		int playerposition = p1.getCurrentPosition() + num;
		p1.setCurrentPosition(playerposition);
	}

	public static void main(String[] args) {

		PlayGame();
	}

}
