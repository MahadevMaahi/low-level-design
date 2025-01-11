package LLDSolutions.TicTacToeLLD.Game;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import LLDSolutions.TicTacToeLLD.Board.Board;
import LLDSolutions.TicTacToeLLD.Piece.PieceO;
import LLDSolutions.TicTacToeLLD.Piece.PieceX;
import LLDSolutions.TicTacToeLLD.Player.Player;

public class TicTacToeGame {
    
    public Board board;
    public Deque<Player> players;

    public TicTacToeGame() {
        players = new LinkedList<>();

        // Create two players
        Player player1 = new Player("Player 1", new PieceX());
        Player player2 = new Player("Player 2", new PieceO());
        players.add(player1);
        players.add(player2);

        // Initilize board
        board = new Board(3);
    }

    public void startGame() {
        boolean noWinner = true;
        Scanner inputScanner = new Scanner(System.in);
        while (noWinner) {
            Player currPlayer = players.removeFirst();

            // current board state
            board.printBoard();

            // is board still playable
            boolean isGameNotOver = board.canMakeMove();
            if (!isGameNotOver) {
                noWinner = false;
                continue;
            }

            // Get input form player
            System.out.print("Player: " + currPlayer.name + " please enter row, column: ");
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputCol = Integer.valueOf(values[1]);

            // Validate User entry
            boolean isValidMove = board.placePiece(inputRow, inputCol, currPlayer.piece);
            if (!isValidMove) {
                System.out.println(currPlayer.name + " please make a proper move");
                players.addFirst(currPlayer);
                continue;
            }

            // valid move add player to the last of queue
            players.addLast(currPlayer);

            // check if its a winning move
            boolean isMatchWon = board.isAWinMove(inputRow, inputCol, currPlayer.piece);
            if (isMatchWon) {
                System.out.println("Match Completed: Player: " + currPlayer.name + " Won!");
                board.printBoard();
                noWinner = false;
                return;
            }

        }
        inputScanner.close();
        System.out.println("Match Completed: No Player: Won!");
    }
}
