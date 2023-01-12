package Esercizio1;

public class Main {

	public static void main(String[] args) {
		
		Dipendente d1 = new Dipendente(1, Dipartimento.PRODUZIONE);
		Dipendente d2 = new Dipendente(2, Dipartimento.AMMINISTRAZIONE);
		
		d1.stampaDipendente();
		d2.stampaDipendente();
		
		d1.promuovi();
		d1.stampaDipendente();
		
		d1.calcolaPaga();
		System.out.println( "------------------------------------------------" );
		d2.calcolaPaga(30);

	}

}