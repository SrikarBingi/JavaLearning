package Day5.Generics;

import java.util.List;

public class PrintDataInteger {
    List<Integer> item;
    public PrintDataInteger(List<Integer> item){
        this.item = item;
    }
    public List<Integer> print(){
        return item;
    }
}
