package q02_advanced.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public String inputString() throws IOException {
		return br.readLine();
	}

	public int inputNumber() throws IOException {
		return Integer.parseInt(br.readLine());
	}

}
