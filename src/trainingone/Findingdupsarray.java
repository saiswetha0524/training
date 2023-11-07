package trainingone;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Findingdupsarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  List<String> l1=Arrays.asList("AB", "BC", "DE"); 
		  List<String> l2=Arrays.asList("AB", "GT", "DE");
		  List<String> duplicates=l1.stream().filter(str->l2.contains(str)).collect(Collectors.toList());
		  System.out.println(duplicates);
		/*
		 * String[] l1= {"AB", "BC", "DE"}; String[]l2= {"AB", "GT", "DE"}; boolean
		 * result=Arrays.stream(l1).filter(str->
		 * Arrays.stream(l2).anyMatch((str2->str2==str)) ) != null;
		 * System.out.println(result);
		 */
		  
		  //for number
		  List<Integer> l3=Arrays.asList(1,2,4,5); 
		  List<Integer> l4=Arrays.asList(1,2,3,5);
		  List<Integer> duplicates1=l3.stream().filter(num->l4.contains(num)).collect(Collectors.toList());
		  System.out.println(duplicates1);
		
	}

}
