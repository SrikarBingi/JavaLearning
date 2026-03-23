package Day5.Generics;

import java.util.List;

public class PrintDataFloat {
    List<Double> item;
    public PrintDataFloat(List<Double> item){
        this.item = item;
    }
    public List<Double> print(){
        return item;
    }
}
