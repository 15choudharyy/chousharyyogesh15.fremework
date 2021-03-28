package testnorg.testnorg;

public class swwwww {
	
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int key=1;
		for(int i=0; i<key;i++)
	     {
			int count=0;
			for(int j=0;j<arr.length-1;j++)
			{
				int temp=arr[j];
				arr[i]= arr[j+1];
				arr[j+1]= temp;
				
				System.out.print(arr[count++] +" ");
				
			}
			
		
			
			
	     }
	
	}

}
