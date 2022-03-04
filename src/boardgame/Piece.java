package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();

	// Isso é que a gente chama de Roque methods roll que vem de gancho é um método
	// que faz um gancho com a subclasse.

	public boolean possibleMove(Position position) {

		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	/*
	 * Essa operação vai ter que contar se existe pelo menos um movimento possível
	 * para essa peça e verifica se a peca esta travada.
	 */

	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {

			if ( mat[i][j]) {
				return true;
				}
			}
		}
		
		return false;

	}

}
