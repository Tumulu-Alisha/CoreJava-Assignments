package com.java.org;

abstract class Persistence {
	
	abstract void persist();
}

class FilePersistence extends Persistence{
	
	void persist() 
	{
		System.out.println("FilePersistence");	
	}
}

class DataPersistence extends Persistence{

	void persist()
	{
		System.out.println("DataPersistence");
	}
}

 class client{
	
	public static void main(String[] args) {
		
		Persistence p= new FilePersistence();
		p.persist();
		
		Persistence p2= new DataPersistence();
		p2.persist();
	}
}

