void main () {
       //2D Array
       //accessing array element
       int[][] arr = {
               {1, 2, 3},
               {4, 5, 6},
               {8,9,10}
       };
       System.out.println(arr[0][2]);
       int [][] arr1 = {
                       {1,2,3},
                       {4,5,6},
                       {7,8,9}
       };
       for(int row = 0;row<=arr.length-1;row++){
              for (int col = 0;col<=arr.length-1;col++){
                     System.out.print(arr[row][ col]+ " ");

              }
              System.out.println();
       }

       int [][]arr2 ={{1,2},
                      {3,4,5,6,},
                      {3,4,5,6,7},
                      {4}};
       int rowlength = arr.length;

       for(int row =0;row<=arr.length-1;row++){

              int collength = arr.length;
              for(int col=0;col<arr[row].length-1;col++){
                     System.out.print(arr[row][col]+" ");
              }
              System.out.println();
       }










       // min value
//       int arr[] = {2,8,-5,10,45};
//       int n = arr.length
//       int minValue= arr[0];
//
//       for(int i =  0;i<=n-1;i++){
//              if(arr[i]<minValue){
//                     minValue = arr[i];
//              }
//       }
//       System.out.println(minValue);
//
//    // max value
//       int arr [] = {4,5,-6,25,9};
//       int n = arr.length;
//       int maxValue = arr[0];
//
//       //compare max value with each element of array
//       for(int i=0;i<=n-1;i++) {
//              if (arr[i] > maxValue) {
//                     maxValue = arr[i];
//              }
//       }
//       System.out.println(maxValue);

//    // multiplication
//    int arr [] ={1,2,3,4,5};
//    int ans = 1;
//    int n = arr.length;
//
//    for(int i = 0;i<5;i++){
//        int value = arr[i];
//        ans = ans * value;
//
//    }
//    System.out.println(ans);

       // Sum
//    int arr[] ={5,10,15,20,25,30};
//    int sum = 0;
//    int n = arr.length;
//    for(int i =0;i<=n-1;i++){
//    int value = arr[i];
//    sum = sum + value;
//    }
//    // sum is ready to print
//    System.out.println(sum);


//    int arr[]=new int[5];
//    Scanner sc= new Scanner(System.in);
//    int n = arr.length;
//    // input
//     for(int i =0;i<n;i++){
//         System.out.println("provide input for index" + i);
//         arr[i] =sc.nextInt();
//     }
//     //print
//    System.out.println("you array contains :");
//     for(int value : arr){
//        System.out.println(value);
//    }
//
//
//    //  int arr [] ={10,20,30,40,50 };
//      System.out.println("value at index 0 is " +" "+ arr[0]);
//      System.out.println("value at index 1 is " +" "+arr[1]);
//      System.out.println("value at index 1 is " +" "+arr[2]);
//      System.out.println("value at index 1 is " +" "+arr[3]);
//      System.out.println("value at index 1 is " +" "+arr[4]);
//

//    int brr [] = {100,200,300};
//    int n = brr.length;
//    for( int value:brr){
//        System.out.println(value);
//    }
       // for (int index = 0;index<=n;index++){
       //    System.out.println(brr[index]);

       // }


}