
public class Arma extends Item{
	private String adaga;
	private String faca;
	private String espada;
	private String espadaLonga;
	
	private int dano;

	public String getAdaga() {
		return adaga;
	}

	public void setAdaga(String adaga) {
		this.adaga = adaga;
		this.dano = 1;
	}

	public String getFaca() {
		return faca;
	}

	public void setFaca(String faca) {
		this.faca = faca;
		this.dano = 2;
	}

	public String getEspada() {
		return espada;
	}

	public void setEspada(String espada) {
		this.espada = espada;
		this.dano = 1;
	}

	public String getEspadaLonga() {
		return espadaLonga;
	}

	public void setEspadaLonga(String espadaLonga) {
		this.espadaLonga = espadaLonga;
		this.dano = 5;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

public Arma Arma(String nome){
	int numero = (int) (Math.random()*3);
    String n = "";
    switch (numero) {
        case 0:
            n = "faca";
            break;
        case 1:
            n = "espada";
            break;
        case 2:
            n = "cimitarra";
            break;
    }
return new Arma();
		
		
}





}//Final item

