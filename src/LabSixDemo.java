import java.util.Scanner;

/**
 * Created by rizwa on 7/2/2017.
 */
public class LabSixDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(14);

        System.out.println("Welcome to Pig Latin Translator! ");
        String choice = " ";
        String newWord = " ";
        String x = "way";
        String y = "ay";
        do {
            System.out.println("Enter a word to be translated: ");
            String userWord2 = sc.nextLine();
            String userWord = userWord2;

            if (userWord.charAt(0) == 'a' || userWord.charAt(0) == 'e' || userWord.charAt(0) == 'i' || userWord.charAt(0) == 'o'
                    || userWord.charAt(0) == 'u') {
               newWord = userWord + x;

            } else {

                for (int i = 0; i < userWord.length(); i++) {
                    if (userWord.charAt(i) == 'a' || userWord.charAt(i) == 'e' || userWord.charAt(i) == 'i' ||
                            userWord.charAt(i) == 'o' || userWord.charAt(i) == 'u') {
                        String start = userWord.substring(0, i);
                        String end = userWord.substring(i, userWord.length());
                        newWord = end + start + y;
                        break;
                    }
                }
            }
            System.out.println(newWord);
            System.out.println("Translate another word? (y/n): ");
            choice = sc.nextLine();
            System.out.println(" ");


        }while (choice.equalsIgnoreCase("y"));
        System.out.println("Goodbye!");
    }
}
