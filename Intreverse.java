public class Reverse {

    
    public static void main(String[] args) {
         int n= 61019;
                int revnumber = 0;
                int temp = 0;
               
                while(n>0)
                {
                  temp = n%10;
                  revnumber = revnumber * 10 + temp;
                  num = n/10;
                         
                }
            System.out.println("Reversed Number is: " + revnumber);
        }
}
 