public class TestEmployeeMethods{
    public static void main(String[] args){
        Employee aWorker = new Employee();
        aWorker.setValues();
        aWorker.methodThatUsesIntanceAttributes();
        aWorker.methodThatUsesLocalVariables();
    }
    
}