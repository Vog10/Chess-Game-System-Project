package application;

import chess.ChessPiece;

public class UI {
		
		// imprimindo a tabuleiro na tela 
	public static void printBoard(ChessPiece[][] pieces) {

		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " ");

			for (int j = 0; j < pieces.length; j++) {

				printPiece(pieces[i][j]);

			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}

	// Testando se a peca esta na posicao e imprimindo uma peca
	private static void printPiece(ChessPiece piece) {

		if (piece == null) {
			System.out.print("-");
		} else {
			System.out.print(piece);
		}

		System.out.print(" ");

	}

}
