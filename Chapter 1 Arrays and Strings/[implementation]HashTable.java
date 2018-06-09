import java.util.LinkedList;

class Main {
    public static class HashTable<T> {
        private int size;
        private int numElem;
        private LinkedList[] table;
        
        public HashTable() {
            this(101);
        }
        
        public HashTable(int size) {
            this.size = size;
            this.numElem = 0;
            this.table = new LinkedList[size];
            
            for (int i = 0; i < size; i++) {
                table[i] = new LinkedList();
            }
        }
        
        public int getNumElement() {
            return this.numElem;
        }
        
        public int hashFunction(T t) {
            return t.hashCode() % this.size;
        }
        
        public void insert(T t) {
            int hashIndex = this.hashFunction(t);
            
            table[hashIndex].add(t);
            this.numElem++;
        }
        
        public T find(T t) {
            int hashIndex = this.hashFunction(t);
            
            int listIndex = this.table[hashIndex].indexOf(t);
            
            if (listIndex == -1) {
                return null;
            } else {
                return (T) table[hashIndex].get(listIndex);
            }
        }
        
        public boolean remove(T t) {
            int hashIndex = this.hashFunction(t);
            
            if(table[hashIndex].remove(t)) {
                numElem--;
                return true;
            } else {
                return false;
            }
        }
        
    }
    
    public static void main(String[] args) {
        HashTable<String> ht = new HashTable();
        
        for (int i = 0; i < 10; i++) {
            String s = String.valueOf(i);
            
            ht.insert(s);
        }
        
        System.out.print(ht.getNumElement() + "\n");
        System.out.print(ht.remove(String.valueOf(0)) + "\n");
        System.out.print(ht.remove(String.valueOf(0)) + "\n");
        System.out.print(ht.getNumElement() + "\n");
        System.out.print(ht.find(String.valueOf(1)) + "\n");
     
    }
}
