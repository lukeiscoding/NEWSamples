package pseudocode;

import java.util.Scanner;

public class app {
	public static void main(String[] args) {
		fr fr = new fr(5);
		fr.prt();
		tl tl = new tl(5);
		tl.prt();
		pm pm = new pm(5);
		pm.prt();
		call call = new call();
		call.levelit(3);
		System.out.println("calllv is " + call.lv());
	}

	public void getCallHandler(call call) {

	}
}

class call {
	static int calllv = 0;

	public void levelit(int lvl) {
		this.calllv = lvl;
	}

	public int lv() {
		return this.calllv;
	}
}

class employee {
	int lv = 0;
	int id = 0;
	static Scanner scanner = new Scanner(System.in);

	public employee() {
		System.out.println("The ID:");
		this.id = scanner.nextInt();
	}

	public employee(int idd) {
		this();
		this.id = idd;
	}

	void level(int lv) {
		this.lv = lv;
	}

	void prt() {
		System.out.println("level is " + lv);
		System.out.println("id is " + id);
	}
}

class fr extends employee {
	public fr() {
		super();
		this.level(1);
	}

	public fr(int idd) {
		super(idd);
	}
}

class tl extends employee {
	public tl() {
		super();
		this.level(2);
	}

	public tl(int idd) {
		super(idd);
	}
}

class pm extends employee {
	public pm() {
		super();
		this.level(3);
	}

	public pm(int idd) {
		super(idd);
	}
}