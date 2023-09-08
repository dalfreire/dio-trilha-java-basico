public class Usuario {

    public static void main(String[] args) throws Exception {
        SmartTv smarTv = new SmartTv();

        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.diminuirVolume();
        smarTv.aumentarVolume();

        System.out.println("Canal Atual ? :  " + smarTv.canal);
        smarTv.mudarCanal(13);
        System.out.println("Canal Atual ? :  " + smarTv.canal);

        System.out.println("TV ligada? " + smarTv.ligada);
        System.out.println("Canal Atual ? :  " + smarTv.canal);
        System.out.println("Volume Atual ? :  " + smarTv.volume);
    
        smarTv.ligar();
        System.out.println("Novo Status -> TV ligada ? " + smarTv.ligada);

        smarTv.desligar();
        System.out.println("Novo Status -> TV ligada ? " + smarTv.ligada);
    }
}
