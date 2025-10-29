public class MainDemo {
    public static void main(String[] args) {
        Conteudo conteudo = new Conteudo("Nova campanha da marca lançada!");

        System.out.println("=== Publicando nas redes sociais ===");

        GerenciadorMidiaSocial twitter = new GerenciadorMidiaSocial(new TwitterAdapter());
        twitter.autenticar("token_twitter");
        twitter.postar(conteudo);
        twitter.exibirEstatisticas();

        GerenciadorMidiaSocial insta = new GerenciadorMidiaSocial(new InstagramAdapter());
        insta.autenticar("token_instagram");
        insta.postar(conteudo);
        insta.exibirEstatisticas();

        GerenciadorMidiaSocial linkedin = new GerenciadorMidiaSocial(new LinkedInAdapter());
        linkedin.autenticar("token_linkedin");
        linkedin.postar(conteudo);
        linkedin.exibirEstatisticas();

        GerenciadorMidiaSocial tiktok = new GerenciadorMidiaSocial(new TikTokAdapter());
        tiktok.autenticar("token_tiktok");
        tiktok.postar(conteudo);
        tiktok.exibirEstatisticas();
    }
}
