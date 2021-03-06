/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package diaketas.UI.Empleo;

import ValidarCampos.ValidarCampos;
import diaketas.Modelo.Gestores.Gestor_de_ofertas;
import diaketas.Modelo.ONG.ONG;
import diaketas.Modelo.ONG.Oferta;
import diaketas.UI.UI;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 
 * @author Cesar
 */
public class jCrearOferta extends javax.swing.JPanel {

    jModificacionCorrecta confirmarModificacion;
    JPanel panel;
    /**
     * Creates new form jConsultarMovimiento
     */
    public jCrearOferta() {
        initComponents();
        
        Date f = new Date();
        
        java.sql.Timestamp fecha = new java.sql.Timestamp( f.getTime() );
        
        //Ponemos por defecto los datos del voluntario a modificar
        
        /*
         * 
         * última cosa por el momento: a la hora de añadir, imagino que la fecha se pone automáticamente, pero... ¿el código de la oferta también? ¿hago una consulta a la BD para ver el máximo código, lo incremento, y lo pongo? 
        Oferta datosOferta = ONG.gestorOfertas.consultarDatosOferta();
        
        Cod_Oferta.setText( Integer.toString(datosOferta.cod_oferta) );
        Concepto.setText( datosOferta.concepto );
        Activada.setText( Integer.toString(datosOferta.activo) );
        Poblacion.setText( datosOferta.poblacion );
        Num_vacantes.setText( Integer.toString(datosOferta.numero_vacantes) );
        Descripcion.setText( datosOferta.descripcion );
        Req_minimos.setText( datosOferta.requisitos_minimos );
        Tipo_contrato.setText( datosOferta.tipo_contrato );
        Jornada_laboral.setText( Integer.toString(datosOferta.jornada_laboral) );
        Salario.setText( Double.toString(datosOferta.salario) );
        DNI_donante.setText( datosOferta.NIF_CIF_Donante );
        Observaciones.setText( datosOferta.observaciones );
        */
        
        // Representamos la fecha, pasandola de tipo Date a String
        SimpleDateFormat formatoFecha=new java.text.SimpleDateFormat("dd/MM/yy");
               
        Fecha.setText(formatoFecha.format(fecha));

    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botonOK = new javax.swing.JButton();
        jTitulo2 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        Fecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTitulo1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        Observaciones = new javax.swing.JTextArea();
        Concepto = new javax.swing.JTextField();
        Activada = new javax.swing.JTextField();
        Poblacion = new javax.swing.JTextField();
        Req_minimos = new javax.swing.JTextField();
        Num_vacantes = new javax.swing.JTextField();
        Tipo_contrato = new javax.swing.JTextField();
        Jornada_laboral = new javax.swing.JTextField();
        Salario = new javax.swing.JTextField();
        DNI_donante = new javax.swing.JTextField();
        botonCancelar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        NIF1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(233, 225, 242));
        setForeground(new java.awt.Color(102, 102, 102));
        setMaximumSize(new java.awt.Dimension(32767, 500));
        setPreferredSize(new java.awt.Dimension(1100, 518));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Poblacion");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Activada");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Concepto");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Fecha");

        botonOK.setText("Guardar");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        jTitulo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTitulo2.setText("Añadir una oferta");

        Fecha.setText("Fecha");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Numero vacantes");

        jTitulo1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTitulo1.setText("Empleo");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diaketas/Iconos/empleo.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Observaciones");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Jornada laboral");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Requisitos minimos");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("Tipo contrato");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel19.setText("Descripcion");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setText("Salario");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setText("DNI del donante ofertante");

        Descripcion.setColumns(20);
        Descripcion.setRows(5);
        Descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DescripcionKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(Descripcion);

        Observaciones.setColumns(20);
        Observaciones.setRows(5);
        Observaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ObservacionesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(Observaciones);

        Concepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConceptoActionPerformed(evt);
            }
        });
        Concepto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ConceptoKeyTyped(evt);
            }
        });

        Activada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ActivadaKeyTyped(evt);
            }
        });

        Poblacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PoblacionKeyTyped(evt);
            }
        });

        Req_minimos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Req_minimosKeyTyped(evt);
            }
        });

        Num_vacantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Num_vacantesKeyTyped(evt);
            }
        });

        Tipo_contrato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Tipo_contratoKeyTyped(evt);
            }
        });

        Jornada_laboral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Jornada_laboralKeyTyped(evt);
            }
        });

        Salario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SalarioKeyTyped(evt);
            }
        });

        DNI_donante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DNI_donanteKeyTyped(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        jLabel17.setText("DNI del voluntario actual");

        NIF1.setBackground(new java.awt.Color(255, 255, 153));
        NIF1.setColumns(9);
        NIF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NIF1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(39, 39, 39)
                        .addComponent(jTitulo1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2)
                                .addGap(88, 88, 88))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTitulo2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8))
                                        .addGap(96, 96, 96)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Fecha)
                                            .addComponent(Poblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Activada, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Concepto, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Num_vacantes, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator8)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tipo_contrato)
                                    .addComponent(DNI_donante, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Salario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                        .addComponent(Jornada_laboral, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(Req_minimos, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(NIF1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(botonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jTitulo1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTitulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Req_minimos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(Tipo_contrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(Jornada_laboral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(DNI_donante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Concepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Fecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Activada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Poblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Num_vacantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonOK)
                            .addComponent(botonCancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NIF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
        
        
        boolean continuar = true;

        //compruebo que no haya ningun campo vacio
        if (Concepto.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "No se ha introducido el concepto.", "Concepto", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        } else if (Activada.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "Indica si la oferta esta activa o no.", "Activada", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        } else if (Poblacion.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "No se ha introducido la poblacion.", "Poblacion", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        } else if (Num_vacantes.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "No se ha introducido el numero de plazas vacantes.", "Plazas vacantes", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        } else if (Descripcion.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "No se ha introducido la descripcion.", "Descripcion", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        } else if (Req_minimos.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "No se han introducido los requisitos minimos.", "Requisitos minimos", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        } else if (Tipo_contrato.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "No se ha introducido el tipo de contrato.", "Tipo de contrato", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        } else if (Jornada_laboral.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "No se ha introducido el numero de horas de la jornada laboral.", "Jornada laboral", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        } else if (Salario.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "No se ha introducido el salario.", "Salario", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        } else if (DNI_donante.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "No se ha introducido el dni del donante.", "DNI donante", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        } else if (Observaciones.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "No se han introducido observaciones.", "Observaciones", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        } else if (NIF1.getText().compareTo("") == 0) {
            JOptionPane.showMessageDialog(this, "No se ha introducido el DNI del voluntario actual.", "DNI voluntario actual", JOptionPane.ERROR_MESSAGE);
            continuar = false;
        } 
        
        if ( continuar && Activada.getText().compareTo("") != 0 ) {    //compruebo que Activada solo puede ser 1 o 0
            
            if( Activada.getText().compareTo("0")!=0 && Activada.getText().compareTo("1")!=0 )
            {
                JOptionPane.showMessageDialog(this, "Introducir 0 para desactivar y 1 para activar.", "Activada", JOptionPane.ERROR_MESSAGE);
                continuar = false;
            }
        } 
        //una vez que todos los campos han sido rellenados correctamente
        
        if(continuar)
        {
            
            if( !ValidarCampos.isInteger(Activada.getText()) ) 
            {
                JOptionPane.showMessageDialog(this, "El campo activada no es correcto. Debe ser un numero.", "Activada Invalido", JOptionPane.ERROR_MESSAGE);
                continuar = false;
            }
            else if (!ValidarCampos.isInteger(Num_vacantes.getText())) {

                JOptionPane.showMessageDialog(this, "El numero de vacantes no es correcto. Deber ser un numero.", "Vacantes Invalido", JOptionPane.ERROR_MESSAGE);
                continuar = false;
            } 
            else if (!ValidarCampos.isInteger(Jornada_laboral.getText())) {

                JOptionPane.showMessageDialog(this, "El numero de horas de la jornada laboral no es correcto. Deber ser un numero.", "Jornada Invalida", JOptionPane.ERROR_MESSAGE);
                continuar = false;
            } 
            else if (!ValidarCampos.isDouble(Salario.getText())) {

                JOptionPane.showMessageDialog(this, "El salario no es correcto. Deber ser un numero real.", "Salario Invalido", JOptionPane.ERROR_MESSAGE);
                continuar = false;
            } 
            
            
           
            
            boolean exito = false;

            if (continuar) //si todos los datos introducidos son correctos, llamo a las funciones
            {

                //primero compruebo si el dni del donante existe en el sistema
                boolean existe_don = ONG.gestorDonantes.comprobarDniDonante((String) DNI_donante.getText().toUpperCase());

                if (existe_don) {
                    
                    boolean existe_vol = ONG.gestorVoluntarios.comprobarExistenciaVoluntario((String) NIF1.getText().toUpperCase());
                    
                    if (existe_vol) {   //si existen el voluntario y el donante llamo a la funcion que modifica los datos
                        
                        
                        //Antes de llamar a la funcion, obtengo el tipo Date desde el String 
                        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yy");

                        Date FechaOf = null;

                        if (Fecha.getText().compareTo("d/mm/aa") != 0 && Fecha.getText().compareTo("") != 0) //si el campo fecha tiene escrito algo distinto de "d/mm/aa" y " "
                        {

                            try {
                                FechaOf = formatoFecha.parse(Fecha.getText());

                            } catch (ParseException ex) {
                                Logger.getLogger(jCrearOferta.class.getName()).log(Level.SEVERE, null, ex);
                                JOptionPane.showMessageDialog(this, "Fecha de oferta incorrecta, utilice formato dd/MM/yy.", "Fecha de oferta", JOptionPane.ERROR_MESSAGE);
                            }
                        } else //si la fecha esta vacia...
                        {
                            JOptionPane.showMessageDialog(this, "No se ha introducido la fecha de oferta.", "Fecha de oferta", JOptionPane.ERROR_MESSAGE);
                            continuar = false;
                        }
                        
                        
                        //ahora si se llama a la funcion final
                        boolean error = ONG.gestorOfertas.crearOferta((String)Concepto.getText(), FechaOf, Integer.parseInt(Activada.getText()), (String)Poblacion.getText(), Integer.parseInt(Num_vacantes.getText()), (String)Descripcion.getText(), (String)Req_minimos.getText(), (String)Tipo_contrato.getText(), Integer.parseInt(Jornada_laboral.getText()), Double.parseDouble(Salario.getText()), (String)DNI_donante.getText().toUpperCase(), (String)Observaciones.getText(), (String)NIF1.getText().toUpperCase() );
                        
                        if(!error)  //si no hay errores
                        {
                            exito=true;
                            
                            //ahora registro la operacion en el historial
                            
                            ONG.gestorOfertas.finAgregarOferta();
                            
                        }
                        else    //si hay algun error...
                        {
                            exito=false;
                        }
                        
                                                
                    } else {
                        JOptionPane.showMessageDialog(this, "No se ha encontrado el DNI del voluntario actual.", "Error DNI voluntario", JOptionPane.ERROR_MESSAGE);
                        exito = false;
                    }
                    
                    
                } else {
                    JOptionPane.showMessageDialog(this, "No se ha encontrado el DNI del donante.", "Error DNI donante", JOptionPane.ERROR_MESSAGE);
                    exito = false;
                }
            }



            if (exito && continuar) //si la operacion se ha realizado con exito y se habian introducido todos los datos
            {
                //MODIFICACION OFERTA REALIZADA
                confirmarModificacion = new jModificacionCorrecta();
                UI.jPrincipal.remove(confirmarModificacion);
                UI.jPrincipal.add("ConfirmarModificacion", confirmarModificacion);
                UI.cl.show(UI.jPrincipal, "ConfirmarModificacion");
            } else if (!exito) {
                JOptionPane.showMessageDialog(this, "No se ha podido realizar correctamente la modificacion.", "Error modificacion", JOptionPane.ERROR_MESSAGE);
            }
            
            
        }//continuar
        
        //UI.cl.show(UI.jPrincipal, "Empleo");
    }//GEN-LAST:event_botonOKActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
     
        double fuente = 13 + (this.getSize().width - 1262) / 30;
        for (int i = 0; i < this.getComponentCount(); i++) {
            this.getComponent(i).setFont(new Font("Courier", Font.BOLD, (int) fuente));
        }

        jTitulo1.setFont(new Font("Courier", Font.BOLD, (int) fuente+12));
        jTitulo2.setFont(new Font("Courier", Font.BOLD, (int) fuente+2));
        

        Concepto.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Fecha.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Activada.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Poblacion.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Num_vacantes.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Req_minimos.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Tipo_contrato.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Jornada_laboral.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Salario.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        DNI_donante.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Descripcion.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        Observaciones.setFont(new Font("Courier", Font.PLAIN, (int) fuente));
        
    }//GEN-LAST:event_formComponentResized

    private void ConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConceptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConceptoActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        
        UI.cl.show(UI.jPrincipal, "Empleo");
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void DNI_donanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DNI_donanteKeyTyped
        // TODO add your handling code here:
        if (DNI_donante.getText().length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_DNI_donanteKeyTyped

    private void ConceptoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConceptoKeyTyped
        // TODO add your handling code here:
        
        if (Concepto.getText().length() >= 60) {
            evt.consume();
        }
    }//GEN-LAST:event_ConceptoKeyTyped

    private void PoblacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PoblacionKeyTyped
        // TODO add your handling code here:
        if (Poblacion.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_PoblacionKeyTyped

    private void Num_vacantesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Num_vacantesKeyTyped
        // TODO add your handling code here:
        if (Num_vacantes.getText().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_Num_vacantesKeyTyped

    private void DescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescripcionKeyTyped
        // TODO add your handling code here:
        if (Descripcion.getText().length() >= 500) {
            evt.consume();
        }
    }//GEN-LAST:event_DescripcionKeyTyped

    private void ActivadaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ActivadaKeyTyped
        // TODO add your handling code here:
        if (Activada.getText().length() >= 1) {
            evt.consume();
        }
    }//GEN-LAST:event_ActivadaKeyTyped

    private void Req_minimosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Req_minimosKeyTyped
        // TODO add your handling code here:
        if (Req_minimos.getText().length() >= 200) {
            evt.consume();
        }
    }//GEN-LAST:event_Req_minimosKeyTyped

    private void Tipo_contratoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tipo_contratoKeyTyped
        // TODO add your handling code here:
        if (Tipo_contrato.getText().length() >= 60) {
            evt.consume();
        }
    }//GEN-LAST:event_Tipo_contratoKeyTyped

    private void Jornada_laboralKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jornada_laboralKeyTyped
        // TODO add your handling code here:
        if (Jornada_laboral.getText().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_Jornada_laboralKeyTyped

    private void SalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalarioKeyTyped
        // TODO add your handling code here:
        if (Salario.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_SalarioKeyTyped

    private void ObservacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ObservacionesKeyTyped
        // TODO add your handling code here:
        if (Observaciones.getText().length() >= 200) {
            evt.consume();
        }
    }//GEN-LAST:event_ObservacionesKeyTyped

    private void NIF1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NIF1KeyTyped
        // TODO add your handling code here:
        if (NIF1.getText().length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_NIF1KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Activada;
    private javax.swing.JTextField Concepto;
    private javax.swing.JTextField DNI_donante;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JLabel Fecha;
    private javax.swing.JTextField Jornada_laboral;
    private javax.swing.JTextField NIF1;
    private javax.swing.JTextField Num_vacantes;
    private javax.swing.JTextArea Observaciones;
    private javax.swing.JTextField Poblacion;
    private javax.swing.JTextField Req_minimos;
    private javax.swing.JTextField Salario;
    private javax.swing.JTextField Tipo_contrato;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonOK;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel jTitulo1;
    private javax.swing.JLabel jTitulo2;
    // End of variables declaration//GEN-END:variables
}
