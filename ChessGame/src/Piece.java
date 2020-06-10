public class Piece {

    Position position;

    public boolean isValidMove(Position newPosition)
    {
        if(newPosition.row > 0 && newPosition.col >0 && newPosition.col < 8 && newPosition.row < 8)
        {
            return true;
        }
        return  false;
    }
}
