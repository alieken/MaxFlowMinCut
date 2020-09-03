/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musluk;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author TOSHIBA
 */
public class grafik extends javax.swing.JFrame {

    int width;
    int height;

    ArrayList<Node> nodes;
    ArrayList<edge> edges;
    public static int graph2[][] = new int[10][10];
    public static int aynagraph2[][] = new int[10][10];
    public static int toplamgraph2[][] = new int[50][3];
    public static int pathlarkopya[][] = new int[50][3];
    public static int maxfloww = 0;

    public grafik() {
//Constructor

        this.setLocation(325, 0);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nodes = new ArrayList<Node>();
        edges = new ArrayList<edge>();
        width = 30;
        height = 30;

        this.setSize(700, 700);
        this.setVisible(true);
        arayuz.dugumler.size();
        switch (arayuz.dugumler.size()) {
            case 2:
                this.addNode("a", 100, 350);
                this.addNode("b", 300, 100);
                break;

            case 3:

                this.addNode("a", 100, 350);
                this.addNode("b", 300, 100);
                this.addNode("c", 600, 400);
                break;

            case 4:
                this.addNode("a", 100, 350);
                this.addNode("b", 300, 100);
                this.addNode("c", 600, 400);
                this.addNode("d", 400, 600);

                break;

            case 5:
                this.addNode("a", 100, 350);
                this.addNode("b", 300, 100);
                this.addNode("c", 600, 400);
                this.addNode("d", 400, 600);
                this.addNode("e", 175, 175);

                break;
            case 6:
                this.addNode("a", 100, 350);
                this.addNode("b", 300, 100);
                this.addNode("c", 600, 400);
                this.addNode("d", 400, 600);
                this.addNode("e", 175, 175);
                this.addNode("f", 525, 175);

                break;
            case 7:
                this.addNode("a", 100, 350);
                this.addNode("b", 300, 100);
                this.addNode("c", 600, 400);
                this.addNode("d", 400, 600);
                this.addNode("e", 175, 175);
                this.addNode("f", 525, 175);
                this.addNode("g", 525, 525);

                break;
            case 8:
                this.addNode("a", 100, 350);
                this.addNode("b", 300, 100);
                this.addNode("c", 600, 400);
                this.addNode("d", 400, 600);
                this.addNode("e", 175, 175);
                this.addNode("f", 525, 175);
                this.addNode("g", 525, 525);
                this.addNode("h", 175, 525);

                break;
            case 9:
                this.addNode("a", 100, 350);
                this.addNode("b", 300, 100);
                this.addNode("c", 600, 400);
                this.addNode("d", 400, 600);
                this.addNode("e", 175, 175);
                this.addNode("f", 525, 175);
                this.addNode("g", 525, 525);
                this.addNode("h", 175, 525);
                this.addNode("ı", 300, 600);

                break;
            case 10:
                this.addNode("a", 100, 350);
                this.addNode("b", 300, 100);
                this.addNode("c", 600, 400);
                this.addNode("d", 400, 600);
                this.addNode("e", 175, 175);
                this.addNode("f", 525, 175);
                this.addNode("g", 525, 525);
                this.addNode("h", 175, 525);
                this.addNode("ı", 300, 600);
                this.addNode("j", 400, 100);

                break;

        }
        /*  for (int i = 0; i <arayuz.dugumler.size(); i++) {
            System.out.println(i+"  "+arayuz.dugumler.get(i).baba);
            
        }
        for (int i = 0; i < nodes.size(); i++) {
            System.out.println("nodes "+i+nodes.get(i).name);
            
        }*/

        int graph[][] = new int[nodes.size()][nodes.size()];

        for (int i = 0; i < nodes.size(); i++) {
            for (int j = 0; j < nodes.size(); j++) {
                graph[i][j] = 0;
            }

        }

        for (int i = 0; i < 50; i++) {

            for (int j = 0; j < 3; j++) {
                toplamgraph2[i][j] = 0;
            }
        }

        int buldum = 0;
        int baba = 0;
        boolean bababulundu = false;
        boolean cocukbulundu = false;
        //////////////////////////ADDEDGE////////////////////////////////////
        for (int i = 0; i < arayuz.dugumler.size(); i++) {
            bababulundu = false;

            for (int j = 0; j < arayuz.dugumler.get(i).cocukbuton.size(); j++) {
                cocukbulundu = false;
                for (int k = 0; k < nodes.size(); k++) {

                    //   System.out.println("+++++"+ arayuz.dugumler.get(i).baba+"nde"+nodes.get(k).name);
                    if (arayuz.dugumler.get(i).baba.equalsIgnoreCase(nodes.get(k).name)) {
                        baba = k;
                        bababulundu = true;
                    }

                    if (arayuz.dugumler.get(i).cocukbuton.get(j).getText().equalsIgnoreCase(nodes.get(k).name)) {
                        buldum = k;
                        cocukbulundu = true;

                    }
                    if (bababulundu == true && cocukbulundu == true) {
                        this.addEdge(baba, buldum);
                        graph[baba][buldum] = arayuz.dugumler.get(i).kapasite.get(j);
                        break;
                    }

                }

            }

        }
        System.out.println("GRAPHIMIZ");
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                System.out.print(" " + graph[i][j]);

            }
            System.out.println("");
        }
        maxflow m = new maxflow();
        maxflow.V = nodes.size();
        maxfloww = m.fordFulkerson(graph, 0, (nodes.size() - 1));
        System.out.println("MAXFLOW:  "
                + maxfloww);

        mincut.minCut(graph, 0, (nodes.size() - 1));

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph.length; j++) {
                graph2[i][j] = graph[i][j];
            }
        }

        /*  for (int i = 0; i < maxflow.pathlarsayac; i++) {
          System.out.println(""); 
          System.out.print("u: "+maxflow.pathlar[i][0]); System.out.print(" v: "+maxflow.pathlar[i][1]); System.out.print(" pathflow: "+maxflow.pathlar[i][2]);
            
      }*/
    }

    class Node {

        int x, y;
        String name;

        public Node(String myName, int myX, int myY) {
            x = myX;
            y = myY;
            name = myName;
        }
    }

    class edge {

        int i, j;

        public edge(int ii, int jj) {
            i = ii;
            j = jj;
        }
    }

    public void addNode(String name, int x, int y) {
        nodes.add(new Node(name, x, y));
        this.repaint();
    }

    public void addEdge(int i, int j) {
        edges.add(new edge(i, j));
        this.repaint();
    }

    public void renkatama() {

    }

    public void paint(Graphics g) { // draw the nodes and edges
        FontMetrics f = g.getFontMetrics();
        int nodeHeight = Math.max(height, f.getHeight());
        Graphics2D g2 = (Graphics2D) g;
        Random rand = new Random();

        for (edge e : edges) {
            float a12 = rand.nextFloat();
            float a13 = rand.nextFloat();
            float a14 = rand.nextFloat();
            Color randomColor = new Color(a12, a13, a14);

            /* g.drawLine(nodes.get(e.i).x, nodes.get(e.i).y,
		     nodes.get(e.j).x, nodes.get(e.j).y);*/
            g2.setStroke(new BasicStroke(4));
            if (nodes.get(e.i).name.equalsIgnoreCase("a")) {
                g.setColor(Color.BLUE);
            } else if (nodes.get(e.i).name.equalsIgnoreCase("b")) {
                g.setColor(Color.BLACK);
            } else if (nodes.get(e.i).name.equalsIgnoreCase("c")) {
                g.setColor(Color.CYAN);
            } else if (nodes.get(e.i).name.equalsIgnoreCase("d")) {
                randomColor = new Color(0, 139, 0);
                g.setColor(randomColor);
            } else if (nodes.get(e.i).name.equalsIgnoreCase("e")) {
                randomColor = new Color(173, 255, 47);
                g.setColor(randomColor);
            } else if (nodes.get(e.i).name.equalsIgnoreCase("f")) {
                g.setColor(Color.MAGENTA);
            } else if (nodes.get(e.i).name.equalsIgnoreCase("g")) {
                g.setColor(Color.ORANGE);
            } else if (nodes.get(e.i).name.equalsIgnoreCase("h")) {
                g.setColor(Color.RED);
            } else if (nodes.get(e.i).name.equalsIgnoreCase("ı")) {
                randomColor = new Color(255, 182, 193);
                g.setColor(randomColor);
            } else if (nodes.get(e.i).name.equalsIgnoreCase("j")) {

                randomColor = new Color(130, 130, 130);
                g.setColor(randomColor);
            }
            g2.draw(new Line2D.Double(nodes.get(e.i).x, nodes.get(e.i).y, nodes.get(e.j).x, nodes.get(e.j).y));
        }
        int sayac = 0;
        for (Node n : nodes) {
            int nodeWidth = Math.max(width, f.stringWidth(n.name) + width / 2);
            float a12 = rand.nextFloat();
            float a13 = rand.nextFloat();
            float a14 = rand.nextFloat();
            Color randomColor = new Color(a12, a13, a14);

            if (nodes.get(sayac).name.equalsIgnoreCase("a")) {
                g.setColor(Color.BLUE);
            } else if (nodes.get(sayac).name.equalsIgnoreCase("b")) {
                g.setColor(Color.BLACK);
            } else if (nodes.get(sayac).name.equalsIgnoreCase("c")) {
                g.setColor(Color.CYAN);
            } else if (nodes.get(sayac).name.equalsIgnoreCase("d")) {
                randomColor = new Color(0, 139, 0);
                g.setColor(randomColor);
            } else if (nodes.get(sayac).name.equalsIgnoreCase("e")) {
                randomColor = new Color(173, 255, 47);
                g.setColor(randomColor);
            } else if (nodes.get(sayac).name.equalsIgnoreCase("f")) {
                g.setColor(Color.MAGENTA);
            } else if (nodes.get(sayac).name.equalsIgnoreCase("g")) {
                g.setColor(Color.ORANGE);
            } else if (nodes.get(sayac).name.equalsIgnoreCase("h")) {
                g.setColor(Color.RED);
            } else if (nodes.get(sayac).name.equalsIgnoreCase("ı")) {
                randomColor = new Color(255, 182, 193);
                g.setColor(randomColor);
            } else if (nodes.get(sayac).name.equalsIgnoreCase("j")) {

                randomColor = new Color(130, 130, 130);
                g.setColor(randomColor);
            }

            g.fillOval(n.x - nodeWidth / 2, n.y - nodeHeight / 2,
                    nodeWidth, nodeHeight);

            g.setColor(Color.black);

            g.drawOval(n.x - nodeWidth / 2, n.y - nodeHeight / 2,
                    nodeWidth, nodeHeight);
            if (nodes.get(sayac).name.equalsIgnoreCase("b")) {
                g.setColor(Color.white);
            }
            g.drawString(n.name, n.x - f.stringWidth(n.name) / 2,
                    n.y + f.getHeight() / 2);
            g.setColor(Color.black);

            sayac++;
        }
        for (int i = 0; i < maxflow.pathlar.length; i++) {
            pathlarkopya[i][0] = maxflow.pathlar[i][0];
            pathlarkopya[i][1] = maxflow.pathlar[i][1];
            pathlarkopya[i][2] = maxflow.pathlar[i][2];

        }

        /*   for (int i = 0; i < pathlarkopya.length; i++) {
            for (int j = i; j < pathlarkopya.length; j++) {
                if (maxflow.pathlar[i][0] == pathlarkopya[j][0] && maxflow.pathlar[i][1] == pathlarkopya[j][1]) {
                    toplamgraph2[i][0] = maxflow.pathlar[i][0];
                    toplamgraph2[i][1] = maxflow.pathlar[i][1];
                    toplamgraph2[i][2] += maxflow.pathlar[i][2];
                    toplamgraph2[i][2] += pathlarkopya[j][2];

                }
            }
        }*/
        for (int i = 0; i < pathlarkopya.length; i++) {
            boolean kontrol = false;
            for (int j = 0; j < edges.size(); j++) {
                if (i == 0 && j == 0) {
                    toplamgraph2[0][0] = pathlarkopya[0][0];
                    toplamgraph2[0][1] = pathlarkopya[0][1];
                    toplamgraph2[0][2] = pathlarkopya[0][2];
                    kontrol = true;
                    break;
                } else {
                    if (pathlarkopya[i][0] == toplamgraph2[j][0] && pathlarkopya[i][1] == toplamgraph2[j][1]) {
                        toplamgraph2[j][2] += pathlarkopya[i][2];
                        kontrol = true;
                    }

                }
            }
            if (kontrol == false) {
                for (int j = 0; j < toplamgraph2.length; j++) {
                    if (toplamgraph2[j][0] == 0 && toplamgraph2[j][1] == 0 && toplamgraph2[j][2] == 0) {
                        toplamgraph2[j][0] = pathlarkopya[i][0];
                        toplamgraph2[j][1] = pathlarkopya[i][1];
                        toplamgraph2[j][2] = pathlarkopya[i][2];
                        break;
                    }

                }
            }

        }

        for (int i = 0; i < toplamgraph2.length; i++) {
            if (toplamgraph2[i][0] == 0 && toplamgraph2[i][1] == 0 && toplamgraph2[i][2] == 0) {
                break;
            }
            System.out.println("");
            System.out.print("TOPLAMLAR ");
            System.out.print(toplamgraph2[i][0] + " ");
            System.out.print(toplamgraph2[i][1] + " ");
            System.out.print(toplamgraph2[i][2]);

        }

        /*   for (int i = 0; i < graph2.length; i++) {
            for (int j = 0; j < graph2.length; j++) {
                aynagraph2[i][j]=graph2[i][j];
  
            }
        }*/
        for (int i = 0; i < aynagraph2.length; i++) {
            for (int j = 0; j < aynagraph2.length; j++) {
                aynagraph2[i][j] = 0;

            }

        }

        for (int i = 0; i < toplamgraph2.length; i++) {
            for (int j = 0; j < 3; j++) {
                int ba = toplamgraph2[i][0];
                int ab = toplamgraph2[i][1];
                aynagraph2[ba][ab] = toplamgraph2[i][2];

            }

        }

        for (int i = 0; i < nodes.size(); i++) {
            float a12 = rand.nextFloat();
            float a13 = rand.nextFloat();
            float a14 = rand.nextFloat();
            Color randomColor = new Color(a12, a13, a14);

            if (nodes.get(i).name.equalsIgnoreCase("a")) {
                g.setColor(Color.BLUE);
            } else if (nodes.get(i).name.equalsIgnoreCase("b")) {
                g.setColor(Color.BLACK);
            } else if (nodes.get(i).name.equalsIgnoreCase("c")) {
                g.setColor(Color.CYAN);
            } else if (nodes.get(i).name.equalsIgnoreCase("d")) {
                randomColor = new Color(0, 139, 0);
                g.setColor(randomColor);
            } else if (nodes.get(i).name.equalsIgnoreCase("e")) {
                randomColor = new Color(173, 255, 47);
                g.setColor(randomColor);
            } else if (nodes.get(i).name.equalsIgnoreCase("f")) {
                g.setColor(Color.MAGENTA);
            } else if (nodes.get(i).name.equalsIgnoreCase("g")) {
                g.setColor(Color.ORANGE);
            } else if (nodes.get(i).name.equalsIgnoreCase("h")) {
                g.setColor(Color.RED);
            } else if (nodes.get(i).name.equalsIgnoreCase("ı")) {
                randomColor = new Color(255, 182, 193);
                g.setColor(randomColor);
            } else if (nodes.get(i).name.equalsIgnoreCase("j")) {

                randomColor = new Color(130, 130, 130);
                g.setColor(randomColor);
            }

            for (int j = 0; j < nodes.size(); j++) {
                if (graph2[i][j] != 0) {
                    g2.drawString(String.valueOf(aynagraph2[i][j] + "/" + graph2[i][j]), (nodes.get(i).x + nodes.get(j).x) / 2 + 20, (nodes.get(i).y + nodes.get(j).y) / 2 + 20);
                }
            }
        }
        g.setColor(Color.red);
        g2.drawString(String.valueOf("MAX FLOW: "
                + maxfloww), 30, 50);
        int kordinatsayac = 0;
        g2.drawString("MİNCUT", 630, 50);
        for (int j = 0; j < mincut.iler.size(); j++) {
            g2.drawString(String.valueOf(mincut.iler.get(j) + " - " + mincut.jler.get(j)), 650, 65 + kordinatsayac);
            kordinatsayac += 15;

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(grafik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grafik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grafik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grafik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new grafik().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
