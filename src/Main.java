import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        int km;
        int baslnagicucret=10;
        double kmbasi=2.20;
        double total=10;
        Scanner input=new Scanner(System.in);

        System.out.println("mesafeyi gir km");
        km= input.nextInt();
        total=(km*kmbasi);
        total+=baslnagicucret;
        if(total<20){
            total=20;

        }
        System.out.println(total);




    }

}