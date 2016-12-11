import java.io.BufferedReader;
import java.io.FileReader;

public class ReadFirst1000CharFromFile {

	public static void main(String[] args) throws Exception{
		FileReader file = new FileReader("C:/Users/Navdeep/Desktop/test.txt");
		BufferedReader br = new BufferedReader(file);
		String[] c = new String[5];
		String line;
		int i = 0;
		int count = 0;
		while((line=br.readLine()) !=null)
		{
			c[i%5] = br.readLine();
		}
		
		int start = count - 5;
		if(start <0){
			start = 0;
		}
		for(int j = start; j < count; j++){
			System.out.println(c[j%5]);
		}
		br.close();		
	}
}
