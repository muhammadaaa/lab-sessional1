package khan;

	public class NameRepository implements Container{
		public float Myarry[] = {2 , 3 , 2};

		   @Override
		   public Iterator getIterator() {
		      return new NameIterator();
		   }

		   private class NameIterator implements Iterator {

		      int index;

		      @Override
		      public boolean hasNext() {
		      
		         if(index <  Myarry.length){
		            return true;
		         }
		         return false;
		      }

		      @Override
		      public Object next() {
		      
		         if(this.hasNext()){
		        	 
		        		 float sum=0;
		        		 while(index <  Myarry.length)
		        		 sum=sum +  Myarry[index++];
		        		 float cost;
		        		 if (sum < 5)
		        		 { 
		        		 cost=(float) (0.75 * sum);
		        		 
		        			 return cost;
		        		 }
		        		 else
		        		 {
		        	 
		            return cost=(float) (0.50 * sum);
		            }
		        		 
		         }
		         return null;
		      }		
		   }

	}

