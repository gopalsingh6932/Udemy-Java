public class MainPart2Task56 {
    public static void main(String[] args) {
        Item[][] items = new Item[][] {
            { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
             { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
             { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
          };

          Machine machine = new Machine(items);

          machine.dispense(0,0 );
          machine.dispense(0,0 );

          System.out.println(machine.getItem(0,0));



    
}

}
