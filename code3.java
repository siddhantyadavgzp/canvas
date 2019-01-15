
		import java.util.Random; 
  
public class code3{ 
  
    public static void main(String args[]) 
    { 
        // create instance of Random class 
for (int i=0;i<100000;i++){       
 Random rand = new Random(); 
  
        // Generate random integers in range 0 to 999 
        int rand_int1 = rand.nextInt(100000); 
  //      int rand_int2 = rand.nextInt(100000); 
 //       int rand_int3 = rand.nextInt(200000); 
  
        // Print random integers 
      	System.out.print(rand_int1+" ");
if(i%50==0)
{
System.out.println("\n"); 
 }   //    System.out.println(rand_int2+" "); 
       // System.out.println(rand_int3+" "); 
  }
      
    } 
} 