package bluques_for;

public class piramide_numeros {
	public static void main(String[] args) {
		for (int i = 9; i >=1; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
