
// addition of two number is 7

package testnorg.testnorg;

import java.util.HashSet;

public class sum7 {
	
	
	public static void main(String[] args) {
		
		
int arr[]= {1,3,4,5,2,6,9,7};


     HashSet set=new HashSet<int>();
    
     

for(int i=0; i<arr.length-1; i++)
	

{

	for(int j=i+1;j<arr.length;j++)
		
	{
		
		if(arr[i]+arr[j]==7)
		{
			System.out.println(arr[i] + " " +arr[j]);
		}
			
		
			}
		
}
		
		
		
		
		
	}

}
