import java.util.Scanner;


public class JavaApplication5 {
public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter n value");
        int n=sc.nextInt(); int K=1;
	for(int i=0;i<2*n;i++)	
        {int x=2*n-i;
	  if(n!=x) 
           {
             System.out.println(" "+K++ +"  "+"  "+K);  
              }		
	       }
    }
}