public class Test 
{
    public static void main(String[] args) throws Exception 
    {
    	Integer i = 32;
    	Integer j = i;
    	i = -2 + 3*j;

    	Double treasure = 9.3;
    	Double beta5x = treasure;
    	beta5x = treasure/3.7 - treasure*2.88;
    	beta5x = 8.45*(treasure + 9.12);
    	System.out.println(treasure);
    	while(treasure < 13){
    		treasure = treasure + 1;
    	}
    }
}
