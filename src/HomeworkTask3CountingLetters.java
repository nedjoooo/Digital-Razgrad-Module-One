public class HomeworkTask3CountingLetters {
    public static void main(String[] args) {
        System.out.println(countingYAndZLettersAtTheEndOfTheWords("fez day"));
        System.out.println(countingYAndZLettersAtTheEndOfTheWords("day fyyyz"));
        System.out.println(countingYAndZLettersAtTheEndOfTheWords("Dad fez"));
        System.out.println(countingYAndZLettersAtTheEndOfTheWords("Yellowy fez day"));
    }

    public static int countingYAndZLettersAtTheEndOfTheWords(String text) {
        int countOfYAndZ = 0;
        for (String word : text.split(" ")) {
            char lastLetter = word.charAt(word.length() - 1);
            if(lastLetter == 'y' || lastLetter == 'z') {
                countOfYAndZ++;
            }
        }

        return countOfYAndZ;
    }
}
