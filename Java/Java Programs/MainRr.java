import java.util.*;
public class MainRr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();

        int MaxLen=0;
        int strIdx=-1;

        for(int len=2;len<=n-1;len++) {
            for (int i = 0; i + len <= n; i++) {
                for (int j = i + 1; j + len <= n; j++) {


                    boolean match = true;
                    for (int k = 0; k < len; k++) {
                        if (arr[i + k] != arr[j + k]) {
                            match = false;
                            break;
                        }
                    }
                    if (match && len > MaxLen) {
                        MaxLen = len;
                        strIdx = i;
                    }
                }
            }
        }
                   if(MaxLen > 0){
                       System.out.println("pattern length:" +MaxLen);
                       System.out.print("Patter:");
                       for(int i=strIdx;i<strIdx+MaxLen;i++){
                           System.out.print(arr[i]);
                           if(i<strIdx+MaxLen-1){
                               System.out.print(" ");
                           }
                       }
                   }else{
                       System.out.println("no repeating pattern founf(-1");
                   }
                }
            }
