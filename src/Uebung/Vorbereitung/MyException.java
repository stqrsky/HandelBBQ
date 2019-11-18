package Uebung.Vorbereitung;

public class MyException {
    public void EigeneExcepton(){

        int temp = 24;

        try {
            if (!(temp > -10 && temp <= 10)) {
                throw new BereichsException("außerhalb des Bereichs");
            } else {

            }
        } catch (BereichsException e) {
            System.out.println(e.getMessage());
            temp = 10;
        }
        System.out.println(temp);
    }
   public void exMeth(){
       int i;
       int z = 10;
       int n = 0;
       int erg;
       int base = 0;

       erg = z / n;

       for (base = 10; base >= 2; --base) {
           i = Integer.parseInt("40", base);
           System.out.println("40 base" + base + " = " + i);
       }
   }
}
