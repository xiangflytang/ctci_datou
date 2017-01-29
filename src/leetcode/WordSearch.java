package leetcode;



public class WordSearch {
	
	
	/*1.start from each char
	 * 
	 *2.use the visited array
	 *
	 *3.use the distance function, so it is easy to switch to diangonal
	 *
    */
	 public boolean exist(char[][] board, String word) {
	        int m=board.length;
	        int n=board[0].length;
	        if(word.length()>m*n){
	            return false;
	        }
	        boolean[][]visited=new boolean[m][n];
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(dfs(board,word,visited,i,j,0)){
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	    
	    private int distance(int x,int y,int i,int j){
	    	int dis=Math.abs(x-i)+Math.abs(y-j);
	    	return dis;
	    	
	    }
	    public boolean dfs(char[][]board,String word,boolean[][]visited,int i,int j,int k){
	    	
	    	  int m=board.length;
	          int n=board[0].length;
	        
	        if(board[i][j]!=word.charAt(k)){
	        	return false;
	        }
	        if(k==word.length()-1){
	        	return true;
	        }
	        visited[i][j]=true;
	        k++;
	        boolean flag=false;
	        for(int row=i-1;row<=i+1;row++){
	        	for(int col=j-1;col<=j+1;col++){
	        		if((row>=0&&row<m&&col>=0&&col<n)&&(visited[row][col]==false)&&(distance(row,col,i,j)==1)){
	        			flag=dfs(board,word,visited,row,col,k);
	        			
	        		}
	        		if(flag){
	        			return true;
	        		}
	        	}
	        }
	         visited[i][j]=false;
	        return flag;
	        
	    }
    
    
}