package com.game.api;

/**
 * A player is able to send and receive messages with other players
 * @author Julian Vasa
 */
public interface Player {
    /**
     * @return the player name
     */
    String getName();
    /**
     * Sends a message to another player
     * @param toPlayer a reference to the other player
     * @param message  the message sent to the other player
     * @return returns the reply from the other player
     */
    String sendMessage(Player toPlayer, String message);

    /**
     * Receives a message from another player.
     * @param fromPlayer the reference of the other player
     * @param message   the message received from the other player
     * @return  returns a reply to be sent to the sender
     */
    String receiveMessage(Player fromPlayer, String message) ;
}
