 public static void main(String args[]){  
int i,m=0,flag=0;    
  int num=17;
  m=num/2;    
  for(i=2;i<=m;i++){    
   if(num%i==0){    
   System.out.println("Number is not prime");    
   flag=1;    
   break;    
   }    
  }    
  if(flag==0)    
  System.out.println("Number is prime");    
}  
}  