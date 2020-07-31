class LRUCache {
    class Node {
        Node next;
        Node prev;
        int key;
        int value;
        public Node (int key, int value) {
            this.key = key;
            this.value = value;
        }
        private void update (int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private final int capacity;
    private Node head;
    private Node tail;
    private Map<Integer, Node> map;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<Integer, Node>();
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) return -1;
        remove(node);
        append(node);
        return node.value;
    }
    public void put(int key, int value) {
        Node node = null;
        if (map.containsKey(key)) {
            node = map.get(key);
            node.value = value;
            remove(node);
        } else if (map.size() < capacity){
            node = new Node(key, value);
        } else {
            //remove the tail
            node = tail;
            remove(tail);
            node.update(key, value);
        }
        append(node);
    }
    //remove a key in the map and from the list
    private Node remove (Node node) {
        map.remove(node.key);
        if (node.prev != null) {
            node.prev.next = node.next;
        }
        if (node.next != null) {
            node.next.prev = node.prev;
        }
        if (node == head) {
            head = node.next;
        }
        if (node == tail) {
            tail = node.prev;
        }
        node.next.prev = null;
        node.prev = null;
        return node;
    }
    //append a node to the head
    private Node append (Node node) {
        map.put(node.key, node);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        return node;
    } 
}