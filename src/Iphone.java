public class Iphone implements Phone, Ipod, Browser {


    @Override
    public void displayPage() {
        System.out.println("Exibindo um página.");
    }

    @Override
    public void newPage() {
        System.out.println("Adicionando nova Página.");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando Página.");
    }

    @Override
    public void playMusic() {
        System.out.println("Play na Música!");
    }

    @Override
    public void stopMusic() {
        System.out.println("Parando a Música.");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecionar uma Música.");
    }

    @Override
    public void selectAlbum() {
        System.out.println("Escolher um novo Albúm.");
    }

    @Override
    public void voiceMail() {
        System.out.println("Ouvir mensagem do correio de voz");
    }

    @Override
    public void call() {
        System.out.println("Realizar Ligação");
    }

    @Override
    public void answerCall() {
        System.out.println("Atender Ligaçâo.");
    }

    @Override
    public void disconnectCall() {
        System.out.println("Desligar Ligação.");
    }
}
