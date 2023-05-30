package Objetos;

public class Increment {

	public static void main(String[] args) {
	int c = 5;
	System.out.printf("c before postincrement: %d%n", c); //imprime 5
	System.out.printf("  postincrement: %d%n", c++); //imprime 5
	System.out.printf(" c after postincrement: %d%n", c); //imprime 6
	
	System.out.println();
	
	c = 5;
	System.out.printf("c before preincrement: %d%n", c);
	System.out.printf("  preincrementing c: %d%n", ++c);
	System.out.printf("c after preincrement: %d%n", c);
	}

}
