package fr.codeonce.lamda;

import java.util.Optional;

public class transform {
	
	public Optional<String> transform (String a,String b){
		
		Optional<String> opt=Optional.of(a);
		//Optional<String> transformedOpt =Optional.of(b);
		opt.ifPresent(x-> x=b);	
		return opt;
		
	}

}
