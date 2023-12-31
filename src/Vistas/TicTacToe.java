/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author NICOLAS
 */
public class TicTacToe extends javax.swing.JFrame {
    /**
     * Creates new form TicTacToe
     */
    String turno = "X";
    JLabel lblArray[] = new JLabel[9];
    
    //ver quien gano: 
    //horizontal 123 456 789 vertical 147 258 369
    //diagonal 159 753
    /*
        1 2 3
        4 5 6
        7 8 9
    */
    int ganador[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, 
                        {1, 4, 7}, {2, 5, 8}, {3, 6, 9},
                        {1, 5, 9}, {7, 5, 3}};
    
    public TicTacToe() {
        initComponents();
        setTitle("Tic Tac Toe");
        
        lblArray[0] = lbl1;
        lblArray[1] = lbl2;
        lblArray[2] = lbl3;
        lblArray[3] = lbl4;
        lblArray[4] = lbl5;
        lblArray[5] = lbl6;
        lblArray[6] = lbl7;
        lblArray[7] = lbl8;
        lblArray[8] = lbl9;
        
        ganador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTic = new javax.swing.JPanel();
        lbl1 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lblJuega = new javax.swing.JLabel();
        btnJugarDeNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTic.setBackground(new java.awt.Color(0, 0, 0));

        lbl1.setBackground(new java.awt.Color(255, 255, 255));
        lbl1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl1.setForeground(new java.awt.Color(0, 0, 0));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setOpaque(true);
        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl1MousePressed(evt);
            }
        });

        lbl4.setBackground(new java.awt.Color(255, 255, 255));
        lbl4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl4.setForeground(new java.awt.Color(0, 0, 0));
        lbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl4.setOpaque(true);
        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl4MousePressed(evt);
            }
        });

        lbl2.setBackground(new java.awt.Color(255, 255, 255));
        lbl2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl2.setForeground(new java.awt.Color(0, 0, 0));
        lbl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl2.setOpaque(true);
        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl2MousePressed(evt);
            }
        });

        lbl3.setBackground(new java.awt.Color(255, 255, 255));
        lbl3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl3.setForeground(new java.awt.Color(0, 0, 0));
        lbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl3.setOpaque(true);
        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl3MousePressed(evt);
            }
        });

        lbl6.setBackground(new java.awt.Color(255, 255, 255));
        lbl6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl6.setForeground(new java.awt.Color(0, 0, 0));
        lbl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl6.setOpaque(true);
        lbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl6MousePressed(evt);
            }
        });

        lbl5.setBackground(new java.awt.Color(255, 255, 255));
        lbl5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl5.setForeground(new java.awt.Color(0, 0, 0));
        lbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl5.setOpaque(true);
        lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl5MousePressed(evt);
            }
        });

        lbl7.setBackground(new java.awt.Color(255, 255, 255));
        lbl7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl7.setForeground(new java.awt.Color(0, 0, 0));
        lbl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl7.setOpaque(true);
        lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl7MousePressed(evt);
            }
        });

        lbl8.setBackground(new java.awt.Color(255, 255, 255));
        lbl8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl8.setForeground(new java.awt.Color(0, 0, 0));
        lbl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl8.setOpaque(true);
        lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl8MousePressed(evt);
            }
        });

        lbl9.setBackground(new java.awt.Color(255, 255, 255));
        lbl9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl9.setForeground(new java.awt.Color(0, 0, 0));
        lbl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl9.setOpaque(true);
        lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelTicLayout = new javax.swing.GroupLayout(panelTic);
        panelTic.setLayout(panelTicLayout);
        panelTicLayout.setHorizontalGroup(
            panelTicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicLayout.createSequentialGroup()
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelTicLayout.createSequentialGroup()
                .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelTicLayout.createSequentialGroup()
                .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelTicLayout.setVerticalGroup(
            panelTicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTicLayout.createSequentialGroup()
                .addGroup(panelTicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lblJuega.setText("Juega la X");

        btnJugarDeNuevo.setText("Jugar De Nuevo");
        btnJugarDeNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarDeNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblJuega, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnJugarDeNuevo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJuega)
                    .addComponent(btnJugarDeNuevo))
                .addGap(31, 31, 31)
                .addComponent(panelTic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MousePressed
        presionar(1);
    }//GEN-LAST:event_lbl1MousePressed

    private void lbl2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MousePressed
        presionar(2);
    }//GEN-LAST:event_lbl2MousePressed

    private void lbl3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MousePressed
        presionar(3);
    }//GEN-LAST:event_lbl3MousePressed

    private void lbl4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MousePressed
        presionar(4);
    }//GEN-LAST:event_lbl4MousePressed

    private void lbl5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MousePressed
        presionar(5);
    }//GEN-LAST:event_lbl5MousePressed

    private void lbl6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MousePressed
        presionar(6);
    }//GEN-LAST:event_lbl6MousePressed

    private void lbl7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MousePressed
        presionar(7);
    }//GEN-LAST:event_lbl7MousePressed

    private void lbl8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MousePressed
        presionar(8);
    }//GEN-LAST:event_lbl8MousePressed

    private void lbl9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MousePressed
        presionar(9);
    }//GEN-LAST:event_lbl9MousePressed

    private void btnJugarDeNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarDeNuevoActionPerformed
        
        for (int i = 0; i < lblArray.length; i++) {
            lblArray[i].setText("");
            lblArray[i].setBackground(Color.white);
        }
        
        //aveces me pongo tontito
        //dejamos en blnco todo
        /*lbl1.setText("");
        lbl2.setText("");
        lbl3.setText("");
        lbl4.setText("");
        lbl5.setText("");
        lbl6.setText("");
        lbl7.setText("");
        lbl8.setText("");
        lbl9.setText("");
        
        //ahora quitamos el color que queda al ganar
        lbl1.setBackground(Color.white);
        lbl2.setBackground(Color.white);
        lbl3.setBackground(Color.white);
        lbl4.setBackground(Color.white);
        lbl5.setBackground(Color.white);
        lbl6.setBackground(Color.white);
        lbl7.setBackground(Color.white);
        lbl8.setBackground(Color.white);
        lbl9.setBackground(Color.white);
        */
    }//GEN-LAST:event_btnJugarDeNuevoActionPerformed

    //al presionar inserta en el lbl correspondiente una x o O, si corresponde.
    public void presionar (int posicion){
        if (lblArray[posicion-1].getText().equals("")) {
            lblArray[posicion-1].setText(turno);
            cambiarTurnos();
            ganador();
        }
    }
    
    //cambia de turnos, al intercalar entre x y o
    public void cambiarTurnos(){
        if (turno.equals("X")) {
            lblJuega.setText("Juega la O");
            turno = "O";
        } else {
            lblJuega.setText("Juega la X");
            turno = "X";
        }
    }
    
    
    public void ganador(){
        for (int i = 0; i < ganador.length; i++) {
            
            //gano x, horizontal
            if (lblArray[ganador[i][0]-1].getText().equals("X") && 
                    lblArray[ganador[i][1]-1].getText().equals("X") &&
                    lblArray[ganador[i][2]-1].getText().equals("X")) {
                
                
                lblArray[ganador[i][0]-1].setBackground(Color.green);
                lblArray[ganador[i][1]-1].setBackground(Color.green);
                lblArray[ganador[i][2]-1].setBackground(Color.green);
                
                JOptionPane.showMessageDialog(null, "Gano x");
            }
            //gano O, horizontal
            if (lblArray[ganador[i][0]-1].getText().equals("O") && 
                    lblArray[ganador[i][1]-1].getText().equals("O") &&
                    lblArray[ganador[i][2]-1].getText().equals("O")) {
                
                
                lblArray[ganador[i][0]-1].setBackground(Color.green);
                lblArray[ganador[i][1]-1].setBackground(Color.green);
                lblArray[ganador[i][2]-1].setBackground(Color.green);
                
                JOptionPane.showMessageDialog(null, "Gano O");
            }
        }
        
       
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugarDeNuevo;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblJuega;
    private javax.swing.JPanel panelTic;
    // End of variables declaration//GEN-END:variables
}
