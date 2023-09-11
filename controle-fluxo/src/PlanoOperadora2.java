// Modo condicional switch/case
public class PlanoOperadora2 {
	public static void main(String[] args) {
		String plano = "T"; // M / T

		switch (plano) {
			case "": {
				System.out.println("5Gb Youtube");
				
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
				
			}
			case "B": {
				System.out.println("100 minutos de ligação");
				
			}
		}
	}
}