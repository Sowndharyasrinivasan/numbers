import java.util.Scanner;


public class JavaApplication5 {


public static void main(String[] args) {

       Scanner s=new Scanner(System.in);

       System.out.println("enter n value");
        int a=s.nextInt();
     int K=1;
	for(int i=0;i<2*a;i++)	
        {
      int x=2*a-i;
	  if(a!=x) 
           {
             System.out.println(" "+K++ +"  "+"  "+K);  
              }		
	       }
    }
}