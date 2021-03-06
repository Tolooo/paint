/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbwi.paint;

import java.awt.BorderLayout;
import java.awt.Color;
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
public class PaintFrame extends javax.swing.JFrame {

    private JButton Rectangle, Ellipse, Polygon, Line;
    private int x, y;

    public PaintFrame() {
        initComponents();

        //paintPanel = PaintPanel.getInstance();
        // paintPanel.setBackground(new java.awt.Color(255,255,255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paintPanel = pbwi.paint.PaintPanel.getInstance();
        RectangleButton = new javax.swing.JButton();
        EllipseButton = new javax.swing.JButton();
        LineButton = new javax.swing.JButton();
        PolygonButton = new javax.swing.JButton();
        UndoButton = new javax.swing.JButton();
        RedoButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        xScaleInput = new javax.swing.JTextField();
        yScaleInput = new javax.swing.JTextField();
        ScaleButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        xMoveInput = new javax.swing.JTextField();
        yMoveInput = new javax.swing.JTextField();
        MoveButton = new javax.swing.JButton();
        StrokeLineComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        RedButton = new javax.swing.JButton();
        BlueButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout paintPanelLayout = new javax.swing.GroupLayout(paintPanel);
        paintPanel.setLayout(paintPanelLayout);
        paintPanelLayout.setHorizontalGroup(
                paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        paintPanelLayout.setVerticalGroup(
                paintPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 402, Short.MAX_VALUE)
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

        UndoButton.setText("Undo");
        UndoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoButtonActionPerformed(evt);
            }
        });

        RedoButton.setText("Redo");
        RedoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedoButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Scale");

        xScaleInput.setText("1.5555");
        xScaleInput.setToolTipText("xScale");

        yScaleInput.setText("1.5555");
        yScaleInput.setToolTipText("yScale");

        ScaleButton.setText("Scale");
        ScaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScaleButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Move");

        xMoveInput.setText("1.5555");
        xMoveInput.setToolTipText("xMove");

        yMoveInput.setText("1.5555");
        yMoveInput.setToolTipText("yMove");

        MoveButton.setText("Move");
        MoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveButtonActionPerformed(evt);
            }
        });

        StrokeLineComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.0", "4.0", "8.0", "16.0" }));
        StrokeLineComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StrokeLineComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("px");

        RedButton.setText("Red");
        RedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedButtonActionPerformed(evt);
            }
        });

        BlueButton.setText("Blue");
        BlueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(RectangleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(PolygonButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EllipseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ScaleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(MoveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(xScaleInput)
                                                                        .addComponent(yScaleInput)
                                                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(xMoveInput)
                                                                .addComponent(yMoveInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(UndoButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(RedoButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(StrokeLineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(RedButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BlueButton)
                                                .addGap(0, 101, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(paintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(UndoButton)
                                        .addComponent(RedoButton)
                                        .addComponent(StrokeLineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(RedButton)
                                        .addComponent(BlueButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(paintPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(RectangleButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(EllipseButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(LineButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(PolygonButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(xScaleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(yScaleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ScaleButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(xMoveInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(yMoveInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(MoveButton)
                                                .addGap(0, 0, Short.MAX_VALUE)))
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

    private void UndoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoButtonActionPerformed
        paintPanel.undo();
    }//GEN-LAST:event_UndoButtonActionPerformed

    private void RedoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedoButtonActionPerformed
        paintPanel.redo();
    }//GEN-LAST:event_RedoButtonActionPerformed

    private void ScaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScaleButtonActionPerformed

        paintPanel.visitLast(new ScaleVisitor(Double.parseDouble(xScaleInput.getText()), Double.parseDouble(yScaleInput.getText())));
        paintPanel.repaint();
    }//GEN-LAST:event_ScaleButtonActionPerformed

    private void MoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveButtonActionPerformed
        paintPanel.visitLast(new MoveVisitor(Double.parseDouble(xMoveInput.getText()), Double.parseDouble(yMoveInput.getText())));
        paintPanel.repaint();
    }//GEN-LAST:event_MoveButtonActionPerformed

    private void StrokeLineComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StrokeLineComboBoxActionPerformed
        paintPanel.setStroke(Float.parseFloat((String) StrokeLineComboBox.getSelectedItem().toString()));
    }//GEN-LAST:event_StrokeLineComboBoxActionPerformed

    private void RedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedButtonActionPerformed
        paintPanel.setColor(Color.RED);
    }//GEN-LAST:event_RedButtonActionPerformed

    private void BlueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlueButtonActionPerformed
        paintPanel.setColor(Color.BLUE);
    }//GEN-LAST:event_BlueButtonActionPerformed

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
    private javax.swing.JButton BlueButton;
    private javax.swing.JButton EllipseButton;
    private javax.swing.JButton LineButton;
    private javax.swing.JButton MoveButton;
    private javax.swing.JButton PolygonButton;
    private javax.swing.JButton RectangleButton;
    private javax.swing.JButton RedButton;
    private javax.swing.JButton RedoButton;
    private javax.swing.JButton ScaleButton;
    private javax.swing.JComboBox<String> StrokeLineComboBox;
    private javax.swing.JButton UndoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private pbwi.paint.PaintPanel paintPanel;
    private javax.swing.JTextField xMoveInput;
    private javax.swing.JTextField xScaleInput;
    private javax.swing.JTextField yMoveInput;
    private javax.swing.JTextField yScaleInput;
    // End of variables declaration//GEN-END:variables

}