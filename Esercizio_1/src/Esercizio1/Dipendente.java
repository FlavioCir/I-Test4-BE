package Esercizio1;

public class Dipendente {

	double stipendioBase = 1000.00;

	private int matricola;
	private double stipendio;
	double importoOrarioStraordinario;
	private Livello jobTitle;
	Dipartimento jobArea;
	
	public Dipendente(int matricola, Dipartimento jobArea) {
		
		this.matricola = matricola;
		this.jobArea = jobArea;
		
		this.stipendio = stipendioBase;
		this.importoOrarioStraordinario = 30;
		this.jobTitle = Livello.OPERAIO;
		
	}
	
	public Dipendente(int matricola, Livello jobTitle, Dipartimento jobArea, double importoOrarioStraordinario) {

		this.importoOrarioStraordinario = importoOrarioStraordinario;
		
		this.matricola = matricola;
		this.stipendio = stipendioBase;
		this.jobTitle = jobTitle;
		this.jobArea = jobArea;
		
	}

	public double getStipendioBase() {
		return stipendioBase;
	}

	public int getMatricola() {
		return matricola;
	}

	public double getStipendio() {
		return stipendio;
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}
	
	public Livello getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(Livello jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Dipartimento getJobArea() {
		return jobArea;
	}

	public void setJobArea(Dipartimento jobArea) {
		this.jobArea = jobArea;
	}

	public void stampaDipendente() {
		
		pagaJobTitle();
		
		System.out.println( "DIPENDENTE:" );
		System.out.println( "Matricola: " + matricola );
		System.out.printf( "Stipendio: €%.2f %n", stipendio );
		System.out.println( "Livello: " + jobTitle );
		System.out.println( "Dipartimento: " + jobArea );
		System.out.println( "------------------------------------------------" );
		
	}	
	
	public void promuovi() {
		
		switch(this.jobTitle) {
			case OPERAIO:
				this.jobTitle = Livello.IMPIEGATO;
				this.stipendio = stipendioBase * 1.2;
				break;
			case IMPIEGATO:
				this.jobTitle = Livello.QUADRO;
				this.stipendio = stipendioBase * 1.5;
				break;
			case QUADRO:
				this.jobTitle = Livello.DIRIGENTE;
				this.stipendio = stipendioBase * 2;
				break;
			case DIRIGENTE:
				System.out.println( "------- Non puoi essere promosso ancora! SEI IL MIGLIORE! -------" );
				break;
			default:
				this.jobTitle = Livello.OPERAIO;
				break;
			}
		
	}
	
	public void pagaJobTitle() {
		
		switch(this.jobTitle) {
		case OPERAIO:
			this.stipendio = stipendioBase;
			break;
		case IMPIEGATO:
			this.stipendio = stipendioBase * 1.2;
			break;
		case QUADRO:
			this.stipendio = stipendioBase * 1.5;
			break;
		case DIRIGENTE:
			this.stipendio = stipendioBase * 2;
			break;
		default:
			this.jobTitle = Livello.OPERAIO;
			break;
		}
		
	}
	
	public void calcolaPaga() {
		
		System.out.println( "Calcolo stipendio dipendente: " + matricola );
		System.out.println( "Livello: " + jobTitle );
		System.out.printf( "Stipendio: €%.2f %n", stipendio );
		
	}
	
	public void calcolaPaga(int a) {
		
		System.out.println( "Calcolo stipendio con straordinario dipendente: " + matricola );
		System.out.println( "Livello: " + jobTitle );
		System.out.println( "Ore di straordinario: " + a );
		System.out.printf( "Stipendio: €%.2f %n", (stipendio + (importoOrarioStraordinario * a)) );
		
	}
	
	public double calcolaStipendioTotale(int a) {
		return (stipendio + (importoOrarioStraordinario * a));
	}
	
}
