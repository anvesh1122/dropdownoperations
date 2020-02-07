package DropDownChrome;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class practiceAgainFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a = {12,45,56,67,2,40,75};		
		//System.out.println(a.length);		
		int lb=0;
		int ub=a.length-1;		
		//System.out.println(ub);	
		int temp = 56;		
		while(lb<=ub)
		{	
			 int mb =(lb+ub)/2 ;
			 if(temp==a[mb]) 
			 {
				 System.out.println(temp +"::element found at index::"+mb);
				 break;
			 } 
			 else if(a[mb]>temp)
			 {
				 ub=mb-1;				
			 }
			 else if(a[mb]<temp)
			 {
				 lb=mb+1;           
			 }
			 
		}			
		}
	}


