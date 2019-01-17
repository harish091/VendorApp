package com.app.controller;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			
			System.out.println(1/0);
		}
		catch(Error e){
			
			System.out.println("111");
		}
		catch(Exception e){
			
			System.out.println("112221");
		}

catch(Throwable e){
			
			System.out.println("11223321");
		}
	}

}
