package Composite;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File f1 = new File(); 
        File f2 = new File(); 
        Folder folder = new Folder(); 
        folder.add(f1); 
        folder.add(f2); 

        folder.show(); 
    }
}
