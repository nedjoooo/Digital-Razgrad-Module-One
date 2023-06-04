public class HomeworkTask2MirroringPartInTheBeginningAndTheEndOfAText {
    public static void main(String[] args) {
        checkingTheFirstAnLastElementsInAText("Akara");
        checkingTheFirstAnLastElementsInAText("Ba123ab");
        checkingTheFirstAnLastElementsInAText("A5c21b");
    }

    public static void checkingTheFirstAnLastElementsInAText(String text) {
        int countOfSameElements = 0;

        for (int i = 0; i < text.length(); i++) {
            char symbolFromTheBeginnig = text.charAt(i);
            char symbolFromTheEnd = text.charAt(text.length() - 1 - i);
            if(Character.toLowerCase(symbolFromTheBeginnig) == Character.toLowerCase(symbolFromTheEnd)) {
                countOfSameElements++;
            } else {
                break;
            }
        }

        if(countOfSameElements > 0) {
            System.out.println("Yes, the mirroring part is: " + text.substring(0, countOfSameElements).toLowerCase());
        } else {
            System.out.println("No mirroring part of the text");
        }
    }
}