package sangdepzai;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test2 {
	public static void main(String[] args) {
		try {
			FileInputStream input = new FileInputStream("input.txt");
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));

			FileOutputStream output = new FileOutputStream("output.txt");
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));

			String line;
			while ((line = reader.readLine()) != null) {
				writer.write(line);
				writer.newLine();
			}
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
