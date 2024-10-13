
public class Principal {
    public static void main(String[] args)  {
        try{
             Menu.menu();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
