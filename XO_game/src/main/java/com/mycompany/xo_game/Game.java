package com.mycompany.xo_game;

import java.util.Scanner;

public class Game {

    // Attributes:
    private Board b = new Board();
    private Player p1 = new Player();
    private Player p2 = new Player();
    private int counter = 0;
    Scanner cin = new Scanner(System.in);

    // Methods:
    public void ReadPlayerData() {
        System.out.println("Welcome to XO Game:\n");
        System.out.println("Enter Player one name:\n");
        String Player_one_name = cin.next();
        p1.setName(Player_one_name);
        System.out.println("Choose Player one OPerator (X | O):\n");
        char Player_one_op = cin.next().charAt(0);
        p1.setOp(Player_one_op);
        System.out.println("Enter Player two name:\n");
        String Player_one_two = cin.next();
        p2.setName(Player_one_two);
        if (p1.getOp() == 'x' || p1.getOp() == 'X') {
            p2.setOp('o');
        } else {
            p2.setOp('x');
        }
    }

    // Master Methods:
    void Play() {
        // player one is even; 0,2,4
        // player two is odd; 1,3,5
        ReadPlayerData();
        b.Draw();
        while (!b.Is_Full()) {
            Player current_player = p1;
            if (counter % 2 == 1) {
                current_player = p2;
            }
            while (true) {
                System.out.println("Enter Position from 1:9\n");
                int pos = cin.nextInt();
                if (b.Replace_Char(pos, current_player)) {
                    break;
                }
            }
            b.Draw();
            if (b.Is_Win(current_player)) {
                System.out.println("The Winner is: " + current_player.getName());
                break;
            }
            counter++;
        }
        // when matrix full and no one win:
        if (b.Is_Full()) {
            System.out.println("Game is Draw,Game Over\n");
        }
    }
}
