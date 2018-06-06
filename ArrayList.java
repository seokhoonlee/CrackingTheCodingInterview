// Class name must be "Main"
// Libraries included:
// json simple, guava, apache commons lang3, junit, jmock

class Main {
    public static class ArrayList {
        public int size;
        public int elemCount;
        public int[] array;
        
        public ArrayList() {
            this.size = 32;
            this.elemCount = 0;
            this.array = new int[32];
        }
        
        public ArrayList(int size) {
            this.size = size;
            this.elemCount = 0;
            this.array = new int[size];
        }
        
        public int getElementAtIndex(int getIndex) {
            if (getIndex < this.elemCount && getIndex >= 0) {
                return this.array[getIndex];
            } else {
                return -1;
            }
        }
        
        public int getArraySize() {
            return this.size;
        }
        
        public int getElemCount() {
            return this.elemCount;
        }
        
        public void appendElement(int appendElement) {
            this.array[this.elemCount] = appendElement;
            this.elemCount++;
            
            if (this.elemCount == this.size) {
                this.size *= 2;
                int[] newArray = new int[this.size];
                
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
        ArrayList al = new ArrayList(4);
        
        for (int i = 0; i < 8; i++) {
            al.appendElement(i);
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
        System.out.print(al.getElemCount() + "\n");

        // test edge case (end) of remove element at index method
        al.removeElementAtIndex(7);
        
        System.out.print(al.getElementAtIndex(6) + "\n");
        
        System.out.print(al.getArraySize() + "\n");
        
        System.out.print(al.getElemCount() + "\n");
        
        // test edge case (start) of remove element at index method
        al.removeElementAtIndex(0);
        
        System.out.print(al.getElementAtIndex(0) + "\n");
        
        System.out.print(al.getArraySize() + "\n");
        
        System.out.print(al.getElemCount() + "\n");
    }
}
