package com.bridgelabz;
import java.util.Scanner;


public class TicTacToe {

   static Scanner sc = new Scanner(System.in);
   static char player;
    static  void letterchoose(){

//        String p1 = sc.nextLine();
//        String p2 = sc.nextLine();
//        System.out.print(p1 + ", Choose X or O: ");
//        String letter = sc.next();
        System.out.println("Letter entered is X or O");
        char player = sc.next().charAt(0);
        //char computer = sc.next().charAt(0);
        char computer=' ';
        if (player == 'X') {
            computer='O';
            System.out.println("Computer choose: " + player);

        } else {
            computer = 'O';
            System.out.println("Computer choose: " + computer);
        }
        System.out.println("Player choose: " + player);
        System.out.println("Computer choose: " + computer);

    }

    static char[] board = new char[10];
    public static void showBoard()
    {
        System.out.println("Current board looks like this");
        for (int j = 1; j <= 9; j++) {
            System.out.print(board[j] + " | ");
            if (j % 3 == 0) {
                System.out.println();
            }
        }
    }
    static void move() {

        for (int i = 1; i <= 9; ) {
            System.out.println("Enter the position (1,2,3,4,5,6,7,8,9)");
            int position = sc.nextInt();
            if (position <= 9) {
                if (board[position] == ' ') {
                    System.out.println("position is free");
                } else {
                    System.out.println("Position is already filled, Enter new position");
                }
                board[position] = player;
            } else if (position > 9) {
                System.out.println("Enter position from 1 to 9");
            }
            i++;
        }
    }


    public static void main(String[] args) {

        char[][] board = new char[3][3];
        //Initialize
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        System.out.println(" 1 2 3");
        System.out.println("A" + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-----");
        System.out.println("B" + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-----");
        System.out.println("C" + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

        letterchoose();
        showBoard();
        move();

    }

}
