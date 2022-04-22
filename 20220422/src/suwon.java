import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class suwon {

	public static void main(String[] args) throws IOException {
	
		
		int count = 0; //배열의 크기 
		{
			File file = new File("data/suwon.txt");
			FileInputStream infile = new FileInputStream(file);	
			Scanner sc = new Scanner(infile);
			
			while(sc.hasNextLine()) { //읽어올데이타가잇으면 수행 hasNextLine
				sc.nextLine();
				count++;
			}
			count--;
			System.out.println("count :" + count);
			sc.close();
			infile.close();
		} 
		
		// 변수명 만들기
		// 어학사전을 참고해서 만들면 좋다. 
		  String[] region = new String[count];
	      String[] city = new String[count];
	      String[] district = new String[count];
	      String[] dong = new String[count];
	      int[] variety = new int[count];
	      String[] howmany = new String[count];
	      String[] owner = new String[count];
	      String[] office = new String[count];
	      String[] callnum = new String[count];
	      String[] data = new String[count];
		
	      {	
	    	//불러오는 데이타 파일명은 항상 "영어로" 해야 오류안나~
			File file = new File("data/suwon.txt");
			FileInputStream infile = new FileInputStream(file);	
			Scanner sc = new Scanner(infile);
			
			int total = 0;
			sc.nextLine(); // 파일 가장 상단 필드명에 등록품종수가 한글이기때문에 에러나서
							//sc.nextLine을 썻어.
			
			for(int i=0; i<count; i++) {
				String line = sc.nextLine();
				
				String[] tokens = line.split(","); // split(",")은 콤마로 분리해서 집어넣었단 뜻.
				region[i] = tokens[0]; 
				city[i] = tokens[1]; 
				district[i] = tokens[2]; 
				dong[i] = tokens[3]; 
				variety[i] = Integer.parseInt(tokens[4]); 
				total += variety[i];
			}
			
			for(int i=0; i<count; i++) 
				System.out.printf("%s %s %s %s %d\n",region[i], city[i], district[i],dong[i],variety[i]);
				System.out.println("total = " +total);
	
		}

	}}
