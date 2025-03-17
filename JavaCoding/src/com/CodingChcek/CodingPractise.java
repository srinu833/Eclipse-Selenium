package com.CodingChcek;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class CodingPractise {

	 static String testV = "test";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner scn = new Scanner(System.in);
		//System.out.println("Enter String");
		//String inpt = scn.nextLine();
		//scn.close();
		//changes from srinu833
		DuplicateLetters("Lamba jumbaa");
		//TreeSetPractise();
		//ArrayListPractise();
		//StringOps();
		//I have added this line
		//I have added another  line
		//HMPractise();
		RepeatedWords();
	}
		
		
		// If and For loop practise
		
	/* int [] aryiter = new int[5] ;
		
	 int [] aryiter = {1,2,3,4,5};
	 k = aryiter.length;
		
		for (i = 0; i < aryiter[k-1]; i++) {
			System.out.println("welcome to my java checks " +i);
			
			for( j = 0; j <= 5; j++) {
			
				
				if (i == j ) {
					
					System.out.println("Both have same number so closing the loop");
					break;
					
				}
					else {
						System.out.println("Not the same numbers");
						
						
					}	
					
				}
			
			
		}*/
		
		
		//Reverse string
		/*
		String org = "my name is srinu";
		String rev = "";
		
		for ( i = org.length()-1; i >= 0 ; i--) {
			
			rev = rev + org.charAt(i) ;
			
			
		}
		
		System.out.println(rev);

		 */
		
		//Reverse Sentence
		/*
		String org = "My name is srinu";
		String rev = "";
		
		String [] temp = org.split(" ");
		
		for(i = temp.length-1; i >= 0; i--) {
			
			rev = rev + " " + temp[i];
		}
		
		System.out.println(rev);
		*/
	
	//String str = "ABC fgt CDE acb CDE ABC acb ABC fgt jkr";
static void RepeatedWords () {
	String str = "ABC abc fgt CDE cde acb CDE acb abc fgt jkr CDE";
	 //str = str.toUpperCase();
	Hashtable<String, Integer> hm = new Hashtable<>();


	String[] splitStr = str.split(" ");

	for (String temp : splitStr) {
		//System.out.println(temp);
		//System.out.println(hm.containsKey(temp));
		if (hm.containsKey(temp)) {
			hm.put(temp, hm.get(temp) + 1);
		} else {
			hm.put(temp, 1);
	
		}
	}


	
	hm.forEach((key, value) -> System.out.println(key + " : " + value));
	System.out.println(CodingPractise.testV);
}
//------------------------------	
//	HashMap <String, Integer> hasm = new HashMap <String, Integer>();
//	
//	String[] arr = str.split(" ");
//	
//		for (String tmp : arr) {
//			if (hasm.containsKey(tmp)) {
//				
//				hasm.put(tmp, hasm.get(tmp) + 1);
//			}
//			else {
//				hasm.put(tmp, 1);
//			}
//			
//			}
//		
//		for (String x : hasm.keySet())
//		{
//			
//			System.out.println(x + "<>" + hasm.get(x));
//		}
//		
	 		
//		String methods
		static void StringOps() {
		String org = "My Name is Srinu";
		String sam = "My name is srinu";
		String othr = "My Name is srinu";
		//System.out.println(org.toUpperCase());
	//	System.out.println(org.toLowerCase());
		//System.out.println(org.compareTo(othr));
		//System.out.println(org.compareTo(sam));
	//	System.out.println(org.concat(othr));
		//System.out.println(org.contains("Srinu"));
		//System.out.println(org.startsWith("Name", 3));
		System.out.println(org.substring(3));
		System.out.println(org.length());
		if(org.equalsIgnoreCase(othr) == true) {
			
			System.out.println("Both are same strings are equal");
			System.out.println(testV);
		
		}
		}
		
// Exception handling
//		i = 10;
//		j = 5;
//		
//		
//		try {
//			k = j/0;
//			System.out.println(k); }
//			catch (Exception a){
//				System.out.println(a);
//						
//		
//		throw (a);
//	}
//		finally {
//		
//	
//		}
//	
	//Duplicate Letters
		static void DuplicateLetters(String dup) {
		String str = dup;
		int i,j,k;
		char [] charr = str.toCharArray();
		
		for (i =0; i < charr.length; i++) {
			int count = 1;
			for (j = 1; j < charr.length; j++) {
				
				if(charr[i]==charr[j] && i!=j) {
					
					count = count + 1;
					charr[j] = '0';
				}
				
			}
			if(count > 1 && charr[i]!='0') {
			System.out.println(charr[i] + "repeated "+ count + "times'");
			}
		}
	
		System.out.println(charr);
	}

		static void TreeSetPractise () {
			
			TreeSet <Integer> mySet = new TreeSet<Integer>();
			
			
	
			int [] iarr = new int [5];
			iarr[1] = 1;
			iarr[0] = 3;
			iarr[2] = 8;
			iarr[3] = 8;
			iarr[4] = 10;
			
			int [] uarr = {11,33,8,8,8,100,29,29,456,34,56};
			
			for(int tmp : uarr) {
				System.out.println(mySet.add(tmp));
			
			}
			
			mySet.add(7);
			
			System.out.println(mySet);
			System.out.println(Arrays.toString(uarr));
			
			
			TreeSet <String> TS = new TreeSet<>();
			TS.add("NAGA");
			TS.add("SRINU");
			TS.add("SRI");
			System.out.println(TS.contains("SRINU"));
			
			//Arrays.sort(uarr);
			//System.out.println(Arrays.toString(uarr));
			//System.out.println(uarr[uarr.length-1]);
			//System.out.println(uarr[0]);
			//System.out.println(Arrays.equals(iarr, uarr));
			//System.out.println(Arrays.compare(iarr, uarr));
	
			//System.out.println(Arrays.toString(iarr));
//			for(int x: iarr) {
//				
//				if(!mySet.add(x)) {
//					System.out.println("false");
//				}
//				else {System.out.println("true"); }
//			}
//			
//			System.out.println(mySet);
		}
		
		static void ArrayListPractise() {
			
			List<String> arList = new ArrayList<String>();
			
			arList.add("Srinu");
			arList.add("Naga");
			arList.add("Maha");
			arList.add("Godisi");
			arList.add("Pothana");
			
			ArrayList<String> arList2 = new ArrayList<String>();
			
			arList2.add("Srinu");
			arList2.add("Naga");
			arList2.add("Maha");
			arList2.add("Godisi");
			arList2.add("Pothana");
			
			System.out.println(arList2.equals(arList));
			ArrayList<Integer> arList3 = new ArrayList <Integer>();
		
			arList3.add(12);
			arList3.add(10);
			arList3.add(19);
			arList3.add(32);
			arList3.add(67);
		
			
			arList3.set(2, 100);
			List<Integer> arList4 = new ArrayList <>();
			String mystr = "12,34,678,90,87778,667,56567,88,22,33,4565,7676,88,98998,9,998,9898,999,989,323,2,4324,35434234,5232523,4254523";
			
			String [] myarr = mystr.split(",");
			
			for(int i =0; i<=myarr.length-1; i++) {
				
				arList4.add(Integer.valueOf(myarr[i]));
				
			}
			
			
			//System.out.println(arList.equals(arList2));
			//System.out.println(arList4.indexOf(90)); 
			Collections.sort(arList4);
			//System.out.println(Collections.min(arList4));
			System.out.println(arList4); 
			//System.out.println(arList4.indexOf(90)); 
			arList4.forEach(System.out::println); 
		}
		

		
		static void HMPractise() {
			
			Hashtable<Integer, String> hm = new Hashtable<>();
			Hashtable<Integer, String> hm2 = new Hashtable<>();
			hm.put(10, "Srinu");
			hm.put(11, "Godisi");
			hm.put(13, "Naga");
			hm.put(14, "Naga");
			hm.put( 0, "Naga");
			
			
			//hm.put(10, hm.get(11) + hm.get(10));
			
			hm2.put(10, "Srinu");
			hm2.put(11, "Godisi");
			hm2.put(12, "Naga");
			//hm.equals(hm2)
			//hm.keySet();
			System.out.println(hm.keySet()); 
			System.out.println(hm.size()); 
			System.out.println(hm.containsValue("Srinu"));
			System.out.println(hm2.containsKey(11));
			
			HashSet<Integer> hSet = new HashSet<>();
			hSet.add(12);
			hSet.add(13);
			hSet.add(12);
			
			//System.out.println(hSet.toString()); 
		}
		
		static void triangles() {
			
			for(int i=1;i<=10;i++) {
				
				for(int j=1; j<=i;j++) {
				System.out.print("*");
				
				}
				System.out.println(" ");
			}
			
			
		}
		

}
