package boardgame;

public class Board {

	private int rows;
	private int columns;

	private Piece[][] pieces;

	public Board(int rows, int columns) {
		// Verificando o tamanho do board "Programacao defesiva"
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];

	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) { // Programacao defesiva
			throw new BoardException("Position not on the board");
		}

		return pieces[row][column];
	}

	// Sobrecarga do metodo acima
	public Piece piece(Position position) {
		if (!positionExists(position)) { // Programacao defesiva
			throw new BoardException("Position not on the board");
		}

		return pieces[position.getRow()][position.getColumn()];
	}

	// Pegando a matriz na posicao dada e abribuindo a ela a peca informada
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;

		// Infomando que peca nao está na posicao null
		piece.position = position;

	}

	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		if (piece(position) == null) { // testando se a peca do board e null se for verdade nao tem nenhuma peca nessa
										// posicao
			return null;
		}
		Piece aux = piece(position);
		aux.position = null; // retirando a peca do board
		pieces [position.getRow()] [position.getColumn()] = null; /* na minha de pecas agora e null, indicando 
		que nao tem pecas nesa posicao na matriz */ 
		return aux;
	}

	// Condicao para ver se uma posicao existe
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}

	// reaproveintado o metodo e testando se uma posicao existe
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	// tetsnatdo se tem uma peca na posicao
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) { // Programacao defesiva
			throw new BoardException("Position not on the board");
		}

		return piece(position) != null;
	}

}
