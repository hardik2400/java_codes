import java.util.Random;
 
// MAin class
class GFG {
 
    // Main driver method
    public static long mult(long x, long y) {
 
        // Checking only if input is within range 
        if (x < 10 && y < 10) {
           
            // Multiplying the inputs entered
            return x * y;
        }
      
        // Declaring variables in order to 
        // Find length of both integer
        // numbers x and y
        int noOneLength = numLength(x);
        int noTwoLength = numLength(y);
 
        // Finding maximum length from both numbers
        // using math library max function
        int maxNumLength
            = Math.max(noOneLength, noTwoLength);
 
        // Rounding up the divided Max length
        Integer halfMaxNumLength
            = (maxNumLength / 2) + (maxNumLength % 2);
            // Multiplier
        long maxNumLengthTen
        = (long)Math.pow(10, halfMaxNumLength);

    // Compute the expressions
    long a = x / maxNumLengthTen;
    long b = x % maxNumLengthTen;
    long c = y / maxNumLengthTen;
    long d = y % maxNumLengthTen;


    // Compute all mutilpying variables
    // needed to get the multiplication   
    long z0 = mult(a, c);
    long z1 = mult(a + b, c + d);
    long z2 = mult(b, d);

    long ans = (z0 * (long)Math.pow(10, halfMaxNumLength * 2) +
               ((z1 - z0 - z2) * (long)Math.pow(10, halfMaxNumLength) + z2));

    return ans;

}

 
    // To calculate length of the number
    public static int numLength(long n)
    {
        int noLen = 0;
        while (n > 0) {
            noLen++;
            n /= 10;
        }
 
        // Returning length of number n
        return noLen;
    }

    public static void main(String[] args)
    {
        
         
      // Case 1: Big integer lengths
        long expectedProduct = 1234 * 5678;
        long actualProduct = mult(1234, 5678);
 
        // Printing the expected and corresponding actual product
        System.out.println("Expected  : " + expectedProduct);
        System.out.println("Actual  : " + actualProduct + "\n\n");
    }
}