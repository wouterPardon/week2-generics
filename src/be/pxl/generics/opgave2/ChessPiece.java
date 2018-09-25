package be.pxl.generics.opgave2;

public class ChessPiece implements Moveable<ChessBoardLocation>{
    private ChessBoardLocation location;

    public ChessPiece(){}

    @Override
    public void move(ChessBoardLocation location) {
        this.location = location;
    }

    @Override
    public String getCurrentLocation() {
        return location.toString();
    }
}
