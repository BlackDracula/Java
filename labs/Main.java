
public class Main extends Calculator {
	public static void main(String[] args) {
		Calculator a = new Calculator();
		System.out.printf("%f: \n", a.sum(2, 3));
		System.out.printf("%f: \n", a.divide(2, 3));
		System.out.printf("%f: \n", a.minus(2, 3));
		System.out.printf("%f: \n", a.multiply(2, 3));
	}

}
