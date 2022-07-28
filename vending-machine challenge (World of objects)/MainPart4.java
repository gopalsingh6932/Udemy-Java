import java.util.Scanner;

public class MainPart4 {
    public static void main(String[] args) {
    
            System.out.println("\t************************************************");
            System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
            System.out.println("\t************************************************");
    
            Item[][] items = new Item[][] {
                { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
                 { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
                 { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
              };
    
              Machine machine = new Machine(items);
    
              System.out.println(machine);
    
            System.out.println("\t************************************************");

            Scanner scan = new Scanner (System.in);
            while(true){
            System.out.print("Pick a row: ");
            int rowRequired = scan.nextInt();
            System.out.print("\nPick a spot in the row: ");
            int spotRequired = scan.nextInt();

            boolean a = machine.dispense(rowRequired,spotRequired);
            System.out.println("\n" + machine);
            if(a){
                System.out.println("\nEnjoy your drink! Press 1 to purchase another: ");
            }
            else{
                System.out.print("\nSorry, we're out of this item. Press 1 to purchase another: ");

            }
            if(scan.nextInt() != 1){
                break;
            }
            }

            // scan.close();





              
            
    
            
            
            
            }
    
        
    }
    

