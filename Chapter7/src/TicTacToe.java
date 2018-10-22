public class TicTacToe {
	public static void main (String[] args) {
		char[][] board = {
							{' ',' ',' '},
							{' ',' ',' '},
							{' ',' ',' '}
						};
		drawBoard(board);
	}
				
	public static void drawBoard(char[][] board) {
		for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <=2; j++) {
				System.out.print(board[i][j] + "|");
			}
		System.out.println();
		}
	}
}
