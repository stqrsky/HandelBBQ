package Uebung.colection;

import java.util.BitSet;

public class Main {
    public static void main(String[] args) {
        //int[] ar= { 1,2,3,4,5};

//bitset
        /*
        BitSet b = new BitSet();
        System.out.println(b);
        boolean ok;
        for (int i = 2; i <= 20; i++) {
            ok = true;
            for(int j = 2; j < i;j++){
                System.out.print(i+" "+ j+" "+ b.get(j)+" ");
                if(b.get(j)&& i%j ==0){
                    System.out.print("in der Schleife \n");
                    ok = false;
                    break;
                }
                System.out.print("\n");
            }
            if ((ok)){
                System.out.println("ok");
                b.set(i);
            }

        }

        for (int i = 1; i <= 20;++i){
            if(b.get(i)){
                System.out.println(i);
            }
        }

        /*
        HashMap h = new HashMap();
        h.put("Berta",75);
        h.put("Marta",70);
        h.put("Hilde",66);
        h.put("Grete",55);
        h.put("Berta",74);


        Iterator it = h.keySet().iterator();
        while (it.hasNext()){
            String key = (String) it.next();
            System.out.println(
                    key + "-->"+ h.get(key)
            );

        }

       /*
        //erster versuch mit viel code
        Iterator it = h.entrySet().iterator();


        System.out.println(it);

        while (it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(
                    entry.getKey() +"-->"+ entry.getValue()
            );
        }


        }
        /*
        Stack s = new Stack();
        s.push("eins");
        s.push(25);
        s.push("zwei");
        s.push(123);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.elementAt(1));//entspricht nicht dem stack prinzip LIFO


        /*        System.out.println(s.get(1));
        System.out.println(s.size());
        System.out.println(s);
        s.removeElementAt(1);
        s.add(1,"test123");
        System.out.println(s);*/

    }
}
