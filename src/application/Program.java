package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		
		// VAI RECEBR A MATRIZ DE PECAS DA PARTIDA
		UI.printBoard(chessMatch.getPieces());
				
	}

}
