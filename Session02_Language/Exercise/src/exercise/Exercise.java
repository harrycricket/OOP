
package exercise;

/**
 *
 * @author Huynh Van Phuot
 */
public class Exercise {

    public static void main(String[] args) {
//        boolean result = isPrime(0);
//        System.out.println("0: " + result);
//        System.out.println("100: " + isPrime(100));
//        System.out.println("101: " + isPrime(101));
//        printPrimeList();
        print1000FirstPrimes();
    }
    
    // in các số nguyên tố từ 1...1000
    public static void printPrimeList () {
        System.out.println("The list of prime from 1 to 1000: ");
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }
    
    // in ra 1000 snt 
    public static void print1000FirstPrimes() {
        int count = 1;
        int i = 2;
        while (count <= 1000) {            
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
            
            
    }
    
    public static boolean isPrime(int n){
        if (n < 2)
            return false;
        // ktra xem trong khoảng từ 2 đến căn n
        // nếu lỡ chia hết cho số nào đó thì sẽ k là số nt
        if (n == 2)
            return true;
        // for từ 2...căn n
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
