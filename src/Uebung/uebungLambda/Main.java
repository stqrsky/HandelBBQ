package Uebung.uebungLambda;

public class Main {
    public static void main(String[] args) {
        /* ohne Lambda muss in der Klasse abc Rechne implementiert sein*/
       /* abc a1 = new abc();
        a1.mult(10);*/

        /* mit Lambda*/
       /* Rechne re = (int x) -> System.out.println(100 * x);
        re.mult(4);
       */
        String name = "Berta";
        Rechne sp = (s) -> {return name+" hallo";};
        System.out.println(sp.sprich("los"));
    }


}

