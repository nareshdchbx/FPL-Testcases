package com.utilities;

import java.util.Random;

public class BusinessMethods {
	
	public static String getRandomNumber(int x){
		
		Random rand = new Random(); 
		String val="";
		for(int i=1;i<=x;i++){
			val=String.valueOf(val+rand.nextInt(9));
		}	
		return val;
	}
	
	static String randomString(int len){
		final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 Random rnd = new Random();
		   StringBuilder sb = new StringBuilder( len );
		   for( int i = 0; i < len; i++ ) 
		      sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
		  return sb.toString();
		}
	
	public static String getDynamicStr(){
		
		return "Test"+randomString(3)+getRandomNumber(2);
	}
	
	
	public static void main(String args[]){
		System.out.println(getRandomNumber(9));
		
		

		

	}

}
