public class Node_no1{
    String nama;
    int noAntri;
    Node prev, next;

    Node_no1(Node prev, int noAntri, String nama, Node next){
        this.nama = nama;
        this.noAntri = noAntri;
        this.prev = prev;
        this.next = next;
    }
}