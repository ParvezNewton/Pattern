import java.util.Scanner;

/**
 * My answer  what you think about it and what about your solution to it 
 */
public class pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any even number");
        int x = sc.nextInt();
        int b=1;
        int c =1;
        while(b<=x/2){
            printA(x,c);
            b++;
            c++;
        }
        c=c-2;
        while(b<x){
            printA(x,c);
            b++;
            c--;
        }
    }
 public static  void printA(int x,int y){
    char a[] = new char[x];
    int d =y;
     for( int i =0;i<x/2;i++){
         a[i]='*';
     }
      for (int i=0;i<d;i++){
          a[x/2-i]='b';
      }
     for (int i =0;i<x/2;i++){
         System.out.print(a[i]);
     }
     for (int i = x/2-1;i>=0;i--){
         System.out.print(a[i]);
     }
     System.out.println();
 }
}
