import java.util.Scanner;

public class PemilihanBilangan16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========MENCARI ANGKA GENAP DAN GANJIL==========");

        System.out.println("masukan sebuah angka : ");
        int angka = sc.nextInt();

        

    

        if(angka % 2 == 0){
            System.out.println("angka " + angka + "Termasuk bilangan genap");
        } else {
            System.out.println("angka " + angka + " Termasuk bilangan ganjil");
        }
    }
}