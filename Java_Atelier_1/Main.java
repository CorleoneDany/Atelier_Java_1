package Java_Atelier_1;

public class Main {
	public static void main(String args[]) {
		Scope scope_1 = new Scope();
		scope_1.count();
		
		Scope_2 scope_2 = new Scope_2();
		scope_2.Count_2(0, 30);
		
		Variables variables = new Variables();
		variables.Sqr_root();
		
		Promote promote = new Promote();
		promote.Blabla();
		promote.Blabla_2();
		
		Casts casts = new Casts();
		casts.int_to_ASCII();
		
		Program program = new Program();
		program.Calculate();
		
		Furniture furniture = new Furniture();
		furniture.Calculate(1, 1, 2);
	}
}
