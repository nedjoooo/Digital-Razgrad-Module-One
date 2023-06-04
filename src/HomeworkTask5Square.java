public class HomeworkTask5Square {
    public static void main(String[] args) {
        printSquare(3);
        printSquare(6);
        printSquare(8);
    }

    public static void printSquare(int squareSize) {
        for (int i = 0; i < squareSize; i++) {
            for (int j = 0; j < squareSize; j++) {
                if((i == 0 && j == 0) ||
                        (i == 0 && j == squareSize - 1) ||
                        (i == squareSize - 1 && j == 0) ||
                        (i == squareSize - 1 && j == squareSize - 1)) {
                    System.out.print("?");
                } else if (j == 0 || j == squareSize - 1) {
                    System.out.print("|");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
