package ro.teamnet.zerotohero.oop.graphicshape.exception;

/**
 * Created by ramona.raducu on 7/4/2017.
 */
public class block {

    public void meth1() {
        try {
            System.out.println("Ana are mere");
        } catch (Exception e) {
            System.out.println("Excetia este " + e);
        } final {
            System.out.println("Am ajuns in final");
        }
    }

    public void meth2() {
        try {
            System.out.println("Ana are pere");
        }catch(IOException ex1, SQLException ex2) {
            System.out.println("IOException ex " + ex);
        } catch (Exception e) {
            System.out.println("Exception e" + e);
        }
    }
}
