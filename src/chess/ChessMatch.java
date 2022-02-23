package chess;

import boardgame.Board;
import chess.pieces.Rook;
import chess.pieces.king;

public class ChessMatch {

	private Board board;
	
	public ChessMatch() {
		
		board = new Board(8, 8);
		initialSetup();
	}
	// Metodo para percorre e acessa boardgame > Piece atraves do Chessmatch
	public ChessPiece[][] getPieces(){
			ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
			for(int i = 0;i <  board.getRows(); i++) {
				for(int j = 0;j < board.getColumns(); j++) {
					
					mat[i][j] = (ChessPiece) board.piece(i, j);
					
				}
			}
			
			return mat;
 		
	}
	
		// Passando as pecas nas coordenadas do xadrez 
	private void placeNewPiece( char column, int row, ChessPiece piece ) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	// Metodo Responsável pelo inicio da partida e coloca as peca no tabuleiro 
	private void initialSetup() {
		
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new king(board, Color.BLACK));
		placeNewPiece('e', 1, new king(board, Color.WHITE));
	}
	
	
	
}
