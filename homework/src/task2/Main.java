package task2;

public class Main {
	
	public static void main(String[] args) {
		Printable eat = () -> System.out.println("���� ����!");
		Printable sleep = () -> System.out.println("���� �����!");
		Printable swim = () -> System.out.println("���� �������!");
		Printable walk = () -> System.out.println("���� ������!");

		eat.print();
		sleep.print();
		swim.print();
		walk.print();
	}
}
