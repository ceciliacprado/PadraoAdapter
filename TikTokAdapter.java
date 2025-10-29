public class TikTokAdapter implements SocialMediaAdapter {
    @Override
    public void autenticar(String token) {
        System.out.println("Autenticando no TikTok com token: " + token);
    }

    @Override
    public void postar(Conteudo conteudo) {
        System.out.println("Postando no TikTok: " + conteudo.getTexto());
    }

    @Override
    public SocialMediaResponse obterEstatisticas() {
        return new SocialMediaResponse("TikTok", 500, 200, 60);
    }
}
