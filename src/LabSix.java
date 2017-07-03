import java.util.Scanner;

/**
 * Created by Rizwan Khan on 7/3/2017.
 */
public class LabSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String newWord;
        String choice = " ";
        StringBuilder sb = new StringBuilder(18);
        System.out.println("Welcome to the Pig Latin Translator! ");
        System.out.println("");
        do {
            System.out.println("Enter a word to be translated: ");
            String userWord3 = sc.nextLine();
            System.out.println(PigLatinTrans(userWord3));

            System.out.println("Translate another world? (y/n): ");
            choice = sc.nextLine();

        }while (choice.equalsIgnoreCase("y"));


    }
    public static String PigLatinTrans(String userWord3){
        String newWord = " ";
        String x = "way";
        String y = "ay";
        StringBuilder sb = new StringBuilder(18);
        String userWord = userWord3.toLowerCase();
        if (userWord.charAt(0) == 'a' || userWord.charAt(0) == 'e' || userWord.charAt(0) == 'i' || userWord.charAt(0) == 'o'
                || userWord.charAt(0) == 'u') {
            sb.append(userWord).append(x);
            newWord = sb.toString();

        } else {

            for (int i = 0; i < userWord.length(); i++) {
                if (userWord.charAt(i) == 'a' || userWord.charAt(i) == 'e' || userWord.charAt(i) == 'i' ||
                        userWord.charAt(i) == 'o' || userWord.charAt(i) == 'u') {
                    String start = userWord.substring(0, i);
                    String end = userWord.substring(i, userWord.length());
                    sb.append(end).append(start).append(y);
                    newWord = sb.toString();
                    break;
                }
            }
        }

        return newWord;
    }
}
