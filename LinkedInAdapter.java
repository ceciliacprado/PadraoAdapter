public class LinkedInAdapter implements SocialMediaAdapter {
    @Override
    public void autenticar(String token) {
        System.out.println("Autenticando no LinkedIn com token: " + token);
    }

    @Override
    public void postar(Conteudo conteudo) {
        System.out.println("Postando no LinkedIn: " + conteudo.getTexto());
    }

    @Override
    public SocialMediaResponse obterEstatisticas() {
        return new SocialMediaResponse("LinkedIn", 90, 30, 5);
    }
}
