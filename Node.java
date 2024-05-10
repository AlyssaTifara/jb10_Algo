public class Node{
    String judul;
    int id;
    double rating;
    Node prev, next;

    Node(Node prev, int id, String judul, double rating, Node next){
        this.judul = judul;
        this.id = id;
        this.rating = rating;
        this.prev = prev;
        this.next = next;
    }
}