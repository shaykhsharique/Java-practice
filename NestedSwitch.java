import java.util.Scanner;
  public class NestedSwitch{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

   // Enhanced Switch with case grouping
      System.out.println("entre a day (1-7): ");
      int day = in.nextInt();
      
      switch (day){
          case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
          case 6, 7 -> System.out.println("weekend");
          default -> System.out.println("Invalide day entered");
      }
      //Nested Enhanced Switch
          System.out.println("\nEnter Employee ID (1,2 and 3): ");
          int empID = in.nextInt();

       switch (empID) {
          case 1 -> System.out.println("Epmloyee: Raju");
          case 2 -> System.out.println("Employee: Mahatab");
          case 3 -> {
                System.out.println("Employee 3 selected");
                System.out.println("Entered department(IT/ management): ");
                String department = in.next();
          
        switch (department) {
                     case "IT" -> System.out.println("depatrment: IT wing");
             case "Management" -> System.out.println("department: Management wing");
                       default -> System.out.println("No valide depatrment intered");
                 }
           }
         default -> System.out.println("Invalid EmpID entered"); 
     }
   }
}