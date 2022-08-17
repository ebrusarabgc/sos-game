import java.util.Scanner;

public class Game {
    static void showStatus(Player player1, Player player2) {
        System.out.println("Player Score   : " + player1.score);
        System.out.println("Computer Score : " + player2.score);
    }

    static void showWinner(Player player1, Player player2) {
        if (player1.score > player2.score) {
            System.out.println("Player wins!");
        } else if (player1.score < player2.score) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("It's a draw.");
        }
    }

    static void oneTurn(Player player, SosCheck check) {
        player.play(check);
        check.board.printBoard();
        if (check.secondChance) {
            check.secondChance = false;
            oneTurn(player,check);
        }
    }

    static void start() {
        Board board = new Board();
        Player player = new Player();
        Computer computer = new Computer();
        SosCheck check = new SosCheck(board);
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the size of the board (the size must be between 5x5 and 10x10) : ");
        int size = scan.nextInt();

        if (size < 5) {
            System.out.println("You entered a number smaller than 5, so the size set to 5.");
            size = 5;
        } else if (size > 10) {
            System.out.println("You entered a number greater than 10, so the size set to 10.");
            size = 10;
        }

        board.setBoard(size,size);

        while (!board.isOver()) {
            oneTurn(player,check);
            showStatus(player,computer);

            if (!board.isOver()) {
                oneTurn(computer,check);
                showStatus(player,computer);
            }
        }
        showWinner(player,computer);
    }
}
