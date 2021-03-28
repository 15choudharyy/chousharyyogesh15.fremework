public class string11 {
		
		
		public static void main(String[] args) {
			
			
			
			String s="welcome to india";
			
		String[]s1=s.split(" ");
		
		String var=s1[0];

		
		for(int i=1;i<s1.length;i++)
		{
			if(s1[i].length()<var.length())
			{
				
				var=s1[i];
			}
		
		}
		System.out.println(var);
		
			
		

		
		}

	}


