package ui;

/***
 * A JDialog for user authentication into the data source to be accessed.
 */
public class AuthDialog extends javax.swing.JDialog {

    /**
     * Creates new form AuthDialog
     */
    public AuthDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userInput = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        passInput = new javax.swing.JPasswordField();
        authButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setPreferredSize(new java.awt.Dimension(250, 200));
        setResizable(false);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AUTENTICAR");
        getContentPane().add(jLabel1);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.PAGE_AXIS));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Usuário:");
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 16));
        jPanel2.add(jLabel2);

        userInput.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanel2.add(userInput);

        jPanel1.add(jPanel2);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Senha:");
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 16));
        jPanel3.add(jLabel3);

        passInput.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanel3.add(passInput);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1);

        authButton.setText("Enviar");
        authButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                authButtonMousePressed(evt);
            }
        });
        getContentPane().add(authButton);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void authButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authButtonMousePressed
        String user = userInput.getText();
        String pass = new String(passInput.getPassword());

        if (user.isEmpty() || pass.isEmpty()) {
            return;
        }

        RetrieveTextWindow reordenar = (RetrieveTextWindow) getParent();
        reordenar.setLogin(user, pass);

        dispose();
    }//GEN-LAST:event_authButtonMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField passInput;
    private javax.swing.JTextField userInput;
    // End of variables declaration//GEN-END:variables
}
