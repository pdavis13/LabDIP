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
public class MessageService {
    private Reader reader;
    private Writer writer;

    public MessageService(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }
    
    public void produceMessage() {
        writeMessage(readMessage());
    }
    
    public void writeMessage(String msg) {
        writer.writeMessage(msg);
    }
    
    public String readMessage() {
        return reader.getMessage();
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
    
    
}
