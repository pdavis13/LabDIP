package dip.lab3;

/**
 *
 * @author pdavis13
 */
import java.util.*;

public class Startup {
    public static void main(String[] args) {
        /*
         * We'll just use this class for testing our ccde.
         * We'll provide input and get some output...
         */
        ArrayList<String> arrayListMessage = new ArrayList<String>(Arrays.asList("Array", "List", "Message"));
        
        //Low-level modules
        Reader keyboardReader = new KeyboardReader();
        Reader stringArrayReader = new StringArrayReader(arrayListMessage);
        
        Writer consoleWriter = new ConsoleWriter();
        Writer guiWriter = new GUIWriter();

        // High-level module
        ReadService rs = new ReadService();
        WriteService ws = new WriteService();

        ws.writeMessage(guiWriter, rs.getMessage(keyboardReader));
        ws.writeMessage(consoleWriter, rs.getMessage(stringArrayReader));
    }
}
