import day3.AccessModifier;
import day3.NoAccess;

public class NoAccess_Outside extends AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier am = new AccessModifier();
		am.method1(); //public
		am.method2(); //default
		am.method3(); //private
		am.method4(); //protected
		
		NoAccess_Outside Noam = new NoAccess_Outside();
		Noam.method1();
		Noam.method2();
		Noam.method3();
		Noam.method4();
		
		method1();
		method2();
		method3();
		method4();
	}

}

