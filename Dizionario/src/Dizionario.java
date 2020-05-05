import java.util.ArrayList;
import java.util.*;

public class Dizionario {

	private ArrayList<String> parole;
	private Random r;

	public Dizionario() {
		parole = new ArrayList<String>();
		r=new Random();
	}

	public String getParola() {
		int n = r.nextInt(parole.size());
		return parole.get(n);
	}

	public void setParola(String p) {
		parole.add(p);
	}

	public static void main(String[] args) {
		Dizionario d = new Dizionario();
		d.setParola("cane");
		d.setParola("gatto");
		d.setParola("casa");
		System.out.println(d.getParola());
	}

}