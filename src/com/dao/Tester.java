package com.dao;

import java.sql.SQLException;

public class Tester {

	public static void main(String[] args) throws SQLException 
	{
		daoClass dao=new daoClass();
		System.out.println(dao.fetchPlayerDetailsStats(1001));
	}

}
