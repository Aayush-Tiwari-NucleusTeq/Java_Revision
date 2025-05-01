package demo; 

class MyException extends Exception {
    public MyException(String m) {
        super(m);
    }
}

// A Class that uses the above MyException
public class Demo3 {
    public static void main(String args[]) throws MyException {
        try {
            
            // Throw an object of user-defined exception
            throw new MyException("This is a custom exception");  
        }
        catch (MyException ex) {
            System.out.println("Caught");  
            System.out.println(ex.getMessage());  
        }
    }
}