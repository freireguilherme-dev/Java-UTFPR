package atividade01;

public class Motor {
    private int qtdPist; 
    private int potencia; 

   
    public Motor() {
        this.setQtdPist(0);
        this.potencia = 0;
    }

    // Getters e Setters
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

	public int getQtdPist() {
		return qtdPist;
	}

	public void setQtdPist(int qtdPist) {
		this.qtdPist = qtdPist;
	}

}
