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
        int numberSpaces = 1;
        int numberCharacters = 1;
        int lineSize = 1;
        int charactersInARow = 1;
        String characterPrint = character + " ";


        //while (lineSize <= size) {
            //while (numberSpaces < size) {
               // System.out.print(" ");
               // numberSpaces = numberSpaces + 1;
           // }

            //numberSpaces = 1;


            while (numberCharacters <= lineSize) {
                if (numberCharacters > 1) {
                    while (numberSpaces < (size - 1)) {
                        System.out.print(" ");
                        numberSpaces = numberSpaces + 1;
                    }
                    while (charactersInARow < numberCharacters) {
                        System.out.print(characterPrint);
                        charactersInARow = charactersInARow + 1;
                    }
                } else {
                    System.out.print(character + "\n");
                }
                numberCharacters = numberCharacters + 1;
            }
            //lineSize = lineSize + 1;
        //}










        System.out.println("Would you like another triangle (Y/N) ?");
        String yesOrNo = sc.nextLine();

        if (yesOrNo == "Y") {
            repeat = true;
        } else repeat = false;
        }
    }