package com.bean;

public class Player 
{
	//Instance Variables
	public int playerId;
	public String playerName;
	public String playerCountry;
	public int playerAge;
	
	//Creating object of PlayerStats Class
	PlayerStats playerStats;
	
	//Constructor
	public Player(int playerId, String playerName, String playerCountry, int playerAge) 
	{
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerCountry = playerCountry;
		this.playerAge = playerAge;
	}

	public Player(int playerId, String playerName, String playerCountry, int playerAge, PlayerStats playerStats) 
	{
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerCountry = playerCountry;
		this.playerAge = playerAge;
		this.playerStats = playerStats;
	}

	//Getter Setter
	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPlayerCountry() {
		return playerCountry;
	}

	public void setPlayerCountry(String playerCountry) {
		this.playerCountry = playerCountry;
	}

	public int getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(int playerAge) {
		this.playerAge = playerAge;
	}

	public PlayerStats getPlayerStats() {
		return playerStats;
	}

	public void setPlayerStats(PlayerStats playerStats) {
		this.playerStats = playerStats;
	}
	
	
	
	
}
