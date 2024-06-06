/*How to create a class, object, method and its signature*/
package java_basic;

/*create class using  class keyword  */
public class class_AND_object {
	
	//created a method using methodName()
	public  void method_name() {
		 //fields are used to store data
		String Str="veerasekhar";
		System.out.println(Str);
	}
	//create main method//
	public static void main(String[] args) {
		//create instance for object //
		class_AND_object object= new class_AND_object();
		//take reference and call method name//
		object.method_name();
	}

}
