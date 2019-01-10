package aautomatas2;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Separa_cadenas extends javax.swing.JFrame {

    String Reservadas[] = {"Entero", "Texto", "Doble", "Long", "Caracter"};
    String Metodo[] = {"procedimiento"};
    boolean be1 = false, be2 = false, be3 = false, be4 = false, be5 = false, be6 = false, met1 = false, met2 = false, met3 = false, met4 = false, met5 = false, met6 = false;
    boolean ban1 = false, ban2 = false, ban3 = false, ban4 = false, ban5 = false, ban6 = false;
    boolean tab=false,tab2=false,tab3=false,tab4=false;
    String matriz[][] = new String[4][10];
    int indicador = 0, ind_ent = 0, ind_tex = 0, ind_bol = 0, ind_do = 0;

    public Separa_cadenas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        areafuente = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        areamensaje = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        areafuente.setColumns(20);
        areafuente.setRows(5);
        jScrollPane1.setViewportView(areafuente);

        areamensaje.setColumns(20);
        areamensaje.setRows(5);
        jScrollPane3.setViewportView(areamensaje);

        jButton1.setText("Separar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Metodo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Lineas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jButton1)
                        .addGap(53, 53, 53)
                        .addComponent(jButton2)
                        .addGap(62, 62, 62)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String texto = areafuente.getText(), cad = "", aux;
        StringTokenizer token = new StringTokenizer(texto);
        LinkedList lista = new LinkedList();
        while (token.hasMoreTokens()) {
            aux = token.nextToken();
            cad += aux + "\n";
            lista.add(aux);
        }
        areamensaje.setText(cad);
        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            validar_dec_var(iter.next().toString());
        }
        System.out.println("be1=" + be1 + " be2=" + be2 + " be3=" + be3 + "");


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String texto = areafuente.getText(), cad = "", aux;
        StringTokenizer token = new StringTokenizer(texto);
        LinkedList lista = new LinkedList();
        while (token.hasMoreTokens()) {
            aux = token.nextToken();
            cad += aux + "\n";
            lista.add(aux);
        }
        areamensaje.setText(cad);
        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            validar_met(iter.next().toString());
        }
        System.out.println("met1=" + met1 + " met2=" + met2 + " met3=" + met3 + " met4=" + met4 + " met5=" + met5 + " met6=" + met6 + "");

    }//GEN-LAST:event_jButton2ActionPerformed
    boolean Pres(String p) {
        for (int i = 0; i < Reservadas.length; i++) {
            if (p.equals(Reservadas[i])) {
                return true;
            }
        }
        return false;
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String texto = areafuente.getText(), cad = "", aux;
        StringTokenizer token = new StringTokenizer(texto);
        LinkedList lista = new LinkedList();
        while (token.hasMoreTokens()) {
            aux = token.nextToken();
            cad += aux + "\n";
            lista.add(aux);
        }
        areamensaje.setText(cad);
        Iterator iter = lista.iterator();
        while (iter.hasNext()) {
            a(iter.next().toString());
        }
        String mat="";
        
        ///System.out.println("////////");
        for (int i = 0; i <4; i++) {
            for (int j = 0; j <10; j++) {
                mat+=""+matriz[j][i];
            }
            System.out.println("  "+mat);
            mat="";
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    void a(String palabra) {
        if (palabra.equals("Entero") && !tab) {
            indicador = 0;
            tab = true;
        }
        if (tab) {
            if (Pres(palabra) == false) {
                if (palabra.equals(",") || palabra.equals("#") ) {
                } else {
                    matriz[indicador][ind_ent] = palabra;
                    ind_ent++;
                }
            }
        }
        if (palabra.equals("Texto") && !tab2) {
            indicador = 1;
            tab2 = true;
        }
        if (tab2) {

            if (Pres(palabra) == false) {
                if (palabra.equals(",") || palabra.equals("#") ) {
                } else {
                    matriz[indicador][ind_tex] = palabra;
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


boolean validar_dec_var(String palabra) {
        if (!be1)//validar dato
        {
            for (int i = 0; i < Reservadas.length; i++) {
                if (palabra.equals(Reservadas[i])) {
                    be1 = true;
                }
            }
        }
        if (be1 && !be2) {

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(0) >= 97 && palabra.charAt(0) <= 122)///minusculas
                {
                    if (palabra.charAt(i) >= 97 && palabra.charAt(i) <= 122
                            || palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57
                            || ///numeros
                            palabra.charAt(i) == '_') {
                        be2 = true;
                    } else {
                        be2 = false;
                        break;
                    }

                } else {
                    be2 = false;
                    break;
                }
            }
        }
        if (be2) {
            if (palabra.equals(",")) {
                be2 = false;
            }
        }
        if (be2) {
            if (palabra.equals("=")) {
                be4 = true;
            }
        }
        if (be4) {
            if (palabra.charAt(0) >= 48 && palabra.charAt(0) <= 57) {

                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57) {
                        System.out.println(palabra.charAt(i));
                    } else {
                        be1 = false;
                        break;
                    }
                }
                be2 = true;
            } else {
                be4 = false;
                be5 = true;
            }
        }
        if (be2) {
            if (palabra.equals("#")) {
                be3 = true;
            }
        }

        return false;
    }

    boolean validar_met(String metodo) {
        if (!met1)//validar dato
        {
            for (int i = 0; i < Metodo.length; i++) {
                if (metodo.equals(Metodo[i])) {
                    met1 = true;
                }
            }
        }
        if (met1 && !met2) {

            for (int i = 0; i < metodo.length(); i++) {
                if (metodo.charAt(0) >= 65 && metodo.charAt(0) <= 90
                        || metodo.charAt(0) >= 97 && metodo.charAt(0) <= 122) {
                    if (metodo.charAt(i) >= 65 && metodo.charAt(i) <= 90
                            || metodo.charAt(i) >= 97 && metodo.charAt(i) <= 122
                            || metodo.charAt(i) >= 48 && metodo.charAt(i) <= 57
                            || metodo.charAt(i) == '_') {
                        met2 = true;
                    } else {
                        met2 = false;
                        break;
                    }

                } else {
                    met2 = false;
                    break;
                }
            }
        }

        if (met2) {
            if (metodo.equals("[")) {
                met3 = true;
            }
        }
        if (met3) {
            if (metodo.equals("]")) {
                met4 = true;
            }
        }

        if (met3 && met4) {
            for (int i = 0; i < Metodo.length; i++) {
                if (metodo.equals(Metodo[i])) {
                    met5 = true;
                }
            }
        }
        if (met5) {
            for (int i = 0; i < metodo.length(); i++) {
                if (metodo.charAt(0) >= 65 && metodo.charAt(0) <= 90
                        || metodo.charAt(0) >= 97 && metodo.charAt(0) <= 122) {
                    if (metodo.charAt(i) >= 65 && metodo.charAt(i) <= 90
                            || metodo.charAt(i) >= 97 && metodo.charAt(i) <= 122
                            || metodo.charAt(i) >= 48 && metodo.charAt(i) <= 57
                            || metodo.charAt(i) == '_') {
                        met6 = true;
                    } else {
                        met6 = false;
                        break;
                    }

                } else {
                    met6 = false;
                    break;
                }
            }
        }

        return false;
    }

    boolean validar_numero(String palabra) {
        if (!be1)//validar dato
        {
            for (int i = 0; i < Reservadas.length; i++) {
                if (palabra.equals(Reservadas[i])) {
                    ban1 = true;
                }
            }
        }
        if (ban1 && !ban2) {

            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(0) >= 97 && palabra.charAt(0) <= 122)///minusculas
                {
                    if (palabra.charAt(i) >= 97 && palabra.charAt(i) <= 122
                            || palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57
                            || ///numeros
                            palabra.charAt(i) == '_') {
                        ban2 = true;
                    } else {
                        ban2 = false;
                        break;
                    }

                } else {
                    ban2 = false;
                    break;
                }
            }
        }
        if (ban2) {
            if (palabra.equals(",")) {
                ban2 = false;
            }
        }
        if (ban2) {
            if (palabra.equals("=")) {
                ban4 = true;
            }
        }
        if (ban4) {
            if (palabra.charAt(0) >= 48 && palabra.charAt(0) <= 57) {

                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) >= 48 && palabra.charAt(i) <= 57) {
                        System.out.println(palabra.charAt(i));
                    } else {
                        ban1 = false;
                        break;
                    }
                }
                ban2 = true;
            } else {
                ban4 = false;
                ban5 = true;
            }
        }
        if (ban2) {
            if (palabra.equals("#")) {
                ban3 = true;
            }
        }

        return false;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Separa_cadenas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areafuente;
    private javax.swing.JTextArea areamensaje;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
