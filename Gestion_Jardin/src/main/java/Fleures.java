
    public class Fleures extends Plantes {
    private String code;
    private String couleur;

    public Fleures(String code, String couleur) {
        this.code = code;
        this.couleur = couleur;
    }

    public String getCode() {
        return code;
    }

    public String getCouleur() {
        return couleur;
    }

    @Override
    boolean necessiteEau() {
        return false;
    }

    @Override
    boolean resitanteOmbre() {
        // Vérifie si la fleur est une clématite
        if (code.equals("C")) {
            return true;
        }
        // La fleur est une rose
        return false;
    }

    @Override
    public boolean proximTuyeau() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public boolean ombragees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

