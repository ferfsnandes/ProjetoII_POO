

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import ui.RetrieveTextWindow;

/***
 * Application's entry point.
 */
public class App {

    public static void main(String[] args) {
        // Set look and feel
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new RetrieveTextWindow().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        });
    }
}
