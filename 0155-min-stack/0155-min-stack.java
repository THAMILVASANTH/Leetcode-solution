class MinStack {
private ArrayList<Integer> list;
private ArrayList<Integer> minlist;
private int s;
    public MinStack() {
        list=new ArrayList<>();
        minlist=new ArrayList<>();
        s=0;
    }
    
    public void push(int val) {
        list.add(val);
        if(s==0)
        {
            minlist.add(val);
        }
        else{
            minlist.add(Math.min(val,minlist.get(s-1)));
        }
        s++;
    }
    
    public void pop() {
        if(s>0)
        {
            list.remove(s-1);
            minlist.remove(s-1);
            s--;
        }
    }
    
    public int top() {
        if(s>0)
        {
            return list.get(s-1);
        }
        return -1;
    }
    
    public int getMin() {
        if(s>0)
        {
            return minlist.get(s-1);
        }
        return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */