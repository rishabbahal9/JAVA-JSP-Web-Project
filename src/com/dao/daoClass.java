package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Player;
import com.bean.PlayerStats;
import com.util.DatabaseUtil;

public class daoClass 
{
	public ArrayList<Player> fetchPlayerDetails() throws SQLException
	{
		ArrayList<Player> playerList=new ArrayList<>();
		
		Connection con=null;
		con=DatabaseUtil.getConnection();
		
		String query="SELECT * FROM Player_1440512";
		
		PreparedStatement ps=null;
		ps=con.prepareStatement(query);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			Player p=new Player(rs.getInt(1), rs.getString(2),  rs.getString(3), rs.getInt(4));
			playerList.add(p);
		}
		
		return playerList;
	}
	
	public Player fetchPlayerDetailsStats(int playerId) throws SQLException
	{
		Player p=null;
		Connection con=null;
		con=DatabaseUtil.getConnection();
		
		String query="SELECT * FROM Player_1440512 P INNER JOIN Player_Stats_1440512 PS ON P.PlayerId=PS.PlayerId WHERE P.PlayerId=?";
		
		PreparedStatement ps=null;
		ps=con.prepareStatement(query);
		ps.setInt(1,playerId);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			PlayerStats playerStats=new PlayerStats(rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10));
			p=new Player(rs.getInt(1), rs.getString(2),  rs.getString(3), rs.getInt(4),playerStats);
		}
		
		return p;
	}
	
	public boolean updateStats(int totalMatches,int totalRuns,int highestScore,int playerId) throws SQLException
	{
		boolean status=false;
		
		Connection con=null;
		con=DatabaseUtil.getConnection();
		
		String query="UPDATE Player_Stats_1440512 SET TotalMatches=?,TotalRuns=?,HighestScore=?,AverageScore=? WHERE PlayerId=?";
		
		PreparedStatement ps=null;
		ps=con.prepareStatement(query);
		ps.setInt(1,totalMatches);
		ps.setInt(2,totalRuns);
		ps.setInt(3,highestScore);
		ps.setInt(4,totalRuns/totalMatches);
		ps.setInt(5,playerId);
		int i=ps.executeUpdate();
		
		if(i>0)
		{
			status=true;
		}
		
		return status;
	}
	
}
