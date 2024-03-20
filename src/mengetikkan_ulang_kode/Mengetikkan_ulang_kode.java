package mengetikkan_ulang_kode;

public class Mengetikkan_ulang_kode {
    
    public static void main(String[] args) {
        int data [][] ={
            {4, 6, 4, 2, 8, 4, 2, 10},
            {4, 6, 4, 2, 8, 4, 2, 10}
        };
        for(int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[a].length; b++) {
                System.out.print(data[a][b] + " ");
            }
            System.out.println("");
        }
    }
    
}
