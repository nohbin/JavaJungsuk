package day0408;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Sample2 {
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	String str = br.readLine();
	int num = Integer.parseInt(br.readLine());
	bw.write(str + "\n");
	bw.write(String.valueOf(num));
	
	bw.flush();
	bw.close();
}
}
