package DropDownChrome;

public class smallandlarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {23,41,3,1,223,2,456};
		
		int small = arr[0];
	    int large = arr[0];
	   
	    
	    for(int i=0;i<arr.length;i++) {	
	    	//System.out.println(arr[i]);
	   if(small>arr[i]) {
		   small=arr[i];
	   }
	   else if(large<arr[i]) {
		   large=arr[i];
	   }
	    }
	   System.out.println(""+small);
	   System.out.println(""+large);  
	}

}
