
package modul_1_202357201028;


public class nama_alamat_telepon {
    
    
    public static void main(String[] args) {
        String data [][] ={
            {"NAMA","\t\tALAMAT","\t\tTELEPON"},
            {"\nABDUL","\t\tKediri","\t\t085646668991"},
            {"KUSNO","\t\tTrenggalek","\t085646668992"},
            {"PONIRAN","\t\tBojonegoro","\t085646668999"},
        };
        for (int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[a].length; b++) {
                System.out.print(data[a][b]+" ");       
            }
            System.out.println("");
        }
    }
  
}
