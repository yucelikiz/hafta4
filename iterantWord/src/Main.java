import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("İncelemek istediğiniz metni giriniz :");
        String text = scan.nextLine();

        String[] words = text.split(" ");
        HashMap<String, Integer> iterant = new HashMap<String, Integer>();

        for (String word : words) {
            if (iterant.containsKey(word)) {
                iterant.put(word, iterant.get(word) + 1);
            } else {
                iterant.put(word, 1);
            }
        }

        String mostIterant = "";
        int count = 0;
        for (String word : iterant.keySet()) {
            if (iterant.get(word) > count) {
                mostIterant = word;
                count = iterant.get(word);
            }
        }

        System.out.println("En çok tekrar eden kelime:");

        for (String word :iterant.keySet()) {
            if (iterant.get(word) == count) {
                System.out.println("==>" + word + ", tekrar sayısı :" + count);
            }
        }
    }
}