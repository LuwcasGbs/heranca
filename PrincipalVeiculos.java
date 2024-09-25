package Herenca;

public class PrincipalVeiculos {

	public static void main(String[] args) {
		Veiculo ve = new Veiculo("Chevrolet","sla",2013,"Vermelho");
		System.out.println("Automóvel: ");
		System.out.println("Marca: "+ve.getMarca());
		System.out.println("Modelo: "+ve.getModelo());
		System.out.println("Ano: "+ve.getAno());
		System.out.println("Cor: "+ve.getCor());
		System.out.println("");
		
		Automovel auto = new Automovel("Chevrolet","sla",2013,"Vermelho",4,"bom?");
		System.out.println("Veículo: ");
		System.out.println("Marca: "+auto.getMarca());
		System.out.println("Modelo: "+auto.getModelo());
		System.out.println("Ano: "+auto.getAno());
		System.out.println("Cor: "+auto.getCor());
		System.out.println("Nº de portas: "+auto.getNumeroPortas());
		System.out.println("Motor: "+auto.getMotor());
		System.out.println("");
		
		Moto mo = new Moto("Vespa","sla",2018,"Amarela",12);
		System.out.println("Moto: ");
		System.out.println("Marca: "+mo.getMarca());
		System.out.println("Modelo: "+mo.getModelo());
		System.out.println("Ano: "+mo.getAno());
		System.out.println("Cor: "+mo.getCor());
		System.out.println("Cilindrada: "+mo.getCilindrada());
		System.out.println("");
	}

}
