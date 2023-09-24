import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean repeat = true;
        int size;

        while (repeat = true) {

        System.out.println("What size would you like the triangle to be?");

        size = sc.nextInt();

        while (size > 50 || size < 1) {
            System.out.println("That's not within the bounds. Please enter a number between one and fifty.");
            System.out.println("What size would you like the triangle to be?");
            size = Integer.parseInt(sc.nextLine());
        }

        System.out.println("What fill character would you like to use?");
        String character = sc.next();



            int currentRow = 1;
            int numberOfCharacters = 1;

            //width is size * 2 - 1
            int width = size * 2 - 1;
            //num chars increases by 2

            int initialWidth = 1;
            //width increases by 2 each time

            int numberOfSpaces = ((width - initialWidth) / 2) - 1;


            for (currentRow = 1; currentRow <= size; currentRow++) {
                for (numberOfSpaces = ((width - initialWidth) / 2) - 1; numberOfSpaces >= 0; numberOfSpaces--) {
                    System.out.print(" ");
                }
                for (numberOfCharacters = 1; numberOfCharacters <= currentRow; numberOfCharacters++) {
                    System.out.print(character + " ");
                }
                System.out.println();
                initialWidth = initialWidth + 2;
            }

            System.out.println("Would you like another triangle (Y/N)?");

            String yesOrNo = sc.next();

            if (yesOrNo == "Y") {
                repeat = true;
            } else {
                repeat = false;
            }

        }
        }
    }