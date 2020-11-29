package objetos;

public class Cuadrado {
	public double medida;

    public Cuadrado(double lado) {
        this.medida =  lado;
    }

    public double calcularArea(){
        return this.medida * this.medida;
    }

    public double calcularPerimetro(){
        return this.medida *4;
    }
}

