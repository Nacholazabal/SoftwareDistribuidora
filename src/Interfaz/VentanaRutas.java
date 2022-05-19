
package Interfaz;
import Dominio.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
/**
 *
 * @author nacho
 */
public class VentanaRutas extends javax.swing.JFrame implements Observer {

    private SistemaBeta sistema;
    public VentanaRutas(SistemaBeta unSistema) {
        initComponents();
        this.sistema= unSistema;
        lstRutas.setListData(this.sistema.getListaRutas().toArray());
        sistema.addObserver(this);
        this.setTitle("Registro Rutas");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        calletxt = new javax.swing.JTextField();
        xftxt = new javax.swing.JTextField();
        yftxt = new javax.swing.JTextField();
        yitxt = new javax.swing.JTextField();
        xitxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRutas = new javax.swing.JList();
        Agregarbtn = new javax.swing.JButton();
        Eliminarbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Rutas");
        jLabel1.setToolTipText("");

        calletxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calletxtActionPerformed(evt);
            }
        });

        xftxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xftxtActionPerformed(evt);
            }
        });

        yftxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yftxtActionPerformed(evt);
            }
        });

        yitxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yitxtActionPerformed(evt);
            }
        });

        xitxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xitxtActionPerformed(evt);
            }
        });

        jLabel2.setText("Xi");

        jLabel3.setText("Xf");

        jLabel4.setText("Yi");

        jLabel5.setText("Yf");

        jLabel6.setText("Calle:");

        jScrollPane1.setViewportView(lstRutas);

        Agregarbtn.setText("Agregar");
        Agregarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarbtnActionPerformed(evt);
            }
        });

        Eliminarbtn.setText("Eliminar");
        Eliminarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarbtnActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Agregarbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Eliminarbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(calletxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(xftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(xitxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yitxt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jButton1)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xitxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yitxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(xftxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(yftxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(Agregarbtn)
                        .addComponent(Eliminarbtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calletxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calletxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calletxtActionPerformed

    private void xitxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xitxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xitxtActionPerformed

    private void xftxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xftxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xftxtActionPerformed

    private void yitxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yitxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yitxtActionPerformed

    private void yftxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yftxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yftxtActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void AgregarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarbtnActionPerformed
        String calle= calletxt.getText();
        String xi= xitxt.getText();
        String xf= xftxt.getText();
        String yi= yitxt.getText();
        String yf= yftxt.getText();
        double xid = Double.parseDouble(xi);
        double xfd = Double.parseDouble(xf);
        double yid = Double.parseDouble(yi);
        double yfd = Double.parseDouble(yf);
        Rutas nR = new Rutas (calle, xid,xfd,yid,yfd);
        this.sistema.agregarRutas(nR);
        String alt=new String("Ruta agregada");
        JOptionPane.showMessageDialog(this, alt);
        actualizarVentana();
        this.sistema.actualizar();
    }//GEN-LAST:event_AgregarbtnActionPerformed

    private void EliminarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarbtnActionPerformed
        if (this.lstRutas.getSelectedValue() != null) {
            String ruta = this.lstRutas.getSelectedValue().toString();
            sistema.eliminarRuta(ruta);
            this.sistema.actualizar();
        }
    }//GEN-LAST:event_EliminarbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.sistema.leerRutas("Calles.txt");    
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregarbtn;
    private javax.swing.JButton Eliminarbtn;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JTextField calletxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstRutas;
    private javax.swing.JTextField xftxt;
    private javax.swing.JTextField xitxt;
    private javax.swing.JTextField yftxt;
    private javax.swing.JTextField yitxt;
    // End of variables declaration//GEN-END:variables
private void actualizarVentana() {
    lstRutas.clearSelection();
    lstRutas.setListData(this.sistema.getListaRutas().toArray());
    calletxt.setText("");
    xitxt.setText("");
    xftxt.setText("");
    yitxt.setText("");
    yftxt.setText("");
    }
@Override
    public void update(Observable o, Object obj){
        lstRutas.setListData(this.sistema.getListaRutas().toArray());
    }
}
