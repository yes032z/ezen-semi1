/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.semi.view;

import com.semi.market.model.MarketDAO;
import com.semi.market.model.MarketService;
import com.semi.view.model.ViewDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ezen
 */
public class MarketMainGUI extends javax.swing.JFrame implements ActionListener{
    private MarketDAO marketDao;
    private DefaultTableModel model = new DefaultTableModel();
    private DefaultTableModel model2 = new DefaultTableModel();
    private String[] colNames={"상품 번호","카테고리","묘/견","상품명","가격","평점"};
    /**
     * Creates new form Market
     */
    public MarketMainGUI() {
        initComponents();
        
        init();
        addEvent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbpd = new javax.swing.JTable();
        btBasket = new javax.swing.JButton();
        tfProductName = new javax.swing.JTextField();
        cbType = new javax.swing.JComboBox<>();
        tfMinPrice = new javax.swing.JTextField();
        tfMaxPrice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btMydata = new javax.swing.JButton();
        btMarket = new javax.swing.JButton();
        btBoard = new javax.swing.JButton();
        btMain = new javax.swing.JButton();
        rbpd = new javax.swing.JRadioButton();
        rbprice = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("먹거리");

        tbpd.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbpd);

        btBasket.setText("장바구니");

        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "사료", "영양제", "간식" }));

        jLabel1.setText("~");

        btSearch.setText("검색");

        jLabel2.setText("구분");

        jLabel3.setText("가격");

        jLabel4.setText("상품이름 :");

        btMydata.setText("내 정보");

        btMarket.setBackground(new java.awt.Color(204, 255, 255));
        btMarket.setText("마켓");

        btBoard.setText("게시판");

        btMain.setText("홈");

        buttonGroup1.add(rbpd);
        rbpd.setText("상품명");

        buttonGroup1.add(rbprice);
        rbprice.setText("가격");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbpd)
                            .addComponent(rbprice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMinPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfMaxPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btMain, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btMarket, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btMydata, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBasket)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMydata, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMarket, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btMain, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbpd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfMinPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMaxPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearch)
                    .addComponent(btBasket)
                    .addComponent(rbprice)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
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
            java.util.logging.Logger.getLogger(MarketMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarketMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarketMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarketMainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarketMainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBasket;
    private javax.swing.JButton btBoard;
    private javax.swing.JButton btMain;
    private javax.swing.JButton btMarket;
    private javax.swing.JButton btMydata;
    private javax.swing.JButton btSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbpd;
    private javax.swing.JRadioButton rbprice;
    private javax.swing.JTable tbpd;
    private javax.swing.JTextField tfMaxPrice;
    private javax.swing.JTextField tfMinPrice;
    private javax.swing.JTextField tfProductName;
    // End of variables declaration//GEN-END:variables

    private void init() {
        marketDao=new MarketDAO();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        rbpd.setSelected(true);
    }

    private void addEvent() {
        btBasket.addActionListener(this);
        btBoard.addActionListener(this);
        btMain.addActionListener(this);
        btMydata.addActionListener(this);
        btSearch.addActionListener(this);
        tfProductName.addActionListener(this);
        tbpd.addMouseListener(new EventHandler());
    }
    
    class EventHandler extends MouseAdapter{

        @Override
        public void mousePressed(MouseEvent e) {
            int row=tbpd.getSelectedRow();
            Object objNo=tbpd.getValueAt(row, 0);
            String strNo=(String)objNo;
            
            if(strNo==null || strNo.isEmpty()){
                return;
            }
            int no=Integer.parseInt((String)objNo);
            
            MarketService.setPdno(no);
            MarketDetailGUI f = new MarketDetailGUI();
            f.show();
        }
        
    }
            
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btBasket){
            BasketGUI f= new BasketGUI();
            f.show();
        }else if(e.getSource()==btMain){
            this.dispose();
        }else if(e.getSource()==btBoard){
            BoarderGUI f =new BoarderGUI();
            f.show();
            this.dispose();
        }else if(e.getSource()==btMydata){
            MemberInfo f =new MemberInfo();
            f.show();
            this.dispose();
        }else if(e.getSource()==btSearch || e.getSource()==tfProductName){
            //상품명으로 검색
            if(rbpd.isSelected()){
                try {
                    showPdName();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }else if(rbprice.isSelected()){
                try {
                    showPrice();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    private void showPdName() throws SQLException {
        String pdcategory=(String)cbType.getSelectedItem();
        String pdname= tfProductName.getText();
        
        if(pdname==null || pdname.isEmpty()){
            JOptionPane.showMessageDialog(this, "상품명을 입력해주세요","입력",JOptionPane.YES_OPTION);
            tfProductName.requestFocus();
            return;
        }
                
        List<ViewDTO>list=marketDao.selectPdName(pdcategory,pdname);
        
        if(list==null || list.isEmpty()){
            JOptionPane.showMessageDialog(this, "해당 상품이 존재하지 않습니다.");
            return;
        }
        
        String[][] data=new String[list.size()][colNames.length];
        for(int i=0;i<list.size();i++){
            ViewDTO dto=list.get(i);
            
            data[i][0]=dto.getPdno()+"";
            data[i][1]=dto.getPdcategory();
            data[i][2]=dto.getCatdog();
            data[i][3]=dto.getPdName();
            data[i][4]=dto.getPrice()+"";
            data[i][5]=dto.getGrade()+"";
        }
        model.setDataVector(data, colNames);
        tbpd.setModel(model);
    }

    private void showPrice() throws SQLException {
        String minPrice=tfMinPrice.getText();
        String maxPrice=tfMaxPrice.getText();
        
        if(minPrice==null || minPrice.isEmpty()){
            minPrice="0";
        }
        if(maxPrice==null || maxPrice.isEmpty()){
            maxPrice=Integer.toString(Integer.MAX_VALUE);
        }
        
        List<ViewDTO> list=marketDao.selectPrice(Integer.parseInt(minPrice),Integer.parseInt(maxPrice));
        
        String[][] data=new String[list.size()][colNames.length];
        for(int i=0;i<list.size();i++){
            ViewDTO dto=list.get(i);
            
            data[i][0]=dto.getPdno()+"";
            data[i][1]=dto.getPdcategory();
            data[i][2]=dto.getCatdog();
            data[i][3]=dto.getPdName();
            data[i][4]=dto.getPrice()+"";
            data[i][5]=dto.getGrade()+"";
        }
        model.setDataVector(data, colNames);
        tbpd.setModel(model);
        
    }
    
}
