package com.game;

import com.ginsberg.junit.exit.ExpectSystemExit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit tests
 * @author Julian Vasa
 */
public class UnitTests {
    private Player initiator;
    private Player player2;

    /**
     * Create two players, initiator and player2
     */
    @BeforeEach
   public void initialization() {
        initiator = new Messenger("initiator");
        player2 = new Messenger("player2");
    }

    /**
     * Initiator sends a message to player2
     */
    @Test
    public void sendMessageToPlayer2() {
        assertNotNull(initiator.sendMessage(player2, "Initiate game"));
    }

    /**
     * When initiator sends a message to player2, check if player2 received the same message
     */
    @Test
    public void whenInitiatorSendsMessageToPlayer_thenPlayer2SendsBackMessageWithCounter() {
        String receivedMessage = initiator.sendMessage(player2, "Initiate game");
        assertEquals("Initiate game1", receivedMessage);
    }

    /**
     * When 10 messages are send and received exit the program gracefully
     */
    @Test
    @ExpectSystemExit
    public void when10MessageSentAndReceived_thenFinalizeTheProgramGracefully() {
        for (int i = 0; i < 100; i++) {
            initiator.sendMessage(player2, "Initiate game");
        }
    }
}

