package n1exercici2.handlers;

import java.util.Arrays;
import java.util.List;

public class Animals {
		
	public void filtrarLlista() {
		
		List<String> animals = Arrays.asList("LLeo","Aranya","Anxova","Formiga","Estornell","Ànec",
												"Guineu","Cavall");
		
		animals.stream()
			   .filter(animal -> animal.toLowerCase().contains("o") && animal.length() > 5)
			   .forEach(System.out::println);
				
	}
}
