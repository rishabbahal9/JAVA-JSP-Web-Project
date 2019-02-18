package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Player;
import com.dao.daoClass;

public class serviceClass 
{
	public ArrayList<Player> fetchPlayerDetails()
	{
		ArrayList<Player> playerList=new ArrayList<>();
		
		//Creating object to dao
		daoClass dao=new daoClass();
		
		try {
			playerList=dao.fetchPlayerDetails();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return playerList;
	}
	
	public Player fetchPlayerDetailsStats(int playerId)
	{
		Player p=null;
		
		//Creating object to dao
		daoClass dao=new daoClass();
		
		try {
			p=dao.fetchPlayerDetailsStats(playerId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p;
	}
	
	public boolean updateStats(int totalMatches,int totalRuns,int highestScore,int playerId)
	{
		boolean status=false;
		//Creating object to dao
		daoClass dao=new daoClass();

		try {
			status=dao.updateStats(totalMatches, totalRuns, highestScore, playerId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
}
