/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gbsperso2;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * Classe permettant de modifier la position d'un employé, réservé aux responsables
 * @author Idaex
 */
public class ModifPosition extends javax.swing.JDialog {

    private InterfaceGraphique fenetre;

    /**
     * Creates new form ModifPosition
     */
    public ModifPosition(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //positionnement au milieu de la fenetre parente
        this.setLocationRelativeTo(parent);
        //on stocke dans this.fenetre la référence vers la fenetre parente
        this.fenetre = (InterfaceGraphique) parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1Nom = new javax.swing.JTextField();
        jTextField1Prenom = new javax.swing.JTextField();
        jButton1Chercher = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonDirigeant = new javax.swing.JButton();
        jButtonCadre = new javax.swing.JButton();
        jButtonNonCadre = new javax.swing.JButton();
        jLabel1Etat = new javax.swing.JLabel();
        jTextField1Identifiant = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextField1Nom.setText("Nom");

        jTextField1Prenom.setText("Prenom");

        jButton1Chercher.setText("Chercher");
        jButton1Chercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ChercherActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Chercher l'utilisateur grâce à l'identifiant au nom et au prenom");

        jButtonDirigeant.setText("Passer dirigeant");
        jButtonDirigeant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDirigeantActionPerformed(evt);
            }
        });

        jButtonCadre.setText("Passer cadre");
        jButtonCadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadreActionPerformed(evt);
            }
        });

        jButtonNonCadre.setText("Passer non-cadre");
        jButtonNonCadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNonCadreActionPerformed(evt);
            }
        });

        jLabel1Etat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1Etat.setText("Aucun utilisateur selectionné");

        jTextField1Identifiant.setText("Identifiant");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jTextField1Identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jTextField1Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jButtonDirigeant)
                .addGap(108, 108, 108)
                .addComponent(jButtonCadre)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonNonCadre)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel1Etat))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jButton1Chercher, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1Identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButton1Chercher)
                .addGap(41, 41, 41)
                .addComponent(jLabel1Etat)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadre)
                    .addComponent(jButtonNonCadre)
                    .addComponent(jButtonDirigeant))
                .addContainerGap(289, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ChercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ChercherActionPerformed
        try {
            //interrogation de la BD pour savoir si l'identifiant/mot de passe est correct
            //instanciation de la classe Driver du paquetage jdbc de mysql
            Class.forName("com.mysql.jdbc.Driver");
            //Chaine de connexion (prise dans l'onglet services)
            String connexionUrl = "jdbc:mysql://localhost/gsbperso?user=admin&password=wxcvbn";

            //etablissement de la connexion
            Connection maConnexion = (Connection) DriverManager.getConnection(connexionUrl);

            //requete
            Statement requete = maConnexion.createStatement();
            String nom1 = jTextField1Nom.getText();
            String prenom1 = jTextField1Prenom.getText();
            String identifiant1= jTextField1Identifiant.getText();
            ResultSet lignesRet = requete.executeQuery("select * from utilisateurs where nom='" + nom1 + "' and prenom='" + prenom1 +"' and identifiant='" + identifiant1 + "'");

            lignesRet.last();
            //on récupère le numéro de la ligne 
            int nombreLignes = lignesRet.getRow();
            //on replace le curseur avant la première ligne 
            lignesRet.beforeFirst();

            if (nombreLignes == 0) {
                JOptionPane.showMessageDialog(rootPane, "Aucun utilisateur correspondant trouvé");
            } else {
                this.jLabel1Etat.setText("Utilisateur trouvé : " + jTextField1Prenom.getText() + " " + jTextField1Nom.getText());
                jTextField1Nom.setEditable(false);
                jTextField1Prenom.setEditable(false);
                jButton1Chercher.setEnabled(false);

            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Classe de connexion mysql non trouvee..." + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "SQL exception ... " + ex.toString());
        }
    }//GEN-LAST:event_jButton1ChercherActionPerformed

    private void jButtonDirigeantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDirigeantActionPerformed
        try {
            //interrogation de la BD pour savoir si l'identifiant/mot de passe est correct
            //instanciation de la classe Driver du paquetage jdbc de mysql
            Class.forName("com.mysql.jdbc.Driver");
            //Chaine de connexion (prise dans l'onglet services)
            String connexionUrl = "jdbc:mysql://localhost/gsbperso?user=admin&password=wxcvbn";

            //etablissement de la connexion
            Connection maConnexion = (Connection) DriverManager.getConnection(connexionUrl);

            //requete
            Statement requete2 = maConnexion.createStatement();
            Statement requete1 = maConnexion.createStatement();

            String nom1 = jTextField1Nom.getText();
            String prenom1 = jTextField1Prenom.getText();

            ResultSet lignesRet = requete1.executeQuery("select * from utilisateurs where nom='" + nom1 + "' and prenom='" + prenom1 + "'");
            if (lignesRet.next()) {
                if (lignesRet.getInt("idposition") == 1) {
                    JOptionPane.showMessageDialog(rootPane, "L'utilisateur est déjà dirigeant");

                } else {
                    int annee = lignesRet.getInt("annee_entree");
                    int anciennete = 2017 - annee ;
                    int leSalaire = 5000;
                    for (int i = 1; i <= anciennete; i++) {
                        leSalaire = leSalaire + (leSalaire * 3 / 100);
                    }
                    requete2.executeUpdate("update utilisateurs set idposition='1', salaire='"+leSalaire+"' where nom='" + nom1 + "' and prenom='" + prenom1 + "'");
                    JOptionPane.showMessageDialog(rootPane, "L'utilisateur est bien promu en dirigeant");
                    
                }
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Classe de connexion mysql non trouvee..." + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "SQL exception ... " + ex.toString());
        }
    }//GEN-LAST:event_jButtonDirigeantActionPerformed

    private void jButtonCadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadreActionPerformed
        try {
            //interrogation de la BD pour savoir si l'identifiant/mot de passe est correct
            //instanciation de la classe Driver du paquetage jdbc de mysql
            Class.forName("com.mysql.jdbc.Driver");
            //Chaine de connexion (prise dans l'onglet services)
            String connexionUrl = "jdbc:mysql://localhost/gsbperso?user=admin&password=wxcvbn";

            //etablissement de la connexion
            Connection maConnexion = (Connection) DriverManager.getConnection(connexionUrl);

            //requete
            Statement requete2 = maConnexion.createStatement();
            Statement requete1 = maConnexion.createStatement();

            String nom1 = jTextField1Nom.getText();
            String prenom1 = jTextField1Prenom.getText();

            ResultSet lignesRet = requete1.executeQuery("select * from utilisateurs where nom='" + nom1 + "' and prenom='" + prenom1 + "'");
            if (lignesRet.next()) {
                if (lignesRet.getInt("idposition") == 2) {
                    JOptionPane.showMessageDialog(rootPane, "L'utilisateur est déjà cadre");

                } else {
                    int annee = lignesRet.getInt("annee_entree");
                    int anciennete = 2017 - annee ;
                    int leSalaire = 3500;
                    for (int i = 1; i <= anciennete; i++) {
                        leSalaire = leSalaire + (leSalaire * 3 / 100);
                    }
                    requete2.executeUpdate("update utilisateurs set idposition='2', salaire='"+leSalaire+"' where nom='" + nom1 + "' and prenom='" + prenom1 + "'");
                    JOptionPane.showMessageDialog(rootPane, "L'utilisateur est bien devenu cadre");
                }
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Classe de connexion mysql non trouvee..." + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "SQL exception ... " + ex.toString());
        }
    }//GEN-LAST:event_jButtonCadreActionPerformed

    private void jButtonNonCadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNonCadreActionPerformed
        try {
            //interrogation de la BD pour savoir si l'identifiant/mot de passe est correct
            //instanciation de la classe Driver du paquetage jdbc de mysql
            Class.forName("com.mysql.jdbc.Driver");
            //Chaine de connexion (prise dans l'onglet services)
            String connexionUrl = "jdbc:mysql://localhost/gsbperso?user=admin&password=wxcvbn";

            //etablissement de la connexion
            Connection maConnexion = (Connection) DriverManager.getConnection(connexionUrl);

            //requete
            Statement requete2 = maConnexion.createStatement();
            Statement requete1 = maConnexion.createStatement();

            String nom1 = jTextField1Nom.getText();
            String prenom1 = jTextField1Prenom.getText();

            ResultSet lignesRet = requete1.executeQuery("select * from utilisateurs where nom='" + nom1 + "' and prenom='" + prenom1 + "'");
            if (lignesRet.next()) {
                if (lignesRet.getInt("idposition") == 3) {
                    JOptionPane.showMessageDialog(rootPane, "L'utilisateur est déjà non-cadre");

                } else {
                    int annee = lignesRet.getInt("annee_entree");
                    int anciennete = 2017 - annee ;
                    int leSalaire = 2500;
                    for (int i = 1; i <= anciennete; i++) {
                        leSalaire = leSalaire + (leSalaire * 3 / 100);
                    }
                    requete2.executeUpdate("update utilisateurs set idposition='3', salaire='"+leSalaire+"' where nom='" + nom1 + "' and prenom='" + prenom1 + "'");
                    JOptionPane.showMessageDialog(rootPane, "L'utilisateur est bien retrograder en non-cadre");

                }
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Classe de connexion mysql non trouvee..." + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "SQL exception ... " + ex.toString());
        }
    }//GEN-LAST:event_jButtonNonCadreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModifPosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifPosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifPosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifPosition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModifPosition dialog = new ModifPosition(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Chercher;
    private javax.swing.JButton jButtonCadre;
    private javax.swing.JButton jButtonDirigeant;
    private javax.swing.JButton jButtonNonCadre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Etat;
    private javax.swing.JTextField jTextField1Identifiant;
    private javax.swing.JTextField jTextField1Nom;
    private javax.swing.JTextField jTextField1Prenom;
    // End of variables declaration//GEN-END:variables
}
