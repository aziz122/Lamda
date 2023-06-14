package fr.codeonce.lamda;

import java.util.function.Predicate;

@FunctionalInterface
public interface IsvalidInterface {

	public Predicate<String> isValid();
}
