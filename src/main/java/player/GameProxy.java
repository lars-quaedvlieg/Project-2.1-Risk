package player;

import board.Country;

import java.util.LinkedList;

/**
 * Handles game events and processes the interaction between players
 */
public class GameProxy implements GameObserver {
    Player currentPlayer;
    LinkedList<Player> players;

    public GameProxy(LinkedList<Player> players){
        this.players = players;
    }

    @Override
    public void onGameEvent(){
        //TODO: battle and setup events during the gameplay
    }

    /**
     * player accessible methods
     */
    protected void sendSoldiers(Country country){
        //TODO: access the map and modify units in country
    }
}
