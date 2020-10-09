package com.nacre.ofd.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	
	//class level variables
	private static String driverName = null;
	private static String url = null;
	private static String userName = null;
	private static String password = null;
	public static Connection getDBConnection() {
		DBConnection db = null;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			db = new DBConnection();
			db.readPropFile();
			Class.forName(driverName);
			con = DriverManager.getConnection(url, userName, password);
		} catch(Exception se) {
			se.printStackTrace();
		}
		return con;
	}
	//properties file reader
	public void readPropFile() throws IOException {
		
		Properties p = null;
		InputStream is = null;
		
		String fileName = "com/nacre/ofd/config/db.properties";
		
		p = new Properties();
		is = this.getClass().getClassLoader().getResourceAsStream(fileName);
		if(is != null) {
			p.load(is);
		}
		driverName = p.getProperty("driverName");
		url = p.getProperty("url");
		userName = p.getProperty("userName");
		password = p.getProperty("password");
	}
}
