package day3;

public class NoAccess extends AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier am = new AccessModifier();
		
		NoAccess Noam = new NoAccess();
		Noam.method1();
		Noam.method2();
		Noam.method3();
		Noam.method4();
		
		am.method1(); //public
		am.method2(); //default
		// am.method3(); //private
		am.method4(); //protected
		
		method1();
		method2();
		method3();
		method4();
	}

}
