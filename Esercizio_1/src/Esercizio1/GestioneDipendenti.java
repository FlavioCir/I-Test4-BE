package Esercizio1;

public class GestioneDipendenti {

	public static void main(String[] args) {
		
		Dipendente d1 = new Dipendente(1, Livello.OPERAIO, Dipartimento.PRODUZIONE, 5);
		Dipendente d2 = new Dipendente(2, Livello.OPERAIO, Dipartimento.PRODUZIONE, 5);
		Dipendente d3 = new Dipendente(3, Livello.IMPIEGATO, Dipartimento.VENDITE, 5);
		Dipendente d4 = new Dipendente(4, Livello.DIRIGENTE, Dipartimento.AMMINISTRAZIONE, 5);
		
		d1.stampaDipendente();
		d2.stampaDipendente();
		d3.stampaDipendente();
		d4.stampaDipendente();
		d1.promuovi();
		d1.stampaDipendente();
		d3.promuovi();
		d3.stampaDipendente();
		
		System.out.println( "Calcola stipendio totale da pagare" );
		System.out.printf( "Il datore di lavoro deve pagare: €%.2f%n", (d1.calcolaStipendioTotale(5) + d2.calcolaStipendioTotale(5) + d3.calcolaStipendioTotale(5) + d4.calcolaStipendioTotale(5)));

	}
	
}
