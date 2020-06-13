import java.util.*;
public class  CircularDeque {
    public static void main(String[] args) {
        MyCircularDeque obj = new MyCircularDeque(4);
        boolean param_1 = obj.insertFront(1);
        System.out.println("Test cases are as below: ");
        System.out.println("Insert Front 1 and Result is:" + param_1);
        boolean param_2 = obj.insertLast(2);
        System.out.println("Insert Front 2 and Result is:" + param_2);
        boolean param_3 = obj.deleteFront();
        System.out.println("Delete Front  and Result is:" + param_3);
        boolean param_4 = obj.deleteLast();
        System.out.println("Delete Last and Result is:" + param_4);
        int param_5 = obj.getFront();
        System.out.println("Get Front and Result is:" + param_5);
        int param_6 = obj.getRear();
        System.out.println("Get Rear and Result is:" + param_6);
        boolean param_7 = obj.isEmpty();
        System.out.println("IsEmpty() and Result is:" + param_7);
        boolean param_8 = obj.isFull();
        System.out.println("IsFull() and Result is:" + param_8);
    }
        public static class MyCircularDeque {
        int front = 0, rear = -1, len = 0, k = 0; 
        int[] arr; 
        /** Initialize your data structure here. Set the size of the deque to be k. */
        public MyCircularDeque(int k) {
            arr = new int[k]; 
            this.k = k; 
        }
        
        /** Adds an item at the front of Deque. Return true if the operation is successful. */
        public boolean insertFront(int value) {
            if (isFull()) return false; 
            front = --front % k;
            if (front < 0) front += k; 
            arr[front] = value;
            len++; 
            if (len == 1) rear = front; 
            return true; 
        }
        
        /** Adds an item at the rear of Deque. Return true if the operation is successful. */
        public boolean insertLast(int value) {
            if (isFull()) return false; 
            rear = ++rear % k; 
            arr[rear] = value;
            len++;
            return true; 
        }
        
        /** Deletes an item from the front of Deque. Return true if the operation is successful. */
        public boolean deleteFront() {
            if (isEmpty()) return false; 
            front = ++front % k;
            len--;
            return true; 
        }
        
        /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
        public boolean deleteLast() {
            if (isEmpty()) return false; 
            rear = --rear % k;
            if (rear < 0) rear += k; 
            len--; 
            return true; 
        }
        
        /** Get the front item from the deque. */
        public int getFront() {
            return isEmpty() ? -1 : arr[front]; 
        }
        
        /** Get the last item from the deque. */
        public int getRear() {
            return isEmpty() ? -1 : arr[rear]; 
        }
        
        /** Checks whether the circular deque is empty or not. */
        public boolean isEmpty() {
            return len == 0; 
        }
        
        /** Checks whether the circular deque is full or not. */
        public boolean isFull() {
            return len == k; 
        }
    }
}