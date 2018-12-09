package chapter6;
public class E {
	public static void main(String[] args) {
		InterfaceA a = new Print();
		a.printCapitalLetter();

		InterfaceB b = new Print();
		b.printLowercaseLetter();
	}
}

class Print implements InterfaceA, InterfaceB {

	@Override
	public void printLowercaseLetter() {
		char[] chr = new char[26];
		char j = 65;
		for (int i = 0; i <= 25; i++) {
			chr[i] = j;
			j++;
		}
		System.out.print("´óÐ´×ÖÄ¸£º");
		for (char temp : chr) {
			System.out.print(temp);
		}
		System.out.println();
	}

	@Override
	public void printCapitalLetter() {
		char[] chr = new char[26];
		char j = 97;
		for (int i = 0; i <= 25; i++) {
			chr[i] = j;
			j++;
		}
		System.out.print("Ð¡Ð´×ÖÄ¸£º");
		for (char temp : chr) {
			System.out.print(temp);
		}
		System.out.println();
	}

	public void printName() {
		System.out.println("I'm yuanfang");
	}
}

interface InterfaceA {
	void printCapitalLetter();
}

interface InterfaceB {
	void printLowercaseLetter();
}
