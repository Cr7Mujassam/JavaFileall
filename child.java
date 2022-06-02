package SuperKeyword;

public class child extends parent {
		int c,d;
		
		child(int a,int b,int c,int d){
			super(a,b);
			this.c=c;
			this.d=d;
		}
		
		void display() {
			System.out.println("parent a" + super.a);
			System.out.println("Parent b" + super.b);
			System.out.println("Child c" + this.c);
			System.out.println("Child d" + this.d);
		}
		
	
		void f1() {
			super.f1();
			super.name="Mujassam";
			System.out.println(super.name);
			System.out.println("You are in child f1()");
		}
}
