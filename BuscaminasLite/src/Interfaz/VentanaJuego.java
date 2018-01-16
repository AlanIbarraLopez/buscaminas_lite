/*
Interfaz Grafica
 */
package Interfaz;

import Clases.Buscaminas;
import Clases.Lienzo;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author Alan E. Ibarra López
 */
public class VentanaJuego extends javax.swing.JFrame {

    private JButton botones[][];
    private Buscaminas juego;
    private Lienzo fondo;
    private boolean cara; //resultado del boton true o false
    private ImageIcon check,bomb; //variables donde se guardara la imagen del boton
    public VentanaJuego() {
        initComponents();
        this.setTitle("Buscaminas Lite");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        juego = new Buscaminas();

        fondo = new Lienzo(this.getWidth(),this.getHeight());
        this.add(fondo);
        botones = new JButton[4][3];
        check = new ImageIcon(getClass().getResource("/Imagenes/check.png"));
        bomb=new ImageIcon(getClass().getResource("/Imagenes/bomb.png"));
        iniciarMatrizBotones();
        
        //botones[0][0].setIcon(new ImageIcon(getClass().getResource("/Imagenes/check.png")));
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        marcador = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setBackground(new java.awt.Color(255, 255, 102));
        btn1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setOpaque(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(255, 255, 102));
        btn2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(255, 255, 102));
        btn3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(255, 255, 102));
        btn4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(255, 255, 102));
        btn5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(255, 255, 102));
        btn6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(255, 255, 102));
        btn8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(255, 255, 102));
        btn7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(255, 255, 102));
        btn9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.setBackground(new java.awt.Color(255, 255, 102));
        btn10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setBackground(new java.awt.Color(255, 255, 102));
        btn11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setBackground(new java.awt.Color(255, 255, 102));
        btn12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(java.awt.Color.orange);
        jSeparator1.setOpaque(true);

        jSeparator2.setBackground(java.awt.Color.orange);
        jSeparator2.setOpaque(true);

        jSeparator3.setBackground(java.awt.Color.orange);
        jSeparator3.setOpaque(true);

        marcador.setBackground(java.awt.Color.orange);
        marcador.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        marcador.setText("SCORE");
        marcador.setOpaque(true);

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Acerca de..");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(marcador)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn12, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(btn11, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(btn10, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(marcador)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // 0,0
        cara = juego.getValor(0, 0); //obtenemos la posicion correspondiente en la matriz, para saber si es bomba o no 
      
        if(cara){
            botones[0][0].setIcon(check);
            juego.setAcierto();
            marcador.setText("Score: "+juego.getMarcador());
        }else{
            botones[0][0].setIcon(bomb);
            marcador.setText("Score: "+juego.getMarcador());
        }//obtenemos la imagen y un valor
        
        //si perdimos, preguntamos si seguir o no en el juego, en caso de si resetear el frame sino salir
        if(juego.getResultado(cara)==false){
            int i = showConfirmDialog(this,"PERDISTE !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//perdimos ?
        
        //saber si ganamos 
        if(juego.gameOver()){
            int i = showConfirmDialog(this,"GANASTE SCORE: "+juego.getMarcador()+" !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//ganamos ?
        
        botones[0][0].setEnabled(false);
        
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // 0,1
         cara = juego.getValor(0, 1); //obtenemos la posicion correspondiente en la matriz, para saber si es bomba o no 
      
        if(cara){
            botones[0][1].setIcon(check);
            juego.setAcierto();
            marcador.setText("Score: "+juego.getMarcador());
        }else{
            botones[0][1].setIcon(bomb);
            marcador.setText("Score: "+juego.getMarcador());
        }//obtenemos la imagen y un valor
        
        //si perdimos, preguntamos si seguir o no en el juego, en caso de si resetear el frame sino salir
        if(juego.getResultado(cara)==false){
            int i = showConfirmDialog(this,"PERDISTE !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//perdimos ?
        
        //saber si ganamos 
        if(juego.gameOver()){
            int i = showConfirmDialog(this,"GANASTE SCORE: "+juego.getMarcador()+" !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//ganamos ?
        
        botones[0][1].setEnabled(false);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // 0,2
         cara = juego.getValor(0, 2); //obtenemos la posicion correspondiente en la matriz, para saber si es bomba o no 
      
        if(cara){
            botones[0][2].setIcon(check);
            juego.setAcierto();
            marcador.setText("Score: "+juego.getMarcador());
        }else{
            botones[0][2].setIcon(bomb);
            marcador.setText("Score: "+juego.getMarcador());
        }//obtenemos la imagen y un valor
        
        //si perdimos, preguntamos si seguir o no en el juego, en caso de si resetear el frame sino salir
        if(juego.getResultado(cara)==false){
            int i = showConfirmDialog(this,"PERDISTE !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//perdimos ?
        
        //saber si ganamos 
        if(juego.gameOver()){
            int i = showConfirmDialog(this,"GANASTE SCORE: "+juego.getMarcador()+" !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//ganamos ?
        
        botones[0][2].setEnabled(false);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // 1,0
         cara = juego.getValor(1, 0); //obtenemos la posicion correspondiente en la matriz, para saber si es bomba o no 
      
        if(cara){
            botones[1][0].setIcon(check);
            juego.setAcierto();
            marcador.setText("Score: "+juego.getMarcador());
        }else{
            botones[1][0].setIcon(bomb);
            marcador.setText("Score: "+juego.getMarcador());
        }//obtenemos la imagen y un valor
        
        //si perdimos, preguntamos si seguir o no en el juego, en caso de si resetear el frame sino salir
        if(juego.getResultado(cara)==false){
            int i = showConfirmDialog(this,"PERDISTE !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//perdimos ?
        
        //saber si ganamos 
        if(juego.gameOver()){
            int i = showConfirmDialog(this,"GANASTE SCORE: "+juego.getMarcador()+" !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//ganamos ?
        
        botones[1][0].setEnabled(false);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // 1,1
         cara = juego.getValor(1, 1); //obtenemos la posicion correspondiente en la matriz, para saber si es bomba o no 
      
        if(cara){
            botones[1][1].setIcon(check);
            juego.setAcierto();
            marcador.setText("Score: "+juego.getMarcador());
        }else{
            botones[1][1].setIcon(bomb);
            marcador.setText("Score: "+juego.getMarcador());
        }//obtenemos la imagen y un valor
        
        //si perdimos, preguntamos si seguir o no en el juego, en caso de si resetear el frame sino salir
        if(juego.getResultado(cara)==false){
            int i = showConfirmDialog(this,"PERDISTE !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//perdimos ?
        
        //saber si ganamos 
        if(juego.gameOver()){
            int i = showConfirmDialog(this,"GANASTE SCORE: "+juego.getMarcador()+" !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//ganamos ?
        
        botones[1][1].setEnabled(false);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // 1,2
         cara = juego.getValor(1, 2); //obtenemos la posicion correspondiente en la matriz, para saber si es bomba o no 
      
        if(cara){
            botones[1][2].setIcon(check);
            juego.setAcierto();
            marcador.setText("Score: "+juego.getMarcador());
        }else{
            botones[1][2].setIcon(bomb);
            marcador.setText("Score: "+juego.getMarcador());
        }//obtenemos la imagen y un valor
        
        //si perdimos, preguntamos si seguir o no en el juego, en caso de si resetear el frame sino salir
        if(juego.getResultado(cara)==false){
            int i = showConfirmDialog(this,"PERDISTE !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//perdimos ?
        
        //saber si ganamos 
        if(juego.gameOver()){
            int i = showConfirmDialog(this,"GANASTE SCORE: "+juego.getMarcador()+" !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//ganamos ?
        
        botones[1][2].setEnabled(false);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // 2,0
         cara = juego.getValor(2, 0); //obtenemos la posicion correspondiente en la matriz, para saber si es bomba o no 
      
        if(cara){
            botones[2][0].setIcon(check);
            juego.setAcierto();
            marcador.setText("Score: "+juego.getMarcador());
        }else{
            botones[2][0].setIcon(bomb);
            marcador.setText("Score: "+juego.getMarcador());
        }//obtenemos la imagen y un valor
        
        //si perdimos, preguntamos si seguir o no en el juego, en caso de si resetear el frame sino salir
        if(juego.getResultado(cara)==false){
            int i = showConfirmDialog(this,"PERDISTE !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//perdimos ?
        
        //saber si ganamos 
        if(juego.gameOver()){
            int i = showConfirmDialog(this,"GANASTE SCORE: "+juego.getMarcador()+" !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//ganamos ?
        
        botones[2][0].setEnabled(false);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // 2,1
         cara = juego.getValor(2, 1); //obtenemos la posicion correspondiente en la matriz, para saber si es bomba o no 
      
        if(cara){
            botones[2][1].setIcon(check);
            juego.setAcierto();
            marcador.setText("Score: "+juego.getMarcador());
        }else{
            botones[2][1].setIcon(bomb);
            marcador.setText("Score: "+juego.getMarcador());
        }//obtenemos la imagen y un valor
        
        //si perdimos, preguntamos si seguir o no en el juego, en caso de si resetear el frame sino salir
        if(juego.getResultado(cara)==false){
            int i = showConfirmDialog(this,"PERDISTE !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//perdimos ?
        
        //saber si ganamos 
        if(juego.gameOver()){
            int i = showConfirmDialog(this,"GANASTE SCORE: "+juego.getMarcador()+" !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//ganamos ?
        
        botones[2][1].setEnabled(false);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        //2,2
         cara = juego.getValor(2, 2); //obtenemos la posicion correspondiente en la matriz, para saber si es bomba o no 
      
        if(cara){
            botones[2][2].setIcon(check);
            juego.setAcierto();
            marcador.setText("Score: "+juego.getMarcador());
        }else{
            botones[2][2].setIcon(bomb);
            marcador.setText("Score: "+juego.getMarcador());
        }//obtenemos la imagen y un valor
        
        //si perdimos, preguntamos si seguir o no en el juego, en caso de si resetear el frame sino salir
        if(juego.getResultado(cara)==false){
            int i = showConfirmDialog(this,"PERDISTE !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//perdimos ?
        
        //saber si ganamos 
        if(juego.gameOver()){
            int i = showConfirmDialog(this,"GANASTE SCORE: "+juego.getMarcador()+" !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//ganamos ?
        
        botones[2][2].setEnabled(false);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // 3,0
         cara = juego.getValor(3, 0); //obtenemos la posicion correspondiente en la matriz, para saber si es bomba o no 
      
        if(cara){
            botones[3][0].setIcon(check);
            juego.setAcierto();
            marcador.setText("Score: "+juego.getMarcador());
        }else{
            botones[3][0].setIcon(bomb);
            marcador.setText("Score: "+juego.getMarcador());
        }//obtenemos la imagen y un valor
        
        //si perdimos, preguntamos si seguir o no en el juego, en caso de si resetear el frame sino salir
        if(juego.getResultado(cara)==false){
            int i = showConfirmDialog(this,"PERDISTE !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//perdimos ?
        
        //saber si ganamos 
        if(juego.gameOver()){
            int i = showConfirmDialog(this,"GANASTE SCORE: "+juego.getMarcador()+" !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//ganamos ?
        
        botones[3][0].setEnabled(false);
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // 3,1
         cara = juego.getValor(3, 1); //obtenemos la posicion correspondiente en la matriz, para saber si es bomba o no 
      
        if(cara){
            botones[3][1].setIcon(check);
            juego.setAcierto();
            marcador.setText("Score: "+juego.getMarcador());
        }else{
            botones[3][1].setIcon(bomb);
            marcador.setText("Score: "+juego.getMarcador());
        }//obtenemos la imagen y un valor
        
        //si perdimos, preguntamos si seguir o no en el juego, en caso de si resetear el frame sino salir
        if(juego.getResultado(cara)==false){
            int i = showConfirmDialog(this,"PERDISTE !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//perdimos ?
        
        //saber si ganamos 
        if(juego.gameOver()){
            int i = showConfirmDialog(this,"GANASTE SCORE: "+juego.getMarcador()+" !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//ganamos ?
        
        botones[3][1].setEnabled(false);
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // 3,2
         cara = juego.getValor(3, 2); //obtenemos la posicion correspondiente en la matriz, para saber si es bomba o no 
      
        if(cara){
            botones[3][2].setIcon(check);
            juego.setAcierto();
            marcador.setText("Score: "+juego.getMarcador());
        }else{
            botones[3][2].setIcon(bomb);
            marcador.setText("Score: "+juego.getMarcador());
        }//obtenemos la imagen y un valor
        
        //si perdimos, preguntamos si seguir o no en el juego, en caso de si resetear el frame sino salir
        if(juego.getResultado(cara)==false){
            int i = showConfirmDialog(this,"PERDISTE !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//perdimos ?
        
        //saber si ganamos 
        if(juego.gameOver()){
            int i = showConfirmDialog(this,"GANASTE SCORE: "+juego.getMarcador()+" !! deseas jugar otra vez?","Buscaminas",YES_OPTION,NO_OPTION);
            if(i==YES_OPTION){
                juego.resetear();
                this.hide();
                VentanaJuego d = new VentanaJuego();
                d.setVisible(true);
            }else{
                System.exit(0);
            }
        }//ganamos ?
        
        botones[3][2].setEnabled(false);
    }//GEN-LAST:event_btn12ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //menu
        showMessageDialog(this, "Juego Buscaminas Lite\nDesarrollado por: Alan Eduardo Ibarra López");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel marcador;
    // End of variables declaration//GEN-END:variables

    private void iniciarMatrizBotones() {
        
        botones[0][0] = btn1;
        botones[0][1] = btn2;
        botones[0][2] = btn3;
        
        botones[1][0] = btn4;
        botones[1][1] = btn5;
        botones[1][2] = btn6;
        
        botones[2][0] = btn7;
        botones[2][1] = btn8;
        botones[2][2] = btn9;
        
        botones[3][0] = btn10;
        botones[3][1] = btn11;
        botones[3][2] = btn12;
        
    }//llenar matriz
}//class
