package boardgame;

public class Board {

	private int rows;
	private int columns;

	private Piece[][] pieces;

	public Board(int rows, int columns) {

		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];

	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public Piece piece(int row, int column) {
		return pieces[row][column];
	}

	// Sobrecarga do metodo acima
	public Piece piece(Position position) {
		
		return pieces[position.getRow()][position.getColumn()];
	}


	// Pegando a matriz na posicao dada e abribuindo a ela a peca informada
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
	
	// Infomando que peca nao está na posicao null
		piece.position = position;
	
	}
	
	
}
