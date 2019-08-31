
public class Fibo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fiboLimit = 5;
		int fibo;

		for (int i = 0; i < fiboLimit; i++) {
			int first = 0;
			int second = 1;
			int next;

			if (i == 0) {
				next = 0;
			}

			if (i == 1) {
				next = 1;
			} else {

				next = first + second;
				first = second;
				second = next;
			}

			System.out.println("Series Is: " + next);
//New Comment
		}
	}

}
