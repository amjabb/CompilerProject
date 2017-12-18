public class Test 
{
	public static String doSomething(int i){
    		return Integer.toString(i);
    	}

    public static void main(String[] args) throws Exception 
    {
    	
    	String j = doSomething(3);
    	System.out.println(j);
    }
}