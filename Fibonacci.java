public class Fibonacci {
  
    public static void main(String[] args) {
           
 int fact1=0,fact2=1,fact3,i,count=10; 
       // System.out.println(fact1+ +fact2);
 System.out.print(fact1+ " " +fact2);   
    
 for(i=2;i<count;++i)    
 {    
  fact3=fact1+fact2;    
  fact1=fact2;    
  fact2=fact3; 
  System.out.println( "" +fact3 );   
 }    
  
}}  
    

