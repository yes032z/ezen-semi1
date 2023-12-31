/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.semi.view;

import com.semi.comments.model.CommentsDAO;
import com.semi.comments.model.CommentsDTO;
import com.semi.comments.model.CommentsService;
import com.semi.person.model.PersonService;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author yes03
 */
public class CoReCoDetails extends javax.swing.JFrame implements ActionListener{
    CommentsDTO dto;
    CommentsDAO commentsDao;
    
    /** Creates new form CoReCoDetails */
    public CoReCoDetails() {
        initComponents();
        
        init();
        addEvent();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNickName = new javax.swing.JLabel();
        lbRegdate = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbGoodCnt = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taBody = new javax.swing.JTextArea();
        btDelete = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btgood = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbNickName.setText("댓글/답글작성자닉");

        lbRegdate.setText("등록일");

        jLabel9.setText("좋아요 :");

        lbGoodCnt.setText("숫자");

        taBody.setColumns(20);
        taBody.setRows(5);
        jScrollPane3.setViewportView(taBody);

        btDelete.setText("삭제");

        btUpdate.setText("수정");

        btgood.setText("좋아요");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNickName)
                        .addGap(44, 44, 44)
                        .addComponent(lbRegdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbGoodCnt)
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btgood, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNickName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRegdate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbGoodCnt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btgood, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(CoReCoDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoReCoDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoReCoDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoReCoDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoReCoDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btUpdate;
    private javax.swing.JToggleButton btgood;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbGoodCnt;
    private javax.swing.JLabel lbNickName;
    private javax.swing.JLabel lbRegdate;
    private javax.swing.JTextArea taBody;
    // End of variables declaration//GEN-END:variables

    private void init() {
        dto=new CommentsDTO();
        commentsDao=new CommentsDAO();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        int no=CommentsService.getCono();
        String type=CommentsService.getType();
        try {
            if(type.trim().equals("")){ //댓글
                readCMDetail(no);
            }else if(type.trim().equals("답글 ▶▶▶")){ //답글
                readRCMDetail(no);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        String dtoNickname=dto.getNickname();
        String personNickname=PersonService.getNickname(); //사용자가 로그인한 닉네임
        
        if(dtoNickname.equals(personNickname)){
            btDelete.setVisible(true);
            btUpdate.setVisible(true);
            taBody.setEditable(true);
        }else{
            btDelete.setVisible(false);
            btUpdate.setVisible(false);
            taBody.setEditable(false);
        }
    }

    private void addEvent() {
        btUpdate.addActionListener(this);
        btDelete.addActionListener(this);
        btgood.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String type=CommentsService.getType();
        if(e.getSource()==btUpdate){
            try {
                if(type.trim().equals("")){ //댓글
                    editCM();
                }else if(type.trim().equals("답글 ▶▶▶")){ //답글
                    editRCM();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }else if(e.getSource()==btDelete){
            try {
                if(type.trim().equals("")){ //댓글
                    delCM(CommentsService.getCono());
                }else if(type.trim().equals("답글 ▶▶▶")){ //답글
                    delRCM(CommentsService.getCono());
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }else if(e.getSource()==btgood){
             try {
                if(type.trim().equals("")){ //댓글
                    upGoodCntCM();
                }else if(type.trim().equals("답글 ▶▶▶")){ //답글
                    upGoodCntRCM();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
    }

    private void readCMDetail(int no) throws SQLException {
        dto=commentsDao.detailReadCM(no);
      
        lbNickName.setText(dto.getNickname());
        lbGoodCnt.setText(dto.getCogood()+"");
        taBody.setText(dto.getCobody());
        lbRegdate.setText(dto.getCoregdate()+"");
    }

    private void readRCMDetail(int no) throws SQLException {
        dto=commentsDao.detailReadRCM(no);
        
        lbNickName.setText(dto.getNickname());
        lbGoodCnt.setText(dto.getCogood()+"");
        taBody.setText(dto.getCobody());
        lbRegdate.setText(dto.getCoregdate()+"");
    }

    private void editCM() throws SQLException {
        String cobody=taBody.getText();
        if(cobody==null || cobody.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "내용을 입력해야 합니다.");
        }
        dto.setCobody(cobody);
        int cnt=commentsDao.UpdateCM(dto);
            if(cnt>0) {
                JOptionPane.showMessageDialog(rootPane, "댓글 수정에 성공했습니다.");
                     dispose();
                     ReadBoardGUI readboardGui=new ReadBoardGUI();
                     readboardGui.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(rootPane, "댓글 수정에 실패했습니다.");
            }
    }

    private void editRCM() throws SQLException {
        String recobody=taBody.getText();
        if(recobody==null || recobody.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "내용을 입력해야 합니다.");
        }
        dto.setCobody(recobody);
        int cnt=commentsDao.UpdateRCM(dto);
        if(cnt>0) {
            JOptionPane.showMessageDialog(rootPane, "답글 수정에 성공했습니다.");
                dispose();
                ReadBoardGUI readboardGui=new ReadBoardGUI();
                readboardGui.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(rootPane, "답글 수정에 실패했습니다.");
        }
    }

    private void delCM(int no) throws SQLException {
        int type=JOptionPane.showConfirmDialog(this, "정말 삭제하시겠습니까?");
        if(type==JOptionPane.YES_OPTION) {
            int cnt=commentsDao.deleteCM(no);
            
            if(cnt>0) {
                JOptionPane.showMessageDialog(this, "댓글이 삭제되었습니다.");
                     dispose();
                     ReadBoardGUI readboardGui=new ReadBoardGUI();
                     readboardGui.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(this,"댓글 삭제에 실패했습니다.");
            }
        }
        
    }

    private void delRCM(int no) throws SQLException {
        int type=JOptionPane.showConfirmDialog(this, "정말 삭제하시겠습니까?");
        if(type==JOptionPane.YES_OPTION) {
            int cnt=commentsDao.deleteRCM(no);
            
            if(cnt>0) {
                JOptionPane.showMessageDialog(this, "답글이 삭제되었습니다.");
                     dispose();
                     ReadBoardGUI readboardGui=new ReadBoardGUI();
                     readboardGui.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(this,"답글 삭제에 실패했습니다.");
            }
        }
    }

    private void upGoodCntCM() throws SQLException {
        String dtoNickname=dto.getNickname();
        String personNickname=PersonService.getNickname();
        
        if(dtoNickname.equals(personNickname)){
            JOptionPane.showMessageDialog(this, "다른사람의 댓글만 추천 가능합니다.");
            return;
        }
        
        int cogood=Integer.parseInt(lbGoodCnt.getText());
        dto.setCogood(cogood);
        int cnt=commentsDao.UpdateCMGood(dto);
        if(cnt>0) {
            JOptionPane.showMessageDialog(this, "좋아요 완료!");
            dispose();
            ReadBoardGUI readBoardGui=new ReadBoardGUI();
            readBoardGui.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(this, "좋아요 실패..");
        }
        
    }

    private void upGoodCntRCM() throws SQLException {
        String dtoNickname=dto.getNickname();
        String personNickname=PersonService.getNickname();
        
        if(dtoNickname.equals(personNickname)){
            JOptionPane.showMessageDialog(this, "다른사람의 답글만 추천 가능합니다.");
            return;
        }
        
        int recogood=Integer.parseInt(lbGoodCnt.getText());
        dto.setCogood(recogood);
        int cnt=commentsDao.UpdateRCMGood(dto);
        if(cnt>0) {
            JOptionPane.showMessageDialog(this, "좋아요 완료!");
            dispose();
             ReadBoardGUI readBoardGui=new ReadBoardGUI();
            readBoardGui.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(this, "좋아요 실패..");
        }

    }

}
