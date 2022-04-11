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
public class VentanaCamiones extends javax.swing.JFrame implements Observer {
    private SistemaBeta sistema;
    public VentanaCamiones(SistemaBeta unSistema ) {
        initComponents();
        this.sistema= unSistema;
        lstCamiones.setListData(this.sistema.getListaCamiones().toArray());
        sistema.addObserver(this);
        this.setTitle("Registro Camiones");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        nombretxt = new javax.swing.JTextField();
        chofertxt = new javax.swing.JTextField();
        matriculatxt = new javax.swing.JTextField();
        cargaLtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCamiones = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAMIONES");
        jLabel1.setToolTipText("");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Matricula:");

        jLabel4.setText("chofer:");

        jLabel5.setText("carga en L:");

        jScrollPane1.setViewportView(lstCamiones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(matriculatxt, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(nombretxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cargaLtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(chofertxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar))
                .addGap(0, 82, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chofertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(btnAgregar))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(matriculatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cargaLtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    String alt=new String("Datos incorrectos, porfavor verifique:");
    boolean bul = true;
    int h=0;
    String nombre= nombretxt.getText();
    String matricula= matriculatxt.getText();
    String chofer= chofertxt.getText();
    String carga = cargaLtxt.getText();
    bul= this.sistema.chequearNumero(carga, 10000000, 99999999);
    if(bul){
    h= Integer.parseInt(carga);
    Camiones nC= new Camiones(nombre, h, matricula, chofer);
    this.sistema.agregarCamiones(nC);
    alt="Camion agregado";
    JOptionPane.showMessageDialog(this, alt);
    actualizarVentana();
    this.sistema.actualizar();
    }else{
    alt=alt+" Carga";
    JOptionPane.showMessageDialog(this, alt, "ERROR", ERROR_MESSAGE);
    }
     
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (this.lstCamiones.getSelectedValue() != null) {
            String camion = this.lstCamiones.getSelectedValue().toString();
            sistema.eliminarCamion(camion);
            this.sistema.actualizar();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JTextField cargaLtxt;
    private javax.swing.JTextField chofertxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstCamiones;
    private javax.swing.JTextField matriculatxt;
    private javax.swing.JTextField nombretxt;
    // End of variables declaration//GEN-END:variables
    private void actualizarVentana() {
    lstCamiones.clearSelection();
    lstCamiones.setListData(this.sistema.getListaCamiones().toArray());
    cargaLtxt.setText("");
    chofertxt.setText("");
    matriculatxt.setText("");
    nombretxt.setText("");
    }
    @Override
    public void update(Observable o, Object obj){
        lstCamiones.setListData(this.sistema.getListaCamiones().toArray()); 
    }
}
