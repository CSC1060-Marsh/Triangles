import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What size would you like the triangle to be?");

        int size = Integer.parseInt(sc.nextLine());

        while (size > 50 || size < 1) {
            System.out.println("That's not within the bounds. Please enter a number between one and fifty.");
            System.out.println("What size would you like the triangle to be?");
            size = Integer.parseInt(sc.nextLine());
        }

        System.out.println("What fill character would you like to use?");
        String character = sc.next( );

        boolean repeat = true;

        int currentRow = 1;
        int numberSpaces = size - currentRow;































        System.out.println("Would you like another triangle (Y/N) ?");
        String yesOrNo = sc.nextLine();

        if (yesOrNo == "Y") {
            repeat = true;
        } else repeat = false;
        }
    }