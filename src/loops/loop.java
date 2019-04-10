package loops;

import java.util.ArrayList;

public class loop 
{

	  public static void main (String[] args)
	  {
          //loops
                               // for loops
	for (int s = 0; s<=5; s++)
	{
	
System.out.println("i love coding and valus of s is = "+s);
}

	  
                             //while loop
	  int a = 0;
	  while(a<5) {
		  System.out.println("i love java");
		  a++; 
	  }
		  
		                    //array loop
	  String[] array = {"iby","aitsaid","athsonia","rocheys"};
	  System.out.println("lenth of array is "+array.length);
		  for(String s : array) {
			  System.out.println("name of villages is"+s);
		  }
		  
		  
		  String[] sqr = {"department", "employees", "countries"};
		  System.out.println("lenth of sqr is " +sqr.length);
		  for(String s : sqr) { 
			  System.out.println("name of entreprise are "+s);
		  }
		  int[] sqr_Number = {18, 12345,7};
		 
		  
		  
	  
	                       //do while loop
	  int q = 10;
	  do
	  {
		  q++;
		  }
	  while(q<20);
		  
		                  //arraylist
	  ArrayList<String> arrayList = new ArrayList<String>();
	  
	  for(int v =0; v<5;v++) {
	 arrayList.add("roch");
	  } 
	  
	  System.out.println(arrayList.size());
	  System.out.println(arrayList.get(3));
	   
	  
		  
		  
	  }
	  
}