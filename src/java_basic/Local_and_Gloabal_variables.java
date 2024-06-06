package java_basic;
//Define the local and Global variables with the same name and print both variables and understand the scope of the variables

public class Local_and_Gloabal_variables {
	  // Instance variable is declared inside the class but outside the body of the method.
    int a = 11;
    void localVariable() {
        //Local variables are declared in methods, constructors, or blocks.
        int a = 22;
        System.out.println("Local variable a : " + a);
    }

    public static void main(String[] args) {
    	Local_and_Gloabal_variables obj = new Local_and_Gloabal_variables ();
        System.out.println("Instance variable a : " + obj.a);
        //calling method()
        obj.localVariable();
    }
	

}
