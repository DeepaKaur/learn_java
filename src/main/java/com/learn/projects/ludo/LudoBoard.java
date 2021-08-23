package com.learn.projects.ludo;

public class LudoBoard {
	private int boardposition = 100;

	public void displayBoard() {
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.format("%02d", boardposition--);
				System.out.print(" ");
			}
			System.out.println();
		}
		boardposition = 100;
	}

	public void updateDisplay(Player p1) {
		int playerposition = p1.getCurrentPosition();
	
		Ladder l1 = new Ladder();
		playerposition = l1.checkifLadder(playerposition);
		p1.setCurrentPosition(playerposition);
		
		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if(playerposition == boardposition) {
					System.out.print(p1.getName());
					boardposition--;
					playerposition = 0;
				}
				else {
				System.out.format("%02d", boardposition--);
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		boardposition = 100;
	}
}
