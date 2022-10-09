package StringsInterviewQue;

public class ReverseString {

	public static void main(String[] args) {
		//reverse stringBuilder using 
		StringBuilder sb=new StringBuilder("sagar");
		
		for(int i=0; i<sb.length()/2; i++) {
			int front=i;
			int back= sb.length() -1-i; //5-1-0 =>4
			
			char frontChar=sb.charAt(front);
			char backChar=sb.charAt(back);
			
			sb.setCharAt(front, backChar);
			sb.setCharAt(back, frontChar);
		}
		System.out.print(sb);
		
		
		
		
	}

}
