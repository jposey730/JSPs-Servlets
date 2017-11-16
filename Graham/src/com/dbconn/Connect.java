package com.dbconn;

import java.sql.*;
import javax.swing.*;
public class Connect {
	Connection con=null;
		public static Connection dbConnector(){
			try{
				Class.forName("org.sqlite.JDBC");
				Connection conn=DriverManager.getConnection("jdbc:sqlite:/Users/jposey730/login.sqlite");
				return conn;
				
				
			}catch(Exception e){
				
				JOptionPane.showMessageDialog(null, "Sorry, there was a connection error.");
				return null;
			}
			
		}
	
}