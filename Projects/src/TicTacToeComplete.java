import java.util.Scanner;

public class TicTacToeComplete {
	public static void main (String[] args) {
		
		boolean gameOn = true; //gamestate
		boolean turn = false; //false = x true = o
		char current = ' '; //current player's char
		int move;
		char[] board = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
		int increment = 0;
		
		while(gameOn) {
			
			if(turn) {
				current = 'O';
			}
			else {
				current = 'X';
			}
			
			do {
				System.out.println("Enter Coordinate of Move");
				move = getMove();
			}
			while(!checkMove(move,board));//check validity of move
			
			board[move] = current; //board slot assigned char of current player
			
			drawBoard(board);
			
			gameOn = checkWin(board, current);
			System.out.println(gameOn);
			
			if(increment == 8) {
				gameOn = false;
				current = ' ';
			}
			
			turn = !turn;
			increment++;
		}
		
		
		if(current == ' ') {
			System.out.println("It's a draw!");
		}
		else {
		System.out.println(current + " has won!!");
		}
		
	}
				
	public static void drawBoard(char[] board) {
			for(int j = 1; j <=9; j++) {
				System.out.print(board[j-1] + "|");
				if((j%3) == 0) {
					System.out.println();
				}
		
		}
	}
	
	public static int getMove() {
		Scanner keyboard = new Scanner(System.in);
		int move;
		
		do{
		move = keyboard.nextInt();
		} while (move > 9 || move < 1);
		
		return (move - 1);//to adjust for array indexing
	}
	
	public static boolean checkMove(int move, char[] board) {//if space is open returns true else returns false
		if(board [move] == ' ') {
			return true;
		}
		else {
			System.out.println("Invalid Move");
			return false;
		}
	}
	
	public static boolean checkWin(char[] board, char current) {
		boolean won = false;
		
		
		for(int i = 0; i <= 8; i += 3) {
			if(board[i] == current && board[i+1] == current && board[i+2] == current) {
				won = true;
			}
		}
		
		for(int j = 0; j <= 2; j++) {
			if(board[j] == current && board[j+3] == current && board[j+6] == current) {
				won = true;
		}
			
		if(board[0] == current && board[4] == current && board[8] == current)
			won = true;
		}
		
		if(board[2] == current && board[4] == current && board[6] == current) {
			won = true;
		}
		
		return !won;
	}
}