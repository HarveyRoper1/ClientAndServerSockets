import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("192.168.0.8", 4999);
		Scanner sc = new Scanner(System.in);
		for(;;) {
		System.out.print("Enter Message: ");
		String msg = sc.nextLine();
		PrintWriter pr = new PrintWriter(s.getOutputStream());
		
		pr.println(msg);
		pr.flush();
		
		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);
		String str = bf.readLine();
		System.out.println("Server: "+ str);
		}
		
	}
	
	

}
