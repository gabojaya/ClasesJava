import BusinessLogic.*;

public class App {
    public static void main(String[] args) throws Exception {
        MasterFrame frm1 = new MasterFrame();
        Cliente c = new Cliente();
        c.nacer("Pepe");
        c.crecer();
        c.reproducirseAmor();

    }
}
