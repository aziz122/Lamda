package fr.codeonce.lamda;

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

      
        strings.stream()
        .filter(LamdaApplication::isValid)
        .forEach(System.out::println);
        		  
                

       // System.out.println(filteredStrings);
	}
	
	  public static boolean isValid(String str) {
		  Predicate<String> isValidPred= s-> s.length()==11 && s.startsWith("W");
		  return isValidPred.test(str);
	  }

}
