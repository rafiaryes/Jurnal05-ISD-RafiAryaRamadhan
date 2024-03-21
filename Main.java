import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        while (true) {
            System.out.println("1. Input Tugas");
            System.out.println("2. Tugas Yang Harus Dikerjakan Terlebih Dahulu");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Tampilkan Tugas");
            System.out.println("5. Exit");

            String pilih = input.nextLine();
            switch (pilih) {
                case "1":
                    System.out.println("Tambahkan Tugas: ");
                    String task = input.nextLine();
                    queue.add(task);
                    break;
                case "2":
                    if (!queue.isEmpty()) {
                        System.out.println("Tugas yang harus dikerjakan " + queue.peek());
                    } else {
                        System.out.println("Tidak ada tugas yang harus dikerjakan");
                    }
                    break;
                case "3":
                    if (!queue.isEmpty()) {
                        System.out.println("Tugas yang sudah selesai adalah " + queue.remove());
                    } else {
                        System.out.println("Tidak ada tugas yang harus dkerjakan");
                    }
                    break;
                case "4":
                    for (String tugas : queue) {
                        System.out.println(tugas);
                    }
                    break;
                case "5":
                    input.close();
                    System.out.println("Program selesai");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilih angka lain");
                    break;
            }
        }
    }
}