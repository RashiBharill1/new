package PracticeProblem;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Iterator;

public class concurrentException {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Orange o=new Orange();

		al.add("m1");
		al.add("m2");
		al.add("m3");
		al.add("m4");
		al.add("m5");
		al.add("t1");
		al.add("t2");
		al.add("t3");
		al.add("t4");
		al.add("p1");
		al.add("p2");

		Iterator iter = al.iterator();
		String  str="";
		/*while (iter.hasNext()) {

			str = (String) iter.next();*/
		// scenario 1 :concurrent modification exception ;Solution :concurrent collections ;ex:concurrent list
		/*if(str.equals("m1")){
				al.remove(str);
			}*/

		// scenario 2 :sucessful removal of elements during iteration
		/*	if(str.equals("m1")){
				iter.remove();
				System.out.println("the element m5 is remove");

			}*/
		//}

		//senerio 3:removal of element directly in al
		al.remove("m1");
		System.out.println(al);
	}
}
