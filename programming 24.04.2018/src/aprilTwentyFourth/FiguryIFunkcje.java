package aprilTwentyFourth;

public class FiguryIFunkcje {
    public static void main(String[] args) {

        // narysować figury ze slajdu 9
        drawTriangle(6);
        System.out.println();
        drawDiagonalLine(6);
        drawSquare(6);
        drawX(6);
    }
    // rysowanie trójkąta
    private static void drawTriangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    // rysowanie ukośnej linii
    private static void drawDiagonalLine(int height){
        for (int i = 0; i < height; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(' ');
            }
            System.out.println('*');
        }
    }
    // rysowanie kwadratu
    private static void drawSquare (int height){
        for (int i = 0; i < height; i++){
            System.out.print('*');
            for (int j = 1; j < height - 1; j++){
                System.out.print((i == 0 || i == height - 1) ? '*' : ' ');
            }
            System.out.println('*');
        }
    }
    // rysowanie znaku X
    private static void drawX (int height){
        for (int i = 0; i < height; i++){
            if (i == 0 || i == height + 1){
                System.out.print('*');
            }
            System.out.println(" ");
        }
    }
}
