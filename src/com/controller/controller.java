package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Player;
import com.service.serviceClass;




@WebServlet("/controller")
public class controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public controller() 
    {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		serviceClass service=new serviceClass();
		String s=request.getParameter("action");
		
		if(s.equalsIgnoreCase("view"))
		{
			System.out.println("View");
			
			ArrayList<Player> playerList=new ArrayList<>();
			
			playerList=service.fetchPlayerDetails();
			request.setAttribute("playerList", playerList);
			RequestDispatcher rd=request.getRequestDispatcher("nameView.jsp");
			rd.forward(request, response);
		}
		else if(s.equalsIgnoreCase("playerSubmit"))
		{
			System.out.println("PlayersSubmit");
			System.out.println(request.getParameter("playersDropDown"));
			
			Player p; 
			
			p=service.fetchPlayerDetailsStats(Integer.parseInt(request.getParameter("playersDropDown")));
			
			request.setAttribute("p", p);
			RequestDispatcher rd=request.getRequestDispatcher("detailsView.jsp");
			rd.forward(request, response);
		}
		
		else if(s.equalsIgnoreCase("update"))
		{
			System.out.println("update");
			System.out.println(request.getParameter("playerId"));
			
			Player p; 
			
			p=service.fetchPlayerDetailsStats(Integer.parseInt(request.getParameter("playerId")));
			
			request.setAttribute("p", p);
			RequestDispatcher rd=request.getRequestDispatcher("updateForm.jsp");
			rd.forward(request, response);
		}
		else if(s.equalsIgnoreCase("updateValues"))
		{
			System.out.println("UpdateValues");
			
			boolean status=false;
			status=service.updateStats(Integer.parseInt(request.getParameter("totalMatches")),Integer.parseInt(request.getParameter("totalRuns")),Integer.parseInt(request.getParameter("highestScore")),Integer.parseInt(request.getParameter("playerId")));
			
			request.setAttribute("status", status);
			RequestDispatcher rd=request.getRequestDispatcher("updateSuccess.jsp");
			rd.forward(request, response);
		}
		else if(s.equalsIgnoreCase("home"))
		{
			System.out.println("home");
			
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.forward(request, response);
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		doGet(request, response);
	}

}
