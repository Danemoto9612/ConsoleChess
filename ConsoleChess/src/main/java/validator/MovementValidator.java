package validator;

import java.util.HashMap;
import model.ChessBoard;

public class MovementValidator {

    private final HashMap<String, Integer> converter = new HashMap<>();
    private final int[] backString = new int[4];
    private int lenBackString;

    public MovementValidator() {

        converter.put("A", 0);
        converter.put("B", 1);
        converter.put("C", 2);
        converter.put("D", 3);
        converter.put("E", 4);
        converter.put("F", 5);
        converter.put("G", 6);
        converter.put("H", 7);
    }

    public int[] getBackString() {
        return backString;
    }

    public int[] movementValidator(ChessBoard board, String movement) {

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

                lenBackString = 0;
                backString[lenBackString] = converter.get(movement.substring(0, 1));
                lenBackString++;
                backString[lenBackString] = Integer.parseInt(String.valueOf(movement.substring(1, 2)));
                lenBackString++;
                backString[lenBackString] = converter.get(movement.substring(2, 3));
                lenBackString++;
                backString[lenBackString] = Integer.parseInt(String.valueOf(movement.substring(3, 4)));
                if (availableMovement(board, backString)) {

                    return backString;
                } else {

                    return null;
                }
            }
        } else {

            System.out.println("---------------------------------------------");
            System.out.println("            << Jugada errónea >>");
            System.out.println("---------------------------------------------");
            System.out.println("Horizontal: A - H");
            System.out.println("Vertical: 0 - 7");
            return null;
        }
    }

    private boolean availableMovement(ChessBoard board, int[] movement) {

        String pieza = board.getBoard()[movement[1]][movement[0]].substring(1, 2);

        switch (pieza) {

            case "P" -> {

                // Validar si es o no movimiento diagonal
                if (movement[0] != movement[2] && movement[1] != movement[3]) {

                    return (movement[2] <= movement[0] + 1 || movement[2] <= movement[0] - 1)
                            && !board.getBoard()[movement[3]][movement[2]].equals(" XX ");
                } else {

                    switch (movement[1]) {
                        case 1 -> {

                            return (movement[3] <= movement[1] + 2
                                    && board.getBoard()[movement[3]][movement[2]].equals(" XX "));
                        }
                        case 6 -> {

                            return (movement[3] >= movement[1] - 2
                                    && board.getBoard()[movement[3]][movement[2]].equals(" XX "));
                        }
                        default -> {

                            if (movement[3] > movement[1]) {

                                return ((movement[3] <= movement[1] + 1) && board.getBoard()[movement[3]][movement[2]].equals(" XX "));
                            } else {

                                return ((movement[3] >= movement[1] - 1) && board.getBoard()[movement[3]][movement[2]].equals(" XX "));
                            }
                        }
                    }
                }
            }
            case "T" -> {

                boolean sw = true;

                if (movement[0] == movement[2] || movement[1] == movement[3]) {

                    if (movement[0] != movement[2]) {

                        if (movement[2] > movement[0]) {

                            int i = movement[0] + 1;
                            while (sw && i < movement[2]) {

                                if (!board.getBoard()[1][i].equals(" XX ")) {

                                    sw = false;
                                }
                                i++;
                            }
                        } else {

                            int i = movement[0] - 1;
                            while (sw && i > movement[2]) {

                                if (!board.getBoard()[1][i].equals(" XX ")) {

                                    sw = false;
                                }
                                i--;
                            }
                        }
                    } else if (movement[1] != movement[3]) {

                        if (movement[3] > movement[1]) {

                            int i = movement[1] + 1;
                            while (sw && i < movement[3]) {

                                if (!board.getBoard()[i][0].equals(" XX ")) {

                                    sw = false;
                                }
                                i++;
                            }
                        } else {

                            int i = movement[1] - 1;
                            while (sw && i > movement[3]) {

                                if (!board.getBoard()[i][0].equals(" XX ")) {

                                    sw = false;
                                }
                                i--;
                            }
                        }
                    }
                } else {
                    
                    sw = false;
                }
                return sw;
            }
            case "C" -> {

                return false;
            }
            case "A" -> {

                return false;
            }
            case "Q" -> {

                return false;
            }
            case "K" -> {

                return false;
            }
            default -> {

                return false;
            }
        }
    }
}
