package edu.schollj3.assign06;
import edu.schollj3.assign04.GameBoard;
//NOTE: CHANGE realemj to YOUR SITNETID!!!
import org.testng.annotations.Test;

public class Test_Drawable {

    private class DrawTest implements Drawable {
        public void draw(GameBoard map) {

        }
    }

    @Test()
    public void testDrawable() {
        Drawable drawableThing = new DrawTest();
        drawableThing.draw(new GameBoard(1,1,'.'));
    }
}
