package com.cbfacademy;

public class App {
    public static void main(String[] args) {
        // Player player1 = PlayerFactory.create();
        // Player player2 = PlayerFactory.create();
        SimpleContainer container = initialiseContainer();
        
        Game game = container.get(Game.class);
        String winner = game.play();

        if (winner == null) {
            System.out.println("It's a draw!");
        } else {
            System.out.println(winner + " wins!");
        }
    }
        private static SimpleContainer initialiseContainer() {
            SimpleContainer container = new SimpleContainer();

            container.register(Game.class, DiceGame.class);

            container.register(Player.class, DicePlayer.class);
    
            // Register mappings for any required interfaces with their concrete implementations
    
            return container;
        }
}
