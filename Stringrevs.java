public class StringReverse{
   public static void main(String[] args){
      String s="sowndharya";
      String reverse = new StringBuffer(s).reverse().toString();
      System.out.println("\nString before reverse:"+s);
      System.out.println("String after reverse:"+reverse);
      
   }
}