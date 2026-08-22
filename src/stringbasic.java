void main() {
    // replace old char to new char
    String name = "chidu";
    name = name.replace('u', 'i');
    System.out.println(name);

    // split
    String input = " My,name,is,Ritika";
    String[] words = input.split(",");
    for (String str : words) {
        System.out.println(str);
    }

    // .to charArray()
    String name4 = "ritika";
    char[] crr = name4.toCharArray();
    // print the char array
    for (char ch : crr) {
        System.out.println("value of crr" + "  " + ch);
    }
    String name7 = "ritti";
    char[] cr = name7.toCharArray();
    for (char ch2 : cr) {
        System.out.println("value of cr " + " " + ch2);
    }

    // starts with and ends with
    String name6 = "  I am Ritika";
    System.out.println(name.startsWith("Ritika"));
    System.out.println(name.endsWith("Ritika"));
    System.out.println(name.startsWith("  I am"));
    System.out.println(name.endsWith("Kritika"));
    // value of method
    int num = 5123;
    String str = String.valueOf(num);
    System.out.println(num + 1);
    System.out.println(str + 1);

    //contains
    String name3 = " my name is ritika";
    System.out.println(name3.contains("ritika"));
    // sub string
    String str1 = " my name is ritika";
    System.out.println(str.substring(4, 8));
    // upper and lower case
    String name8 = "ritika";
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());

    // empty
    //blank
    String str2 = "  ";
    System.out.println(str.length());
    System.out.println(str.isEmpty());
    System.out.println(str.isBlank());
    String name9 = ("   string   ");
    System.out.println(name.length());
    // trim
    name = name.trim();
    System.out.println(name.length());

    String name10 = "Ritika";
    System.out.println(name.length());
    System.out.println(name.charAt(0));
    String name1 = "ritika";
    System.out.println(name.equals(name1));
    System.out.println(name.equalsIgnoreCase(name1));
    String firstName = "Mr";
    String lastName = "Gupta";
    System.out.println(firstName + " " + lastName);
    System.out.println(firstName.length());
    System.out.println(lastName.length());
    System.out.println(firstName.charAt(0));
    System.out.println(lastName.charAt(0));

    String name_1 = "Akshay";
    String name2 = "akshay";
    {
        if (name1.equals(name2)) {
            System.out.println("both string are equals");
        } else
            System.out.println("both strings are not equal");

    }
    Scanner Sc = new Scanner(System.in);
    System.out.println("provide the string content");
    String str3 = Sc.nextLine();
    System.out.println("value o nextline:" + str);
    System.out.println("provide the string content");
    String str4 = Sc.next();
    System.out.println("value of next :" + str1);

}

// for more practice
// print each char of the string
//public class stringbasic {
//    static void printString(String str) {
//        int n = str.length();
//        for (int i = 0; i <= n; i++) {
//            char ch = str.charAt(i);
//
//            System.out.println(ch);
//        }
//    }
//
//    static void main() {
//        String str = "ritika";
//        printString(str);
//    }

























