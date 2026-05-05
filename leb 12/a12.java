import java.io.*;
public class a12{
	public static void main(String[] args)
	{
		try{

			BufferedReader bf=new BufferedReader(new FileReader("E:/xyz.txt"));
			String line="";
			int word=0;
			int ch=0;
			int lineNo=0;
			while((line=bf.readline())!=null){
				lineNo++;
				String[] word=line.split(" ");
				word+=word.length;
				for(int i=0;i<word.length;i++){
					ch+=word[i].length();
				}
			}
			bf.close();
			System.out.println("Number of words"+word);
			System.out.println(lineNo);
			System.out.println("Total Number of Character"+ch);


		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}