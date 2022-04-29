import java.util.Scanner;

public class tugasQueue {
    int id;
    String nama;
    tugasQueue next;
    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);

    public void input(){
        System.out.print("Masukkan nama : ");
        nama = str.nextLine();
        System.out.println("Pengantri baru didaftarkan");
        next = null;
    }

    public void read(){
        System.out.println("Pengantri a.n. " + nama + " silahkan memasuki ruangan");
        next = null;
    }

    public static void main(String[] args){
        int menu = 3;
        linked que = new linked();
        while(menu!=0){
            System.out.println("Pilih menu: ");
            System.out.println("1. Tambah antrian");
            System.out.println("2. Panggil antrian");
            System.out.println("0. Keluar");

            System.out.print("Menu pilihan : ");
            menu = in.nextInt();

            if(menu == 1)que.enqueue();
            else if(menu==2)que.view();
            else if(menu==0)System.exit(0);
            else System.out.println("Salah");
        }
    }
}

class linked{
    tugasQueue head, tail;

    public linked(){
        head = null;
        tail = null;
    }

    public void enqueue(){
        tugasQueue baru = new tugasQueue();
        baru.input();

        if(head == null)head=baru;
        else tail.next=baru;
        tail=baru;
    }

    public void view(){
        if(head==null)System.out.println("- Kosong -");
        else{
            for(tugasQueue a=head; a!=null; a=a.next) a.read();
        }
    }
}