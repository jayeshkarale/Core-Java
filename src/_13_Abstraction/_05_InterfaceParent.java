package _13_Abstraction;

interface GrandFather{
	void advise();
}

interface Father extends GrandFather{
	void work();
}

interface Mother extends GrandFather{
	void cook();
}

class Son implements Father, Mother{
	@Override
	public void cook() {
		System.out.println("cooking..");
	}
	@Override
	public void work() {
		System.out.println("Working..");
	}
	@Override
	public void advise() {
		System.out.println("Advise..");
	}
}

public class _05_InterfaceParent {
	public static void main(String[] args) {
		
		Son s = new Son();
		s.cook();
		s.work();
		s.advise();
		
	}

}
