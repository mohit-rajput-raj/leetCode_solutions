import java.util.Scanner;
public class Main{
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = "I hate";
        a=a-1;
        boolean go = false;
        while(a!=0){
            if(go){
                // s = s+" that";
                s = s+" that I hate";
                go=!go;
            }else{
                // s = s+" that";
                s =s+" that I love";
                go=!go;
            }
            a--;
        }
        s = s + " it";
        System.out.println(s);
       
       
        sc.close();
    }
}