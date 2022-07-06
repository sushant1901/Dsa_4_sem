// Java program to demonstrate 
// working of HashSet 
import java.util.*; 

class Test 
{ 
    public static void main(String[]args) 
    { 
        HashSet<String> h = new HashSet<String>(); 

        
        h.add("gfg"); 
        h.add("courses"); 
        h.add("ide"); 

      
        System.out.println(h.size());
        
        h.remove("ide");
        System.out.println(h.size());
        // h.clear();
        //System.out.println(h.size());
        
        for(String s: h)
        {
            System.out.print(s+" ");
        }
        
        
        
        System.out.println("\n"+h.isEmpty());
        
    } 
} 
