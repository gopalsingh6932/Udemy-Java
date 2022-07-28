public class Pyramid {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i+1; j++) {
                if(j==rows-i+1)
                {System.out.print(" *");
                System.out.println();}
                else{
                    System.out.print("  ");
                }
            }
            
        }
    }
}
