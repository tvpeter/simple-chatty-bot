public class Queen extends Piece {

    private int col;
    private int row;

    public boolean isValidMove(Position newPosition)
    {
        if(Math.abs(newPosition.row - this.row) == Math.abs(newPosition.col - this.col) &&
                (newPosition.row > 0 && newPosition.col > 0)
        )
        {
            return true;
        }
        return  false;
    }
}
