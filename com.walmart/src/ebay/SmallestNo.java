package ebay;
public class SmallestNo {
	/*public static void main(String[] args) {
		int []arr = {23,15,2,16,89,76};
		int num = arr[0];
		for(int i =1;i<arr.length;i++){
			if(num>arr[i]){
				num = arr[i];
			}
		}
		System.out.println("the smallest number in a given array is :"+num);
}*/
	public static int getSmallestNo(int arr[]){
		
		int smallNo = arr[0];
		
		for(int i=0;i<arr.length;i++){
			
			if(smallNo>arr[i]){
				
		smallNo = arr[i];	}
		}
		
		return smallNo;
		
		
	}
	
	public static void main(String[] args) {
		
		int arr[]={1,3,-1,0,97,34};
		
		int smallNo=SmallestNo.getSmallestNo(arr);
		
		System.out.println("the smallestno is:"+smallNo);
		
	}
	}	
	
	
	


	


