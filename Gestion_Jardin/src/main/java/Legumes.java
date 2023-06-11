    public class Legumes extends Plantes {
    private String code;

    public Legumes(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    boolean necessiteEau() {
        return true;
    }

    @Override
    boolean resitanteOmbre() {
        // Vérifie si le légume est une laitue
        if (code.equals("L")) {
            return true;
        }
        // Le légume est une tomate
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