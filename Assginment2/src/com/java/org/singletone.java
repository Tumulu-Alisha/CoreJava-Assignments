package com.java.org;

class Database {
	   private static Database db;

	   private Database() {      
	   }
	   
	   public static Database getInstance() {
	      if(db == null) {
	         db = new Database();
	      }
	       return db;
	   }

	   public void getConnection() {
	       System.out.println("You are now connected to the database.");
	   }
	}

	class Main {
	   public static void main(String[] args) {
	      Database db1;
	      db1= Database.getInstance(); 
	      db1.getConnection();
	   }
	}