package tt1;

import java.util.Arrays;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = 
			{{1,1,0,0,0}
			,{0,0,0,0,0}
			,{0,0,1,0,0}
			,{0,0,0,0,0}
			,{0,0,0,1,1}};
		
		int answer = 0;
		
		for(int i=0; i<board.length; i++) {
			System.out.println("출력1 : " + Arrays.toString(board[i]));			
		}
		System.out.println("----------------------- ");			
		
		for(int i=0; i < board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
				if(board[i][j] == 1) {
					checkArea(board, j, i);
				}
			}
		}
		for(int i=0; i<board.length; i++) {
			System.out.println("출력2 : " + Arrays.toString(board[i]));			
		}
		
		for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    answer++;
                }
            }
        }
		
		System.out.println("안전지대 : " + answer + "개");
	}
	
	public static void checkArea(int[][] board, int tx, int ty){
		int x = board[0].length-1;
		int y = board.length-1;
		
		
		if(ty != 0) {
			if(board[ty-1][tx] == 0) board[ty-1][tx] = 2;//상
		}
		if(ty != y) {
			if(board[ty+1][tx] == 0) board[ty+1][tx] = 2;//하
		}
		if(tx != 0) {
			if(board[ty][tx-1] == 0) board[ty][tx-1] = 2;//좌
		}
		if(tx != x) {
			if(board[ty][tx+1] == 0) board[ty][tx+1] = 2;//우
		}
		
		if(ty != 0 && tx != 0) {
			if(board[ty-1][tx-1] == 0) board[ty-1][tx-1] = 2;
		}
		if(ty != 0 && tx != x) {
			if(board[ty-1][tx+1] == 0) board[ty-1][tx+1] = 2;
		}
		if(ty != y && tx != 0) {
			if(board[ty+1][tx-1] == 0) board[ty+1][tx-1] = 2;
		}
		if(ty != y && tx != x) {
			if(board[ty+1][tx+1] == 0) board[ty+1][tx+1] = 2;
		}
    }

}
