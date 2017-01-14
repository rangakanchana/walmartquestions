/**
 * 
 */
package ebay;

/**
 * @author sridhar//we need to reverse the string such that walmart = lawmtra;
 * 
 *
 */
public class StringRevWal {
	
	public static String revString(String inputString){
		
		String result1 = "";
		String result2 = "";
		String result3 = "";
		
		int mid = inputString.length()/2;
		
		for(int i=(mid-1);i>=0;i--){
			result1 = result1+inputString.charAt(i);
		}
		result2 = result2+inputString.charAt(mid);
		
		for(int i=inputString.length()-1;i>mid;i--){
			
			result3 = result3+inputString.charAt(i);
		}
		String result = result1+result2+result3;
		
		
		System.out.println(result);
		
		return result;
	}
	    public static void main(String[] args) {
	    	
	    	StringRevWal.revString("WALMART");	
		    
	}
	

}
