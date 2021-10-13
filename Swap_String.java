package geekster;

public class Swap_String {
	public static void main(String []args) {
		String str1="Hello";
		String str2="World";
		
		System.out.println("String before swap");
		System.out.println("String1 "+str1);
		System.out.println("String2 "+str2);
		
		str1=str1.concat(str2);
		str2=str1.replace("World","");
		str1=str1.replace("Hello", "");
		
		System.out.println("String after swap");
		System.out.println("String1 "+str1);
		System.out.println("String2 "+str2);
	}

}
