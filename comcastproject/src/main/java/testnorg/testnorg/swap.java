package testnorg.testnorg;

public class swap {
	
	
	public static void main(String[] args) {
		
		String s= "welcome to testyanta";
		String temp="";
		
	String[]ch=	s.split(" ");
	
	temp= ch[0];
	ch[0]= ch[ch.length-1];
	ch[ch.length-1]= temp;
	
	
	for(String s1 :ch)
	{
		System.out.print(s1+" ");
	}
	
      
		
		
		
		
	}

}
