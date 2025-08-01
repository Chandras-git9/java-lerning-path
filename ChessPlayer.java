public class ChessPlayer {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayerr {
    void moves();
}

class Queen implements ChessPlayerr {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 dirns)");
    }
}

class Rook implements ChessPlayerr {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}

class King implements ChessPlayerr {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}
