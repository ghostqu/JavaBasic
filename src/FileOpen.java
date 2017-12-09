import java.io.*;

public class FileOpen {
	public static void main(String[] arg) {
		try{
			FileReader f = new FileReader("tset.txt");
			BufferedReader br = new BufferedReader(f);
			String s;
			while((s = br.readLine() )!= null) {
				System.out.println(s);
			}
		} catch(IOException e) {
			System.out.println(e);
		} finally {
			System.out.println("this will be deploy!");
		}		
	}
}
