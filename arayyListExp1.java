package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;


class cars{
	
	void brand(){
	ArrayList<String> carBrand = new ArrayList<>();
	carBrand.add("TATA");
	carBrand.add("MARUTHI SUZIKI");
	carBrand.add("HONDA");
	carBrand.add("RENAULT NISSAN");
	carBrand.add("HYUNDAI");
	carBrand.add("AUDI");
	carBrand.add("RENAULT NISSAN");
	carBrand.add("HONDA");          //Allows Duplicate elements
	carBrand.add("RENAULT NISSAN"); //Allows Duplicate elements 
	
	
	
	System.out.println("-------GETarrayList-----------------------------------------------------------------------");
	
	System.out.println(carBrand);           // USING GET METHOD GETTING THE SPECIFIED VALUE FROM THE LIST
	System.out.println("Geting the 2nd position from above list :"+carBrand.get(2));
	System.out.println("-------------------------///-----------------------------------------------------");
	System.out.println();
	System.out.println();
	
	
	
	System.out.println("-------setArrayuList-----------------------------------------------------------------------");
	System.out.println(carBrand);
	
	carBrand.set(1, "MAHENDRA");    // adding value to the selected/preffered before this index ..so its display before 1st index
	System.out.println("Seting MAHENDRA in before 1st index position");
	System.out.println("RESULT  :"+carBrand);
	System.out.println("-------------------------///-----------------------------------------------------");
	System.out.println();
	System.out.println();
	
	
	
	System.out.println("--------isEmptyArrayList----------------------------------------------------------------------");
	System.out.println(carBrand);
	
	System.out.println("IN the list there is no empty so its print ");
	System.out.println(carBrand.isEmpty());  // is there any empty space in list it displays True if not false
	
	System.out.println("-------------------------///-----------------------------------------------------");
	System.out.println();
	System.out.println();
	
	
	
	System.out.println("--------indexOfArrayList----------------------------------------------------------------------");
	System.out.println(carBrand);
	
	System.out.println("The index of TATA is : "+carBrand.indexOf("TATA"));  // prints 0...   so that first Position of list TATA is 0
	System.out.println("The index of RENAULT NISSAN is : "+carBrand.lastIndexOf("RENAULT NISSAN")); // taking last position 7 and it skips 4 and 5 position   
	System.out.println("The index of benz is : "+carBrand.indexOf("benz")); // BENZ is not in list so its print -1 indicating not available in list
	System.out.println("BENZ IS not in list so its so its print -1 indicating not in list");
	System.out.println("-------------------------///-----------------------------------------------------");
	System.out.println();
	System.out.println();
	
	

	System.out.println("-------addArrayList-----------------------------------------------------------------------");
	//System.out.println(carBrand);
	//carBrand.add(null);           // Adding new data to list as last index here null is given without 
	                                   //qoutes but it accepts without error and display null data
	System.out.println(carBrand);
	
	carBrand.add("VOLVO"); // Adding volo to list and it displays in last index
	System.out.println("Adding VOLVO into the List");
	System.out.println(carBrand);
	System.out.println("-------------------------///-----------------------------------------------------");
	System.out.println();
	System.out.println();
	
	
	
	System.out.println("--CopyArrayList and Addall and clearLISt----------------------------------------------------------------------------");
	ArrayList<String> copyBrand = new ArrayList<>(); // creating new list name 
	copyBrand.addAll(carBrand);     // copying  complete list data from car brand to copy brand
	System.out.println("copyBrand new list is Copied from CarBrand all datas are copied");
	System.out.println("CarBrand  list orginal ="+copyBrand);  //ArrayList Data value
	System.out.println("copyBrand list copy    ="+copyBrand);   // copied value from carBrand
	copyBrand.clear();System.out.println("clearArray used so its clear all and Result given below");// clear is used to delete all data in mentioned list
	System.out.println("Result :"+copyBrand);
	System.out.println("-------------------------///-----------------------------------------------------");
	System.out.println();
	System.out.println();

	
	
	System.out.println("-------RemoveArrayList-----------------------------------------------------------------------");
	System.out.println(carBrand);    // just speciefied for refference
	
	System.out.println();  // to give space below
	
	System.out.println("               Remove 1st position(MAHENDRA) is given below  ");
	carBrand.remove(1);          // removing data at index position 1
	System.out.println(carBrand);
	System.out.println();
	
	System.out.println("               Remove RENAULT NISSAN position is given below(2nd position removed FROM ABOVE)  ");
	carBrand.remove("RENAULT NISSAN"); // removing 2nd position RENAULT NISSAN from the list 
	System.out.println(carBrand);
	System.out.println();
	
	System.out.println("               Remove RENAULT NISSAN position is given below(4TH position removed FROM ABOVE)  ");
	carBrand.remove("RENAULT NISSAN");// removing 4th position RENAULT NISSAN from the list
	System.out.println(carBrand);
	System.out.println();
	System.out.println("-------------------------///-----------------------------------------------------");
	System.out.println();
	System.out.println();
	
	
	
	System.out.println("-------------sortArrayList-------------------------------------------------------------");
	System.out.println(carBrand);
	
	try{
		System.out.println("SORT A-z list will display");
		System.out.println();
		
		Collections.sort(carBrand);   // sort used to display the data value in alfabatic order
		for (String SortArray : carBrand) {
			System.out.println(SortArray);
		}
	}catch ( NullPointerException e){
		 System.err.println("NullPointerException error occured");  // REMOVING out AND ENTER err TO GET RED COLOUR INDICATION
	 }
	System.out.println("-------------------------///-----------------------------------------------------");
	System.out.println();
	System.out.println();
	

	
	System.out.println("-------------sizeArrayList-------------------------------------------------------------");
	System.out.println("car brand are :  "+carBrand);    // used to find total index length of given array elements
	System.out.println("SIZE OF ARRAY given  above variable  is:"+carBrand.size());
	
	System.out.println("------------------///--------------------------------------------------");
	System.out.println();
	System.out.println();
	
	

	System.out.println("-------cloneArrayList-----------------------------------------------------------------------");
	System.out.println(carBrand);
	System.out.println("               cloned from above carBrand names");
	
	System.out.println(carBrand.clone()); // clone is used to copy full data of array element
	
	System.out.println("-------------------------///-----------------------------------------------------");
	System.out.println();
	System.out.println();
	
	
	
	
	System.out.println("-------containsArrayList-----------------------------------------------------------------------");
	System.out.println(carBrand);
	System.out.println("contains  /AUDI/ is "+carBrand.contains("AUDI")); //to check the specified element is containing in given array
	System.out.println("contains  /audi/ is "+carBrand.contains("audi"));
	System.out.println("-------------------------///-----------------------------------------------------");
	System.out.println();
	System.out.println();
	
	
	
	
	System.out.println("-------ensureCapacityArrayList-----------------------------------------------------------------------");
	System.out.println(carBrand);
	carBrand.ensureCapacity(10); // for adding additional index line
	
	System.out.println("-------------------------///-----------------------------------------------------");
	System.out.println();
	System.out.println();
	
	
	
	//iterate
	System.out.println("-------ArrayList--iterate using for each---------------------------------------------------------------------");
	for (String carList : carBrand) {   //Iterating array one by one using for each
		System.out.println(carList);
	}
	System.out.println("-------------------------///-----------------------------------------------------");
	int i=0; 
	for(i=0;i<carBrand.size();i++){
		System.out.println("using for loop : "+carBrand.get(i));
	}
	System.out.println("-------------------------///-----------------------------------------------------");
	System.out.println();
	System.out.println();
	
	
	
	
	
	System.out.println("-------ArrayList--itrated using while- hasnext and next can be used------------");
	Iterator<String> idrtdEx=carBrand.iterator();
	System.out.println("using hasnext and next list is idrated in farward position");
	System.out.println();
	while(idrtdEx.hasNext())
	{
		System.out.println("itreated :"+ idrtdEx.next());
	}
	System.out.println("-------------------------///-----------------------------------------------------");
	System.out.println();
	System.out.println();

	
	
	
	
	System.out.println("-------ArrayList----ListItrated using while- hasnext, next and hasPrevious and previous used can be used-------------");
	java.util.ListIterator<String> idrate=carBrand.listIterator();

	System.out.println("using hasnext and next list is idrated position");
	System.out.println();
       while(idrate.hasNext()){
	System.out.println(idrate.next());
     }
System.out.println("---------listIdrated---------------------------------");
System.out.println("using hasprevious and previous list is idrated in reverse position");
System.out.println();
	while(idrate.hasPrevious())	{
		System.out.println(idrate.previous());
	}
	System.out.println("-------------------------///-----------------------------------------------------");
	System.out.println();
	System.out.println();
	
	
	

	}
}





public class arayyListExp1 {
public static void main(String[] args) {
	cars s= new cars();
	s.brand();
}
}
