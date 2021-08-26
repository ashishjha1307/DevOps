package com.training.classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	ObjectInputStream oIn = new ObjectInputStream(new FileInputStream("emp.ser"));
	
	Employee emp = (Employee) oIn.readObject();
	System.out.println(emp);
}
catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
catch (ClassNotFoundException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
}

	

	}


