class Main {
    public static final int DEFAULT_ARRAY_LIST_LENGTH = 32;
    
    public static class Element<T> {
        T t;
        
        public Element(T t) {
            this.t = t;
        }
        
        public void set(T t) {
            this.t = t;
        }
        
        public T get() {
            return this.t;
        }
    }
    
    public static class ArrayList {
        public int size;
        public int elemCount;
        public Element[] array;
        
        public ArrayList() {
            this(DEFAULT_ARRAY_LIST_LENGTH);
        }
        
        public ArrayList(int size) {
            this.size = size;
            this.elemCount = 0;
            this.array = new Element[size];
        }
        
        public Element getElementAtIndex(int getIndex) {
            if (getIndex < 0 || getIndex >= this.elemCount) {
                return null;
            } else {
                return this.array[getIndex];
            }
        }
        
        public int getArraySize() {
            return this.size;
        }
        
        public int getElementCount() {
            return this.elemCount;
        }
        
        public void appendElement(Element appendElement) {
            this.array[this.elemCount] = appendElement;
            this.elemCount++;
            
            if (this.elemCount == this.size) {
                this.size *= 2;
                Element[] newArray = new Element[this.size];
                
                for (int i = 0; i < this.elemCount; i++) {
                    newArray[i] = this.array[i];
                }
                
                this.array = newArray;
            }
        }
        
        public void removeElementAtIndex(int index) {
            this.elemCount--;
            
            for(int i = index; i < this.elemCount; i++) {
                this.array[i] = this.array[i + 1];
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        
        for (int i = 0; i < 8; i++) {
            Element<Integer> e = new Element(i);
            
            al.appendElement(e);
        }
        
        // test edge case (start)
        System.out.print(al.getElementAtIndex(0) + "\n");
        
        // test normal case
        System.out.print(al.getElementAtIndex(3) + "\n");
        
        // test edge case (end)
        System.out.print(al.getElementAtIndex(7) + "\n");
        
        // test fail case (start)
        System.out.print(al.getElementAtIndex(-1) + "\n");
        
        // test fail case (end)
        System.out.print(al.getElementAtIndex(8) + "\n");
        
        // test get array size method
        System.out.print(al.getArraySize() + "\n");
        
        // test get elem count method
        System.out.print(al.getElementCount() + "\n");

        // test edge case (end) of remove element at index method
        al.removeElementAtIndex(7);
        
        System.out.print(al.getElementAtIndex(6) + "\n");
        
        System.out.print(al.getArraySize() + "\n");
        
        System.out.print(al.getElementCount() + "\n");
        
        // test edge case (start) of remove element at index method
        al.removeElementAtIndex(0);
        
        System.out.print(al.getElementAtIndex(0) + "\n");
        
        System.out.print(al.getArraySize() + "\n");
        
        System.out.print(al.getElementCount() + "\n");
    }
}
