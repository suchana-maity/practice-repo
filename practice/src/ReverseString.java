import java.io.*;
import java.util.*;

public class ReverseString
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reversed=new StringBuilder(s).reverse().toString();
        System.out.println(s+" "+reversed);
    }
}