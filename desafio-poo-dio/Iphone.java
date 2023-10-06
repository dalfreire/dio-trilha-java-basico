

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{

    public void Iphone(){

    }

    //Métodos do Aparelho Telefônico implementados
    
    public void ligar() {
        System.out.println("Ligando para um contato...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma ligação");
    }

    @Override
    public void iniciarCorreioDeVoz() {
       System.out.println("Iniciando Correio de voz");
    }

    //Métodos do Navegador de Internet implementados
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página da web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da web");
    }

    //Métodos do Reprodutor Musical implementados
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionado música");
    }

    public static void main(String[] args) {
        
        Iphone meuIphone = new Iphone();

        meuIphone.ligar();
        meuIphone.atender();
        meuIphone.iniciarCorreioDeVoz();

        meuIphone.selecionarMusica();
        meuIphone.tocar();
        meuIphone.pausar();

        meuIphone.exibirPagina();
        meuIphone.atualizarPagina();
        meuIphone.adicionarNovaAba();
    }

    
}





    


