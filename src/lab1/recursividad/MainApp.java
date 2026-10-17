/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.recursividad;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author segio
 */
public class MainApp extends javax.swing.JFrame {
    
    private PalindromoAir avion;
    
    private JTextField txtNombre;
    private JTextArea txtConsola;
    private JButton[] botonesAsientos;
    
    private JLabel lblDisponibles;
    private JLabel lblOcupados;
    private JLabel lblPalindromos;
    private JLabel lblIngresos;
    
    /**
     * Creates new form MainApp
     */
    public MainApp() {
        initComponents();
        
        avion = new PalindromoAir();
        
        setTitle("PalindromoAir - Sistema de venta de boletos");
        setSize(850, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10,10));
        
        //Panel Arriba
        JPanel panelArriba = new JPanel();
        panelArriba.setLayout(new FlowLayout());
        
        lblDisponibles = new JLabel("Disponibles: 30  |  ");
        lblOcupados = new JLabel("Ocupados: 0  |  ");
        lblIngresos = new JLabel("Ingresos: $0.00");
        
        panelArriba.add(lblDisponibles);
        panelArriba.add(lblOcupados);
        panelArriba.add(lblIngresos);
        
        add(panelArriba, BorderLayout.NORTH);
        
        //Panel Central
        JPanel panelCentro = new JPanel();
        panelCentro.setLayout(new GridLayout(5,6,5,5));
        botonesAsientos = new JButton[30];
        char [] filas = {'A','B','C','D','E'};
        
        for (int i = 0; i < 30; i++) {
            char letraFila = filas[i/6];
            int columna = (i%6)+1;
            String codigoAsiento = ""+letraFila+columna;
            botonesAsientos[i]= new JButton(codigoAsiento);
            botonesAsientos[i].setBackground(Color.GREEN);
            
            final int indice = i;
            botonesAsientos[i].addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent e){
                  JOptionPane.showMessageDialog(null,"Clic en el asiento: "+codigoAsiento, 
                        "Detalle de Asiento", JOptionPane.INFORMATION_MESSAGE);
               }
            
            });
            panelCentro.add(botonesAsientos[i]);
        }
        add(panelCentro, BorderLayout.CENTER);
        
        
        //Panel Derecho
        JPanel panelDerecho = new JPanel();
        panelDerecho.setLayout(new GridLayout(8,1,5,5));
        
        panelDerecho.add(new JLabel("Nombre del Pasajero:"));
        txtNombre = new JTextField(15);
        panelDerecho.add(txtNombre);
        
        JButton btnVender = new JButton("Sell Ticket");
        JButton btnCancelar = new JButton("Cancel Ticket");
        JButton btnBuscar = new JButton("Search Passenger");
        JButton btnImprimir = new JButton("Print Passengers");
        JButton btnIngresos = new JButton("View Income");
        JButton btnDespachar = new JButton("Dispatch");
        
        panelDerecho.add(btnVender);
        panelDerecho.add(btnCancelar);
        panelDerecho.add(btnBuscar);
        panelDerecho.add(btnImprimir);
        panelDerecho.add(btnIngresos);
        panelDerecho.add(btnDespachar);
        
        add(panelDerecho, BorderLayout.EAST);
        
        //Acciones de los botones
        btnVender.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               String nombre = txtNombre.getText();
               JOptionPane.showMessageDialog(null,"Intentando vender a: " + nombre,
                    "Venta", JOptionPane.INFORMATION_MESSAGE);
               txtNombre.setText("");
           }
        });
        
        btnCancelar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String nombre = txtNombre.getText();
                JOptionPane.showMessageDialog(null, "Intentando cancelar a: "+nombre, 
                        "Cancelacion", JOptionPane.INFORMATION_MESSAGE);
                txtNombre.setText("");
            }
        });
        
        btnBuscar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String nombre = txtNombre.getText();
                JOptionPane.showMessageDialog(null, "Buscando pasajero: "+ nombre,
                        "Busqueda", JOptionPane.INFORMATION_MESSAGE);
                txtNombre.setText("");
            }
        });
        
        btnImprimir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Imprimiendo Lista de pasajeros...",
                        "Lista", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        btnIngresos.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Consultando ingresos...",
                        "Ingresos", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        
        btnDespachar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Vuelo despachado.",
                        "Despacho", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1068, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
