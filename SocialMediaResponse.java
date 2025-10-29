public class SocialMediaResponse {
    private String plataforma;
    private int curtidas;
    private int comentarios;
    private int compartilhamentos;

    public SocialMediaResponse(String plataforma, int curtidas, int comentarios, int compartilhamentos) {
        this.plataforma = plataforma;
        this.curtidas = curtidas;
        this.comentarios = comentarios;
        this.compartilhamentos = compartilhamentos;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getComentarios() {
        return comentarios;
    }

    public int getCompartilhamentos() {
        return compartilhamentos;
    }
}
