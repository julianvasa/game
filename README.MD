Having a Player class - an instance of this class with that can communicate with other Player(s) (other instances of this class)

The use case is as bellow:

1. create 2 players

2. one of the players should send a message to second player (let's call this player "initiator")

3. when a player receives a message should send back a new message that contains the received message concatenated with the message counter that this player sent.

4. finalize the program (gracefully) after the initiator sent 10 messages and received back 10 messages (stop condition)

5. both players should run in the same java process (strong requirement)

6. document for every class the responsibilities it has.

7. additional challenge (nice to have) opposite to 5: have every player in a separate JAVA process.

Run
- `mvn clean package`
- `java -jar target/game-1.0.jar`
