/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gbsperso2;

import javax.swing.JOptionPane;

/**
 *
 * @author nc
 */
public class InterfaceGraphique extends javax.swing.JFrame {

    /**
     * attribut qui indique si l'etudiant est connecté ou non
     */
    private boolean connecte;
    public Personne leUtilisateur;

    /**
     * interface graphique
     */
    private Connexion fenConnexion;
    private Deconnexion fenDeconnexion;
    private ModifInfos fenModifInfos;
    private AjoutUtilisateur fenAjoutUtilisateur;

    /**
     * constructeur : Creates new form InterfaceGraphique
     *
     */
    public InterfaceGraphique() {
        initComponents();
        //par defaut, la connexion est inactive
        this.connecte = false;
        //element du menu de deconnexion grisé
        this.majConnexion();
        //centrage
        this.setLocationRelativeTo(null);
        //titre 
        this.setTitle("Gestion des étudiants du bts sio");
        this.jLabelIdentification.setVisible(false);
        this.jDesktopInfos.setVisible(false);
        this.jButtonInfos.setVisible(false);
        this.jMenuActions.setVisible(false);
        jButtonAjoutUtilisateur.setVisible(false);
        jMenuAjoutUtilisateur.setVisible(false);
        jButtonGererLesRoles.setVisible(false);
        jMenuItemGérerLesRoles.setVisible(false);
        jMenuItemGererLesPositions.setVisible(false);
        jButtonGererLesPositions.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        jLabelIdentification = new javax.swing.JLabel();
        jButtonInfos = new javax.swing.JButton();
        jButtonAjoutUtilisateur = new javax.swing.JButton();
        jButtonGererLesRoles = new javax.swing.JButton();
        jButtonGererLesPositions = new javax.swing.JButton();
        jDesktopInfos = new javax.swing.JDesktopPane();
        jButtonRetourAccueil = new javax.swing.JButton();
        jLabelPrenom = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelTelephone = new javax.swing.JLabel();
        jLabelAnneeEntree = new javax.swing.JLabel();
        jLabelIdentif = new javax.swing.JLabel();
        jLabelAdresse = new javax.swing.JLabel();
        jLabelRole = new javax.swing.JLabel();
        jLabelPosition = new javax.swing.JLabel();
        jLabelSalaire = new javax.swing.JLabel();
        jButtonModifInfos = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        nomMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        connexionMenuItem = new javax.swing.JMenuItem();
        deconnexionMenuItem = new javax.swing.JMenuItem();
        SortieMenuItem = new javax.swing.JMenuItem();
        jMenuActions = new javax.swing.JMenu();
        jMenuItemAccueil = new javax.swing.JMenuItem();
        jMenuInfosPerso = new javax.swing.JMenuItem();
        jMenuItemGérerLesRoles = new javax.swing.JMenuItem();
        jMenuItemGererLesPositions = new javax.swing.JMenuItem();
        jMenuAjoutUtilisateur = new javax.swing.JMenuItem();
        aideMenu = new javax.swing.JMenu();
        aproposMenuItem = new javax.swing.JMenuItem();
        nomjMenu = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(240, 240, 240));
        desktopPane.setBorder(new javax.swing.border.MatteBorder(null));

        jLabelIdentification.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelIdentification.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIdentification.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelIdentification.setText("Nom + Position");
        desktopPane.add(jLabelIdentification);
        jLabelIdentification.setBounds(120, 40, 890, 60);

        jButtonInfos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonInfos.setText("Informations personnelles");
        jButtonInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfosActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonInfos);
        jButtonInfos.setBounds(120, 170, 890, 70);

        jButtonAjoutUtilisateur.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAjoutUtilisateur.setText("Ajouter un utilisateur");
        jButtonAjoutUtilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAjoutUtilisateurActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAjoutUtilisateur);
        jButtonAjoutUtilisateur.setBounds(120, 490, 890, 70);

        jButtonGererLesRoles.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonGererLesRoles.setText("Gérer les roles des utilisateurs");
        desktopPane.add(jButtonGererLesRoles);
        jButtonGererLesRoles.setBounds(120, 330, 890, 70);

        jButtonGererLesPositions.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonGererLesPositions.setText("Gérer les positions");
        desktopPane.add(jButtonGererLesPositions);
        jButtonGererLesPositions.setBounds(120, 330, 890, 70);

        jDesktopInfos.setBackground(new java.awt.Color(240, 240, 240));

        jButtonRetourAccueil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonRetourAccueil.setText("Accueil");
        jButtonRetourAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetourAccueilActionPerformed(evt);
            }
        });

        jLabelPrenom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPrenom.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrenom.setText("Prenom");

        jLabelNom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNom.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNom.setText("Nom");

        jLabelEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmail.setText("Email");

        jLabelTelephone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTelephone.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTelephone.setText("Téléphone");

        jLabelAnneeEntree.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAnneeEntree.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAnneeEntree.setText("AnneeEntree");

        jLabelIdentif.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelIdentif.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIdentif.setText("Identifiant");

        jLabelAdresse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAdresse.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdresse.setText("Adresse");

        jLabelRole.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelRole.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRole.setText("Role");

        jLabelPosition.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPosition.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPosition.setText("Position");

        jLabelSalaire.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelSalaire.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalaire.setText("Salaire");

        jButtonModifInfos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonModifInfos.setText("Modifier les informations");
        jButtonModifInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifInfosActionPerformed(evt);
            }
        });

        jDesktopInfos.setLayer(jButtonRetourAccueil, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopInfos.setLayer(jLabelPrenom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopInfos.setLayer(jLabelNom, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopInfos.setLayer(jLabelEmail, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopInfos.setLayer(jLabelTelephone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopInfos.setLayer(jLabelAnneeEntree, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopInfos.setLayer(jLabelIdentif, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopInfos.setLayer(jLabelAdresse, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopInfos.setLayer(jLabelRole, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopInfos.setLayer(jLabelPosition, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopInfos.setLayer(jLabelSalaire, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopInfos.setLayer(jButtonModifInfos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout jDesktopInfosLayout = new org.jdesktop.layout.GroupLayout(jDesktopInfos);
        jDesktopInfos.setLayout(jDesktopInfosLayout);
        jDesktopInfosLayout.setHorizontalGroup(
            jDesktopInfosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopInfosLayout.createSequentialGroup()
                .add(189, 189, 189)
                .add(jDesktopInfosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabelNom, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jDesktopInfosLayout.createSequentialGroup()
                        .add(jLabelPrenom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(jLabelEmail, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabelTelephone, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabelAnneeEntree, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jDesktopInfosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jDesktopInfosLayout.createSequentialGroup()
                        .add(jLabelSalaire, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(293, 293, 293))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jDesktopInfosLayout.createSequentialGroup()
                        .add(jDesktopInfosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabelRole, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabelPosition, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabelIdentif, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(113, 113, 113))
                    .add(jDesktopInfosLayout.createSequentialGroup()
                        .add(jLabelAdresse, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .add(jDesktopInfosLayout.createSequentialGroup()
                .add(jDesktopInfosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jDesktopInfosLayout.createSequentialGroup()
                        .add(310, 310, 310)
                        .add(jButtonRetourAccueil, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jDesktopInfosLayout.createSequentialGroup()
                        .add(305, 305, 305)
                        .add(jButtonModifInfos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 500, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        jDesktopInfosLayout.setVerticalGroup(
            jDesktopInfosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jDesktopInfosLayout.createSequentialGroup()
                .add(32, 32, 32)
                .add(jButtonRetourAccueil, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(96, 96, 96)
                .add(jDesktopInfosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelPrenom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelIdentif, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(45, 45, 45)
                .add(jDesktopInfosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelAdresse, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelNom, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(66, 66, 66)
                .add(jDesktopInfosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelEmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelRole, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(59, 59, 59)
                .add(jDesktopInfosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelTelephone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelPosition, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(54, 54, 54)
                .add(jDesktopInfosLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabelSalaire, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabelAnneeEntree, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 57, Short.MAX_VALUE)
                .add(jButtonModifInfos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(72, 72, 72))
        );

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));

        org.jdesktop.layout.GroupLayout jDesktopPane1Layout = new org.jdesktop.layout.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1150, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 720, Short.MAX_VALUE)
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("Utilisateur");

        connexionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        connexionMenuItem.setMnemonic('o');
        connexionMenuItem.setText("Connexion");
        connexionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connexionMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(connexionMenuItem);

        deconnexionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        deconnexionMenuItem.setMnemonic('s');
        deconnexionMenuItem.setText("Déconnexion");
        deconnexionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconnexionMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(deconnexionMenuItem);

        SortieMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SortieMenuItem.setMnemonic('x');
        SortieMenuItem.setText("Sortie");
        SortieMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortieMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(SortieMenuItem);

        nomMenuBar.add(fileMenu);

        jMenuActions.setText("Actions");

        jMenuItemAccueil.setText("Accueil");
        jMenuItemAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAccueilActionPerformed(evt);
            }
        });
        jMenuActions.add(jMenuItemAccueil);

        jMenuInfosPerso.setText("Infos personnelles");
        jMenuInfosPerso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInfosPersoActionPerformed(evt);
            }
        });
        jMenuActions.add(jMenuInfosPerso);

        jMenuItemGérerLesRoles.setText("Gérer les roles");
        jMenuItemGérerLesRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGérerLesRolesActionPerformed(evt);
            }
        });
        jMenuActions.add(jMenuItemGérerLesRoles);

        jMenuItemGererLesPositions.setText("Gérer les positions");
        jMenuItemGererLesPositions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGererLesPositionsActionPerformed(evt);
            }
        });
        jMenuActions.add(jMenuItemGererLesPositions);

        jMenuAjoutUtilisateur.setText("Ajouter un utilisateur");
        jMenuActions.add(jMenuAjoutUtilisateur);

        nomMenuBar.add(jMenuActions);

        aideMenu.setMnemonic('h');
        aideMenu.setText("Aide");

        aproposMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        aproposMenuItem.setMnemonic('c');
        aproposMenuItem.setText("A propos");
        aideMenu.add(aproposMenuItem);

        nomMenuBar.add(aideMenu);
        nomMenuBar.add(nomjMenu);

        setJMenuBar(nomMenuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(desktopPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1152, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jDesktopInfos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(desktopPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jDesktopInfos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(jDesktopPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SortieMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortieMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SortieMenuItemActionPerformed

    private void connexionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connexionMenuItemActionPerformed
        // TODO add your handling code here:

        /**
         * création de la fenetre de connexion et attachement de cette dernière
         * à l'interface maj de connecte en retour
         */
        this.fenConnexion = new Connexion(this, true);
        this.fenConnexion.setVisible(true);

        //JOptionPane.showMessageDialog(this, "cc");
    }//GEN-LAST:event_connexionMenuItemActionPerformed

    private void deconnexionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconnexionMenuItemActionPerformed
        // TODO add your handling code here:
        fenDeconnexion = new Deconnexion(this, true);
        this.fenDeconnexion.setVisible(true);
    }//GEN-LAST:event_deconnexionMenuItemActionPerformed

    private void jButtonInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfosActionPerformed
        this.desktopPane.setVisible(false);
        this.jDesktopInfos.setVisible(true);
        this.jButtonRetourAccueil.setVisible(true);
        this.jButtonModifInfos.setVisible(true);
    }//GEN-LAST:event_jButtonInfosActionPerformed

    private void jMenuInfosPersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInfosPersoActionPerformed
        jButtonInfos.doClick();
    }//GEN-LAST:event_jMenuInfosPersoActionPerformed

    private void jButtonRetourAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetourAccueilActionPerformed
        this.jButtonInfos.setVisible(false);
        this.desktopPane.setVisible(true);
        this.jButtonInfos.setVisible(true);
        this.jButtonRetourAccueil.setVisible(false);
        this.jButtonModifInfos.setVisible(false);
    }//GEN-LAST:event_jButtonRetourAccueilActionPerformed

    private void jMenuItemAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAccueilActionPerformed
        jButtonRetourAccueil.doClick();
    }//GEN-LAST:event_jMenuItemAccueilActionPerformed

    private void jMenuItemGererLesPositionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGererLesPositionsActionPerformed
        jButtonGererLesPositions.doClick();
    }//GEN-LAST:event_jMenuItemGererLesPositionsActionPerformed

    private void jButtonModifInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifInfosActionPerformed
        this.fenModifInfos = new ModifInfos(this, true, leUtilisateur);
        fenModifInfos.setVisible(true);

    }//GEN-LAST:event_jButtonModifInfosActionPerformed

    private void jButtonAjoutUtilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAjoutUtilisateurActionPerformed
        this.fenAjoutUtilisateur = new AjoutUtilisateur(this, true);
        fenAjoutUtilisateur.setVisible(true);
    }//GEN-LAST:event_jButtonAjoutUtilisateurActionPerformed

    private void jMenuItemGérerLesRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGérerLesRolesActionPerformed
        jButtonGererLesRoles.doClick();
    }//GEN-LAST:event_jMenuItemGérerLesRolesActionPerformed
    public void connecte(Personne lutilisateur) {
        //maj de l'etat de la connexion
        this.connecte = true;
        //ajout du nom dans la fenetre
        this.nomjMenu.setText("Connecté en tant que : " + lutilisateur.getNom());
        this.nomjMenu.setEnabled(false);
        this.fileMenu.setText(lutilisateur.getPosi());
        this.jLabelIdentification.setText("Bienvenue " + lutilisateur.getNom() + " vous êtes connecté en tant que " + lutilisateur.getRoleentr());
        this.jLabelPrenom.setText("Prenom : " + lutilisateur.getPrenom());
        this.jLabelNom.setText("Nom : " + lutilisateur.getNom());
        this.jLabelEmail.setText("Courriel : " + lutilisateur.getCourriel());
        this.jLabelTelephone.setText("Téléphone : 0" + lutilisateur.getTelephone().toString());
        this.jLabelIdentif.setText("Identifiant : " + lutilisateur.getIdentif());
        this.jLabelAnneeEntree.setText("Année d'entrée : " + lutilisateur.getAnneedentree().toString());
        this.jLabelSalaire.setText("Salaire : " + lutilisateur.getSalaire().toString());
        this.jLabelAdresse.setText("Adresse : " + lutilisateur.getAdresse());
        this.jLabelPosition.setText("Position dans l'entreprise : " + lutilisateur.getPosi());
        this.jLabelRole.setText("Role dans l'entreprise : " + lutilisateur.getRoleentr());
        this.jMenuActions.setVisible(true);
        this.jLabelIdentification.setVisible(true);
        this.jButtonInfos.setVisible(true);
        leUtilisateur = lutilisateur;
        if (leUtilisateur.getRoleentr() == "Directeur") {
            jButtonAjoutUtilisateur.setVisible(true);
            jMenuAjoutUtilisateur.setVisible(true);
            jButtonGererLesRoles.setVisible(true);
            jMenuItemGérerLesRoles.setVisible(true);
        }
        if (leUtilisateur.getRoleentr() == "Responsable") {
            jMenuItemGererLesPositions.setVisible(true);
            jButtonGererLesPositions.setVisible(true);
        }
    }

    public void deconnecte() {
        this.connecte = false;
        this.nomjMenu.setText(null);
        this.fileMenu.setText("Utilisateurs");
        this.jLabelIdentification.setVisible(false);
        this.jDesktopInfos.setVisible(false);
        this.jButtonInfos.setVisible(false);
        this.jMenuActions.setVisible(false);
        this.jButtonAjoutUtilisateur.setVisible(false);
        jButtonGererLesRoles.setVisible(false);
        jMenuItemGérerLesRoles.setVisible(false);
        jMenuItemGererLesPositions.setVisible(false);
        jButtonGererLesPositions.setVisible(false);

    }

    public void majConnexion() {
        deconnexionMenuItem.setEnabled(this.connecte);
        connexionMenuItem.setEnabled(!this.connecte);
    }

    public void majModifInfos() {
        this.nomjMenu.setText("Connecté en tant que : " + leUtilisateur.getNom());
        this.nomjMenu.setEnabled(false);
        this.fileMenu.setText(leUtilisateur.getPosi());
        this.jLabelIdentification.setText("Bienvenue " + leUtilisateur.getNom() + " vous êtes connecté en tant que " + leUtilisateur.getRoleentr());
        this.jLabelIdentification.setVisible(true);
        this.jButtonInfos.setVisible(true);
        this.jLabelPrenom.setText("Prenom : " + leUtilisateur.getPrenom());
        this.jLabelNom.setText("Nom : " + leUtilisateur.getNom());
        this.jLabelEmail.setText("Courriel : " + leUtilisateur.getCourriel());
        this.jLabelTelephone.setText("Téléphone : 0" + leUtilisateur.getTelephone().toString());
        this.jLabelIdentif.setText("Identifiant : " + leUtilisateur.getIdentif());
        this.jLabelAnneeEntree.setText("Année d'entrée : " + leUtilisateur.getAnneedentree().toString());
        this.jLabelSalaire.setText("Salaire : " + leUtilisateur.getSalaire().toString());
        this.jLabelAdresse.setText("Adresse : " + leUtilisateur.getAdresse());
        this.jLabelPosition.setText("Position dans l'entreprise : " + leUtilisateur.getPosi());
        this.jLabelRole.setText("Role dans l'entreprise : " + leUtilisateur.getRoleentr());
        this.jMenuActions.setVisible(true);
    }

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
            java.util.logging.Logger.getLogger(InterfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceGraphique().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SortieMenuItem;
    private javax.swing.JMenu aideMenu;
    private javax.swing.JMenuItem aproposMenuItem;
    private javax.swing.JMenuItem connexionMenuItem;
    private javax.swing.JMenuItem deconnexionMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton jButtonAjoutUtilisateur;
    private javax.swing.JButton jButtonGererLesPositions;
    private javax.swing.JButton jButtonGererLesRoles;
    private javax.swing.JButton jButtonInfos;
    private javax.swing.JButton jButtonModifInfos;
    private javax.swing.JButton jButtonRetourAccueil;
    private javax.swing.JDesktopPane jDesktopInfos;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabelAdresse;
    private javax.swing.JLabel jLabelAnneeEntree;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelIdentif;
    private javax.swing.JLabel jLabelIdentification;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPosition;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelRole;
    private javax.swing.JLabel jLabelSalaire;
    private javax.swing.JLabel jLabelTelephone;
    private javax.swing.JMenu jMenuActions;
    private javax.swing.JMenuItem jMenuAjoutUtilisateur;
    private javax.swing.JMenuItem jMenuInfosPerso;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAccueil;
    private javax.swing.JMenuItem jMenuItemGererLesPositions;
    private javax.swing.JMenuItem jMenuItemGérerLesRoles;
    private javax.swing.JMenuBar nomMenuBar;
    private javax.swing.JMenu nomjMenu;
    // End of variables declaration//GEN-END:variables
}
