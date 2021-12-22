package com.htd.setterinject;

public class FootballPlayer implements player{
	private String football;
	private FootballBoots boots;

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("I am Playing with "+football+" football and "+boots+" boots.");
	}

	public void setFootball(String football) {
		this.football = football;
	}

	public void setBoots(FootballBoots boots) {
		this.boots = boots;
	}
	
}
