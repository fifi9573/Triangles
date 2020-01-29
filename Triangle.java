public class Triangle {
    public static char ch;
    
    /**Use this method to print a blank space
    * 
    **/
    public static void printSpace() {
        System.out.print(" ");
    }
    
    /**Use this method to print the static class variable ch
    * 
    **/
    public static void printChar() {
        System.out.print(ch);
    }
    
    /**Use this method to print a left aligned right triangle
    * @param length the length of the side of the triangle (how many rows)
    **/
    public static void printLeftTriangle(int length) {//length is the number of rows
        for(int i=length; i>=1; i--){
            for(int k=length; k>=i; k--){
            printChar();
            }
            System.out.println();
        }
    }//called by writing Triangle.printLeftTriangle()
    
    /**Use this method to print a right aligned right triangle
    * @param length the length of the side of the triangle (how many rows)
    **/
    public static void printRightTriangle(int length) {
        for(int i=1; i<=length; i++){
            for(int k=length; k>=1; k--){
                if(k>=i){
                    printSpace();
                }else{
                    printChar();
                }
            }
            System.out.println();
        }
    }
    /**Use this method to print a center aligned isosceles triangle
    * @param length the number of rows
    **/
    public static void printCenterTriangle(int length) {
        int count = length-1;
        for (int k=1; k<=length; k++) {
            for (int i=1; i<=count; i++){
                printSpace();
            }
            count--;
            for (int i=1; i<=2*k-1; i++){
                printChar();
            }
            System.out.println();
        }     
    }
    
    /**Use this method to print a flipped center aligned isosceles triangle
    * @param length the number of rows
    **/
    public static void printFlipCenterTriangle(int length) {
        int count=1;
        for (int k=1; k<=length-1; k++) {
            for (int i=1; i<=count; i++){
                printSpace();
            }
            count++;
            for (int i=1; i<=2*(length-k)-1; i++){
                printChar();
            }
            System.out.println();
        }
    }
    
    /**Use this method to print a diamond
    * @param length the number of rows in the top triangle of the diamond
    **/
    public static void printDiamond(int length) {
        int count = length-1;
        for (int k=1; k<=length; k++){
            for (int i=1; i<=count; i++){
                printSpace();
            }
            count--;
            for (int i=1; i<=2*k-1; i++){
                printChar();
            }
            System.out.println();
        }
        count=1;
        for (int k=1; k<=length-1; k++) {
            for (int i=1; i<=count; i++){
                printSpace();
            }
            count++;
            for (int i=1; i<=2*(length-k)-1; i++){
                printChar();
            }
            System.out.println();
        }
    }
    
    
}
