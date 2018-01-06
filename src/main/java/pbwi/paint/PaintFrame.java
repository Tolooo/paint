/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbwi.paint;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

/**
 *
 * @author Kamil
 */
public class PaintFrame extends javax.swing.JFrame{
    private JButton Rectangle, Ellipse, Polygon, Line;
    private int x,y;
    public PaintFrame() {
        initComponents();
        //paintPanel = PaintPanel.getInstance();
        paintPanel.setBackground(new java.awt.Color(90,90,90));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paintPanel = new pbwi.paint.PaintPanel();
        RectangleButton = new javax.swing.JButton();
        EllipseButton = new javax.swing.JButton();
        LineButton = new javax.swing.JButton();
        PolygonButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout paintPanelLayout = new javax.swing.GroupLayout(paintPanel);
        paintPanel.setLayout(paintPanelLayout);
        paintPanelLayout.setHorizontalGroup(
            paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );
        paintPanelLayout.setVerticalGroup(
            paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );

        RectangleButton.setText("Kwadrat");
        RectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectangleButtonActionPerformed(evt);
            }
        });

        EllipseButton.setText("Elipsa");
        EllipseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EllipseButtonActionPerformed(evt);
            }
        });

        LineButton.setText("Linia");
        LineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineButtonActionPerformed(evt);
            }
        });

        PolygonButton.setText("Wielokąt");
        PolygonButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PolygonButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(paintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RectangleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EllipseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LineButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PolygonButton)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RectangleButton)
                    .addComponent(EllipseButton)
                    .addComponent(LineButton)
                    .addComponent(PolygonButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EllipseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EllipseButtonActionPerformed
        paintPanel.setShapeClass(Ellipse.class);
    }//GEN-LAST:event_EllipseButtonActionPerformed

    private void RectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectangleButtonActionPerformed
        paintPanel.setShapeClass(Rectangle.class);
    }//GEN-LAST:event_RectangleButtonActionPerformed

    private void LineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineButtonActionPerformed
        paintPanel.setShapeClass(Line.class);
    }//GEN-LAST:event_LineButtonActionPerformed

    private void PolygonButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PolygonButtonActionPerformed
        paintPanel.setShapeClass(Polygon.class);
    }//GEN-LAST:event_PolygonButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        PaintFrame paintFrame = new PaintFrame();
        
        
                
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 paintFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EllipseButton;
    private javax.swing.JButton LineButton;
    private javax.swing.JButton PolygonButton;
    private javax.swing.JButton RectangleButton;
    private pbwi.paint.PaintPanel paintPanel;
    // End of variables declaration//GEN-END:variables

}
