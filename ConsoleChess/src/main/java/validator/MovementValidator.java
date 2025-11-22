package validator;

import java.util.HashMap;

public class MovementValidator {

    private HashMap<String, Integer> converter = new HashMap<>();
    private int[] backString = new int[4];
    private int lenBackString = 0;
    
    public MovementValidator() {

        converter.put("A", 1);
        converter.put("B", 2);
        converter.put("C", 3);
        converter.put("D", 4);
        converter.put("E", 5);
        converter.put("F", 6);
        converter.put("G", 7);
        converter.put("H", 8);
    }

    public int[] getBackString() {
        return backString;
    }
    
    public int[] movementValidator(String movement) {

        int a, b, c, d;

        a = movement.charAt(0);
        b = movement.charAt(1);
        c = movement.charAt(2);
        d = movement.charAt(3);

        if (a >= 65 && a <= 72 && c >= 65 && c <= 72 && b >= 49 && b <= 56 && d >= 49 && d <= 56) {

            if (a == c && b == d) {

                System.out.println("---------------------------------------------");
                System.out.println("     << No ha realizado un movimiento >>");
                return null;
            } else {

                System.out.println("---------------------------------------------");
                System.out.println("            << Jugada aprobada >>");
                backString[lenBackString] = converter.get(String.valueOf(a));
                lenBackString++;
                backString[lenBackString] = Integer.parseInt(String.valueOf(b));
                lenBackString++;
                backString[lenBackString] = converter.get(String.valueOf(c));
                lenBackString++;
                backString[lenBackString] = Integer.parseInt(String.valueOf(d));
                return backString;
            }
        } else {

            System.out.println("---------------------------------------------");
            System.out.println("            << Jugada errónea >>");
            System.out.println("---------------------------------------------");
            System.out.println("Horizontal: A - H");
            System.out.println("Vertical: 1 - 8");
            return null;
        }
    }
}
