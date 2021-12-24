package com.prafull.game.tikTakToe;

public class StartGame {

    public static void main(String[] args) {

        TikTakToe game = new TikTakToe();



        while(!game.isGameOver){
            System.out.println("\n\n\n");
            game.printBoard();
            game.gameMove();
        }


    }

}
