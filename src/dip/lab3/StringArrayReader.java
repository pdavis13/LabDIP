package dip.lab3;

import java.util.*;

/**
 *
 * @author pdavis13
 */
public class StringArrayReader implements Reader{
    
    ArrayList<String> arrayList;

    public final ArrayList<String> getArrayList() {
        return arrayList;
    }

    public final void setArrayList(ArrayList<String> arrayList) {
        this.arrayList = arrayList;
    }
    
    public StringArrayReader(ArrayList<String> arrayList) {
        setArrayList(arrayList);
    }
    
    public final String getMessage(){
        String message = "";
        for(int i = 0; i < arrayList.size(); i++){
            message += arrayList.get(i);
        }
        return message; 
    }
}
