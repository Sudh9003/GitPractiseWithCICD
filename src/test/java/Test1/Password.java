package Test1;
import java.util.Arrays;

public class Password {

	public static void main(String[] args) {
		
		
		String s= "Sudhanshu Sinha";
		System.out.println(s.replace(" ",""));
		String name[]= s.split(" ");
		String fName= s.split(" ")[0];
		System.out.println("Hi How Are You");
		System.out.println("Doing Good");
		System.out.println("Havyfk");
		System.out.println("srgbbary");
		System.out.println("srgbbary");
		
		int i;
		for(i=0;i<name.length;i++)
		{
		System.out.print(name[i]);
		System.out.print(Arrays.toString(name));
		}
		
	}
	public void newFunction() {
		System.out.println("New Function Added");
	}
	}