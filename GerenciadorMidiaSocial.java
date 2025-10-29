public class GerenciadorMidiaSocial {
    private SocialMediaAdapter adapter;

    public GerenciadorMidiaSocial(SocialMediaAdapter adapter) {
        this.adapter = adapter;
    }

    public void autenticar(String token) {
        adapter.autenticar(token);
    }

    public void postar(Conteudo conteudo) {
        adapter.postar(conteudo);
    }

    public void exibirEstatisticas() {
        SocialMediaResponse resposta = adapter.obterEstatisticas();
        System.out.println("Plataforma: " + resposta.getPlataforma());
        System.out.println("Curtidas: " + resposta.getCurtidas());
        System.out.println("Comentários: " + resposta.getComentarios());
        System.out.println("Compartilhamentos: " + resposta.getCompartilhamentos());
        System.out.println("-----------------------------");
    }
}
