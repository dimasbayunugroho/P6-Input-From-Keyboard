import javax.swing.JOptionPane;

public class DemoJOptionPane{

    public static void main( String[] args) {
        String nim, nama, tempat, tgllahir;

        nim = JOptionPane.showInputDialog("Inputkan Nim Anda: ");
        nama = JOptionPane.showInputDialog("Inputkan Nama Anda: ");
        tempat = JOptionPane.showInputDialog("Inputkan tempat lahir Anda: ");
        tgllahir = JOptionPane.showInputDialog("Inputkan tanggal lahir Anda: ");
        

        String msg = " Hello " + nim + " \n " + nama + " \n " + tempat + " \n " +  tgllahir  + "!";
        JOptionPane.showMessageDialog(null,msg);
        
    }
}