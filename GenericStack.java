
public class GenericStack {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
    
    public class GenericStack<T> {
        
        private class Node<T> {
            
            T value;
            
            Node<T> next;
            
            public Node(T value){
                this.value = value;
                this.next = null;
            }
            
        }
        
        Node<T> top;
        
        public void push(T v){
            if(top == null){
                throw new EmptyStackException();
            }
            
            
        }
    }
}