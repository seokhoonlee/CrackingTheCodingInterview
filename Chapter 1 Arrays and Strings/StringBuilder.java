class Main {
    public static class StringBuilder {
        private int size;
        private int firstEmptyIndex;
        private char[] array;
        
        public StringBuilder() {
            this(32);
        }
        
        public StringBuilder(int size) {
            this.size = size;
            this.firstEmptyIndex = 0;
            this.array = new char[size];
        }
        
        public int getSize() {
            return this.size;
        }
        
        public void append(String s) {
            int stringLength = s.length();
            
            boolean resized = false;
            
            while (this.size <= this.firstEmptyIndex + stringLength) {
                this.size *= 2;
                resized = true;
            }
            
            if (resized) {
                char[] newArray = new char[size];
            
                for (int i = 0; i < this.firstEmptyIndex; i++) {
                    newArray[i] = this.array[i];
                }
                
                this.array = newArray;
            }
            
            int j = 0;
            
            for (int i = firstEmptyIndex; i < firstEmptyIndex + stringLength; i++) {
                this.array[i] = s.charAt(j);
                j++;
            }   
        }
        
        public String toString() {
            return String.valueOf(array);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
