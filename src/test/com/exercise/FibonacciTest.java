package test.com.exercise;



import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import com.exercise.Fibonacci;

public class FibonacciTest
{



@Test
public void testFibonacciSerie(){
  
 Fibonacci fibonacci = new Fibonacci();
 
 List<Integer> resulstToComprobe= fibonacci.getSequenceOfFibonacciNumberLimitedTo10Iterations();
 Integer [] result ={0,1,1,2,3,5,8,13,21,34,55};
 
 assertEquals(result,resulstToComprobe.toArray() );
 
 
}

}
