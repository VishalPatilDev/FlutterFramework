import java.io.*;
class ExceptionDemo{
	public static void main(String [] args)throws IOException{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str);
		int data;
		try{
			data = Integer.parseInt(br.readLine());
		}catch(NumberFormatException obj){
			System.out.println("please enter integer data");
			data = Integer.parseInt(br.readLine());
		}
		System.out.println(data);
	}
}
