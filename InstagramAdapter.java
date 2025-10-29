public class InstagramAdapter implements SocialMediaAdapter {
    @Override
    public void autenticar(String token) {
        System.out.println("Autenticando no Instagram com token: " + token);
    }

    @Override
    public void postar(Conteudo conteudo) {
        System.out.println("Postando no Instagram: " + conteudo.getTexto());
    }

    @Override
    public SocialMediaResponse obterEstatisticas() {
        return new SocialMediaResponse("Instagram", 300, 120, 25);
    }
}
