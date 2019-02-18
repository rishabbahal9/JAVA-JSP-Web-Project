package com.bean;

public class PlayerStats 
{
	//Instance Variables
	public int playerStatsId;
	public int totalMatches;
	public int totalRuns;
	public int highestScore;
	public int averageScore;
	public int playerId;
	
	//Constructors
	public PlayerStats(int playerStatsId, int totalMatches, int totalRuns, int highestScore, int averageScore,
			int playerId) 
	{
		super();
		this.playerStatsId = playerStatsId;
		this.totalMatches = totalMatches;
		this.totalRuns = totalRuns;
		this.highestScore = highestScore;
		this.averageScore = averageScore;
		this.playerId = playerId;
	}

	
	//Getter Setters
	public int getPlayerStatsId() {
		return playerStatsId;
	}

	public void setPlayerStatsId(int playerStatsId) {
		this.playerStatsId = playerStatsId;
	}

	public int getTotalMatches() {
		return totalMatches;
	}

	public void setTotalMatches(int totalMatches) {
		this.totalMatches = totalMatches;
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	public int getHighestScore() {
		return highestScore;
	}

	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}

	public int getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(int averageScore) {
		this.averageScore = averageScore;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	
	
	
}
