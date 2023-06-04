import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HomeworkTask4TriangleOfExclamationMark {
    public static void main(String[] args) {
        printTriangleOfExclamationMark(4);
    }

    public static void printTriangleOfExclamationMark(int size) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("triangleOfExclamationMark.txt"))) {
            int countOfColumns = 1;
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < countOfColumns; j++) {
                    System.out.print("!");
                    writer.write("!");
                }
                writer.write("\n");
                System.out.println();
                countOfColumns++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
