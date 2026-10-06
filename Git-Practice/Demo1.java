// class Demo1 {
// public static void main(String[] args) {
// int arr[] = {1,1,2,2,1,1,2,2};
// int brr[] = new int[arr.length]; 
// int count =0;
// for (int i =0; i < arr.length; i++) {
//     int n;
//     for(int j=i+1;j<arr.length;j++){
//         if ( arr[i] == arr[j]) {
//             break;
//         }
//     }
//     n = arr[i+1];
//     for(int k = 0; k<5;k++){
//         if(n!=brr[k]){
//             brr[count]=n;
//             count++;
//         }
//     }
// }
// for(int i=0;i<brr.length;i++){
//     System.out.println(brr[i]);
// }
// }
// } 
import java.util.Scanner;

class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int n = sc 5252525252
        int arr[] = new int[size];
        // int brr[] = new int[size];
        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int arr[n];

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (arr[i] == brr[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                brr[count] = arr[i];
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(brr[i]);
        }
    }
}