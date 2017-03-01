/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author pdavis13
 */
public class ConsoleWriter implements Writer{
    public final void writeMessage(String message){
        System.out.println(message);
    }
}
