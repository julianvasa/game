package com.game;

import java.util.HashMap;

/**
 * This class represents a player which is able to send and receive message with other players
 * @author Julian Vasa
 */
public class Player {
    /**
     * Keep track of received messages for each other player
     */
    private final HashMap<Player, Integer> receivedMessages = new HashMap<>();

    /**
     * Sends a message to another player
     * @param otherPlayer call receiveMessage on otherPlayer
     * @param message  the message sent to the other player
     * @return returns message + counter (messages sent to otherPlayer)
     */
    public String sendMessage(Player otherPlayer, String message) {
        return otherPlayer.receiveMessage(this, message);
    }

    /**
     * Receives a message from another player.
     * If the number of messages received from this player is 10 exit the program gracefully
     * @param otherPlayer the reference of the other player
     * @param message   the message received from the other player
     * @return  returns message + counter (messages received from otherPlayer)
     */
    public String receiveMessage(Player otherPlayer, String message) {
        Integer counter = receivedMessages.getOrDefault(otherPlayer, 0) + 1;
        receivedMessages.put(otherPlayer, counter);
        if (counter == 10) {
            System.exit(0);
        }
        return message + counter;
    }
}
