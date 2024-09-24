package atividade01;

public class Veiculo {
	private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private float veloMax;
    private int qtdRodas;
	private Motor motor;
	
    public Veiculo() {
        this.placa = " ";
        this.marca = " ";
        this.modelo = " ";
        this.cor = " ";
        this.veloMax = 0.0f;
        this.qtdRodas = 0;
        this.motor = new Motor();
    }

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getVeloMax() {
		return veloMax;
	}

	public void setVeloMax(float veloMax) {
		this.veloMax = veloMax;
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

    public void exibirInfo() {
    	System.out.println("--------------------------");
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Máxima: " + veloMax + "KM/H");
        System.out.println("Quantiade de Rodas: " + qtdRodas);
        System.out.println("Potência do Motor: " + motor.getPotencia() + " CV");
        System.out.println("Quantidade de Pistão: " + motor.getQtdPist() + "V");
        System.out.println("--------------------------");
    }
	
}
