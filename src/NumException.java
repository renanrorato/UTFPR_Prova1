public class NumException extends Exception {

    public NumException(){
        super();
    }

    public void impMsg(){
        System.out.println("\nERRO: Não pode haver número negativo na conta!");
    }
}
