import java.util.Scanner;

public class Player{
    int score = 0;

    Scanner scan = new Scanner(System.in);

    public void play(SosCheck check) {
        System.out.println("Please enter the row and column numbers");

        System.out.print("Row: ");
        int row = scan.nextInt() - 1;

        System.out.print("Column: ");
        int column = scan.nextInt() - 1;

        System.out.print("Enter the letter you want to add: ");
        String letter = scan.next();

        letter = letter.toUpperCase();

        if (letter.equals("S") || letter.equals("O")) {
            if (check.board.isEmpty(row, column)) {
                check.board.array[row][column] = letter;
            } else {
                System.out.println("\nThe cell is not empty, enter other row and column numbers...\n");
                play(check);
            }
        } else {
            System.out.println("Invalid letter...");
            play(check);
        }

        score += check.incScore();
    }
}