class ReversiPlayer{
    public static boolean playMove(ReversiBoard board, char playerColor){
	for(int i = 0; i < board.boardSize; i++){
	    for(int j = 0; j < board.boardSize; j++){
		if(board.isValid(playerColor, i, j)){
		    Reversi.playTurn(board, playerColor, i, j);
		    return true;
		}
	    }
	}
	return false;
    }
}
