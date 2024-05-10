public class DoubleLinkedListsMain{
    public static void main(String[] args){
        DoubleLinkedLists dll = new DoubleLinkedLists();
        // dll.print();
        // System.out.println("Size : " +dll.size());
        // System.out.println("====================================");
        // dll.addFirst(3);
        // dll.addLast(4);
        // dll.addFirst(7);
        // dll.print();
        // System.out.println("Size : " +dll.size());
        // System.out.println("=======================================");
        // // dll.add(40, 1);

        // try {
        //     dll.add(40, 1);
        //     dll.print();
        //     System.out.println("Size : " + dll.size());
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        // dll.print();
        // System.out.println("Size :" +dll.size());
        // System.out.println("======================================");
        // dll.clear();
        // dll.print();
        // System.out.println("Size : " +dll.size());

        // dll.addLast(50);
        // dll.addLast(40);
        // dll.addLast(10);
        // dll.addLast(20);

        // dll.print();
        // System.out.println("Size : " +dll.size());
        // System.out.println("======================================");
        // // dll.removeFirst();
        // try {
        //     dll.removeFirst(3);
        //     dll.print();
        //     System.out.println("Size : " + dll.size());
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        // dll.print();

        // System.out.println("Size : " +dll.size());
        // System.out.println("======================================");
        // // dll.removeLast();
        // try {
        //     dll.removeLast();
        //     dll.print();
        //     System.out.println("Size : " + dll.size());
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        // dll.print();

        // System.out.println("Size : " +dll.size());
        // System.out.println("======================================");
        // // dll.remove(1);
        // try {
        //     dll.remove(1);
        //     dll.print();
        //     System.out.println("Size : " + dll.size());
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        // dll.print();
        // System.out.println("Size : " +dll.size());

        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("=======================================");
        dll.addFirst(3);
        dll.addLast(4 );
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("=======================================");
        try{
            dll.add(40, 1);
            dll.print();
            System.out.println("Size: " + dll.size());
        } catch (Exception m){
            System.out.println(m.getMessage());
        }
        System.out.println("=======================================");
        try{
            System.out.println("Data awal pada Limked Lists adalah: " + dll.getFirst());
            System.out.println("Data akhir pada Linked Lists adalah: " + dll.getLast());
            System.out.println("Data indeks ke-1 pada Linked Lists adalah: " + dll.get(1));
        } catch (Exception m){
            System.out.println(m.getMessage());
            System.out.println("=======================================");
        }
    }
}