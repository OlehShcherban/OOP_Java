package lab3;

public class Executable {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		System.out.println(fibonacci.getNumber(5));
		System.out.println(fibonacci.getNumber(20));
		System.out.println(fibonacci.getNumber(100));
		System.out.println(fibonacci.getNumber(300000));
	}

}
