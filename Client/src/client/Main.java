package client;
public class Main {
    public Main() {
        super();
    }
    private static VentanaPrincipal vp = new VentanaPrincipal();
    public static void main(String[] args) {
      Main main = new Main();
      vp.setDefaultCloseOperation(vp.EXIT_ON_CLOSE);
      vp.setLocationRelativeTo(null);
      vp.setVisible(true);
    }
}
