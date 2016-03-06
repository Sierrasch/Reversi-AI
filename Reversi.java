class Reversi{
    public static void main(String[] args){
	ReversiBoard board = new ReversiBoard(8);
	board.printBoard();
	board.playMove('D',4,5);
	board.printBoard();
	board.playMove('L',3,5);
	board.printBoard();
	board.playMove('D',1,5);
	board.printBoard();
	board.playMove('D',2,4);
	board.printBoard();
	board.playMove('L',1,5);
	board.printBoard();
	
	printValidMoves(board);
    }

    public static void printValidMoves(ReversiBoard board){
	for(int i = 0; i < board.boardSize; i++){
	    for(int j = 0; j < board.boardSize; j++){
		if(board.isValid('D', i, j))
		    System.out.println("valid D " + i + " " + j);
		if(board.isValid('L', i, j))
		    System.out.println("valid L " + i + " " + j);
	    }
	}
    }
}
