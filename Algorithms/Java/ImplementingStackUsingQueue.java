class MyStack {
    Queue<Integer> myQueue = new LinkedList<Integer>();
    Queue<Integer> myQueue2 = new LinkedList<Integer>();
    // Push element x onto stack.
    public void push(int x) {
        if(empty()){
            myQueue.offer(x);
        }else{
            if(myQueue.size()>0){
                myQueue2.offer(x);
                int size = myQueue.size();
                while(size>0){
                    myQueue2.offer(myQueue.poll());
                    size--;
                }
            }else if(myQueue2.size()>0){
                myQueue.offer(x);
                int size = myQueue2.size();
                while(size>0){
                    myQueue.offer(myQueue2.poll());
                    size--;
                }
            }
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        if(myQueue.size()>0){
            myQueue.poll();
        }else if(myQueue2.size()>0){
            myQueue2.poll();
        }
        
    }

    // Get the top element.
    public int top() {
        if(myQueue.size()>0){
            return myQueue.peek();
        }else if(myQueue2.size()>0){
            return myQueue2.peek();
        }
        return 0;
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return myQueue.isEmpty() & myQueue2.isEmpty();
    }
}
