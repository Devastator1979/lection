package lection.U08;
public class Task04 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("main");
		print("Васька");
		print("Васька", "Том");
		print(1, "Васька", "Том", "Hello");
	}

	static void print(String... strings) {
		for (String string : strings) {
			System.out.print(string + " ");
		}
		System.out.println();
	}

	static void print(int i, String... strings) {
		for (String string : strings) {
			System.out.print(string + i + " ");
		}
		System.out.println();
	}

	// static void print( String... strings, float f) { } // ошибка, нельзя
	// указывать другие формальные параметры после множественного
    }
