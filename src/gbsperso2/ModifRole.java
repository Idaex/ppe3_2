/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gbsperso2;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Idaex
 */
public class ModifRole extends javax.swing.JDialog {

    private InterfaceGraphique fenetre;

    /**
     * Creates new form ModifRole
     */
    public ModifRole(java.awt.Frame parent, boolean modal) {
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
        jButtonChercher = new javax.swing.JButton();
        jLabel1Etat = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonPromouvoir = new javax.swing.JButton();
        jButtonRetrograder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextField1Nom.setText("Nom");

        jTextField1Prenom.setText("Prenom");
        jTextField1Prenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1PrenomActionPerformed(evt);
            }
        });

        jButtonChercher.setText("Chercher ");
        jButtonChercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChercherActionPerformed(evt);
            }
        });

        jLabel1Etat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1Etat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1Etat.setText("Aucun utilisateur sélectionné");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Chercher l'utilisateur grâce au nom et au prenom ");

        jButtonPromouvoir.setText("Promouvoir en Responsable");
        jButtonPromouvoir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPromouvoirActionPerformed(evt);
            }
        });

        jButtonRetrograder.setText("Retrograder en employé");
        jButtonRetrograder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetrograderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jTextField1Nom, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jTextField1Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButtonChercher, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jButtonPromouvoir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRetrograder)
                .addGap(114, 114, 114))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1Etat, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1Prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonChercher))
                .addGap(39, 39, 39)
                .addComponent(jLabel1Etat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPromouvoir)
                    .addComponent(jButtonRetrograder))
                .addContainerGap(370, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1PrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1PrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1PrenomActionPerformed

    private void jButtonChercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChercherActionPerformed
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

            ResultSet lignesRet = requete.executeQuery("select * from utilisateurs where nom='" + nom1 + "' and prenom='" + prenom1 + "'");

            lignesRet.last();
            //on récupère le numéro de la ligne 
            int nombreLignes = lignesRet.getRow();
            //on replace le curseur avant la première ligne 
            lignesRet.beforeFirst();
            System.out.println("Ce ResultSet contient " + nombreLignes + " lignes.");

            if (nombreLignes == 0) {
                JOptionPane.showMessageDialog(rootPane, "Aucun utilisateur correspondant trouvé");
            } else {
                this.jLabel1Etat.setText("Utilisateur trouvé : " + jTextField1Prenom.getText() + " " + jTextField1Nom.getText());
                jTextField1Nom.setEditable(false);
                jTextField1Prenom.setEditable(false);
                jButtonChercher.setEnabled(false);

            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Classe de connexion mysql non trouvee..." + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "SQL exception ... " + ex.toString());
        }
    }//GEN-LAST:event_jButtonChercherActionPerformed

    private void jButtonPromouvoirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPromouvoirActionPerformed
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
                if (lignesRet.getInt("idrole") == 2) {
                    JOptionPane.showMessageDialog(rootPane, "L'utilisateur est déjà responsable");

                } else {
                    requete2.executeUpdate("update utilisateurs set idrole='2' where nom='" + nom1 + "' and prenom='" + prenom1 + "'");
                    JOptionPane.showMessageDialog(rootPane, "L'utilisateur est bien promu en responsable");
                }
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Classe de connexion mysql non trouvee..." + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "SQL exception ... " + ex.toString());
        }
    }//GEN-LAST:event_jButtonPromouvoirActionPerformed


    private void jButtonRetrograderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetrograderActionPerformed
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
                if (lignesRet.getInt("idrole") == 3) {
                    JOptionPane.showMessageDialog(rootPane, "L'utilisateur est déjà employé");

                } else {
                    requete2.executeUpdate("update utilisateurs set idrole='3' where nom='" + nom1 + "' and prenom='" + prenom1 + "'");
                    JOptionPane.showMessageDialog(rootPane, "L'utilisateur est rétrogradé en employé");
                }
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Classe de connexion mysql non trouvee..." + ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "SQL exception ... " + ex.toString());
        }

    }//GEN-LAST:event_jButtonRetrograderActionPerformed

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
            java.util.logging.Logger.getLogger(ModifRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the di
                JOptionPane.showMessageDialog(rootPane, "Bonjour");
            }alog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModifRole dialog = new ModifRole(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonChercher;
    private javax.swing.JButton jButtonPromouvoir;
    private javax.swing.JButton jButtonRetrograder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Etat;
    private javax.swing.JTextField jTextField1Nom;
    private javax.swing.JTextField jTextField1Prenom;
    // End of variables declaration//GEN-END:variables
}
