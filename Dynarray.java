package adidsa;

import java.util.ArrayList;

public class Dynarray {
    public static void main(String[] args) 
    {
        
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        dynamicArray.add(14);
        
        dynamicArray.add(64);
        
        dynamicArray.add(87);        
        
        dynamicArray.remove(2); 
        
        dynamicArray.ensureCapacity(10); 

        System.out.println("Dynamic Array Elements: " + dynamicArray);
    }
}
