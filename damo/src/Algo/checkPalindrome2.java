package Algo;



public class checkPalindrome2 {

	public static boolean checkPalindrome1(String inputString) {
		
		  boolean check = false;

		    int i = 0;	    
		    
		    if(inputString.length()%2 ==0){
		        
		        while(i<=inputString.length()/2){
		            
		            if(inputString.charAt(i) == inputString.charAt(inputString.length()-(i+1))){
		                i++;
		                check = true;
		                continue;
		            }else{
		                check = false;
		                break;
		            }
		        }
		    }else{
		        while(i<=(inputString.length()/2)+1){
		             
		        	if(i == (inputString.length()/2)+1){
		        		check = true;
		                break;
		             }
		            
		        	if(inputString.charAt(i) == inputString.charAt(inputString.length()-(i+1))){
		               i++;
		               check = true;
		               continue;
		            }else{
		               check = false;
		               break;
		            } 
		        }       
		  }
		 return check;
	}
	public static void main(String[] args) {
		
		boolean anwser = false;
		
		String example = "aabaa";
		
		anwser = checkPalindrome1(example);
		
		System.out.println(anwser);	
	}
}
