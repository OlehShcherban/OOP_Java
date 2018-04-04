package lab3;

	public class Fibonacci
	{
	  public long getNumber(int position){
	        
	             if (position == 1)
	            {
	                return 1;
	            }
	            else if (position > 0) {
	                long c = 0;
	                long a = 1;
	                long b = 0;

	                for (int i = 1; i < position; i++) {
	                    c = a + b;
	                    b = a;
	                    a = c;
	                }

	                return c;
	            }
	            else
	            {
	                return -1;
	            }
	  }
	}
