package console.drawing.tool;

import console.drawing.canvas.Canvas;
import console.drawing.command.Command;
import console.drawing.tool.DrawingTool;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class DrawingToolTest {

    DrawingTool drawingTool;

    @Mock
    Command command;

    @Before
    public void setUp(){
        drawingTool = new DrawingTool();
    }

    @Test
    public void testDraw(){
        drawingTool.draw(command);
        verify(command,times(1)).execute(any(Canvas.class));
    }

}
