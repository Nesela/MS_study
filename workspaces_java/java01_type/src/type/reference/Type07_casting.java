package type.reference;

public class Type07_casting {
    public static void main (String[] args){

        //boxing
        int a = 100;
        Integer boxedA = Integer.valueOf(a);
        System.out.println("boxedA : " + boxedA);

        // auto boxing
        int b = 100;
        Integer autoBoxedB = b;
        System.out.println(autoBoxedB);

        //unboxing
        Integer c = Integer.valueOf(200);
        int unboxedC = c.intValue();
        System.out.println("unboxedC : " + unboxedC);

        Integer d = Integer.valueOf(200);
        int autoUnboxedD = d;
        System.out.println(autoUnboxedD);
    }
}
