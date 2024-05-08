package ui;

import db.DAO;
import db.DAOFactory;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

/***
 * Application's main window.
 * 
 * This window displays a menu bar with options to authenticate, exit the app,
 * show help and show about dialogs. The reordered text will be displayed here.
 */
public class RetrieveTextWindow extends javax.swing.JFrame {

    /**
     * Creates new form RetrieveTextWindow
     */
    public RetrieveTextWindow() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(680, 550);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Programa Reordenador de Texto");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        statusArea = new javax.swing.JTextField();
        retrieveButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        authMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        setName("Programa para Reordenação de Texto"); // NOI18N

        jPanel1.setName("Programa Recuperador de Texto"); // NOI18N

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        statusArea.setEditable(false);
        statusArea.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        statusArea.setText("Desconectado.");
        statusArea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        statusArea.setFocusable(false);

        retrieveButton.setText("Recuperar Texto");
        retrieveButton.setEnabled(false);
        retrieveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                retrieveButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusArea, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(retrieveButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(retrieveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(statusArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fileMenu.setText("Arquivo");
        fileMenu.setMargin(new java.awt.Insets(3, 10, 3, 6));

        authMenuItem.setText("Autenticar");
        authMenuItem.setName("Autenticar"); // NOI18N
        authMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                authMenuItemMousePressed(evt);
            }
        });
        fileMenu.add(authMenuItem);

        exitMenuItem.setText("Sair");
        exitMenuItem.setName(""); // NOI18N
        exitMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMenuItemMousePressed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        jMenuBar1.add(fileMenu);

        helpMenu.setText("Ajuda");
        helpMenu.setMargin(new java.awt.Insets(3, 10, 3, 6));

        helpMenuItem.setText("Ajuda");
        helpMenuItem.setName("Ajuda"); // NOI18N
        helpMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                helpMenuItemMousePressed(evt);
            }
        });
        helpMenu.add(helpMenuItem);

        aboutMenuItem.setText("Sobre");
        aboutMenuItem.setName("Sobre"); // NOI18N
        aboutMenuItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aboutMenuItemMousePressed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Programa para Reordenação de Texto");

        setSize(new java.awt.Dimension(694, 557));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuItemMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemMousePressed

    private void authMenuItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authMenuItemMousePressed
        AuthDialog authDialog = new AuthDialog(this, true);
        authDialog.setVisible(true);
    }//GEN-LAST:event_authMenuItemMousePressed

    private void aboutMenuItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMenuItemMousePressed
        AboutDialog aboutDialog = new AboutDialog(this, true);
        aboutDialog.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemMousePressed

    private void helpMenuItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMenuItemMousePressed
        HelpDialog helpDialog = new HelpDialog(this, false);
        helpDialog.setVisible(true);
    }//GEN-LAST:event_helpMenuItemMousePressed

    private void retrieveButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retrieveButtonMousePressed
        if (!dao.isConnected()) {
            return;
        }

        try {
            ArrayList<String> lines = dao.getLinesByGroupId(4);
            StringBuilder sb = new StringBuilder();

            for (String line : lines) {
                sb.append(line).append("\n");
            }
            String text = sb.toString();
            
            saveText(text);
            textArea.setText(text);
            retrieveButton.setEnabled(false);

        } catch (Exception e) {
            statusArea.setText("Falha ao recuperar texto.");
            e.printStackTrace(System.err);
        }
    }//GEN-LAST:event_retrieveButtonMousePressed

    /***
     * Save text into a file in disk.
     * 
     * The file is named 'retrieved-text.txt' and is saved in the
     * directory in which the application was invoked.
     * @param text 
     */
    private void saveText(String text) {
        try (FileWriter fw = new FileWriter("retrieved-text.txt");
                BufferedWriter writer = new BufferedWriter(fw)) {
            writer.write(text);
        } catch (Exception e) {
            statusArea.setText("Falha ao gravar arquivo.");
            e.printStackTrace(System.err);
        }
    }
    
    /***
     * Try to connect to the data source represented by the internal
     * <code>DAO</code> object.
     * @param user
     * @param pass 
     */
    public void setLogin(String user, String pass) {
        try {
            dao.connect(user, pass);
            statusArea.setText("Usuário '" + user + "' conectado.");
            retrieveButton.setEnabled(true);
        } catch (Exception e) {
            statusArea.setText("Falha ao conectar. Tente novamente.");
            e.printStackTrace(System.err);
        }
    }

    private final DAO dao = (new DAOFactory()).createDAO(false);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem authMenuItem;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem helpMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton retrieveButton;
    private javax.swing.JTextField statusArea;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
