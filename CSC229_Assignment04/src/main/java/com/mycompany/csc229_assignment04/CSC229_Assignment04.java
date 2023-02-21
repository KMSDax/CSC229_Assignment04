/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc229_assignment04;

/**
 *
 * @author Dax Shethia
 */
public class CSC229_Assignment04 {

static void countDown(int num){//                  Execute until num = 0

    if (num == 0){ //   if 0 end                                   
                                                            
        System.out.println("Blastoff!");//       O(1)           
    
    }
    else if ((num % 2 ) == 0) {//if even execute 1 time O(N-2)                                 
                                                            
        System.out.println("..." + num);//                                            
        countDown(num-1); 
    }
    else{               
        countDown(num-1);// if odd execute 1 time      
    }  
             

}

//what is the output of this code?
//...       (multiplied by N)
//Blastoff  (end loop)

//- modify it so that it prints only the even numbers.
//modified

//- what is the time complexity of this algorithm and why?
//f(N) = O(N-2)+O(1) = O(N-1) ???
//f(N) = O(N) because it decrements at a constant rate





//Task 02) Run the following code:

static int gcd(int x, int y) {

      if (x == y) //                

            return x;                  

      else if(x > y)

            return gcd(x - y, y);
      else
            return gcd(x,y-x);
}

//what is the output of this code?
// the output of this code is the greatest common denomenator of 2 inputs.
//- modify it to find the gcd using subtraction instead of %.

//Task 03) Run the following code:
/*
int fib(int n)

{

       if (n <= 0) // base case 

            return 0;

      else if (n == 1) // base case

             return 1;

      else

             return fib(n – 1) + fib(n – 2); 

}

2^N
O(c^N) - EXPONENTIAL
This is exponential because regardless of what value you input the output would continue to run as long as it doesn't equal 1 or 0 for example if I input 3 it would run
               fib(3)
     fib(2)      +       fib(1)
fib(1) + fib(0)           end
      end

resulting in 3,2,1,1,0
*/

//what is the time complexity of this algorithm and why?

static int HelloWorld(int i){
    if(i != 0){
    System.out.println("Hello World");
    return HelloWorld(i-1);
    }
    else{
    return i;
   }
}


    public static void main(String[] args){
        
        System.out.print("Countdown");
        countDown(6);
        System.out.println("GCD");  
        System.out.println(gcd(21,9));
        HelloWorld(3);
    }

}
