import java.io.*; 
import java.util.Arrays;
import java.math.BigInteger;

public class RunSolution{

	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RESET = "\u001B[0m";

	public static void main(String[] args) throws Exception{

		//input parsing and reading
		File input00File = new File("../../test-cases/input/input00.txt");
		BufferedReader brInput00 = new BufferedReader(new FileReader(input00File));

		File input01File = new File("../../test-cases/input/input01.txt");
		BufferedReader brInput01 = new BufferedReader(new FileReader(input01File));

		String st;
		int currentLine = 0;
		String lineSplit[];

		int[] a00 = null;
		int[] a01 = null;

		while((st = brInput00.readLine()) != null){
			if(currentLine == 1){
				a00 = Arrays
					.stream(st.split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			}
			currentLine++;
		}

		currentLine = 0;

		while((st = brInput01.readLine()) != null){
			if(currentLine == 1){
				a01 = Arrays
					.stream(st.split(" "))
					.mapToInt(Integer::parseInt)
					.toArray();
			}
			currentLine++;
		}

		// problem application

		int response00 = MinimumDistances.run(a00);
		int response01 = MinimumDistances.run(a01);
		

		// expected outputs

		File output00File = new File("../../test-cases/output/output00.txt");
		BufferedReader brOutput00 = new BufferedReader(new FileReader(output00File));

		File output01File = new File("../../test-cases/output/output01.txt");
		BufferedReader brOutput01 = new BufferedReader(new FileReader(output01File));

		int output00 = 0;
		int output01 = 0;

		while((st = brOutput00.readLine()) != null){
			output00 = Integer.parseInt(st.trim());
		}

		while((st = brOutput01.readLine()) != null){
			output01 = Integer.parseInt(st.trim());
		}

		System.out.println(((response00 == output00) ? ANSI_GREEN : ANSI_RED) + "INPUT 00");
		System.out.println(((response01 == output01) ? ANSI_GREEN : ANSI_RED) + "INPUT 01"+ ANSI_RESET);
	}
}