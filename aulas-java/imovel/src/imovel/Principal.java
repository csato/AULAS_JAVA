package imovel;

public class Principal {
	
	public static void main(String[] args) {
		
		Imovel imovel= new Imovel();
		
		imovel.setArea(-100);
		
		imovel.endereco = "nao tem";
		imovel.valor=-10;
		
		System.out.println("Area: "+imovel.getArea());
		System.out.println("endereço : "+imovel.endereco);
		System.out.println("Valor: "+imovel.valor);
} 


}
