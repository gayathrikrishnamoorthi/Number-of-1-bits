package sample;

import java.util.Scanner;

public class bit {
	public static boolean check(int n, int i){
        boolean str=false;
        if((n&(1<<i))!=0) {
            str=true;
        }
       
        return str;

    }
    public static int count(int n) {
        int bit=0;
        for(int i=0;i<n;i++){
            if(check(n,i)){
                bit++;
            }
        }
        return bit;
    }
    public static void main(String[] args) {
        Scanner A=new Scanner(System.in);
        int n=A.nextInt();
        int value=count(n);
        System.out.println(value);
    }
}


