package dip.lab3;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author pdavis13
 */
public class KeyboardReader implements Reader{
    
    public final String getMessage(){
        System.out.println("Please input message");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
