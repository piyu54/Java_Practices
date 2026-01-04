package com.string;

public class StringBuilderex {

	public static void main(String[] args) {
		
//		Create a StringBuilder with text "Hello" and append " Java".
		
		StringBuilder s = new StringBuilder("Hello ");
		s.append("Java");
		System.out.println(s);
		
//		Create a StringBuilder and insert the word "Java" in the middle of a sentence.
		String sen="i am learning programming ";
		StringBuilder s1 = new StringBuilder(sen);
		int mid=sen.length()/2;
		s1.insert(mid, " Java");
		System.out.println(s1.toString());
		
//		Reverse a string using StringBuilder.
		StringBuilder s2= new StringBuilder("hello");
		s2.reverse();
		System.out.println(s2);
		
//		Replace the word "Java" with "Python" using StringBuilder.
		
		StringBuilder s3= new StringBuilder("Java");
		s3.replace(0, 4, "Python");
		System.out.println(s3);
		
//		Delete characters from index 2 to 5 using StringBuilder.
		
		StringBuilder s4= new StringBuilder("i am java learner");
		s4.delete(2, 5);
		System.out.println(s4);
		
//		Convert String to StringBuilder and modify it.
		
		String name="priya";
		StringBuilder s5 = new StringBuilder(name);
		s5.append(" kushwaha");
		System.out.println(s5);
		
//		Count the number of characters using StringBuilder (without length()).
		
		StringBuilder s6 = new StringBuilder("piyu");
		
		try {
		for(int i=0;i<s6.charAt(i);i++)
		{
			System.out.println(i);
		}
		}catch(Exception e)
		{
		}
//		}
//		 int count = 0;
//
//	        try {
//	            while (true) {
//	                s6.charAt(count); // keep accessing characters
//	                count++;
//	            }
//	        } catch (Exception e) {
//	            // exception occurs when index is out of range
//	        }

//	        System.out.println("Number of characters: " + count);
		
//		Check whether the string is palindrome using StringBuilder reverse().
		
		String str = "mam";

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
//        System.out.println(sb);
        if (str.equals(sb.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
		
	}
}
