package vjezbe;

public class VjezbaMathRandom {

	public static void main(String[] args) {
		// How do you generate a random integer i such that 
		// 0 less than or equal i less than 20?
		// a.How do you generate a random integer i such that 0 <= i < 20 ?
		// b. How do you generate a random integer i such that 10 <= i < 20
		// c. How do you generate a random integer i such that 10 <= i <= 50
		// d. Write an expression that returns 0 or 1 randomly.
		//(a) (int)(Math.random() * 20)
		//(b) 10 + (int)(Math.random() * 10)
		//(c) 10 + (int)(Math.random() * 41)
		//(d) (int)(Math.random() * 2)
		
		System.out.println(10 + (int)Math.random() * 41);
		
	}
}
