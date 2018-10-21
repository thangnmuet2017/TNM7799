package demodictionary;

import java.util.*;
import javax.swing.DefaultListModel;
import java.io.*;
import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class FrameDictionary extends javax.swing.JFrame {

    /**
     * Creates new form FrameDictionary
     */
    private DefaultListModel<String> mod;
    private Dictionary dictionary;
    private DictionaryCommandline commandline;
    private DictionaryManagement management;
    private ArrayList<Word> WordList; // luu tru danh sach cac tu tieng Anh
    
    VoiceManager voice_manager;
    Voice voice;
    
    public FrameDictionary() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        EnglishList = new javax.swing.JList<>();
        LabelTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ExplainPane = new javax.swing.JTextPane();
        TranslateButton = new javax.swing.JButton();
        SoundButton = new javax.swing.JButton();
        EnglishWordtxtField = new javax.swing.JTextField();
        labelSearch = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        ChangeButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary");
        setBackground(new java.awt.Color(153, 255, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        SearchField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        SearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SearchFieldKeyTyped(evt);
            }
        });

        EnglishList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        EnglishList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                EnglishListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(EnglishList);

        LabelTitle.setBackground(new java.awt.Color(204, 255, 204));
        LabelTitle.setFont(new java.awt.Font("Calibri", 1, 22)); // NOI18N
        LabelTitle.setForeground(new java.awt.Color(255, 0, 0));
        LabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitle.setText("Từ điển Anh Việt");
        LabelTitle.setOpaque(true);

        jScrollPane2.setViewportView(ExplainPane);

        TranslateButton.setText("Dịch");
        TranslateButton.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        TranslateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TranslateButtonMouseClicked(evt);
            }
        });

        SoundButton.setText("Phát âm");
        SoundButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SoundButtonMouseClicked(evt);
            }
        });

        EnglishWordtxtField.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N

        labelSearch.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        labelSearch.setText("Nhập từ muốn tra vào đây");
        labelSearch.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        AddButton.setText("Thêm từ");

        ChangeButton.setText("Sửa từ");

        ClearButton.setText("Xóa từ");

        UpdateButton.setText("Cập nhật");

        ExitButton.setText("Exit");

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demodictionary/DictDemo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelSearch))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(TranslateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(EnglishWordtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(ChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ExitButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(LabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(491, 491, 491)
                .addComponent(SoundButton))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(labelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnglishWordtxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TranslateButton))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddButton)
                    .addComponent(ChangeButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClearButton)
                    .addComponent(UpdateButton))
                .addGap(8, 8, 8)
                .addComponent(ExitButton))
            .addComponent(LabelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(SoundButton))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // tai du lieu tu tep len
        dictionary = new Dictionary();
        management = new DictionaryManagement();
        commandline = new DictionaryCommandline();
        management.insertFromFile(dictionary);
        WordList = new ArrayList<Word>();
        WordList = dictionary.getListDictionary();
        int dict_size = dictionary.getSize();
        mod = new DefaultListModel<String>();
        EnglishList.setModel(mod);
        for (int i = 0; i < dict_size; i++) {
            mod.addElement(dictionary.wordTargetAt(i));
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void SearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyTyped
        String search = SearchField.getText() + evt.getKeyChar();
        if (search.equals("")) {
            EnglishWordtxtField.setText("");
        }
        search = search.trim();
        Dictionary subDict = commandline.dictionarySearcher(dictionary, search);
        mod.removeAllElements(); // xoa het cac danh sach cu tren list;
        for (int i = 0; i < subDict.getSize(); i++) {
            mod.addElement(subDict.wordTargetAt(i));
        }
    }//GEN-LAST:event_SearchFieldKeyTyped

    private void TranslateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TranslateButtonMouseClicked
       String search = SearchField.getText();
       if (search.equals((""))) {
           JOptionPane.showMessageDialog(null, "Bạn chưa nhập vào từ!", "Warning", JOptionPane.WARNING_MESSAGE);
       }
       search = search.trim();
       String meaning = management.dictionaryLookup(dictionary, search);
       if (meaning == null) {
           JOptionPane.showMessageDialog(null, "Từ điển chưa có từ này!", "Warning", JOptionPane.ERROR_MESSAGE);
       }
       else {
           int index = DictionaryManagement.getWordIndex(dictionary, search);
           EnglishWordtxtField.setText(dictionary.wordTargetAt(index));
           ExplainPane.setText(meaning);
       }
    }//GEN-LAST:event_TranslateButtonMouseClicked

    private void EnglishListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_EnglishListValueChanged
        String search = SearchField.getText();
        search = search.trim();
        Dictionary subDict = commandline.dictionarySearcher(dictionary, search);
        if (!EnglishList.isSelectionEmpty()) {
            int index = EnglishList.getSelectedIndex();
            Word tmp_word = subDict.wordAt(index);
            ExplainPane.setText(tmp_word.getWord_explain());
            EnglishWordtxtField.setText(tmp_word.getWord_target());
        }
    }//GEN-LAST:event_EnglishListValueChanged

    private void SoundButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SoundButtonMouseClicked
        String soundString = EnglishWordtxtField.getText();
        System.setProperty("mbrola.base", "mbrola");
        voice_manager = VoiceManager.getInstance();
        voice = voice_manager.getVoice("mbrola_us1");
        voice.allocate();
        voice.speak(soundString);
    }//GEN-LAST:event_SoundButtonMouseClicked

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
            java.util.logging.Logger.getLogger(FrameDictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDictionary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDictionary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ChangeButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JList<String> EnglishList;
    private javax.swing.JTextField EnglishWordtxtField;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextPane ExplainPane;
    private javax.swing.JLabel LabelTitle;
    private javax.swing.JTextField SearchField;
    private javax.swing.JButton SoundButton;
    private javax.swing.JButton TranslateButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelSearch;
    // End of variables declaration//GEN-END:variables
}
