public class Initializer {
    static int initialValue;

    Initializer(int InitialVal){
        initialValue = InitialVal;
    }

    //Static always runs immediately after the program is loaded
    static {
        initialValue = 1000;
        System.out.println("Static Block: Initial Value is : " + initialValue);
    }

    public static void main(String args[]){
        System.out.println("The Initial Value before instatiation : " + initialValue);
        
        Initializer I = new Initializer(2000);

        System.out.println("The Initial Value after instatiation : " + initialValue);
    }
}
