package Day5.Bounded;

public class GenericMain {
    public static void main(String[] args) {
        NewDataType1 newDataType1 = new NewDataType1();
        @SuppressWarnings("rawtypes")
        NewDataTypeGeneric newDataTypeGeneric = new NewDataTypeGeneric<>(newDataType1);
        newDataTypeGeneric.print();
    }
}
