package com.datou.pie.recursion;

public class TelephoneNumber {
	private static final int PHONE_NUMBER_LENGTH=7;
	private int[]phoneNumber;
	private char[]out;
	public TelephoneNumber(int[]phoneNumber){
		this.phoneNumber=phoneNumber;
		
	}
	public void printWord(){
		printWord(0);
	}
	public void printWord(int curDigit){
		if(curDigit==PHONE_NUMBER_LENGTH){
			System.out.println(new String(out));
			return;
		}
		for(int i=1;i<=3;i++){
			out[curDigit]=getCharFromNumber(phoneNumber[curDigit], i);
			printWord(curDigit+1);
			if(phoneNumber[curDigit]==0||phoneNumber[curDigit]==1){
				return;
			}
		}
	}
	
	//
	public char getCharFromNumber(int number, int index){
		//this is a method to be implemented 
		// that is a helper method , that return the char on the number.
		// each number has 3 chars, except 0 and 1.
		return 'x';
				
	}
}
