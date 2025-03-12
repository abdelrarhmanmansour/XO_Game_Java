package com.mycompany.xo_game;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    Board b;

    @BeforeEach
    public void getBoard() {
        b = new Board();
    }

    @Test
    public void Testgetrow() {
        assertEquals(1, b.Get_Row(5));
    }

    @Test
    public void Testgetcol() {
        assertEquals(1, b.Get_Col(5));
    }

    @Test
    public void TestEmpty() {
        assertEquals(true, b.Is_Empty(5));
    }
    @Test
     public void TestReplace()
     {
         Player p=new Player("Ali",'x');
         b.Replace_Char(5, p);
         assertEquals(b.arr[1][1],'x');
     }
     @Test
     public void TestEmptywithop()
     {
         Player p=new Player("Ali",'x');
         b.Replace_Char(5, p);
         assertEquals(true,'x');
     }
}
