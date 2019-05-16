package java0516;

public class Main {

	public static void main(String[] args) {
		
		
		BB bb = new BB(){
			void B() {
				System.out.println("B()");
			}
			void A() {
				System.out.println("A()");
			}
			
		};
		
		bb.A();
		bb.B();

	}

}
