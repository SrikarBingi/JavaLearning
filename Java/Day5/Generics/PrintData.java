package Day5.Generics;

public class PrintData <T>{
    T item;
    public PrintData(T item){
        this.item = item;
    }
    public T print(){
        return item;
    }
}
