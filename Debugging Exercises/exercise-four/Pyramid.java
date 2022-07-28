public class Pyramid {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
          for (int j = 0; j < 10; j++) {
            if (i==j){
                System.out.println(" * ");
                break;
            }
            else{
                System.out.print("   ");
            }
            //   (j == i) ? System.out.println("*")  : continue;
          }
        }
    }
}
