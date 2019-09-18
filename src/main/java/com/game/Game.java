package com.game;

/**
 * This class starts a new game between two players
 * @author Julian Vasa
 */
public class Game {

    /**
     * Start a new game with two players.
     * Player1 sends two messages to player2, player2 sends one message to player1.
     * Print out the message received from both players
     * @param args
     */
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        String messageReceivedFromPlayer2 = player1.sendMessage(player2, "Hello, i am player1, what is my message counter ");
        String messageReceivedFromPlayer1 = player2.sendMessage(player1, "Hello, i am player2, what is my message counter ");
        System.out.println("Message sent to player2, message received: " + messageReceivedFromPlayer2);
        messageReceivedFromPlayer2 = player1.sendMessage(player2, "Hello, i am player1, what is my message counter ");
        System.out.println("Message sent to player2, message received: " + messageReceivedFromPlayer2);
        System.out.println("essage sent to player1, message received: " + messageReceivedFromPlayer1);
    }
}
