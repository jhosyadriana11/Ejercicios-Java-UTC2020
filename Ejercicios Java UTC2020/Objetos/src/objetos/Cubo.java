package objetos;
import java.lang.Math;
public class Cubo extends Cuadrado{
	public double medida;
	    
	public Cubo(double lado) {
		super(lado);
		this.medida = lado;
	}

	public double calcularVolumen(){
		return Math.pow(this.medida,3);
	}

	public double calcularPerimetro(boolean herencia){
		if (herencia){
			return super.calcularPerimetro ();
		}
		else{
			return this.medida*12;
		}

	}
}
