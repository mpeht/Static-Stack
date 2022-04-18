/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackelements;

/**
 *
 * @author mpeht
 */
public class Stack {
    
 
        private char[] stack; 
        int top; 
        public Stack(int stackSize){ 
          if (stackSize > 0) { 
              stack = new char[stackSize]; 
              top = 0;   }
        }
        public void push (char sElem){ 
            if(stackFull()) 
            { return; }
            stack[top++] = sElem; 
        }
        public char pop (){ 
            if(stackEmpty()){ return '\0';}
            char elem = stack[--top];
            return elem;
        }
        public char consultTop(){ 
            if(stackEmpty()){ return '\0'; }
            int topAux = top;
            topAux--;
            char elem = stack[topAux];
            return elem;
        }
        public boolean stackEmpty (){ 
            return top == 0;}
        
        public boolean stackFull(){ 
            return top == stack.length;}
        
        public void toPrint()  {
            int i;
            for(i = 0; i < top; i++)   {
                System.out.println("Item " + (i + 1) + " " + stack[i]);
            }
        }
    }
