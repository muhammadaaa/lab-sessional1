package khan;

public class IteratorPatternDemo {
	
	public static void main(String[] args) {
		   NameRepository namesRepository = new NameRepository();

		      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
		    	  
		         float totalPrice = (float)iter.next();
		         
		         System.out.println("your total  : " + totalPrice);
		      } 	
		   }

	}
