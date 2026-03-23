package Day5.Bounded;

public class NewDataTypeGeneric <T extends NewDataType>{
    T data;
    public NewDataTypeGeneric(T data){
        this.data = data;
    }
    public void print(){
        System.out.println(data);
    }
}
