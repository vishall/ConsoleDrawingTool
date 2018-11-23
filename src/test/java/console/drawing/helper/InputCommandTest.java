package console.drawing.helper;

import org.junit.Assert;
import org.junit.Test;

public class InputCommandTest {

    @Test
    public void testCreate(){
        Assert.assertEquals(InputCommand.CREATE.getCommandCharacter(),"C");
    }

    @Test
    public void testLine(){
        Assert.assertEquals(InputCommand.LINE.getCommandCharacter(),"L");
    }

    @Test
    public void testRectangle(){
        Assert.assertEquals(InputCommand.RECTANGLE.getCommandCharacter(),"R");
    }

    @Test
    public void testFill(){
        Assert.assertEquals(InputCommand.FILL.getCommandCharacter(),"B");
    }

    @Test
    public void testQuit(){
        Assert.assertEquals(InputCommand.QUIT.getCommandCharacter(),"Q");
    }

    @Test
    public void testInvalid(){
        Assert.assertEquals(InputCommand.INVALID.getCommandCharacter(),"I");
    }
}
