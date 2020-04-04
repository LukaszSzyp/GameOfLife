public class GameOfLife {
 //klasa wywolujaca metode i pozwalajaca zaladowac startowa tablice
    public static void main(String[] arg) {
        int[][] board = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 1, 0}
        };
        Gra gra1 = new Gra();
        gra1.gameOfLife(board);
    }
}
