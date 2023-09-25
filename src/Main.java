import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //This creates a new scanner.
        Scanner sc = new Scanner(System.in);
        //This defines the repeat boolean as true to start the sequence.
        boolean repeat = true;
        //This defines the integer "size".
        int size;
        //This starts the repeat looping sequence.
        while (repeat = true) {
            //This asks the user to input a triangle size.
        System.out.println("What size would you like the triangle to be?");
        //This defines "size" as the next input.
        size = sc.nextInt();
        //This starts the size error loop.
        while (size > 50 || size < 1) {
            //This prints out the error message if the input isn't within the bounds.
            System.out.println("That's not within the bounds. Please enter a number between one and fifty.");
            //This asks the user to input a new size.
            System.out.println("What size would you like the triangle to be?");
            //This redefines the variable "size" as the new input.
            size = sc.nextInt();
        }
        //This asks the user to input the fill character.
        System.out.println("What fill character would you like to use?");
        //This defines the fill character.
        String character = sc.next();
        //This defines the starting row number.
            int currentRow = 1;
            //This defines the starting number of characters.
            int numberOfCharacters = 1;
            //This defines the final width of the triangle.
            int width = size * 2 - 1;
            //This defines the initial width of the triangle.
            int initialWidth = 1;
            //This defines the number of spaces to the left of the first character.
            int numberOfSpaces = ((width - initialWidth) / 2) - 1;
            //This begins the looping sequence to print out the triangle.
            for (currentRow = 1; currentRow <= size; currentRow++) {
                //This starts the secondary loop to print out the spaces to the left.
                for (numberOfSpaces = ((width - initialWidth) / 2) - 1; numberOfSpaces >= 0; numberOfSpaces--) {
                    //This prints out a single space.
                    System.out.print(" ");
                }
                //This starts the tertiary loop to print out the characters.
                for (numberOfCharacters = 1; numberOfCharacters <= currentRow; numberOfCharacters++) {
                    //This prints out a character in the sequence.
                    System.out.print(character + " ");
                }
                //This adds a new line.
                System.out.println();
                //This redefines the inital width as the width of the new line.
                initialWidth = initialWidth + 2;
            }
            //This asks the user if they want another triangle.
            System.out.println("Would you like another triangle (Y/N)?");
            //This defines the string "yesOrNo" as their input.
            String yesOrNo = sc.next();
            //This starts an "if" sequence determining the loop response.
            if (yesOrNo == "Y") {
                //This keeps the repeat as true if the above is true.
                repeat = true;
                //This starts the "else" statement.
            } else {
                //This ends the repeat loop if they input "N".
                repeat = false;
            }
        }
        }
    }