
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Pencere extends javax.swing.JFrame {

    /**
     * Creates new form Pencere
     */
    public Pencere() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jPanel5 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        secenek4 = new javax.swing.JCheckBox();
        secenek5 = new javax.swing.JCheckBox();
        secenek6 = new javax.swing.JCheckBox();
        secenek7 = new javax.swing.JCheckBox();
        Tasi = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setBackground(new java.awt.Color(204, 204, 204));
        jToggleButton1.setText("DOSYA SEÇ");
        jToggleButton1.setBorderPainted(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DosyaSec(evt);
            }
        });

        jToggleButton2.setBackground(new java.awt.Color(204, 204, 204));
        jToggleButton2.setText("TAŞINACAK DİZİN");
        jToggleButton2.setActionCommand("YeniKonum");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YeniYerSec(evt);
            }
        });

        jCheckBox1.setText("Şifrele");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Secenek1(evt);
            }
        });

        jCheckBox2.setText("Sıkıştır()Zip)");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Secenek2(evt);
            }
        });

        jCheckBox3.setText("Gizle");

        secenek4.setText("Sadece txt");
        secenek4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secenek4ActionPerformed(evt);
            }
        });

        secenek5.setText("Sadece png");
        secenek5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secenek5ActionPerformed(evt);
            }
        });

        secenek6.setText("Sadece pdf");
        secenek6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secenek6ActionPerformed(evt);
            }
        });

        secenek7.setText("Tüm Dosyalar");
        secenek7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secenek7ActionPerformed(evt);
            }
        });

        Tasi.setBackground(new java.awt.Color(204, 204, 204));
        Tasi.setText("TAŞI");
        Tasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(secenek5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(secenek4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(secenek6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tasi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secenek7))
                        .addGap(105, 105, 105))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(secenek4)
                            .addComponent(secenek7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(secenek5)
                            .addComponent(jCheckBox2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox3)
                            .addComponent(secenek6)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Tasi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );

        jList.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "SEÇİLEN DOSYA YOLLARI:" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private String dosyaYolu;
    private List<File> secilenDosyalar = new ArrayList<>();
    private File hedefDizin;

    
    private void Secenek2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Secenek2
        // TODO add your handling code here:
    }//GEN-LAST:event_Secenek2

    private void Secenek1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Secenek1
        // TODO add your handling code here:
    }//GEN-LAST:event_Secenek1

    private void secenek7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secenek7ActionPerformed

    if (secenek7.isSelected()) {
        // Checkbox işaretlendiğinde burası çalışır
        // Dosyaları taşımak için gerekli kodları ekleyin
        
        // Önce diğer checkbox'ları devre dışı bırakın
        secenek4.setEnabled(false);
        secenek5.setEnabled(false);
        secenek6.setEnabled(false);
    } else {
        // Checkbox işaretlenmediğinde burası çalışır
        // Diğer checkbox'ları tekrar etkinleştirin
        secenek4.setEnabled(true);
        secenek5.setEnabled(true);
        secenek6.setEnabled(true);
}

    }//GEN-LAST:event_secenek7ActionPerformed

    private void DosyaSec(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DosyaSec
         
        JFileChooser dosyaSecici = new JFileChooser();
    dosyaSecici.setMultiSelectionEnabled(true);

    int secim = dosyaSecici.showOpenDialog(null);

    if (secim == JFileChooser.APPROVE_OPTION) {
        File[] secilenDosyaArray = dosyaSecici.getSelectedFiles();
        secilenDosyalar.addAll(Arrays.asList(secilenDosyaArray));
        
        DefaultListModel<String> listModel = new DefaultListModel<>();
        for (File dosya : secilenDosyalar) {
            listModel.addElement(dosya.getAbsolutePath());
        }
        jList.setModel(listModel);
    }
            

    }//GEN-LAST:event_DosyaSec

    
    private void YeniYerSec(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YeniYerSec
    JFileChooser dosyaSecici = new JFileChooser();
    dosyaSecici.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); // Sadece dizin seçimine izin verir

    int secim = dosyaSecici.showOpenDialog(null);

    if (secim == JFileChooser.APPROVE_OPTION) {
        hedefDizin = dosyaSecici.getSelectedFile();
    }
    }//GEN-LAST:event_YeniYerSec

    private void TasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TasiActionPerformed
          if (!secilenDosyalar.isEmpty() && hedefDizin != null) {
        for (File dosya : secilenDosyalar) {
            try {
                Path kaynakDosya = dosya.toPath();
                Path hedefDosya = hedefDizin.toPath().resolve(kaynakDosya.getFileName());
                Files.move(kaynakDosya, hedefDosya, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Dosya taşıma işlemi sırasında bir hata oluştu: " + ex.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Dosyalar başarıyla taşındı.");
        // Taşıma işleminden sonra jList'i sıfırla
        DefaultListModel<String> emptyListModel = new DefaultListModel<>();
        jList.setModel(emptyListModel);
        secilenDosyalar.clear(); // secilenDosyalar listesini temizle
        hedefDizin = null; // hedefDizin'i sıfırla
        emptyListModel.addElement("LÜTFEN BİR DOSYA SEÇİN");
        jList.setModel(emptyListModel);
    } else {
        JOptionPane.showMessageDialog(null, "Lütfen dosya ve hedef dizin seçin.");
    }
    }//GEN-LAST:event_TasiActionPerformed

    private void secenek4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secenek4ActionPerformed
      DefaultListModel<String> listModel = new DefaultListModel<>();
      
      if (secenek4.isSelected()) {
        // Checkbox işaretlendiğinde burası çalışır
        // Dosyaları taşımak için gerekli kodları ekleyin
        // Önce diğer checkbox'ları devre dışı bırakın
        secenek5.setEnabled(false);
        secenek6.setEnabled(false);
        secenek7.setEnabled(false);
    } else {
        // Checkbox işaretlenmediğinde burası çalışır
        // Diğer checkbox'ları tekrar etkinleştirin
        secenek7.setEnabled(true); 
        secenek5.setEnabled(true);
        secenek6.setEnabled(true);
}
    for (File dosya : secilenDosyalar) {
        if (dosya.getName().toLowerCase().endsWith(".txt")) {
            listModel.addElement(dosya.getAbsolutePath());
        }
    }
    jList.setModel(listModel);
    }//GEN-LAST:event_secenek4ActionPerformed

    private void secenek5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secenek5ActionPerformed
    DefaultListModel<String> listModel = new DefaultListModel<>();
    
       if (secenek5.isSelected()) {
        // Checkbox işaretlendiğinde burası çalışır
        // Dosyaları taşımak için gerekli kodları ekleyin
        // Önce diğer checkbox'ları devre dışı bırakın
        secenek4.setEnabled(false);
        secenek6.setEnabled(false);
        secenek7.setEnabled(false);
    } else {
        // Checkbox işaretlenmediğinde burası çalışır
        // Diğer checkbox'ları tekrar etkinleştirin
        secenek4.setEnabled(true);
        secenek6.setEnabled(true);
        secenek7.setEnabled(true);  
}
    
    for (File dosya : secilenDosyalar) {
        if (dosya.getName().toLowerCase().endsWith(".png")) {
            listModel.addElement(dosya.getAbsolutePath());
        }
    }
    jList.setModel(listModel);
    }//GEN-LAST:event_secenek5ActionPerformed

    private void secenek6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secenek6ActionPerformed
    DefaultListModel<String> listModel = new DefaultListModel<>();
    
       if (secenek6.isSelected()) {
        // Checkbox işaretlendiğinde burası çalışır
        // Dosyaları taşımak için gerekli kodları ekleyin
        // Önce diğer checkbox'ları devre dışı bırakın
        secenek5.setEnabled(false);
        secenek4.setEnabled(false);
        secenek7.setEnabled(false);
    } else {
        // Checkbox işaretlenmediğinde burası çalışır
        // Diğer checkbox'ları tekrar etkinleştirin
        secenek5.setEnabled(true);
        secenek4.setEnabled(true);
        secenek7.setEnabled(true);  
}
       
    for (File dosya : secilenDosyalar) {
        if (dosya.getName().toLowerCase().endsWith(".pdf")) {
            listModel.addElement(dosya.getAbsolutePath());
        }
    }
    jList.setModel(listModel);
    }//GEN-LAST:event_secenek6ActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pencere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Pencere().setVisible(true);
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Tasi;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    public javax.swing.JList<String> jList;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    public javax.swing.JCheckBox secenek4;
    private javax.swing.JCheckBox secenek5;
    private javax.swing.JCheckBox secenek6;
    public javax.swing.JCheckBox secenek7;
    // End of variables declaration//GEN-END:variables

}