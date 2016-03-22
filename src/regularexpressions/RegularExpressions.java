package regularexpressions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author fox_1047
 */
public class RegularExpressions {

    
    public static void main(String[] args) throws FileNotFoundException{
        
        String[] s = new String[15];
        Scanner ins = new Scanner(new File ("doc.txt"));
        int i = 0;
        System.out.println("Анализируемый текст:\n");
        
        while(ins.hasNext()){
        s[i] = ins.nextLine();
        System.out.println(s[i]);
        i++;
        }
        System.out.println("\n\n");
        
        int a = 0, b = 0, x = 0;
        while (a < i){
          x = check(s[a]);
          b += x;
          a++;
          System.out.println("Cовпадений в " + a + " строке: " + x);
          x = 0;
        }
        System.out.println("\n\nОбщее число совпадений: " + b);
    }
    
    
    public static int check(String str){ 
        boolean find;
     
        Pattern pattrn = Pattern.compile("[a-z]{1}[a-z0-9]+[a-z]{1}\\s\\s\\s[a-z]{1}[a-z0-9]+[a-z]{1}");
        Matcher match = pattrn.matcher(str);
       
        find = match.find();
        int c = 0;
        
        while (find) {
            c++;
            find = match.find();
        }
        return c;  
    }  
    
}
