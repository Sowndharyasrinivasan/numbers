public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a day : ");
        String1 day=s.next();
        switch(day.toLowerCase()){
            case "sunday":System.out.println("WorkingDay("+day+") : "+false);break;
            default:System.out.println("WorkingDay("+day+") : "+true);
        }
    }
}
    