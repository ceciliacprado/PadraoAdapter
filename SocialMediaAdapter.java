public interface SocialMediaAdapter {
    void autenticar(String token);
    void postar(Conteudo conteudo);
    SocialMediaResponse obterEstatisticas();
}
