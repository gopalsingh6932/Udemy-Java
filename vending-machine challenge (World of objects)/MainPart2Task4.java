public class MainPart2Task4{
    public static void main(String[] args) {
        Item[][] items = new Item[][] {
            { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
             { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
             { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
          };

          Machine machine = new Machine(items);
          System.out.println(machine.getItem(2,1));

          Item x = machine.getItem(2,1);

          x.setPrice(2.99);

          machine.setItem(x, 2, 1);

          System.out.println(machine.getItem(2,1));

          









        
          



    }

}