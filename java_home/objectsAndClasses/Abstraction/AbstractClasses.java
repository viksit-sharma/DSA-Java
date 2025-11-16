package objectsAndClasses.Abstraction;

public class AbstractClasses {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessGoti {
    void moves();
}

class Queen implements ChessGoti {
    public void moves() {
        System.out.println("Up,Down,Left,Right,Diagonal(Any place)");
    }
}
class King implements ChessGoti {
    public void moves() {
        System.out.println("Up,Down,Left,Right,Diagonal(One place)");
    }
}
class Rook implements ChessGoti {
    public void moves() {
        System.out.println("Up,Down,Left,Right");
    }
}
class pawn implements ChessGoti {
    public void moves() {
        System.out.println("Up");
    }
}