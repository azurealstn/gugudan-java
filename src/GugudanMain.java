
public class GugudanMain {
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			int[] result = Gugudan.calc(i + 2);
			for (int j = 0; j < result.length; j++) {
				System.out.println(result[j]);
			}
			System.out.println("---------");
		}
	}
}
