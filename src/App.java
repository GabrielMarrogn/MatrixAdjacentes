import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int linha = sc.nextInt();
            int coluna = sc.nextInt();

            int[][] arr = new int[linha][coluna];
            List<Integer> list = new ArrayList<Integer>();

            for (int i = 0; i < arr.length; i++) {
                for (int k = 0; k < arr[i].length; k++) {
                    arr[i][k] = sc.nextInt();
                }
            }

            for (int i = 0; i < arr.length; i++) {
                for (int k = 0; k < arr[i].length; k++) {
                    int cont = 0;
                    // Se exitir um pao de queijo
                    if (arr[i][k] == 1) {
                        list.add(9);
                    }
                    // Se não exitir
                    else if (arr[i][k] == 0) {
                        if (k != coluna - 1 && arr[i][k + 1] == 1) {
                            cont++;
                        }
                        if (k != 0 && arr[i][k - 1] == 1) {
                            cont++;
                        }
                        if (i != linha - 1 && arr[i + 1][k] == 1) {
                            cont++;
                        }
                        if (i != 0 && arr[i - 1][k] == 1) {
                            cont++;
                        }

                        list.add(cont);
                    }
                }
            }

            for (int i = 0; i < list.size(); i++) {
                if ((i + 1) % coluna == 0) {
                    System.out.println(list.get(i));
                } else {
                    System.out.print(list.get(i));
                }

            }
        }

        sc.close();
    }
}
