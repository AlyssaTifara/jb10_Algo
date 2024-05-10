import java.util.Scanner;

public class DoubleLinkedListsMain_no1{
    public static void menu(){
        System.out.println("===============================");
        System.out.println("Pengantri Vaksin Extravaganza");
        System.out.println("===============================");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("0. Keluar");
        System.out.println("===============================");
    }
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int opsi;

        do{
            menu();
            opsi = sc.nextInt();
            try{
                switch (opsi) {
                    case 1:
                        System.out.println("-------------------------------");
                        System.out.println(" Masukkan Data Penerima Vaksin ");
                        System.out.println("-------------------------------");
                        System.out.println("Nomor Antrian: ");
                        int noAntri = sc.nextInt();
                        System.out.println("Nama Penerima: ");
                        String nama = sc1.nextLine();
                        dll.addLast(noAntri, nama);
                        break;
                    case 2:
                        dll.removeFirst();
                        break;
                    case 3:
                        dll.print();
                        System.out.println("Sisa Antrian: " + dll.size());
                        break;
                    default:
                        break;
                }
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        } while (opsi == 1|| opsi == 2 || opsi == 3);
    }
}