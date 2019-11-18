package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String s = "das ist oma Berta!";
        // mit den klammern wird die
        String reg = "(.+)\\s(.+)\\s(.+\\s.+)";
        Pattern r= Pattern.compile(reg);
        Matcher m =r.matcher(s);
        m.matches();
        System.out.println(m.group(3));
//        if (s.matches(reg)){
//            System.out.println("richtig ...");
//        }else {
//            System.out.println("falsch ...");
//        }


        /*
        //
   String[] a = {"https://meier.de","ftp://lingot.de","http://obelix.siemens.de", "htp://meier.de","http:/richter.de",
                "https://meier.x","otto://richter.de"};
String regex= "(https|http|ftp)://[\\w]{1,}\\.?[\\w]{1,}\\.[a-z]{2,8}$";
   for (int i = 0; i<a.length;i++){
       System.out.print(a[i]+"\t\t");
       if(a[i].length()<22) System.out.print("\t\t\t");
       if (a[i].matches(regex)){
           System.out.println("Richtig...");
       }else {
           System.out.println("Falsch...");

       }

   }


       /*

        String s = "oma";
        String regex = "^[Oo][mp]a";

        String email = "info@abc.bhbhopa.de";
        //emma@meier.de
        //info@lingott.training
        //Meine Lösung
        String regex2 = ".+@..*\\..{2,8}$";
        //Musterlösung
       // String regex1 = ".*@([a-z0-9]*|[a-z0-9]{2,}\\..)[a-zA-Z]{2,8}";
        String regex1 = ".*@[a-z0-9]+\\.?[a-z]{2,}\\.[a-zA-Z]{2,8}";
        if(email.matches(regex1)){
            System.out.println("richtig...");
        } else {
            System.out.println("falsch...");
        }
*/
    }
}
