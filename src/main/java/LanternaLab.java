import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.awt.*;
import java.io.IOException;

public class LanternaLab {

    public static void main(String[] args) throws IOException {
        Screen screen = new Screen();
        screen.putChar(4, 4, 'X');
        screen.putChar(6, 6, 'B', Screen.RED, Screen.GREEN);

        System.out.println(screen.getChar(4,4));
    }

}
