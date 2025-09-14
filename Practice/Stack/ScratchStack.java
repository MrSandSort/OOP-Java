package Practice.Stack;

import java.util.Arrays;

public class ScratchStack {

    // primarily we intialize array, index of top element, and maximum size of stack

    private int[] arr;
    private int top, capacity;

    // Then, we decided the array to have the size and capacity is equals to size of the array
    // top will be null at first, since we have no elements in stack

    public ScratchStack(int size){
        arr= new int[size];
        capacity=size;
        top=-1; 
    }

    // now we need to push an element into the stack
    // first check if the array is full
    // if array is not full push the element into the 0th index
    // we have top=-1 so adding it as ++top will return 0th index --> top=-1 --> top=-1+1= 0

    public void push(int x){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        arr[++top]=x;
        System.out.println("Pushed into stack: "+ x);
    }


    // now for poping out the element at the top
    // check if the stack is empty, is not empty look for the last element 
    // then decreases one index down from top

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }

        return arr[top--];
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty, can't show any elements");
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return arr.length==0;
    }

    public boolean isFull(){
        return top==capacity-1;
    }

    public void displayStack(){

        int[] arrlist= new int[capacity];

        for(int i=0; i<arr.length;i++){
            arrlist[i]= arr[i];
        }
        Arrays.stream(arrlist).forEach(System.out::print);
        System.err.println(" ");
    }
   
}

