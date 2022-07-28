public class Functions {
    public static void main(String[] args) {
        int random = random(15);    
        System.out.println("Number: " + random);
        if (random == 1){
            System.out.println("NEITHER PRIME NOR COMPOSITE");
        }else {System.out.println("Prime or Composite: " + isPrime(random));
        }

    }

    public static int random(int range) {
        double random = Math.random()*range + 1;
        return (int) random;
    }
    public static String isPrime(int random) {
        String isPrime = "";
        
        for (int i = 2; i < random; i++) {
            if (random % i == 0){
                isPrime = "COMPOSITE";
                break;
            }else{
                isPrime = "PRIME";
            }
            // isPrime = (random % i == 0) ? "COMPOSITE" : "PRIME";
        }
        return isPrime;
    }
}
