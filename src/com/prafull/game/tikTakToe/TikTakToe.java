package com.prafull.game.tikTakToe;

import java.util.Scanner;

public class TikTakToe {

    /*
    * Board Position indexing
    *
    *    Position 1 - [0][0]
         Position 2 - [0][2]
         Position 3 - [0][4]
         Position 4 - [2][0]
         Position 5 - [2][2]
         Position 6 - [2][4]
         Position 7 - [4][0]
         Position 8 - [4][2]
         Position 9 - [4][4]

    *
    * */

    private boolean isCross = true;
    private char[][] gameboard = {
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '},
            {'-','+','-','+','-'},
            {' ','|',' ','|',' '}};

    public boolean isGameOver = false;

    Scanner scan = new Scanner(System.in);


    public void printBoard(){

        for (char[] row: gameboard) {

            for(char col:row){
                System.out.print(col);
            }
            System.out.println();
        }

    }


    public void gameMove(){

        char currentMoveFor = (isCross)? 'X' : '0';
        System.out.print("Player - ( "+currentMoveFor+" )Enter you move (1-9)");

        int move = scan.nextInt();

        applyMove(move);

    }

    private void applyMove(int move){

        switch (move){
            case 1: changeValue(0,0, move);
                break;
            case 2:changeValue(0,2, move);
                break;
            case 3:changeValue(0,4, move);
                break;
            case 4:changeValue(2,0, move);
                break;
            case 5:changeValue(2,2, move);
                break;
            case 6:changeValue(2,4, move);
                break;
            case 7:changeValue(4,0, move);
                break;
            case 8:changeValue(4,2, move);
                break;
            case 9:changeValue(4,4, move);
                break;
            default:
                System.out.println("Please enter a valid move!!!");
        }

    }

    private  void changeValue(int row, int coloum, int value){

        if(gameboard[row][coloum] == 'X' || gameboard[row][coloum] == '0')
            System.out.println("Block is already filled!!!");
        else{
            if(isCross) gameboard[row][coloum] = 'X';
            else gameboard[row][coloum] = '0';
            isCross = !isCross;
            checkWin();
        }
    }





    public void checkWin(){

        /* Reversing the values of CurrentMoveFor cause the values were already switched in the ChangeValue Function, While Calling!*/
        char currentMoveFor = (isCross)? '0' : 'X';


        // 123 - [0][0] [0][2] [0][4]
        if(gameboard[0][0] == gameboard[0][2] && gameboard[0][2] == gameboard[0][4] && gameboard[0][4] != ' '){
            System.out.println("Congratuations ( "+currentMoveFor+" ) Won!!");
            gameboard[0][0] = '*';
            gameboard[0][2] = '*';
            gameboard[0][4] = '*';
            isGameOver=true;
            System.out.println("\n\n\n");
            printBoard();
        }else if(gameboard[0][0] == gameboard[2][2] && gameboard[0][0] == gameboard[4][4] && gameboard[4][4] != ' '){ // 159 - [0][0] [2][2] [4][4]
            System.out.println("Congratuations ( "+currentMoveFor+" ) Won!!");
            gameboard[0][0] = '*';
            gameboard[2][2] = '*';
            gameboard[4][4] = '*';
            isGameOver=true;
            System.out.println("\n\n\n");
            printBoard();
        }else if(gameboard[0][4] == gameboard[2][2] && gameboard[0][4] == gameboard[4][0] && gameboard[4][0] != ' '){ // 357 - [0][4] [2][2] [4][0]
            System.out.println("Congratuations ( "+currentMoveFor+" ) Won!!");
            gameboard[0][4] = '*';
            gameboard[2][2]= '*';
            gameboard[4][0]  = '*';
            isGameOver=true;
            System.out.println("\n\n\n");
            printBoard();
        }else if(gameboard[2][0] == gameboard[2][2] && gameboard[2][0] == gameboard[2][4] && gameboard[2][4] != ' '){ // 456 - [2][0] [2][2] [2][4]
            System.out.println("Congratuations ( "+currentMoveFor+" ) Won!!");
            gameboard[2][0] = '*';
            gameboard[2][2] = '*';
            gameboard[2][4] = '*';
            isGameOver=true;
            System.out.println("\n\n\n");
            printBoard();
        }else if(gameboard[4][0] == gameboard[4][2] && gameboard[4][0] == gameboard[4][4] && gameboard[4][4] != ' '){ // 789 - [4][0] [4][2] [4][4]
            System.out.println("Congratuations ( "+currentMoveFor+" ) Won!!");
            gameboard[4][0] = '*';
            gameboard[4][2] = '*';
            gameboard[4][4] = '*';
            isGameOver=true;
            System.out.println("\n\n\n");
            printBoard();
        }else if(gameboard[0][0] == gameboard[2][0] && gameboard[0][0] == gameboard[4][0] && gameboard[4][0] != ' '){ // 147 - [0][0] [2][0] [4][0]
            System.out.println("Congratuations ( "+currentMoveFor+" ) Won!!");
            gameboard[0][0] = '*';
            gameboard[2][0] = '*';
            gameboard[4][0] = '*';
            isGameOver=true;
            System.out.println("\n\n\n");
            printBoard();
        }else if(gameboard[0][2] == gameboard[2][0] && gameboard[0][2] == gameboard[4][2] && gameboard[4][2] != ' '){ // 248 - [0][2] [2][0] [4][2]
            System.out.println("Congratuations ( "+currentMoveFor+" ) Won!!");
            gameboard[2][0] = '*';
            gameboard[0][2] = '*';
            gameboard[4][2] = '*';
            isGameOver=true;
            System.out.println("\n\n\n");
            printBoard();
        }else if(gameboard[0][4] == gameboard[4][0] && gameboard[0][4] == gameboard[4][4] && gameboard[4][4] != ' '){ // 379 - [0][4] [4][0] [4][4]
            System.out.println("Congratuations ( "+currentMoveFor+" ) Won!!");
            gameboard[4][4] = '*';
            gameboard[4][0] = '*';
            gameboard[0][4] = '*';
            isGameOver=true;
            System.out.println("\n\n\n");
            printBoard();
        }

    }


}
    /*
    * Winning Conditions
    *
    *
        123 - [0][0] [0][2] [0][4]
        159 - [0][0] [2][2] [4][4]
        357 - [0][4] [2][2] [4][0]


        456 - [2][0] [2][2] [2][4]

        789 - [4][0] [4][2] [4][4]

        147 - [0][0] [2][0] [4][0]
        248 - [0][2] [2][0] [4][2]
        379 - [0][4] [4][0] [4][4]

    *
    * */
