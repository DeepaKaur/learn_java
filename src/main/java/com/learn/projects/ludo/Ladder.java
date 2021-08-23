package com.learn.projects.ludo;

public class Ladder {
	private int [] ladderstart = {1,2,3,4,5,6};
	private int [] ladderend = {10,15,20,25,30,35};

	public int checkifLadder(int playerposition)
	{
		int counter = 0;
		for(int x : this.ladderstart) {
			if(x == playerposition) {
				playerposition =  this.ladderend[counter];
				System.out.println("yeh!!!ladder!!! Now I go to : " + playerposition);
			}
			counter++;
		}
		return playerposition;
	}
	
	
}
