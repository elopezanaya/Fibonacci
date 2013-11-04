package com.exercise;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci
{

List <Integer> fibonacciSequence = new ArrayList<Integer>();

public List<Integer> getFibonacciSequence() {
	return fibonacciSequence;
}

public void setFibonacciSequence(List<Integer> fibonacciSequence) {
	this.fibonacciSequence = fibonacciSequence;
}

private int getNextFibonnaciNumberInTheSequence(int index){
  
if (this.getFibonacciSequence().size() > 0 ){
  
  return this.getFibonacciSequence().get(index-2) +this.getFibonacciSequence().get(index-1) ;
  
}

  return 0;

}

public List<Integer> getSequenceOfFibonacciNumberLimitedTo10Iterations(){
  
  
  for (int i=0; i <=10; i++){
    
    
    if (i > 1){
    	this.getFibonacciSequence().add(getNextFibonnaciNumberInTheSequence(i));
      
    }else{
      
    	this.getFibonacciSequence().add(i);
    }
  }
  
  return this.getFibonacciSequence();
  
}




}