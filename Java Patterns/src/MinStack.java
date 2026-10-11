import java.util.Stack;

public class MinStack {
    Stack<Integer> minStack;
    Stack<Integer> minTracker;
    //int min;


    public MinStack(){
        this.minStack = new Stack<>();
        this.minTracker = new Stack<>();
    }


    public void push(int x){
        int min;
        if (minStack.isEmpty()){
            min = x;
            minStack.push(x);
            minTracker.push(x);
        } else if (!(minStack.isEmpty())) {
            min = minTracker.peek();
            min = Math.min(min,x);
            minStack.push(x);
            minTracker.push(min);
        }
    }

    public int pop(){
        int poppedEle = minStack.pop();
        minTracker.pop();
        return poppedEle;
    }

    public int top(){
        int topEle = minStack.peek();
        return topEle;
    }

    public int getMin(){
        return minTracker.peek();
    }

}

// Steps for single stack based MinStack
// previousMin = 2*currentMin - encoded

//currentMin = 3
//encoded = 1
//
//previousMin = 2*3 - 1 = 5 ✅