public class Factorial {

   
    public static void main(String[] args) {
       int n,i;
       int f=1;
       
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the factorial no:");
        n=sc.nextInt();
       
        for(i=1;i<=n;i++)
               f=f*i;
        {
            System.out.println("the factorial"+n+ "is"+f);
        }
    }
    }

