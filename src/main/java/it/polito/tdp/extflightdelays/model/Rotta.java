package it.polito.tdp.extflightdelays.model;

public class Rotta {
	private Airport a1;
	private Airport a2;
	private int nVoli; //la rotta da a1 ad a2 può avere un peso diverso da quella a2 a1 
	
	public Rotta(Airport a1, Airport a2, int nVoli) {
		super();
		this.a1 = a1;
		this.a2 = a2;
		this.nVoli = nVoli;
	}

	public Airport getA1() {
		return a1;
	}

	public void setA1(Airport a1) {
		this.a1 = a1;
	}

	public Airport getA2() {
		return a2;
	}

	public void setA2(Airport a2) {
		this.a2 = a2;
	}

	public int getnVoli() {
		return nVoli;
	}

	public void setnVoli(int nVoli) {
		this.nVoli = nVoli;
	}
	
	
	
}