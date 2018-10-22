import java.util.Scanner;

public class TicTacToeComplete {
	public static void main (String[] args) {
		
		
		boolean gameOn = true; //gamestate
		boolean turn = false; //false = x true = o
		char current; //current player's char
		int moveX;
		int moveY;
		
		
		char[][] board = { 
							{' ',' ',' '},
							{' ',' ',' '},
							{' ',' ',' '}
						};
		while(gameOn) {
			
			if(turn) {
				current = 'O';
			}
			else {
				current = 'X';
			}
			
			do {//requests input until valid move entered
			System.out.println("Enter X Coordinate of Move");
			moveY = getMove();
			System.out.println("Enter Y Coordinate of Move");
			moveX = getMove();
			}
			while(!checkMove(moveX,moveY,board));//check validity of move
			
			board[moveX][moveY] = current; //board slot assigned char of current player
			
			drawBoard(board);
			//gameOn = checkWin();
			
			turn = !turn;
		}
		
	}
				
	public static void drawBoard(char[][] board) {//prints rows and lines of board
		for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <=2; j++) {
				System.out.print(board[i][j] + "|");
			}
		System.out.println();
		}
	}
	
	public static int getMove() {
		Scanner keyboard = new Scanner(System.in);
		int move;
		
		do{
		move = keyboard.nextInt();
		} while (move > 3 || move < 1);
		
		return (move - 1);//to adjust for array indexing
	}
	
	public static boolean checkMove(int x, int y, char[][] board) {//if space is open returns true else returns false
		if(board [x][y] == ' ') {
			return true;
		}
		else {
			System.out.println("Invalid Move");
			return false;
		}
	}
}