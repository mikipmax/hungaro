package hungaro;

import java.util.Arrays;
import munkres.munkres;
import de.javasoft.plaf.synthetica.SyntheticaPlainLookAndFeel;
import java.text.ParseException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
public class Hungaro {

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ParseException{
          UIManager.setLookAndFeel(new SyntheticaPlainLookAndFeel());
              vst_hungaro vista = new vst_hungaro();
         vista.setVisible(true);
         vista.setLocationRelativeTo(null);
        //double matriz[][] = {{3, 5, 4}, {6, 2, 6}, {7, 3, 6}};
    //    double matriz[][] = {{5, 6, 4, 8, 10}, {6, 3, 5, 7, 9}, {4, 8, 6, 5, 3}, {2, 6, 5, 8, 9}, {4, 5, 7, 10, 12}};
        /* Hungaro hung = new Hungaro();
        System.out.println("Matriz original");
        hung.showMatrix(matriz);
        System.out.println("Matriz reducida en filas");
        hung.showMatrix(hung.reduceFilas(matriz));
        hung.showMatrix(hung.reduceColumnas(matriz));*/
    
    }

    /* public int[][] reduceFilas(int matriz[][]) {
        int minFila = 0;
        int[] vecFila = new int[matriz[0].length];

        for (int i = 0; i < matriz[0].length; i++) {
            vecFila = matriz[i];

            minFila = Hungaro.buscarMinVec(vecFila);
            System.out.println("Minimo de fila es: " + minFila);

            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] -= minFila;

            }

        }
        return matriz;
    }*/
}
