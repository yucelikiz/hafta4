import java.util.Scanner;

public class Main {

    public static void userEnterIndex (String[] arr, int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index > arr.length -1) {
            throw new ArrayIndexOutOfBoundsException("Dizi dışında bir index girdiniz !");
        } else {
            System.out.println("Dizinin " + index + ". indeksi :" + arr[index]);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] arr = new String[] {"apple", "apricot", "banana", "peach", "cherry",
                "pear", "blueberry", "strawberry", "blackberry", "lemon"};

        System.out.print("Lütfen bir indeks girin :");
        int index = scan.nextInt();


        try {
            userEnterIndex(arr, index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program sona erdi !");
    }
}