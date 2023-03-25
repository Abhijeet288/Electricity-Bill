import java.util.*;
public class E_Bill {
    public static void main(String[] args) {
        int amt=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the unit of  electricity used: ");
        int u= sc.nextInt();
        if(u<=100){
            amt=u*5;
            System.out.println("Bill amount : "+amt);   
        }
        else if(u>=101 && u<=200){
            amt=100*5+(u-100)*7;
            System.out.println("Bill amount : "+amt);
        }
        else if(u>=201 && u<=300){
            amt=100*5+200*7+(u-200)*10;
            System.out.println("Bill amount : "+amt);
        }
        else {
            amt=100*5+200*7+300*10+(u-300)*15;
            System.out.println("Bill amount : "+amt);
        }
    }
}
