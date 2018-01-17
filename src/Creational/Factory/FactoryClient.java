package Creational.Factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryClient {
	public static void main(String[] args) {
		System.out.println("Enter your choice");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String choice=""; 
		try {
			choice=(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
Bakery b = (Bakery)new Factory().getInstance(choice);
System.out.println(b.serveItem());
/*
b = (Bakery)new Factory().getInstance(choice);
System.out.println(b.serveItem());*/
	}
}
