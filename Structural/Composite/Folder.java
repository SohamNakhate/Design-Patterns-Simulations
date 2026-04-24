package Composite;
import java.util.*;

class Folder implements FileSystem{
    List<FileSystem> list = new ArrayList<>(); 

    public void add(FileSystem f){
        list.add(f); 
    }

    public void show(){
        for(FileSystem f : list){
            f.show();
        }
    }
}
