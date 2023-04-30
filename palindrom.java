import java.util.Scanner;
public class palindrom {

    static boolean pol(int say2){
        int bir,ters = 0,son=say2;
        while(son != 0){
            bir= son%10;
            ters =(ters*10)+bir;
            son /=10;
        }
        if(ters==say2){
            System.out.println(ters);
            return true;
        }
        else{
            System.out.println(ters);
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int say=0;
        System.out.println("palindrom sayı bulma programı ");
        System.out.println("sayı giriniz: ");
        say = inp.nextInt();
        pol(say);
        System.out.println(pol(say));
    }

}
