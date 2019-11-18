package Uebung.Verschachtelung;

public class A{
    private static int x = 1;
    private String s = "Hallo";

    static class B{

        public void gibB(){
            System.out.println(x);
        }
    }

    public void gibA(String d){
        System.out.println(d);
    }

}
