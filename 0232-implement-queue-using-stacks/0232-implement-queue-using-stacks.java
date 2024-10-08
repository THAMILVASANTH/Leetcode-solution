class MyQueue {
    Stack<Integer> in,out;

    public MyQueue() {
        in=new Stack<>();
        out=new Stack<>();
    }
    
    public void push(int x) {
        in.push(x);
        
    }
    
    public int pop() {
        if(out.empty() !=true)
            return out.pop();
        else{
            while(in.empty()==false)
            out.push(in.pop());
        }
        return out.pop();
    }
    
    public int peek() {
        if(out.empty()!=true)
            out.peek();
        else{
            while(in.empty()==false)
                out.push(in.pop());
        }
        return out.peek();
    }
    
    public boolean empty() {
        return in.empty() && out.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */