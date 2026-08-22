//public class BasicMaths {
//    static void printDigit(int num){
//        while(num!=0){
//            int digit =num%10;
//            System.out.println(digit);
//            num = num/10;
//        }
//    }
//    static void main(){
//        int num = 112394;
//        printDigit(num);
//    }
//}


//public class BasicMaths{
//    static int countDigit(int num){
//        int count = 0;
//        while(num!=0){
//            int digit = num%10;
//            count++;
//            num = num/10;
//        }
//        return count;
//    }
//    static void main(){
//        int num = 58282368;
//        int result = countDigit(num);
//        System.out.println(result);
//    }

//    static int countDigit(int num){
//        int count = 0;
//        while(num!=0){
//            int digit = num%10;
//            count++;
//            num = num/10;
//        }
//        return count;
//    }
//    static void main(){
//        int num = 21383321;
//        int result = countDigit(num);
//        System.out.println(result);
//        System.out.println(countDigit(num));
//    }

//

//static int countDigit(int num){
//    int count = 0 ;
//    while(num!=0){
//        int digit = num%10;
//        count++;
//        num = num/10;
//    }
//    return count;
//}
//
//static void main(){
//    int num = 354357537;
//    int result = countDigit(num);
//    System.out.println(result);
//}

static int sumDigit(int num){
    int sum =0;
    while(num!=0){
        int digit = num%10;
        sum = sum+digit;
        num = num/10;


    }
    return sum;
}
static void main(){
    int num = 24202067;
    int result = sumDigit(num);
    System.out.println(result);
}
