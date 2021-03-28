
// seprete the 

package testnorg.testnorg;

public class stringpro1 {
	
	public static void main(String[] args) {
		
		String s= "abc123@4$kyz";
		
		char[]ch= s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
				int n= ch[i]-48;
				sum= sum+n;
			}
			
		}
		System.out.println(sum);
		
	}

}
