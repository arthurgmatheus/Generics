package course;

public class Program {

	public static void main(String[] args) {
		
		GenericClass<String> cla = new GenericClass<>(); //Eu mudo de <String> pra int, double, boolean etc. conforme a necessidade
		
		cla.add("Name 1");
		
		System.out.println(cla.getValue());

	
	}
}
