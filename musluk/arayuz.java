package musluk;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javafx.scene.paint.Stop;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class arayuz extends javax.swing.JFrame {

    public static ArrayList<JButton> butonlar2 = new ArrayList<JButton>();
    public static ArrayList<JButton> butonlar = new ArrayList<JButton>();
    public static ArrayList<dugum> dugumler = new ArrayList<dugum>();
    public static dugum temp = new dugum();
    public static int b;
    public static int sayac = 0;

    public arayuz() {
        this.setLocation(335, 150);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        A = new javax.swing.JButton();
        B = new javax.swing.JButton();
        C = new javax.swing.JButton();
        D = new javax.swing.JButton();
        E = new javax.swing.JButton();
        F = new javax.swing.JButton();
        G = new javax.swing.JButton();
        H = new javax.swing.JButton();
        I = new javax.swing.JButton();
        J = new javax.swing.JButton();
        muslukbaglantilarilabel = new javax.swing.JLabel();
        dinamik = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        G1 = new javax.swing.JButton();
        H1 = new javax.swing.JButton();
        I1 = new javax.swing.JButton();
        J1 = new javax.swing.JButton();
        okdugum = new javax.swing.JButton();
        yazdir = new javax.swing.JButton();
        A1kapasite = new javax.swing.JTextField();
        B1kapasite = new javax.swing.JTextField();
        C1kapasite = new javax.swing.JTextField();
        D1kapasite = new javax.swing.JTextField();
        E1kapasite = new javax.swing.JTextField();
        F1kapasite = new javax.swing.JTextField();
        G1kapasite = new javax.swing.JTextField();
        H1kapasite = new javax.swing.JTextField();
        I1kapasite = new javax.swing.JTextField();
        J1kapasite = new javax.swing.JTextField();
        bitti = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        OK = new javax.swing.JButton();
        musluksayitext = new javax.swing.JTextField();
        musluksayilabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 102));
        setForeground(java.awt.Color.green);

        A.setBackground(new java.awt.Color(255, 153, 204));
        A.setText("A");

        B.setBackground(new java.awt.Color(255, 153, 204));
        B.setText("B");

        C.setBackground(new java.awt.Color(255, 153, 204));
        C.setText("C");

        D.setBackground(new java.awt.Color(255, 153, 204));
        D.setText("D");

        E.setBackground(new java.awt.Color(255, 153, 204));
        E.setText("E");

        F.setBackground(new java.awt.Color(255, 153, 204));
        F.setText("F");

        G.setBackground(new java.awt.Color(255, 153, 204));
        G.setText("G");

        H.setBackground(new java.awt.Color(255, 153, 204));
        H.setText("H");

        I.setBackground(new java.awt.Color(255, 153, 204));
        I.setText("I");

        J.setBackground(new java.awt.Color(255, 153, 204));
        J.setText("J");

        muslukbaglantilarilabel.setText("MUSLUK BAGLANTILARI:");

        dinamik.setBackground(new java.awt.Color(51, 204, 255));
        dinamik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinamikActionPerformed(evt);
            }
        });

        A1.setBackground(new java.awt.Color(204, 204, 0));
        A1.setText("A");

        B1.setBackground(new java.awt.Color(204, 204, 0));
        B1.setText("B");

        C1.setBackground(new java.awt.Color(204, 204, 0));
        C1.setText("C");

        D1.setBackground(new java.awt.Color(204, 204, 0));
        D1.setText("D");

        E1.setBackground(new java.awt.Color(204, 204, 0));
        E1.setText("E");

        F1.setBackground(new java.awt.Color(204, 204, 0));
        F1.setText("F");

        G1.setBackground(new java.awt.Color(204, 204, 0));
        G1.setText("G");
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });

        H1.setBackground(new java.awt.Color(204, 204, 0));
        H1.setText("H");

        I1.setBackground(new java.awt.Color(204, 204, 0));
        I1.setText("I");

        J1.setBackground(new java.awt.Color(204, 204, 0));
        J1.setText("J");

        okdugum.setBackground(new java.awt.Color(51, 255, 0));
        okdugum.setText("OK");
        okdugum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okdugumActionPerformed(evt);
            }
        });

        yazdir.setText("YAZDIR");
        yazdir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yazdirActionPerformed(evt);
            }
        });

        bitti.setBackground(new java.awt.Color(255, 102, 102));
        bitti.setText("BİTTİ");
        bitti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bittiActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        OK.setBackground(new java.awt.Color(51, 255, 0));
        OK.setText("OK");
        OK.setToolTipText("");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        musluksayilabel.setText("MUSLUK SAYISI:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(musluksayilabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(musluksayitext, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OK)
                    .addComponent(musluksayitext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musluksayilabel))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(A)
                                        .addGap(18, 18, 18)
                                        .addComponent(B)
                                        .addGap(18, 18, 18)
                                        .addComponent(C)
                                        .addGap(18, 18, 18)
                                        .addComponent(D)
                                        .addGap(18, 18, 18)
                                        .addComponent(E)
                                        .addGap(18, 18, 18)
                                        .addComponent(F)
                                        .addGap(18, 18, 18)
                                        .addComponent(G)
                                        .addGap(18, 18, 18)
                                        .addComponent(H)
                                        .addGap(18, 18, 18)
                                        .addComponent(I)
                                        .addGap(18, 18, 18)
                                        .addComponent(J))
                                    .addComponent(muslukbaglantilarilabel)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(A1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(A1kapasite))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(B1kapasite))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(C1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(C1kapasite))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(D1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(D1kapasite))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(E1kapasite, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(E1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(F1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(F1kapasite))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(G1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(G1kapasite))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(H1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(H1kapasite))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(I1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(I1kapasite))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(J1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(J1kapasite)))
                                    .addComponent(dinamik, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(289, Short.MAX_VALUE)
                        .addComponent(okdugum)
                        .addGap(162, 162, 162)
                        .addComponent(bitti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yazdir)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(muslukbaglantilarilabel)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A)
                    .addComponent(B)
                    .addComponent(C)
                    .addComponent(D)
                    .addComponent(E)
                    .addComponent(F)
                    .addComponent(G)
                    .addComponent(H)
                    .addComponent(I)
                    .addComponent(J))
                .addGap(18, 18, 18)
                .addComponent(dinamik, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A1)
                    .addComponent(B1)
                    .addComponent(C1)
                    .addComponent(D1)
                    .addComponent(E1)
                    .addComponent(F1)
                    .addComponent(G1)
                    .addComponent(H1)
                    .addComponent(I1)
                    .addComponent(J1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(A1kapasite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B1kapasite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C1kapasite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D1kapasite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(E1kapasite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(F1kapasite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G1kapasite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(H1kapasite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I1kapasite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J1kapasite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yazdir)
                            .addComponent(bitti)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okdugum)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed

        okdugum.setVisible(true);
        String a = musluksayitext.getText();
        b = Integer.parseInt(a);
        dinamik.setVisible(true);
        switch (b) {
            case 2:
                A.setVisible(true);
                B.setVisible(true);

                A1.setVisible(true);
                B1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);
                break;
            case 3:
                A.setVisible(true);
                B.setVisible(true);
                C.setVisible(true);

                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);
                C1kapasite.setVisible(true);

                break;
            case 4:
                A.setVisible(true);
                B.setVisible(true);
                C.setVisible(true);
                D.setVisible(true);

                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);
                C1kapasite.setVisible(true);
                D1kapasite.setVisible(true);

                break;
            case 5:
                A.setVisible(true);
                B.setVisible(true);
                C.setVisible(true);
                D.setVisible(true);
                E.setVisible(true);

                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);
                E1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);
                C1kapasite.setVisible(true);
                D1kapasite.setVisible(true);
                E1kapasite.setVisible(true);

                break;
            case 6:
                A.setVisible(true);
                B.setVisible(true);
                C.setVisible(true);
                D.setVisible(true);
                E.setVisible(true);
                F.setVisible(true);

                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);
                E1.setVisible(true);
                F1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);
                C1kapasite.setVisible(true);
                D1kapasite.setVisible(true);
                E1kapasite.setVisible(true);
                F1kapasite.setVisible(true);

                break;
            case 7:
                A.setVisible(true);
                B.setVisible(true);
                C.setVisible(true);
                D.setVisible(true);
                E.setVisible(true);
                F.setVisible(true);
                G.setVisible(true);

                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);
                E1.setVisible(true);
                F1.setVisible(true);
                G1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);
                C1kapasite.setVisible(true);
                D1kapasite.setVisible(true);
                E1kapasite.setVisible(true);
                F1kapasite.setVisible(true);
                G1kapasite.setVisible(true);

                break;
            case 8:
                A.setVisible(true);
                B.setVisible(true);
                C.setVisible(true);
                D.setVisible(true);
                E.setVisible(true);
                F.setVisible(true);
                G.setVisible(true);
                H.setVisible(true);

                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);
                E1.setVisible(true);
                F1.setVisible(true);
                G1.setVisible(true);
                H1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);
                C1kapasite.setVisible(true);
                D1kapasite.setVisible(true);
                E1kapasite.setVisible(true);
                F1kapasite.setVisible(true);
                G1kapasite.setVisible(true);
                H1kapasite.setVisible(true);

                break;
            case 9:
                A.setVisible(true);
                B.setVisible(true);
                C.setVisible(true);
                D.setVisible(true);
                E.setVisible(true);
                F.setVisible(true);
                G.setVisible(true);
                H.setVisible(true);
                I.setVisible(true);

                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);
                E1.setVisible(true);
                F1.setVisible(true);
                G1.setVisible(true);
                H1.setVisible(true);
                I1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);
                C1kapasite.setVisible(true);
                D1kapasite.setVisible(true);
                E1kapasite.setVisible(true);
                F1kapasite.setVisible(true);
                G1kapasite.setVisible(true);
                H1kapasite.setVisible(true);
                I1kapasite.setVisible(true);

                break;
            case 10:
                A.setVisible(true);
                B.setVisible(true);
                C.setVisible(true);
                D.setVisible(true);
                E.setVisible(true);
                F.setVisible(true);
                G.setVisible(true);
                H.setVisible(true);
                I.setVisible(true);
                J.setVisible(true);

                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);
                E1.setVisible(true);
                F1.setVisible(true);
                G1.setVisible(true);
                H1.setVisible(true);
                I1.setVisible(true);
                J1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);
                C1kapasite.setVisible(true);
                D1kapasite.setVisible(true);
                E1kapasite.setVisible(true);
                F1kapasite.setVisible(true);
                G1kapasite.setVisible(true);
                H1kapasite.setVisible(true);
                I1kapasite.setVisible(true);
                J1kapasite.setVisible(true);

                break;

        }
        for (int i = 0; i < butonlar.size(); i++) {
            System.out.println(butonlar.get(i).getText());
        }

///////////////ANA DUGUMLER&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
        A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                butonlar2.add(A);
                A.setVisible(false);
                A1.setVisible(false);
                A1kapasite.setVisible(false);
                dinamik.setText("A");
                temp.baba = "A";
                sayac++;

            }
        });

        B.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                butonlar2.add(B);
                dinamik.setText("B");
                B.setVisible(false);
                B1.setVisible(false);
                B1kapasite.setVisible(false);
                temp.baba = "B";
                sayac++;

            }
        });

        C.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                butonlar2.add(C);
                dinamik.setText("C");
                C.setVisible(false);
                C1.setVisible(false);
                C1kapasite.setVisible(false);
                temp.baba = "C";
                sayac++;

            }
        });

        D.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                butonlar2.add(D);
                dinamik.setText("D");
                D.setVisible(false);
                D1.setVisible(false);
                D1kapasite.setVisible(false);
                temp.baba = "D";
                sayac++;

            }
        });

        E.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                butonlar2.add(E);
                dinamik.setText("E");
                E1.setVisible(false);
                E.setVisible(false);
                E1kapasite.setVisible(false);
                temp.baba = "E";
                sayac++;

            }
        });

        F.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                butonlar2.add(F);
                dinamik.setText("F");
                F.setVisible(false);
                F1.setVisible(false);
                F1kapasite.setVisible(false);
                temp.baba = "F";
                sayac++;

            }
        });
        G.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                butonlar2.add(G);
                dinamik.setText("G");
                G.setVisible(false);
                G1.setVisible(false);
                G1kapasite.setVisible(false);
                temp.baba = "G";
                sayac++;

            }
        });

        H.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                butonlar2.add(H);
                dinamik.setText("H");
                H.setVisible(false);
                H1.setVisible(false);
                H1kapasite.setVisible(false);
                temp.baba = "H";
                sayac++;

            }
        });

        I.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                butonlar2.add(I);
                dinamik.setText("I");
                I.setVisible(false);
                I1.setVisible(false);
                I1kapasite.setVisible(false);
                temp.baba = "I";
                sayac++;
            }
        });

        J.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                butonlar2.add(J);
                dinamik.setText("J");
                J.setVisible(false);
                J1.setVisible(false);
                J1kapasite.setVisible(false);
                temp.baba = "J";
                sayac++;

            }
        });

        /////////// /////////////ÇOCUK DUGUMLER/////////////////77
        A1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                temp.cocukbuton.add(A);
                temp.kapasite.add(Integer.parseInt(A1kapasite.getText()));
                A1.setVisible(false);
                A1kapasite.setVisible(false);
            }
        });

        B1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                temp.cocukbuton.add(B);
                temp.kapasite.add(Integer.parseInt(B1kapasite.getText()));
                B1.setVisible(false);
                B1kapasite.setVisible(false);
            }
        });

        C1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                temp.cocukbuton.add(C);
                temp.kapasite.add(Integer.parseInt(C1kapasite.getText()));
                C1.setVisible(false);
                C1kapasite.setVisible(false);
            }
        });

        D1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                temp.cocukbuton.add(D);
                temp.kapasite.add(Integer.parseInt(D1kapasite.getText()));
                D1.setVisible(false);
                D1kapasite.setVisible(false);
            }
        });

        E1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                temp.cocukbuton.add(E);
                temp.kapasite.add(Integer.parseInt(E1kapasite.getText()));
                E1.setVisible(false);
                E1kapasite.setVisible(false);
            }
        });

        F1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                temp.cocukbuton.add(F);
                temp.kapasite.add(Integer.parseInt(F1kapasite.getText()));
                F1.setVisible(false);
                F1kapasite.setVisible(false);
            }
        });

        G1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                temp.cocukbuton.add(G);
                temp.kapasite.add(Integer.parseInt(G1kapasite.getText()));
                G1.setVisible(false);
                G1kapasite.setVisible(false);
            }
        });

        H1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                temp.cocukbuton.add(H);
                temp.kapasite.add(Integer.parseInt(H1kapasite.getText()));
                H1.setVisible(false);
                H1kapasite.setVisible(false);
            }
        });

        I1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                temp.cocukbuton.add(I);
                temp.kapasite.add(Integer.parseInt(I1kapasite.getText()));
                I1.setVisible(false);
                I1kapasite.setVisible(false);
            }
        });

        J1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                temp.cocukbuton.add(J);
                temp.kapasite.add(Integer.parseInt(J1kapasite.getText()));
                J1.setVisible(false);
                J1kapasite.setVisible(false);
            }
        });

    }//GEN-LAST:event_OKActionPerformed

    private void dinamikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dinamikActionPerformed

        for (int i = 0; i < butonlar2.size(); i++) {
            System.out.print(" " + butonlar2.get(i).getText());
        }
    }//GEN-LAST:event_dinamikActionPerformed

    private void okdugumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okdugumActionPerformed
        if (sayac == b) {
            bitti.setVisible(true);
        }
        yazdir.setVisible(true);
        dugumler.add(temp);
        temp = new dugum();
        dinamik.setText("");
        A1kapasite.setText("");
        B1kapasite.setText("");
        C1kapasite.setText("");
        D1kapasite.setText("");
        E1kapasite.setText("");
        F1kapasite.setText("");
        G1kapasite.setText("");
        H1kapasite.setText("");
        I1kapasite.setText("");
        J1kapasite.setText("");

        switch (b) {
            case 2:
                A1.setVisible(true);
                B1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);

                break;
            case 3:
                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);
                C1kapasite.setVisible(true);

                break;
            case 4:
                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);
                C1kapasite.setVisible(true);
                D1kapasite.setVisible(true);

                break;
            case 5:
                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);
                E1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);
                C1kapasite.setVisible(true);
                D1kapasite.setVisible(true);
                E1kapasite.setVisible(true);

                break;
            case 6:
                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);
                E1.setVisible(true);
                F1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);
                C1kapasite.setVisible(true);
                D1kapasite.setVisible(true);
                E1kapasite.setVisible(true);
                F1kapasite.setVisible(true);

                break;
            case 7:
                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);
                E1.setVisible(true);
                F1.setVisible(true);
                G1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);
                C1kapasite.setVisible(true);
                D1kapasite.setVisible(true);
                E1kapasite.setVisible(true);
                F1kapasite.setVisible(true);
                G1kapasite.setVisible(true);

                break;
            case 8:
                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);
                E1.setVisible(true);
                F1.setVisible(true);
                G1.setVisible(true);
                H1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);
                C1kapasite.setVisible(true);
                D1kapasite.setVisible(true);
                E1kapasite.setVisible(true);
                F1kapasite.setVisible(true);
                G1kapasite.setVisible(true);
                H1kapasite.setVisible(true);

                break;
            case 9:
                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);
                E1.setVisible(true);
                F1.setVisible(true);
                G1.setVisible(true);
                H1.setVisible(true);
                I1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);
                C1kapasite.setVisible(true);
                D1kapasite.setVisible(true);
                E1kapasite.setVisible(true);
                F1kapasite.setVisible(true);
                G1kapasite.setVisible(true);
                H1kapasite.setVisible(true);
                I1kapasite.setVisible(true);

                break;
            case 10:
                A1.setVisible(true);
                B1.setVisible(true);
                C1.setVisible(true);
                D1.setVisible(true);
                E1.setVisible(true);
                F1.setVisible(true);
                G1.setVisible(true);
                H1.setVisible(true);
                I1.setVisible(true);
                J1.setVisible(true);

                A1kapasite.setVisible(true);
                B1kapasite.setVisible(true);
                C1kapasite.setVisible(true);
                D1kapasite.setVisible(true);
                E1kapasite.setVisible(true);
                F1kapasite.setVisible(true);
                G1kapasite.setVisible(true);
                H1kapasite.setVisible(true);
                I1kapasite.setVisible(true);
                J1kapasite.setVisible(true);
                break;

        }

    }//GEN-LAST:event_okdugumActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G1ActionPerformed

    private void yazdirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yazdirActionPerformed

        for (int i = 0; i < dugumler.size(); i++) {
            System.out.println("BABACIM: " + dugumler.get(i).baba);
            System.out.println("ÇOCUKLAR: ");
            for (int j = 0; j < dugumler.get(i).cocukbuton.size(); j++) {
                System.out.println(dugumler.get(i).cocukbuton.get(j).getText() + " Kapasite: " + dugumler.get(i).kapasite.get(j));
                System.out.println("");

            }

        }
    }//GEN-LAST:event_yazdirActionPerformed

    private void bittiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bittiActionPerformed
        new grafik().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bittiActionPerformed

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
            java.util.logging.Logger.getLogger(arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(arayuz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new arayuz().setVisible(true);
                dinamik.setVisible(false);
                yazdir.setVisible(false);
                A.setVisible(false);
                B.setVisible(false);
                C.setVisible(false);
                D.setVisible(false);
                E.setVisible(false);
                F.setVisible(false);
                G.setVisible(false);
                H.setVisible(false);
                I.setVisible(false);
                J.setVisible(false);
                A1.setVisible(false);
                B1.setVisible(false);
                C1.setVisible(false);
                D1.setVisible(false);
                E1.setVisible(false);
                F1.setVisible(false);
                G1.setVisible(false);
                H1.setVisible(false);
                I1.setVisible(false);
                J1.setVisible(false);
                A1kapasite.setVisible(false);
                B1kapasite.setVisible(false);
                C1kapasite.setVisible(false);
                D1kapasite.setVisible(false);
                E1kapasite.setVisible(false);
                F1kapasite.setVisible(false);
                G1kapasite.setVisible(false);
                H1kapasite.setVisible(false);
                I1kapasite.setVisible(false);
                J1kapasite.setVisible(false);

                okdugum.setVisible(false);
                bitti.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton A;
    public static javax.swing.JButton A1;
    public static javax.swing.JTextField A1kapasite;
    public static javax.swing.JButton B;
    public static javax.swing.JButton B1;
    public static javax.swing.JTextField B1kapasite;
    public static javax.swing.JButton C;
    public static javax.swing.JButton C1;
    public static javax.swing.JTextField C1kapasite;
    public static javax.swing.JButton D;
    public static javax.swing.JButton D1;
    public static javax.swing.JTextField D1kapasite;
    public static javax.swing.JButton E;
    public static javax.swing.JButton E1;
    public static javax.swing.JTextField E1kapasite;
    public static javax.swing.JButton F;
    public static javax.swing.JButton F1;
    public static javax.swing.JTextField F1kapasite;
    public static javax.swing.JButton G;
    public static javax.swing.JButton G1;
    public static javax.swing.JTextField G1kapasite;
    public static javax.swing.JButton H;
    public static javax.swing.JButton H1;
    public static javax.swing.JTextField H1kapasite;
    public static javax.swing.JButton I;
    public static javax.swing.JButton I1;
    public static javax.swing.JTextField I1kapasite;
    public static javax.swing.JButton J;
    public static javax.swing.JButton J1;
    public static javax.swing.JTextField J1kapasite;
    private javax.swing.JButton OK;
    public static javax.swing.JButton bitti;
    public static javax.swing.JButton dinamik;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel muslukbaglantilarilabel;
    private javax.swing.JLabel musluksayilabel;
    public static javax.swing.JTextField musluksayitext;
    public static javax.swing.JButton okdugum;
    public static javax.swing.JButton yazdir;
    // End of variables declaration//GEN-END:variables
}
