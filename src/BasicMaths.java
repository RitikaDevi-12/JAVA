import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;

public class BasicMaths {
    // GDC
    static int getGdc(int a, int b) {
        //gdc(a,b) = gdc(b,a%b);
        while (b != 0) {
            int oldValueOfb = b;
            b = a % b;
            a = oldValueOfb;
        }
        int ans = a;
        return ans;
    }

    int getLcm(int a, int b) {
        int gdc = getGdc(a, b);
        int prod = a * b;
        int Lcm = prod / gdc;
        return Lcm;
    }

    boolean isArmstrongNumber(int num) {
        int sum = 0;
        int originalNum = num;
        while (num != 0) {
            int digit = num % 10;
            int cubeOfDigit = digit * digit * digit;
            sum = sum + cubeOfDigit;
            // digit remove from num

            num = num / 10;
        }
        if (sum == originalNum) {
            return true;
        } else {
            return false;
        }
    }
    boolean checkperfectNumber(int num){
        int sum = 1;
        for(int i = 2; i*i <= num;i++){
            if(num%i == 0){
                int firstFactor = i;
                int secondfactor = num/i;
                sum = sum +firstFactor+secondfactor;
            }
        }
        if (sum == num) {
            return true;
        }
            else{
                return false;
            }
        }
          void printAllPrimes(int n){
        // Print all prime num
              for(int num = 2;num<=n;num++){
                  boolean isPrime = isPrimeOrNot(num);
                  if(isPrime==true){
                      System.out.println(num);
                  }
              }


          }
             void main(){
              printAllPrimes(100);
             }

//        void main(){
//            System.out.println(checkperfectNumber(6));
//        }


//    void main(){
//        System.out.println(isArmstrongNumber(153));
//    }


//     void main(){
//         System.out.println(getLcm(12,18));
//     }
//    static void main() {
//        System.out.println(getGdc(18, 12));
//    }


    // print digits
    void printDigits(int num) {
        while (num != 0) {
            int digit = (num % 10);
            System.out.println(digit);
            num = num / 10;
        }

    }


    // count digit
    int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            count++;
            num = num / 10;
        }
        return count;
    }

    //sum of digit
    int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;

        }
        return sum;

    }

    int reverseNum(int num) {
        int revNum = 0;
        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;

        }
        return revNum;
    }


    boolean ispalindrome(int num) {
        int originalNum = num;
        int reverseNum = reverseNum(num);
        if (originalNum == reverseNum) {
            System.out.println("It is palindrome");
            return true;
        } else {
            System.out.println("It is not palidrome");
            return false;
        }

    }

    // prime no or not
    boolean isPrimeOrNot(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
//    for(int i = 2; i <= num-1;i++){
//        if(num%i == 0){
//            return false;
//        }
//    }
        return true;
    }
}
//   void main(){
//    int num = 245;
//    System.out.println(isPrimeOrNot(num));
 //}

//      void main(){
//    boolean ans  = ispalindrome(122221);
//          System.out.println(ans);
//      }



//    void main(){
//        int num = 1234567;
//       printDigits(num);
//    }

//    void main(){
//        int num = 2341567;
//        int ans = countDigits(num);
//        System.out.println(ans);
//        }

//    void main(){
//    int num = 123456;
//    int ans = sumOfDigits(num);
//        System.out.println(ans);
//    }
//   void main(){
//    int num = 12345;
//    int revNum = reverseNum(num);
//       System.out.println(revNum);
//}