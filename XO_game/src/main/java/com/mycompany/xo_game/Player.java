package com.mycompany.xo_game;

public class Player {

    // Attributes:
    private String name;
    private char op;

    // Default Constructor:
    public Player() {
    }

    // Parametrized Constructor:
    public Player(String name, char op) {
        this.name = name;
        this.op = op;
    }

    // Setters&&Getters:
    public void setName(String name) {
        this.name = name;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public String getName() {
        return name;
    }

    public char getOp() {
        return op;
    }
}
