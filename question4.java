package mod17;

public class question4 {
    public static void main(String[] args) {
        
                printP();
                printW();
                System.out.println(); // Separate P and W with a new line
                printS();
                printK();
                printI();
                printL();
                printL();
                printS();
            }
        
            public static void printP() {
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (j == 0 || (i == 0 && j < 6) || (i == 3 && j < 6) || (j == 6 && i < 3)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
        
            public static void printW() {
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (j == 0 || j == 6 || (i > 3 && (j == i - 3 || j == 9 - i))) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
        
            public static void printS() {
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        if ((i == 0 && j < 6) || (i == 3 && j < 6) || (i == 6 && j < 6) || (j == 0 && i < 3) || (j == 6 && i > 3)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
        
            public static void printK() {
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (j == 0 || (i - j == 3) || (i + j == 3)) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
        
            public static void printI() {
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (i == 0 || i == 6 || j == 3) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                System.out.println();
            }
        
 
        
            public static void printL() {
                for (int i = 0; i < 7; i++) {
                    for (int j = 0; j < 7; j++) {
                        if (j == 0 || i == 6) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                   
                    System.out.println();
                }
                System.out.println();
            }

}
