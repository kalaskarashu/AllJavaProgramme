package ipc;

public class PersonTest {

	public static void main(String[] args) {
		Person ps=new Person();
		Debit dt=new Debit(ps);
		Credit cs=new Credit(ps);
		dt.setName("Ashu");
		cs.setName("Pappu");
		dt.start();
		cs.start();

	}

}
