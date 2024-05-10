public class DoubleLinkedLists {
    Node head;
    int size;

    public DoubleLinkedLists(){
        head=null;
        size=0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int id, String judul, double rating){
        if(isEmpty()){
            head = new Node(null, id, judul, rating, null);
        }else{
            Node newNode = new Node(null, id, judul, rating, head);
            head.prev = newNode;
            head =  newNode;
        }
        size++;
    }

    public void addLast(int id, String judul, double rating){
        if(isEmpty()){
            addFirst(id, judul, rating);
        }else{
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, id, judul, rating, null);
            current.next = newNode;
            size++;
        }
    }
    

    public void add(int id, String judul, double rating, int index) throws Exception{
        if(isEmpty()){
            addFirst(id, judul, rating);
        }else if(index < 0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        }else{
            Node current = head;
            int i = 0;
            while ((i < index)) {
                current = current.next;
                i++;
            }
            if(current.prev == null){
                Node newNode = new Node(null, id, judul, rating, current);
                current.prev = newNode;
                head = newNode;
            }else{
                Node newNode = new Node(current.prev, id, judul, rating, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void print(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Cetak Data");
            while (tmp != null) {
                System.out.println("------------------------");
                System.out.println(" ID : " + tmp.id);
                System.out.println(" Judul Film : " + tmp.judul);
                System.out.println(" Rating : " + tmp.rating);
                System.out.println("------------------------");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked lists kosong");
        }
    }

    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (head.next == null){
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next !=null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public int searchById(int id){
        Node current = head;
        int position = 0;
        while (current != null) {
            if (current.id == id) {
                return position;
            }
            current = current.next;
            position++;
        }
        return -1;
    }
    

    public void displayDataAndPosition(int id){
        int position = searchById(id);
        if (position != -1) {
            Node current = head;
            for (int i = 0; i < position; i++) {
                current = current.next;
            }
            System.out.println("--------------------------------------------------");
            System.out.println("Data ID Film : " + current.id + " berada di node ke-" + (position+1));
            System.out.println("IDENTITAS  : ");
            System.out.println("ID Film      : " + current.id);
            System.out.println("Judul Film   : " + current.judul);
            System.err.println("Rating     : " + current.rating);
            System.out.println("------------------------");
        } else {
            System.out.println("Data dengan ID " + id + " tidak ditemukan");
        }
    }

    public void sortByRatingDescending() {
        if (isEmpty() || size == 1) {
            return;
        }
        
        for (Node current = head; current.next != null; current = current.next) {
            if (current.rating < current.next.rating) {
                int tempId = current.id;
                String tempJudul = current.judul;
                double tempRating = current.rating;
    
                current.id = current.next.id;
                current.judul = current.next.judul;
                current.rating = current.next.rating;
    
                current.next.id = tempId;
                current.next.judul = tempJudul;
                current.next.rating = tempRating;
            }
        }
    }
    
}