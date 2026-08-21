void main () {

       //min value
       int arr6[][]  ={{4,5,6},{6,7,19}};
       int minValue =arr6[0][0];

       for(int i=0; i<arr6.length;i++){
              for(int j =0; j<arr6[i].length;j++){
                     if(arr6[i][j]<minValue){
                            minValue = arr6[i][j];


                     }

              }
       }
       System.out.println(minValue);
       // max value
       int arr5[][] ={{1,63,4},{5,53,8}};
       int maxValue = arr5[0][0];

       for(int i =0;i<arr5.length;i++) {
              for (int j = 0; j < arr5[i].length; j++) {
                     if (arr5[i][j] > maxValue)
                     {
                            maxValue = arr5[i][j];

                     }
              }
       }
       System.out.println(maxValue);
//       //sum
//       int arr4[][] = {{1,2,3},{1,2,3}};
//       int sum =0;
//       int ans = 1;
//       for(int i = 0; i<arr4.length; i++){
//              for(int j = 0; j<arr4[i].length; j++){
//                     int value = arr4[i][j];
//                     ans = ans * value;
//              }
//              System.out.println(ans);
//
//       }


//        for(int i=0;i<arr4.length;i++){
//               for (int j=0;j<arr4[i].length;j++){
//                      int value = arr4[i][j];
//                      sum = sum + value;


//               }
//               System.out.println( sum);
//        }





       //2D Array,
       //accessing array element
//       int[][] arr = {
//               {1, 2, 3},
//               {4, 5, 6},
//               {8,9,10}
//       };
//       System.out.println(arr[0][2]);
//
//
//       int [][] arr1 = {
//                       {1,2,3},
//                       {4,5,6},
//                       {7,8,9},
//       };
//       for(int row = 0;row<=arr.length-1;row++){
//              for (int col = 0;col<=arr1.length-1;col++){
//                     System.out.print(arr1[row][ col]+ " ");
//
//              }
//              System.out.println();
//       }
//
//       int [][]arr2 ={
//                      {1,2},
//                      {3,4,5,6,},
//                      {3,4,5,6,7},
//                      {4}
//       };
//       int rowlength = arr2.length;
//
//       for( int rowIndex =0;rowIndex <= rowlength-1;rowIndex++) {
//
//              int collength = arr2[rowIndex].length;
//              for (int colIndex = 0; colIndex <= collength - 1; colIndex++) {
//                     System.out.print(arr2[rowIndex][colIndex] + " ");
//              }
//              System.out.println();
//       }
//      // input
//       int arr3[][]= new int[3][4];
//       Scanner Sc =new Scanner(System.in);
//       for(int i =0;i<arr3.length;i++){
//              for(int j = 0;j<arr3[i].length;j++){
//                     System.out.println("provide value for row = " + i + " " +" and +  col = " + j );
//                     arr3[i][j] = Sc.nextInt();
//              }
//       }
//
//       //print
//
//       for(int rowIndex = 0;rowIndex<arr3.length;rowIndex++){
//              for(int colIndex = 0;colIndex<arr3[rowIndex].length;colIndex++){
//                     System.out.print(arr3[rowIndex][colIndex]+" ");
//
//              }
//              System.out.println();
//       }
//
//
//
//
//
//
//
//
//
//
//
//       // min value
////       int arr[] = {2,8,-5,10,5};
////       int n = arr.length
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

