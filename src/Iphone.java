import PackageIphone.AparelhoTelefonico;
import PackageIphone.NavegadorDeInternet;
import PackageIphone.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical {
    //metodos do aparelho telefonico
    @Override
    public void ligar() {
        System.out.println("Ligar para fulano");
    }

    @Override
    public void atender() {
        System.out.println("Atender telefone");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    //metodos do navegador de internet
    @Override
    public void exibirPaigna() {
        System.out.println("Exibir pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    //metodos do reprodutor musical
    @Override
    public void tocar() {
        System.out.println("Tocar musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica");
    }
}
