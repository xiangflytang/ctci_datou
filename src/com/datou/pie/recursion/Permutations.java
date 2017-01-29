package com.datou.pie.recursion;

public class Permutations {
	private final String in;
	private boolean used[];
	private StringBuilder out;
	public Permutations(String in){
		this.in=in;
		used=new boolean[in.length()];
	}
	public void permute(){
		if(out.length()==in.length()){
			System.out.println(out.toString());
			return;
			
		}
		for(int i=0;i<in.length();i++){
			if(used[i])
				continue;
			out.append(in.charAt(i));
			used[i]=true;
			permute();
			used[i]=false;
			out.setLength(out.length()-1);
		}
	}
	
}
