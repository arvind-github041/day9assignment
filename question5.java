package mod17;

public class question5 {
    
        public static void main(String[] args) {
            int n = 7; 
    
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1 || (i == n / 2 && j > 0 && j < n - 1) || (i < n / 2 && (i == j || j == n - 1 - i))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("  ");
                for (int j = 0; j < n; j++) {
                    if (j == 0 || (j == n - 1 && i != 0 && i != n / 2 && i != n - 1) || (i == 0 || i == n / 2 || i == n - 1) && j < n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("  ");
    
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1 || i == n / 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("  ");
    
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1 || (i == n / 2 && j > 0 && j < n - 1) || (i < n / 2 && (i == j || j == n - 1 - i))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("  ");
   
                for (int j = 0; j < n; j++) {
                    if ((i < n / 2 && (i == j || j == n - 1 - i)) || (i >= n / 2 && j == n / 2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
    
                System.out.println();
            }
        }
    
    
}
