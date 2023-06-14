package fr.codeonce.lamda;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LamdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LamdaApplication.class, args);
		
	    List<String> strings = new ArrayList<>();
        strings.add("W1234567891"); // true
        strings.add("W"); // false
        strings.add("W12345678901"); //false
        strings.add("Z1234567890"); // false

        IsvalidInterface predection= () -> str->str.length()==11 && str.startsWith("W");
        
      
      
        strings.stream()
        .filter(predection.isValid())
        .forEach(System.out::println);
        		  
                

      
		

		//BiPredicate<String, String> bipres=(x,y)->x>y;
		/*List<String> strings = new ArrayList<>();
        strings.add("d"); // true
        strings.add("c"); // false
        strings.add("a"); //false
        strings.add("b"); // false*/
        Object b = "ccc";
        Object a="aaa";
        
      Optional.ofNullable(a).ifPresentOrElse(x->{ 
    	  x=b;
    	System.out.println(x);  
      }
    		  
    		  ,
    		  
    		  ()-> { throw new  NoSuchElementException();}
    		  
    		  );
      
     // System.out.println(c);
        
       /* Function<Long, Long> facto=x-> {
        	
        	long result=1;
        	
        	for(long i=0;i<=x;i++) {
        		result=result*i;
        	}
			return result;
        	
        };
        long n=3;
        long res=facto.apply(n);
        
        System.out.println(res);*/

       //DoubleSummaryStatistics d=numbers.stream().mapToDouble(x->(Double)x).summaryStatistics();
    // numbers.stream().distinct().forEach(System.out::println);
       // strings.stream().sorted().forEach(System.out::println);
		 
	}
	
	  

}
