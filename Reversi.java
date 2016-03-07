class Reversi{
    public static void main(String[] args){
	int boardSize = 8;
	char humanColor = 'D';
	
	for(int i = 0; i < args.length; i++){
	    if(args[i].equals("-l")){
		humanColor = 'L';
	    }
	    if(args[i].equals("-n")){
		try{
		    boardSize = Integer.parseInt(args[i+1]);
		}catch(Exception ex){
		    ex.printStackTrace();
		}
		if(boardSize > 26 || boardSize < 4)
		    boardSize = 8;
		i++;
		
	    }
	}

	playGame(boardSize, humanColor);
    }

    public static void playGame(int boardSize, char humanColor){
	char human = humanColor;
	char computer = (char)(144 - (int)humanColor);

	/*	ReversiBoard board = new ReversiBoard(8);
	board.printBoard();	
	ReversiPlayer.playMove(board, 'D');
	ReversiPlayer.playMove(board, 'L');
	ReversiPlayer.playMove(board, 'D');
	ReversiPlayer.playMove(board, 'L');
	*/
    }

    public static void playTurn(ReversiBoard board, char playerColor, int iLoc, int jLoc){
	board.playMove(playerColor, iLoc, jLoc);
	board.printBoard();
	board.printScore();
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
