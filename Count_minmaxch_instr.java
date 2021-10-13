package geekster;

public class Count_minmaxch_instr {
	public static void main(String []args) {
		String str="Tit for tat is a proverb";
		str=str.toLowerCase();
		int t=0;
		int f=0;
		for(int i=0;i<str.length();i++) {
          char ch=str.charAt(i);
          if(ch=='t') {
        	  t++;
          }
          if(ch=='f') {
        	  f++;
          }
		}
		System.out.println("T= "+t);
		System.out.println("F= "+f);
	}
 }
