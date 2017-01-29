package com.datou.ctci.chapter9;

public class FibonacciDP {
	public static int max=35;
	public static int[]fb=new int[max];
	public static int fibonacci(int n){
		if(n==0){
			return 1;
		}else if(n==1){
			return 1;
		}else if(fb[n]!=0){
			return fb[n];
		}else{
			fb[n]=fibonacci(n-1)+fibonacci(n-2);
			return fb[n];
			
		}
		
	}
	
	public static void main(String[] args) {
		
			System.out.println(fibonacci(30));
		
	}
}
