package capriotti.anthony.cd12; /**
 * Created by anthonycapriotti on 1/12/17.
 */
import java.util.Scanner;


public class SumOrProduct {
    public String sumOrProduct(String a, int q){
        if (a.equalsIgnoreCase("Sum")) {
            int sum = sumFunction(q);
            String numberToString = Integer.toString(sum);
            return "Total is "+ numberToString;
        }else if (a.equalsIgnoreCase("Product")){
            int sum = productFunction(q);
            String numberToString = Integer.toString(sum);
            return "Product is " + numberToString;
        } else return "Wrong, read the directions";

    }

    public int sumFunction(int sum) {
        int total= 0;
        for (int i = 1; i <= sum; i++){
            total += i;}
        return total;
    }

    public int productFunction(int prod) {
        int product = 1;
        for (int i = 1; i <= prod; i++) {
            product *= i;}
            return product;
        }

}







