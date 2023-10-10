import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] arr = new String[] {"apple", "apricot", "banana", "peach", "cherry",
                "pear", "blueberry", "strawberry", "blackberry", "lemon"};

        System.out.print("Lütfen bir indeks girin :");
        int index = scan.nextInt();
        try {
            System.out.println("Dizinin " + index + ". indeksi :" + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Dizinin dışında bir değer girdiniz !");
            System.out.println(e.getMessage());
        }
        System.out.println("Program sona erdi !");
    }
}