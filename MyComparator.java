package com.collection.vector;
import java.util.Comparator;
public class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		if(i1>i2)
			return -1;
		else if(i1<i2)
			return +1;
		else
			return 0;
		
		//Case 1 : instead of such lengthy code we can have
		//Integer i1=(Integer)obj1;
//		Integer i2=(Integer)obj2;
//		return i2.compareTo(i1); or return -i1.compareTo(i2);
		
		/*Case 2 : if we need to preserver insetion order along 
		 * with duplicates then :
		 * return 1;
		 */
		
		/*Case 3 : if only first element need to be inserted and
		all the other elements considered as duplicates :
		return 0;*/
			
	}
	

}
