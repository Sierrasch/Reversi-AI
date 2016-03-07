class ReversiPlayer{
    public static String playMove(ReversiBoard board, char playerColor){
	for(int i = 0; i < board.boardSize; i++){
	    for(int j = 0; j < board.boardSize; j++){
		if(board.isValid(playerColor, i, j)){
		    board.playMove(playerColor, i, j);
		    String playedMove = "";
		    playedMove += (char)(i + 97);
		    playedMove += (j+1);
		    return playedMove;
		}
	    }
	}
	return "cannot play a move";
    }
}
