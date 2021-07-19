class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return(top==-1)
    } 

    Stack() 
    { 
        //Initialize your constructor 
        
        top == -1;
    } 
  
    boolean push(int x) 
    { 
        

     //Checking for stack Overflow   if(top>=MAX-1)
        {
            System.out.println("stack overflow");
            return false;
            
        }
        else
        {
         //pushing the elements into the stack   a[++top] =x;
            System.out.println("pushed into the stack");
            return false;
            
        }
          
    } 
  
    int pop() 
    { 
        
        if(top<0)
        {
            return 0;
             //If empty return 0 and print " Stack Underflow"
             System.out.println("stack underflow");
        }
        else
        {
           return a[top--];
        }
       
    
    } 
  
    int peek() 
    { 
        if(top<0)
        {
            System.out.println("there is no element in the stack");
            return 0;
        }
        else{  
           int x = a[top];
            return x;
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
