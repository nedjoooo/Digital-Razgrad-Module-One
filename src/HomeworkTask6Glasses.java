public class HomeworkTask6Glasses {
    public static void main(String[] args) {
        printGlasses(4);
    }

    public static void printGlasses(int glassesSize) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < glassesSize; i++) {
            if(i == 0 || i == glassesSize - 1) {
                stringBuilder.append(appendTerminalRow(glassesSize));
            } else {
                stringBuilder.append(appendMiddleRows(glassesSize, i));
            }
        }
        System.out.println(stringBuilder.toString());
    }

    public static StringBuilder appendStars(int countOfStars) {
        StringBuilder stringBuilder = new StringBuilder();
        String star = "*".repeat(countOfStars);
        return stringBuilder.append(star);
    }
    
    public static StringBuilder appendTerminalRow(int glassesSize) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(appendStars(glassesSize * 2));
        stringBuilder.append(" ".repeat(glassesSize));
        stringBuilder.append(appendStars(glassesSize * 2)).append("\n");
        return stringBuilder;
    }

    public static StringBuilder appendMiddleRows(int glassesSize, int row) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(appendSlashesRows(glassesSize * 2));
        if(row == 1) {
            stringBuilder.append("|".repeat(glassesSize));
        } else {
            stringBuilder.append(" ".repeat(glassesSize));
        }
        stringBuilder.append(appendSlashesRows(glassesSize * 2));
        stringBuilder.append("\n");
        return stringBuilder;
    }

    public static StringBuilder appendSlashesRows(int glassesSize) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("*").append("/".repeat(glassesSize - 2)).append("*");
        return stringBuilder;
    }
}
