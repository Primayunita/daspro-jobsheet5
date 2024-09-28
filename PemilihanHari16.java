import java.util.Scanner;

public class PemilihanHari16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String dayNama, dayTipe;
       

        System.out.println("Input Day Nama : ");
        dayNama = sc.nextLine();

        switch (dayNama.toLowerCase()) {
            case "monday":
            case "Truesday":
            case "Wednesday":
            case "thursday":
            case "friday":
                dayTipe = "Weekend";
                break;
            case "saturday":
            case "sunday":
                dayTipe = "weekend";
                break;
            default:
            dayTipe = " Invalid Day Name";
            }
            System.out.println(dayNama + " is a : " + dayTipe); 
    }
 } 
    

