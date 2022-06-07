public class Stack_Array {
    static class Stack {
        int[] arr;
        int top;
        int size;

        public Stack(int size) {
            this.size = size;
            top = -1;
            arr = new int[size];
        }

        public boolean isFull(){
            return top == size - 1;
        }

        public void push(int data){
            if (!isFull()) {
                top++;
                arr[top] = data;
            }
            else {
                System.out.println("Stack overflow");
            }
        }

        public int pop(){
            if (top != -1) {
                int res = arr[top];
                top--;
                return res;
            } else {
                System.out.println("Stack is empty");
                return 0;
            }
        }

        public int peek(){
            if(top==-1){
                System.out.println("Stack is empty");
                return 0;
            }
            return arr[top];
        }

        public boolean isEmpty(){
            return top == -1;
        }

        public void printStack(){
            while(!isEmpty()){
                System.out.print(peek()+" ");
                pop();
            }
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack(4);
        s.peek();
        s.push(20);
        s.push(30);
        s.push(45);
        s.push(90);
        s.push(60);
        s.printStack();
    }
} 
