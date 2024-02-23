/*
BFS 이용
객체를 만드셔도 되고, 어제 처럼 ArrayList 이용도 가능 
입력예시)
5 6 : 배열의 사이즈[][] 
시작-> 101010
	  111111
	  000001
	  111111
	  111111 -> 탈출

출력예시) : 최소 이동 칸의 개수를 출력  
10
*/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import com.encore.algorithm.miro.MiroNode;

public class MiroAlgorithmMain {
	public static void main(String[] args) {
		int n = 0 ;
		int m = 0;
		int [][] ary = null ;
		
		System.out.print("배열의 행과 열의 갑을 입력하세요 :  "); 
		Scanner scan = new Scanner(System.in) ; 
		n = scan.nextInt();
		m = scan.nextInt();
		ary = new int [n][m];
		
		scan.nextLine();
		for(int i = 0; i < n; i++){
		    String row = scan.nextLine();
		    for(int j = 0; j < m; j++){
		    	// ary[i][j] = Integer.parseInt( row.charAt(j)+"" ) ;
		    	ary[i][j] = Character.getNumericValue( row.charAt(j) ) ;
		    }
		}
		System.out.println("result = " + bfs(ary, 0, 0));
	}
	
	public static int bfs(int [][] ary, int x, int y){
	    //상하 좌우 이동 방향 
	    int directionX[] = {-1, 0, 1, 0};
	    int directionY[] = {0, 1, 0, -1};
	    
	    Queue<MiroNode> queue = new LinkedList<MiroNode>();
	    queue.offer(new MiroNode(x, y));
	    
	    while(!queue.isEmpty()){
	    	MiroNode now = queue.poll();
	        
	        for(int i = 0; i < directionX.length; i++){
	            int nextStepX  = now.getX() + directionX[i];
	            int nextStepY = now.getY() + directionY[i]; 
	            
	            // 범위를 넘어갈 경우 
	            if(nextStepX <= -1 || nextStepY <= -1 || nextStepX >= 5 || nextStepY >= 6) {
	            	continue;
	            }
	            
	            // 처음 방문하는 경우에만
	            if(ary[nextStepX][nextStepY] == 1){
	                ary[nextStepX][nextStepY] =  ary[now.getX()][now.getY()] + 1;
	                queue.offer(new MiroNode(nextStepX, nextStepY));
	            }
	        }
	    }
	    
	    return ary[5-1][6-1];
	}

}














