import java.util.Scanner;
   public class Switch{
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
        String fruit = in.next();
        
        switch (fruit) {
          case "mango":
            System.out.println("The fruits of king");
            break;
              case "Apple":
                System.out.println("Apple is red sweet & internally white");
                break;
            
              case "Banana":
                System.out.println("Banana is a healthy fruit");
              break;
          default:
            System.out.println("please enterd the valide fruit");
    
        }

        }
  }

