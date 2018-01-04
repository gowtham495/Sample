import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int r = sc.nextInt();
		Details det = new Details(n,r);
		det.display();
		System.out.println("hi");

	}

}
