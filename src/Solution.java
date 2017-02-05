import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {
		String input = null;
		String input2 = null;
		BigInteger number;
		BigInteger number2;

		try{
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			input = bufferedReader.readLine();
			input2 = bufferedReader.readLine();
			Long numberDouble = Long.parseLong(input);
			Long numberDouble2 = Long.parseLong(input2);
			number = BigInteger.valueOf(numberDouble);
			number2 = BigInteger.valueOf(numberDouble2);


			System.out.println(output(number, number2));
			System.out.println(output2(number, number2));
		} catch (NumberFormatException ex) {
			System.out.println("Not a number !");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static BigInteger output(BigInteger n, BigInteger n1) {
		return n.add(n1);
	}
	public static BigInteger output2(BigInteger n, BigInteger n1) {
		return n.multiply(n1);
	}

}