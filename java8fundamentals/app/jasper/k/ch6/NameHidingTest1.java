package jasper.k.ch6;

class NameHidingTest1 {
	int n1 = 10;			// An instance variable
	static int n2 = 30;		// A class variable
	
	// M1  is method
	void m1(){
		// n1 and an2 can be used here
	}
	int n3 = n1;	// n1 can be used here
}
