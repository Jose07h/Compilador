
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Variables extends javax.swing.JFrame {
    JScrollPane jsbarras; 
    JTable tabladatos;
    JLabel lti;
    String encabezados[]={"Entero","Caracter","Texto","Doble"};
    String  datos[][];   
    
    String PReservadas[] = {"Entero", "Texto", "Doble", "Long", "Caracter"};
    String DMetodos[] = {"Entero", "Texto", "Doble", "Long", "Caracter", "Vacio"};
    String DCiclos[] = {"if", "for", "while","Do"};
    String comparaciones[] = {"<", ">", "<=", ">=", "!=", "==", "!"};
    String logicos[] = {"&&", "||"};
    boolean be1 = false, be2 = false, be3 = false, be4 = false, be5 = false, be6 = false;
    boolean bm1 = false, bm2 = false, bm3 = false, bm4 = false, bm5 = false, bm6 = false, bm7 = false, bm8 = false,bx = false;
    boolean bi1 = false, bi2 = false, bi3 = false, bi4 = false, bi5 = false, bi6 = false;
    boolean bw1 = false, bw2 = false, bw3 = false, bw4 = false, bw5 = false, bw6 = false, bw7 = false, bw8 = false, bw9 = false, bw10 = false, bw11 = false, bw12 = false, bw13 = false, bw14 = false, bw15 = false, bw16 = false;
    boolean tab=false,tab2=false,tab3=false,tab4=false ,ban1=false,igual=false;
    String matriz[][] = new String[4][10];
    String numeros[][] = new String[4][10];
    int indicador = 0, ind_ent = 0, ind_tex = 0, ind_bol = 0, ind_do = 0;
    int cot = 0;
     String for_var = "";
     String variables[][];
    public Variables(){
        initComponents();
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        var = new javax.swing.JButton();
        metodo = new javax.swing.JButton();
        whil = new javax.swing.JButton();
        si = new javax.swing.JButton();
        foor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        t2.setColumns(20);
        t2.setRows(5);
        jScrollPane1.setViewportView(t2);

        t1.setColumns(20);
        t1.setRows(5);
        jScrollPane2.setViewportView(t1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        var.setText("Variables");
        var.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varActionPerformed(evt);
            }
        });

        metodo.setText("Metodo");
        metodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodoActionPerformed(evt);
            }
        });

        whil.setText("while");
        whil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whilActionPerformed(evt);
            }
        });

        si.setText("if");
        si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siActionPerformed(evt);
            }
        });

        foor.setText("for");
        foor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foorActionPerformed(evt);
            }
        });

        jButton1.setText("Do while");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ok");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(whil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(si, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(foor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(var, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(metodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(var)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(metodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(whil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(si)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Entero");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Texto");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Doble");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Caracter");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void varActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varActionPerformed
        String texto = t1.getText(), cad = "", aux = "";
        LinkedList lista = new LinkedList();
        StringTokenizer token = new StringTokenizer(texto);
        while (token.hasMoreTokens()) {
            aux = token.nextToken();
            cad += aux + "\n";
            lista.add(aux);
        }
        t2.setText(cad);

        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            validar_declaracion(iter.next().toString());
        }
        
        System.out.println("be1=" + be1 + "  be2=" + be2 + "  be3=" + be3 + "  be4=" + be4 + "  be5=" + be5);
        be1 = false;
        be2 = false;
        be3 = false;
        be4 = false;
        be5 = false;
        be6 = false;
        if (be3) {
            
        }
    }//GEN-LAST:event_varActionPerformed
    private void metodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodoActionPerformed
        String texto = t1.getText(), cad = "", aux = "";
        LinkedList lista = new LinkedList();
        StringTokenizer token = new StringTokenizer(texto);

        while (token.hasMoreTokens()) {
            aux = token.nextToken();
            cad += aux + "\n";
            lista.add(aux);
        }
        t2.setText(cad);

        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            validar_metodo(iter.next().toString());
        }
        System.out.println("bm1=" + bm1 + "  bm2=" + bm2 + "  bm3=" + bm3 + "   bm4=" + bm4 + "   bm5=" + bm5 + "  bm6=" + bm6
                + "    bm7=" + bm7 + "   bm8=" + bm8);
        bm1 = false;
        bm2 = false;
        bm3 = false;
        bm4 = false;
        bm5 = false;
        bm6 = false;
        bm7 = false;
        bm8 = false;
    }//GEN-LAST:event_metodoActionPerformed
    private void whilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whilActionPerformed
        String texto = t1.getText(), cad = "", aux = "";
        LinkedList lista = new LinkedList();
        StringTokenizer token = new StringTokenizer(texto);
        while (token.hasMoreTokens()) {
            aux = token.nextToken();
            cad += aux + "\n";
            lista.add(aux);
        }
        t2.setText(cad);

        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            validar_while(iter.next().toString());
        }
        System.out.println("bw1=" + bw1 + "  bw2=" + bw2 + "  bw3=" + bw3 + "  bw4=" + bw4 + "  bw5=" + bw5 + "  bw6=" + bw6 + "  bw7=" + bw7 + "  bw8=" + bw8);
        bw1 = false;
        bw2 = false;
        bw3 = false;
        bw4 = false;
        bw5 = false;
        bw6 = false;
        bw7 = false;
        bw8 = false;
    }//GEN-LAST:event_whilActionPerformed
    private void siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siActionPerformed
        String texto = t1.getText(), cad = "", aux = "";
        LinkedList lista = new LinkedList();
        StringTokenizer token = new StringTokenizer(texto);
        while (token.hasMoreTokens()) {
            aux = token.nextToken();
            cad += aux + "\n";
            lista.add(aux);
        }
        t2.setText(cad);

        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            validar_if(iter.next().toString());
        }
        System.out.println("bw1=" + bw1 + "  bw2=" + bw2 + "  bw3=" + bw3 + "  bw4=" + bw4 + "  bw5=" + bw5 + "  bw6=" + bw6 + "  bw7=" + bw7 + "  bw8=" + bw8);
        bw1 = false;
        bw2 = false;
        bw3 = false;
        bw4 = false;
        bw5 = false;
        bw6 = false;
        bw7 = false;
        bw8 = false;
    }//GEN-LAST:event_siActionPerformed
    private void foorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foorActionPerformed
        String texto = t1.getText(), cad = "", aux = "";
        LinkedList lista = new LinkedList();
        StringTokenizer token = new StringTokenizer(texto);
        while (token.hasMoreTokens()) {
            aux = token.nextToken();
            cad += aux + "\n";
            lista.add(aux);
        }
        t2.setText(cad);

        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            validar_for(iter.next().toString());
        }
        System.out.println(
                "bw1= " + bw1 + "     bw2=" + bw2 + "  bw3=" + bw3 + "  bw4=" + bw4
                + "\nbw5= " + bw5 + "  bw6=" + bw6 + "  bw7=" + bw7 + "  bw8=" + bw8
                + "\nbw9= " + bw9 + "  bw10=" + bw10 + "  bw11=" + bw11 + "  bw12=" + bw12
                + "\nbw13=" + bw13 + "  bw14=" + bw14 + "  bw15=" + bw15 + "  bw16=" + bw16);
        bw1 = false;
        bw2 = false;
        bw3 = false;
        bw4 = false;
        bw5 = false;
        bw6 = false;
        bw7 = false;
        bw8 = false;
        bw9 = false;
        bw10 = false;
        bw11 = false;
        bw12 = false;
        bw13 = false;
        bw14 = false;
        bw15 = false;
        bw16 = false;
        cot=0;
        for_var="";
    }//GEN-LAST:event_foorActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
              String texto = t1.getText(), cad = "", aux = "";
        LinkedList lista = new LinkedList();
        StringTokenizer token = new StringTokenizer(texto);
        while (token.hasMoreTokens()) {
            aux = token.nextToken();
            cad += aux + "\n";
            lista.add(aux);
        }
        t2.setText(cad);

        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            validar_dowhile(iter.next().toString());
        }
        System.out.println("bw1=" + bw1 + "  bw2=" + bw2 + "  bw3=" + bw3 + "  bw4=" + bw4 + "  bw5=" + bw5 + "  bw6=" + bw6 + "  bw7=" + bw7 + "  bw8=" + bw8);
        bw1 = false;
        bw2 = false;
        bw3 = false;
        bw4 = false;
        bw5 = false;
        bw6 = false;
        bw7 = false;
        bw8 = false;
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String texto = t1.getText(), cad = "", aux;
        StringTokenizer token = new StringTokenizer(texto);
        LinkedList lista = new LinkedList();
        while (token.hasMoreTokens()) {
            aux = token.nextToken();
            cad += aux + "\n";
            lista.add(aux);
        }
        t2.setText(cad);
        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            a(iter.next().toString());
        }
        String mat="";
        System.out.println("////////");
        for (int i = 0; i <10; i++) {
            for (int j = 0; j < 4; j++) {
                mat+=""+matriz[j][i];
            }
           // System.out.println("  "+mat);
           // mat="";
        }
        String col[]={"Variable 1","Variable 2","Variable 3","Variable 4","Variable 5","Variable 6", "Variable 7", "Variable 8", "Variable 9", "Variable 10"};
       jTable1.setModel(new DefaultTableModel(matriz,col));      
       jTable2.setModel(new DefaultTableModel(numeros,col));
    }//GEN-LAST:event_jButton2ActionPerformed
    boolean validar_declaracion(String palabra) {
        System.out.println("--" + palabra);
        if (!be1) {
            for (int i = 0; i < PReservadas.length; i++) {
                if (palabra.equals(PReservadas[i])) {
                    be1 = true;
                }
            }
        }
        if (be1 && !be2 && Pres(palabra) == false) {
            if (palabra.charAt(0) >= 65 && palabra.charAt(0) <= 90 || palabra.charAt(0) >= 97 && palabra.charAt(0) <= 122) {
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) >= 65 && palabra.charAt(i) <= 90 || palabra.charAt(i) >= 97 && palabra.charAt(i) <= 122
                            || palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57 || palabra.charAt(i) == '_') {
                        System.out.println("_" + palabra.charAt(i));
                        be2 = true;
                    } else {
                        be2 = false;
                        break;
                    }
                }
            } else {
                be2 = false;
            }
        }
        if (be2) {
            if (palabra.equals(",")) {
                be2 = false;
                be5 = false;
            } else {
                be2 = true;
            }
        }
        if (be2) {
            if (palabra.equals("=")) {
                be4 = true;
            }
        }
        if (be4 && !be5) {
            for (int i = 0; i < palabra.length(); i++) {
                if (Character.isDigit(palabra.charAt(i)) == true) {
                    System.out.println("numerooo" + palabra.charAt(i));
                    be5 = true;
                } else {
                    be5 = false;
                    break;
                }
            }
        }
        if (be2) {
            if (palabra.equals("#")) {
                be3 = true;
            }
        }
        return false;
    }
    boolean Pres(String p) {
        for (int i = 0; i < DMetodos.length; i++) {
            if (p.equals(DMetodos[i])) {
                return true;
            }
        }

        for (int i = 0; i < PReservadas.length; i++) {
            if (p.equals(PReservadas[i])) {
                return true;
            }
        }
        for (int i = 0; i < DCiclos.length; i++) {
            if (p.equals(DCiclos[i])) {
                return true;
            }
        }
        for (int i = 0; i < comparaciones.length; i++) {
            if (p.equals(comparaciones[i])) {
                return true;
            }
        }
        for (int i = 0; i < logicos.length; i++) {
            if (p.equals(logicos[i])) {
                return true;
            }
        }
        return false;
    }
    boolean validar_metodo(String palabra) {
        System.out.println("" + palabra);
        if (!bm1) {
            for (int i = 0; i < DMetodos.length; i++) {
                if (palabra.equals(DMetodos[i])) {
                    bm1 = true;
                }
            }
        }
        if (bm1 && !bm2 && (Pres(palabra) == false)) {
            if (Character.isLetter(palabra.charAt(0)) == true) {
                for (int i = 0; i < palabra.length(); i++) {
                    if (Character.isLetter(palabra.charAt(i)) || Character.isDigit(palabra.charAt(i))) {
                        bm2 = true;
                        System.out.println("  " + palabra.charAt(i));
                    } else {
                        bm2 = false;
                    }
                }
            } else {
                bm2 = false;
            }
        }
        if (bm2) {
            if (palabra.equals("(")) {
                bm3 = true;
            }
        }
        if (bm3) {
            for (int i = 0; i < PReservadas.length; i++) {
                if (palabra.equals(PReservadas[i])) {
                    bm4 = true;
                }
            }
        }
        if (bm4 && !bm5 && Pres(palabra) == false) {
            if (palabra.charAt(0) >= 65 && palabra.charAt(0) <= 90
                    || palabra.charAt(0) >= 97 && palabra.charAt(0) <= 122) {
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) >= 65 && palabra.charAt(i) <= 90
                            || palabra.charAt(i) >= 97 && palabra.charAt(i) <= 122
                            || palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57
                            || palabra.charAt(i) == '_') {
                        bm5 = true;
                        System.out.println("   " + palabra.charAt(i));
                    } else {
                        bm5 = false;
                        break;
                    }
                }
            } else {
                bm5 = false;

            }
        }
        if (bm5) {
            if (palabra.equals(",")) {
                bm5 = false;
                bm3 = false;
            }
        }
        if (bm5) {
            if (palabra.equals(")")) {
                bm6 = true;
            }
        }
        if (bm6) {
            if (palabra.equals("{")) {
                bm7 = true;
            }
        }
        if (bm7) {
            if (palabra.equals("}")) {
                bm8 = true;
            }
        }

        return false;
    }
    boolean validar_while(String palabra) {
        System.out.println("" + palabra);
        if (!bw1) {
            for (int i = 0; i < DCiclos.length; i++) {
                if (palabra.equals(DCiclos[i])) {
                    bw1 = true;
                }
            }
        }
        if (bw1) {
            if (palabra.equals("(")) {
                System.out.println("" + palabra);
                bw2 = true;
            }
        }
        if (bw2) {

            if (palabra.charAt(0) >= 65 && palabra.charAt(0) <= 90
                    || palabra.charAt(0) >= 97 && palabra.charAt(0) <= 122) {
                System.out.println("" + palabra);
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) >= 65 && palabra.charAt(i) <= 90
                            || palabra.charAt(i) >= 97 && palabra.charAt(i) <= 122
                            || palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57
                            || palabra.charAt(i) == '_') {
                        System.out.println("------" + palabra.charAt(i));
                        bw3 = true;
                    }
                }
            }
        }
        if (bw3) {
            for (int i = 0; i < comparaciones.length; i++) {
                if (palabra.equals(comparaciones[i])) {
                    System.out.println("" + palabra);
                    bw4 = true;
                }

            }
        }
        if (bw4) {
            if (palabra.charAt(0) >= 65 && palabra.charAt(0) <= 90
                    || palabra.charAt(0) >= 97 && palabra.charAt(0) <= 122) {
                System.out.println("" + palabra);
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) >= 65 && palabra.charAt(i) <= 90
                            || palabra.charAt(i) >= 97 && palabra.charAt(i) <= 122
                            || palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57
                            || palabra.charAt(i) == '_') {
                        System.out.println("------" + palabra.charAt(i));
                        bw5 = true;
                    }
                }
            }
            if (palabra.charAt(0) >= 48 && palabra.charAt(0) <= 57) {
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57) {
                        bw5 = true;
                        System.out.println("     " + palabra.charAt(i));
                    }
                }
            }
        }

        if (bw5) {
            if (palabra.equals(")")) {
                System.out.println("" + palabra);
                bw6 = true;
            }
        }
        if (bw6) {
            if (palabra.equals("{")) {
                bw7 = true;
            }
        }
        if (bw7) {
            if (palabra.equals("}")) {
                bw8 = true;
            }
        }
        return false;
    }
    boolean validar_if(String palabra) {
        System.out.println("" + palabra);
        if (!bw1) {
            for (int i = 0; i < DCiclos.length; i++) {
                if (palabra.equals(DCiclos[i])) {
                    bw1 = true;
                }
            }
        }
        if (bw1) {
            if (palabra.equals("(")) {
                System.out.println("" + palabra);
                bw2 = true;
            }
        }
        if (bw2) {

            if (palabra.charAt(0) >= 65 && palabra.charAt(0) <= 90
                    || palabra.charAt(0) >= 97 && palabra.charAt(0) <= 122) {
                System.out.println("" + palabra);
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) >= 65 && palabra.charAt(i) <= 90
                            || palabra.charAt(i) >= 97 && palabra.charAt(i) <= 122
                            || palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57
                            || palabra.charAt(i) == '_') {
                        System.out.println("------" + palabra.charAt(i));
                        bw3 = true;
                    }
                }
            }
        }
        if (bw3) {
            for (int i = 0; i < comparaciones.length; i++) {
                if (palabra.equals(comparaciones[i])) {
                    System.out.println("" + palabra);
                    bw4 = true;
                }

            }
        }
        if (bw4) {
            if (palabra.charAt(0) >= 65 && palabra.charAt(0) <= 90
                    || palabra.charAt(0) >= 97 && palabra.charAt(0) <= 122) {
                System.out.println("" + palabra);
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) >= 65 && palabra.charAt(i) <= 90
                            || palabra.charAt(i) >= 97 && palabra.charAt(i) <= 122
                            || palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57
                            || palabra.charAt(i) == '_') {
                        System.out.println("------" + palabra.charAt(i));
                        bw5 = true;
                    }
                }
            }
            if (palabra.charAt(0) >= 48 && palabra.charAt(0) <= 57) {
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57) {
                        bw5 = true;
                        System.out.println("     " + palabra.charAt(i));
                    }
                }
            }
        }

        if (bw5) {
            if (palabra.equals(")")) {
                System.out.println("" + palabra);
                bw6 = true;
            }
        }
        if (bw6) {
            if (palabra.equals("{")) {
                bw7 = true;
            }
        }
        if (bw7) {
            if (palabra.equals("}")) {
                bw8 = true;
            }
        }
        return false;
    }
    boolean validar_for(String palabra) {
        System.out.println("" + palabra);
        if (!bw1) {
            for (int i = 0; i < DCiclos.length; i++) {
                if (palabra.equals(DCiclos[i])) {
                    bw1 = true;
                }
            }
        }
        if (bw1) {
            if (palabra.equals("(")) {
                bw2 = true;
            }
        }
        if (bw2) {
            if (palabra.equals("Entero")) {
                bw3 = true;
            }
        }
        if (bw3) {
            if ((Pres(palabra) == false) && cot < 1) {
                if (palabra.charAt(0) >= 65 && palabra.charAt(0) <= 90 || palabra.charAt(0) >= 97 && palabra.charAt(0) <= 122) {
                    for (int i = 0; i < palabra.length(); i++) {
                        if (palabra.charAt(i) >= 65 && palabra.charAt(i) <= 90
                                || palabra.charAt(i) >= 97 && palabra.charAt(i) <= 122
                                || palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57
                                || palabra.charAt(i) == '_') {
                            System.out.println("4-" + palabra.charAt(i));
                            bw4 = true;
                            for_var = palabra;
                        } else {
                            System.out.println("4-" + palabra.charAt(i));
                            bw4 = false;
                            break;
                        }
                    }
                cot++;
                }
            }
        }
        if (bw4) {
            if (palabra.equals("=")) {
                System.out.println("5-" + palabra);
                bw5 = true;
            }
        }
        if (bw5) {
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) >47 && palabra.charAt(i) <58){
                    System.out.println("6-" + palabra.charAt(i));
                    bw6 = true;
                } else {
                    System.out.println("6e-" + palabra.charAt(i));
                    break;
                }
            }
        }
        if (bw6) {
            if (palabra.equals(";")) {
                System.out.println("7-" + palabra);
                bw7 = true;
            }
        }
        if (bw7) {            
            if (palabra.equals(for_var)) {
                System.out.println("8-" + palabra);
                bw8 = true;
            }
            else{
                System.out.println("8e-" + palabra);
            }
        }
        if (bw8) {
            for (int i = 0; i < comparaciones.length; i++) {
                if (palabra.equals(comparaciones[i])) {
                    System.out.println("9-" + palabra);
                    bw9 = true;
                }
            }
        }
        if (bw9) {
            if (palabra.charAt(0) >= 65 && palabra.charAt(0) <= 90
                    || palabra.charAt(0) >= 97 && palabra.charAt(0) <= 122) {
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) >= 65 && palabra.charAt(i) <= 90
                            || palabra.charAt(i) >= 97 && palabra.charAt(i) <= 122
                            || palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57
                            || palabra.charAt(i) == '_') {
                        System.out.println("10-" + palabra.charAt(i));
                        bw10 = true;
                    } else {
                        System.out.println("10-" + palabra.charAt(i));
                        bw10 = false;
                        break;
                    }
                }
            }
            if (palabra.charAt(0) >= 48 && palabra.charAt(0) <= 57) {
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57) {
                        System.out.println("10-" + palabra.charAt(i));
                        bw10 = true;
                    } else {
                        System.out.println("10-" + palabra.charAt(i));
                        bw10 = false;
                        break;
                    }
                }
            }
        }
        if (bw10) {
            if (palabra.equals(";")) {
                System.out.println("11-" + palabra);
                bw11 = true;
            }
        }
        if (bw11) {
            if (palabra.equals(for_var)){
                System.out.println("12-" + palabra);
                bw12 = true;
            }
        }
        if (bw12) {
            if (palabra.equals("++") || palabra.equals("--")) {
                System.out.println("13-" + palabra);
                bw13 = true;
            }
        }
        if (bw13) {
            if (palabra.equals(")")) {
                System.out.println("14-" + palabra);
                bw14 = true;
            }
        }
        if (bw14) {
            if (palabra.equals("{")) {
                System.out.println("15-" + palabra);
                bw15 = true;
            }
        }
        if (bw15) {
            if (palabra.equals("}")) {
                System.out.println("16-" + palabra);
                bw16 = true;
            }
        }
        return false;
    }
    boolean validar_dowhile(String palabra) {
        System.out.println("" + palabra);
        if (!bw1) {
            for (int i = 0; i < DCiclos.length; i++) {
                if (palabra.equals(DCiclos[i])) {
                    bw1 = true;
                }
            }
        }
        if (bw1) {
            if (palabra.equals("{")) {
                bw7 = true;
                bw2=true;
            }
        }
        if (bw2) {
            if (palabra.equals("}")) {
                bw8 = true;
                
            }
        }
        if (!bw3) {
            for (int i = 0; i < DCiclos.length; i++) {
                if (palabra.equals(DCiclos[i])) {
                    bw3 = true;
                }
            }
        }
        if (bw3) {
            if (palabra.equals("(")) {
                System.out.println("" + palabra);
                bw4 = true;
            }
        }
        if (bw4) {

            if (palabra.charAt(0) >= 65 && palabra.charAt(0) <= 90
                    || palabra.charAt(0) >= 97 && palabra.charAt(0) <= 122) {
                System.out.println("" + palabra);
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) >= 65 && palabra.charAt(i) <= 90
                            || palabra.charAt(i) >= 97 && palabra.charAt(i) <= 122
                            || palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57
                            || palabra.charAt(i) == '_') {
                        System.out.println("------" + palabra.charAt(i));
                        bw5 = true;
                    }
                }
            }
        }
        if (bw5) {
            for (int i = 0; i < comparaciones.length; i++) {
                if (palabra.equals(comparaciones[i])) {
                    System.out.println("" + palabra);
                    bw5 = true;
                }

            }
        }
        if (bw5) {
            if (palabra.charAt(0) >= 65 && palabra.charAt(0) <= 90
                    || palabra.charAt(0) >= 97 && palabra.charAt(0) <= 122) {
                System.out.println("" + palabra);
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) >= 65 && palabra.charAt(i) <= 90
                            || palabra.charAt(i) >= 97 && palabra.charAt(i) <= 122
                            || palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57
                            || palabra.charAt(i) == '_') {
                        System.out.println("------" + palabra.charAt(i));
                        bw6 = true;
                    }
                }
            }
            if (palabra.charAt(0) >= 48 && palabra.charAt(0) <= 57) {
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57) {
                        bw6 = true;
                        System.out.println("     " + palabra.charAt(i));
                    }
                }
            }
        }

        if (bw6) {
            if (palabra.equals(")")) {
                System.out.println("" + palabra);
                bw7 = true;
            }
        }
        if (bw7) {
            if (palabra.equals("{")) {
                bw8 = true;
            }
        }
        if (bw8) {
            if (palabra.equals("}")) {
                bw9 = true;
            }
        }
        return false;
    }
    void a(String palabra){
        ban1=false;
        igual=false;
        bx=false;
        String mat;       
       if (palabra.equals("Entero") && !tab) {
            indicador = 0;
            tab = true;
        }
        if (tab) {
            if (Pres(palabra) == false) {
                if (palabra.equals("=")){
                    igual=true;
                }
                if (palabra.equals("=") ||palabra.equals(",")||palabra.equals("#")){                    
                    bm1=true;
                }
                else{
                    for(int i = 0; i <matriz.length; i++) {
                        for (int j = 0; j <matriz[i].length; j++) {
                            mat=matriz[i][j];
                            if (palabra.equals(mat)) {
                                bx=true;
                                break;
                            }
                        }
                    }
                    if (!bx) {
                        if (Character.isDigit(palabra.charAt(0)) == false) {
                            System.out.println("Agregado--"+palabra);
                            matriz[indicador][ind_ent] = palabra;
                            ind_ent++;
                            mat="";  
                            
                        }
                        else if (igual && Character.isDigit(palabra.charAt(0)) == true) {
                            System.out.println("Agregado--"+palabra);
                            numeros[indicador][ind_ent] = palabra;
                            ind_ent++;
                            mat="";
                        }                        
                        else{
                            System.out.println("repetida "+palabra);    
                        }   
                    }
                    else{
                        System.out.println("repetida"+palabra);
                    }
                }
            }
            bx=false;
        }
        if (palabra.equals("Texto") && !tab2){
            indicador = 1;
            tab2 = true;
        }
        if (tab2) {

            if (Pres(palabra) == false) {
                if (palabra.equals(",") || palabra.equals("#") ) {
                } else {
                    
                    matriz[ind_tex][indicador] = palabra;
                    ind_tex++;
                }
            }     
        }
        
        if (palabra.equals("Doble") && !tab3) {
            indicador = 2;
            tab3 = true;
        }
        if (tab3) {
            if (Pres(palabra) == false) {
                if (palabra.equals(",") || palabra.equals("#") ) {
                } else {
                    matriz[indicador][ind_ent] = palabra;
                    ind_ent++;
                }
            }
        }
        
        if (palabra.equals("Caracter") && !tab4) {
            indicador = 3;
            tab4 = true;
        }
        if (tab4) {
            if (Pres(palabra) == false) {
                if (palabra.equals(",") || palabra.equals("#") ) {
                } else {
                    matriz[indicador][ind_ent] = palabra;
                    ind_ent++;
                }
            }
        }
        
    }
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
            java.util.logging.Logger.getLogger(Variables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Variables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Variables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Variables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Variables().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton foor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton metodo;
    private javax.swing.JButton si;
    private javax.swing.JTextArea t1;
    private javax.swing.JTextArea t2;
    private javax.swing.JButton var;
    private javax.swing.JButton whil;
    // End of variables declaration//GEN-END:variables
}

