public class TwitterAdapter implements SocialMediaAdapter {
    @Override
    public void autenticar(String token) {
        System.out.println("Autenticando no Twitter com token: " + token);
    }

    @Override
    public void postar(Conteudo conteudo) {
        System.out.println("Postando no Twitter: " + conteudo.getTexto());
    }

    @Override
    public SocialMediaResponse obterEstatisticas() {
        return new SocialMediaResponse("Twitter", 150, 40, 10);
    }
}
