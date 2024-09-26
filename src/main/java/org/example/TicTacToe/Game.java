package org.example.TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    Deque<Player> playerQ;
    Board board;

    public Game(String p1Name, String p2Name){
        initializeGame(p1Name, p2Name);
    }

    public void initializeGame(String p1Name, String p2Name){
        playerQ = new LinkedList<>();
        Player p1 = new Player(p1Name, new PieceX());
        Player p2 = new Player(p2Name, new PieceO());

        playerQ.add(p1);
        playerQ.add(p2);

        board = new Board(3);
    }
    
    public String creatGame(){
        boolean noWinner = true;

        while(noWinner){
            Player playerTurn = playerQ.removeFirst();
            board.printBoard();

            boolean freeSpaces = board.getFreeSpaces();

            if(!freeSpaces){
                noWinner = false;
                continue;
            }

            System.out.println(playerTurn.name + " its your turn. Please enter the coordinates of you move:");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc. nextInt();

            boolean didPieceAdd = board.addPiece(x, y, playerTurn.piece);

            if(!didPieceAdd){
                System.out.println("Incorrect input co-ordinates");
                playerQ.addFirst(playerTurn);
                continue;
            }

            playerQ.addLast(playerTurn);

            boolean didWin = board.getWinner(playerTurn.piece);

            if (didWin){
                return playerTurn.name + " won the game!";
            }
        }

        return "Game is tie";
    }

}
