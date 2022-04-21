import java.util.Arrays;

public class ArrayEx13 {

	public static void main(String[] args) {

		 String[] names = {"kim", "park", "Yi"};
		 
		 for(int i=0; i<names.length; i++) {
			 System.out.println("names[" +i+ "]:"+ names[i]);
		 }
		 System.out.println();
		 
		 String tmp = names[2];
		 System.out.println("tmp:" +tmp);
		 System.out.println();
		 
		 names[0] = "Yu";
		 
		 for(int i=0; i<names.length; i++)
			 System.out.println(names[i]);
		 
		 for(String str: names)
			 System.out.println(str);
		 
	}//main의 끝
}

