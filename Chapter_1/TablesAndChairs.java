public class TablesAndChairs {
    public static void main(String[] args) {
        int rows = 6;
        int cols = 24;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (c == 0 && r < 6) {
                    System.out.print("X");
                }
                else if (c == cols - 1 && r < 6) {
                    System.out.print("X");
                }               
                else if (r == 2 && c >= 7 && c <= 16) {
                    System.out.print("X");
                }                
                else if (r == 3 && c >= 0 && c <= 4) {
                    System.out.print("X");
                }                
                else if (r == 3 && c >= 19 && c <= 23) {
                    System.out.print("X");
                }               
                else if (r >= 3 && (c == 7 || c == 16)) {
                    System.out.print("X");
                }               
                else if (r >= 4 && (c == 0 || c == 4)) {
                    System.out.print("X");
                }                
                else if (r >= 4 && (c == 19 || c == 23)) {
                    System.out.print("X");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
