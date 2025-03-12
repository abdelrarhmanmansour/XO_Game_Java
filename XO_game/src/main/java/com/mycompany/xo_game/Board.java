package com.mycompany.xo_game;

public class Board {

    // Attributes:
    // 2D character array;
    public char[][] arr;
    // Default Constructor:

    public Board() {
        // initilize to elements of array:
        this.arr = new char[][]{{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
    }

    // Methods:
    public int Get_Row(int index) {
        // index << number of initilize of array in Default Constructor;
        return ((index - 1) / 3);
    }

    public int Get_Col(int index) {
        // index << number of initilize of array in Default Constructor;
        return ((index - 1) % 3);
    }

    public boolean Is_Empty(int index) {
        // in case if  user enter index << (-1 || 10);
        if (index < 1 || index > 9) {
            return false;
        }
        int row = Get_Row(index);
        int col = Get_Col(index);
        if (arr[row][col] == 'x' || arr[row][col] == 'o' || arr[row][col] == 'X' || arr[row][col] == 'O') {
            return false;
        }
        return true;
    }

    public boolean Replace_Char(int index, Player p) {
        if (Is_Empty(index)) {
            int row = Get_Row(index);
            int col = Get_Col(index);
            // replace empty square by x or o;
            arr[row][col] = p.getOp();
            return true;
        }
        return false;
    }

    public void Draw() {
        for (int i = 0; i < 3; i++) {
            System.out.println("-----------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("|  " + arr[i][j] + "  ");
            }
            System.out.println("|");
        }
        System.out.println("-----------------");
    }

    public boolean Is_Full() {
        int counter = 0;
        for (int i = 1; i <= 9; i++) {
            if (Is_Empty(i)) {
                counter++;
            }
        }
        if (counter == 0) {
            return true;
        }
        return false;
    }

    public boolean Is_Win(Player p) {
        if (arr[0][0] == arr[0][1] && arr[0][0] == arr[0][2] && arr[0][1] == arr[0][2]) {
            return true;
        }
        if (arr[1][0] == arr[1][1] && arr[1][0] == arr[1][2] && arr[1][1] == arr[1][2]) {
            return true;
        }
        if (arr[2][0] == arr[2][1] && arr[2][0] == arr[2][2] && arr[2][1] == arr[2][2]) {
            return true;
        }
        if (arr[0][0] == arr[1][0] && arr[0][0] == arr[2][0] && arr[1][0] == arr[2][0]) {
            return true;
        }
        if (arr[0][1] == arr[1][1] && arr[0][1] == arr[2][1] && arr[1][1] == arr[2][1]) {
            return true;
        }
        if (arr[0][2] == arr[1][2] && arr[0][2] == arr[2][2] && arr[1][2] == arr[2][2]) {
            return true;
        }
        if (arr[0][0] == arr[1][1] && arr[0][0] == arr[2][2] && arr[1][1] == arr[2][2]) {
            return true;
        }
        if (arr[0][2] == arr[1][1] && arr[0][2] == arr[2][0] && arr[1][1] == arr[2][0]) {
            return true;
        }
        return false;
    }

}
