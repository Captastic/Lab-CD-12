package capriotti.anthony.cd12; /**
 * Created by anthonycapriotti on 1/13/17.
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SumOrProduct n = new SumOrProduct();
        System.out.println("Pick a number, any whole number?");
        int q = input.nextInt();
        System.out.println("Sum or Product");
        String s = input.next();
        System.out.println(n.sumOrProduct(s,q));

    }
}
