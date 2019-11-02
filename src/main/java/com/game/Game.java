package com.game;

import com.game.api.Player;

/**
 * This class starts a new game between two players
 *
 * @author Julian Vasa
 */
public class Game {

    /**
     * Start a new game with two players.
     * Player1 sends two messages to player2, player2 sends one message to player1.
     * Print out the message received from both players
     *
     * @param args
     */
    public static void main(String[] args) {
        Player initiator = new PlayerImpl("initiator");
        Player player2 = new PlayerImpl("player2");

        String messageReceivedFromPlayer2 = initiator.sendMessage(player2, "Hello, i am " + initiator.getName() + ", what is my message counter");
        String messageReceivedFromInitiator = player2.sendMessage(initiator, "Hello, i am " + player2.getName() + ", what is my message counter");
        System.out.println("Message sent to player2, message received: " + messageReceivedFromPlayer2);

        messageReceivedFromPlayer2 = initiator.sendMessage(player2, "Hello, i am " + initiator.getName() + ", what is my message counter");
        System.out.println("Message sent to player2, message received: " + messageReceivedFromPlayer2);
        System.out.println("Message sent to initator, message received: " + messageReceivedFromInitiator);
    }
}
