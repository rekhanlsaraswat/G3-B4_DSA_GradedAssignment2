package skyScraperFloors;
import java.util.*;


public class floorSortingLogic {
	
	private static Scanner sc;

	public static void main(String[] Args){

	HashMap<Integer, Integer> floors = new HashMap<>();
	
	//creating a hash map to store the number of the day and the size of the floor manufactured on that day.
	
	
	//populating the floors hash map with input using the scanner object sc
	
	sc = new Scanner(System.in);  
	System.out.print("Please enter the number of floors in the building");  
	
	int numberOfFloors = sc.nextInt();
	
	for(int i=1; i<numberOfFloors+1; i++) {
   
		System.out.print("Please enter the floors size given on day "+i); 
		
		floors.put(i, sc.nextInt());
						
	}
	

	// creating a hash map reverse floors to store the size of the floor as a key and the day on which it was manufactured as a value.    
    
	HashMap<Integer, Integer> reverseFloors = new HashMap<>();
	   
    
 //creating a set floorKeySet to save the key set of the has map floors;    
		
    Set<Integer> floorKeySet = new HashSet<Integer>(); 
    
 // fetching the key set of floors hash map	

    
    floorKeySet = floors.keySet();
    
// using for loop to populate the reverse floors hash map.
    
   for(Integer i: floorKeySet) {
    	
	   reverseFloors.put(floors.get(i),i);
    	
    }
   

 //creating an array list valueSet to store the floors sizes as an array
    
    ArrayList<Integer> valueSet = new ArrayList<Integer>();
   
 //populating valueSet from floors hash map
    
    for(Integer i: floorKeySet) {
    	
    	valueSet.add(floors.get(i));
    	
    }
   
//sorting the valueSet in descending order    
    
    Collections.sort(valueSet, Collections.reverseOrder()); 
    
// creating a hashmap output to store the result    
    
	HashMap<Integer, String> output = new HashMap<>();
	
	
	
// populating the output hashmap (the day number will be the key and the sizes of the floors which will be assembled that day will be 
// the values (for now empty strings are added as placeholders))
	
	
	for(int i=1;i<numberOfFloors+1;i++) {
		
		output.put(i,"");	
	}

         	
//Since the largest floor will always be laid on the day it is received, we will fetch the day the first element in the sorted valueSet
// i.e. the element with index=0, and the day it was received from reverse floors and populate the output set (key will be the day and the 
//	value will be the size of the floor)	
	
output.put( reverseFloors.get(valueSet.get(0)), output.get(reverseFloors.get(valueSet.get(0)))+String.valueOf(valueSet.get(0)));

	
for(int i=1;i<numberOfFloors;i++) {
	
//from the second element we will compare the day the floor was received with the day on which the floor with the size equal to its
	// its previous element was received.
	
		
if((reverseFloors.get(valueSet.get(i)) <     reverseFloors.get(valueSet.get(i-1)) )
				
		) {
	
	//if the floor is received earlier than its previous element it will be laid on the same day of its predecessor in valueSet

	
	output.put(    reverseFloors.get(valueSet.get(i-1))        ,    output.get(reverseFloors.get(valueSet.get(i-1)))+" "+String.valueOf(valueSet.get(i))    );

// Since the floor is laid on the same day as its previous element we set the day in reverse floors hashmap to the previous day
	
	reverseFloors.put(valueSet.get(i), reverseFloors.get(valueSet.get(i-1)));


} else {
	
	
	//if the floor is received later than its previous element it will be laid on the day it was received 
	
	
output.put(    reverseFloors.get(valueSet.get(i))        ,    output.get(reverseFloors.get(valueSet.get(i)))+" "+String.valueOf(valueSet.get(i))    );

			
	
}
	
	
	
}

//printing out the day and the sizes of the floors laid on that day by looping over the output set

for(int i=1;i<numberOfFloors+1;i++) {

	
System.out.println("Day: "+i);
System.out.println(output.get(i));

	
	
	
}










    
   
    		 
    	 
    	 
           
     
  
    
 
    
    
    
   
    	
    	
    	
    }
    }





























	
	
  
    
	
