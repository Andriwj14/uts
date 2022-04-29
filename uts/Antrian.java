import java.util.Scanner;
import java.util.InputMismatchException;

public class Antrian {
        private static int[] queue = new int[20];
        private static int counters = 0;
        
        private static boolean queueStorage() {
            if(counters < queue.length) {
                return true;
            }else {
                return false;
            }
        }
        
        private static void createQueue() {
            String nama;
            int a = 0;
            int noKtp = 0;
            while(a == 0) {
                System.out.print("Masukkan no ktp : ");
                Scanner ktp = new Scanner(System.in);
                try {
                    noKtp = ktp.nextInt();
                    a = 1;
                }
                catch(InputMismatchException e) {
                    System.out.println("Masukan harus berupa Angka!");
                    a = 0;
                }
            }
            queue[counters] = noKtp;
            counters++;
        }
        
        private static void removeQueue() {
            counters--;
            for(int i = 0; i < counters; i++) {
                queue[i] = queue[i + 1];
            }
            System.out.println("Dimohon untuk pengantri dengan no ktp :" + queue[0] );
            System.out.println("Dipersilahkan untuk memasuki ruangan");
        }
        
        private static void displayDataQueue() {
            System.out.print("Daftar Antrian: ");
            for(int i = 0; i < counters; i++) {
                System.out.print(" ["+i+" => "+queue[i]+"]" );
            }
            System.out.println("");
        }
        
        private static void cleanQueue() {
            counters = 0;
        }
        
        private static void menuProgram() {
            int a = 0;
            int pilihMenu = 0;
            while(a == 0) {
                System.out.println("\n=== Sistem Aplikasi Antrian Mal Pelayanan Masyarakat Berbasis Virtual ===");
                System.out.println("=== 362155401214_Dhava Bagus Saputra ===");
                System.out.println("=== 362155401206_Andri Wijaksono     ===");
                System.out.println("Menu : ");
                System.out.println("1. Masukkan data pengantri");
                System.out.println("2. Panggil antrian");
                System.out.println("3. Status antrian");
                System.out.println("4. Daftar antrian");
                System.out.println("5. Hapus antrian");
                System.out.println("6. Keluar");
                System.out.print("Pilihan Menu (1 - 6) = ");
                Scanner menuOption = new Scanner(System.in);
                try {
                    pilihMenu = menuOption.nextInt();
                    a = 1;
                }catch(InputMismatchException e) {
                    System.out.println("Masukan harus Angka!");
                }
            }
            System.out.println("");
            menuChooser(pilihMenu);
        }
        
        private static void menuChooser(int choosenMenu) {
            switch(choosenMenu) {
                case 1:
                    boolean check = queueStorage();
                    if(check) {
                        createQueue();
                    }
                    else {
                        System.out.println("Antrian Penuh!, silahkan daftar nanti");
                    }
                    break;
                case 2:
                    removeQueue();
                    break;
                case 3:
                    System.out.println("Daftar antrian  : ");
                    System.out.println("Kapasitas       : " + queue.length);
                    System.out.println("Terisi          : " + counters);
                    break;
                case 4:
                    displayDataQueue();
                    break;
                case 5:
                    cleanQueue();
                    break;
                case 6:
                    quitApp();
                    break;
            }
            menuProgram();
        }
        
        private static void quitApp() {
            String quitss = "y";
            System.out.print("Apakah anda yakin untuk keluar dari antrian? (Y/T): ");
            quitss = new Scanner(System.in).nextLine();
            if(quitss.equalsIgnoreCase("y")) {
                System.out.print("Terimakasih telah berkunjung");
                System.exit(0);
            }
            else {
                System.out.print("Silahkan lanjutkan pendaftaran");
                menuProgram();
            }
        }
        public static void main(String[] args){
            menuProgram();
        }
}