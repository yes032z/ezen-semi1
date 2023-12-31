/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.semi.view;

import com.semi.basket.model.BasketDAO;
import com.semi.market.model.MarketDAO;
import com.semi.market.model.MarketService;
import com.semi.orderdetails.model.OrderdetailsDAO;
import com.semi.orderdetails.model.OrderdetailsDTO;
import com.semi.orders.model.OrdersDAO;
import com.semi.orders.model.OrdersDTO;
import com.semi.pay.model.PayDAO;
import com.semi.pay.model.PayDTO;
import com.semi.person.model.PersonDAO;
import com.semi.person.model.PersonDTO;
import com.semi.person.model.PersonService;
import com.semi.view.model.ViewDTO;
import com.semi.zipcode.model.ZipcodeDAO;
import com.semi.zipcode.model.ZipcodeDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pjm02
 */
public class OrderGUI extends javax.swing.JFrame implements ActionListener, ItemListener{
    private String id=PersonService.getId();
    private PayDTO payDto;
    private PersonDTO personDto;
    private DefaultTableModel model=new DefaultTableModel();
    private List<Integer> listBasket;
    /** Creates new form OrderGUI */
    public OrderGUI() {
        initComponents();
        
        init();
        addEvent();
    }
    
    public OrderGUI(List<Integer> listBasket) {
        this();
        this.listBasket=listBasket;
        try {
            pdLoad2();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgroup = new javax.swing.ButtonGroup();
        btBuy = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfReceiver = new javax.swing.JTextField();
        tfHp = new javax.swing.JTextField();
        tfZipcodeno = new javax.swing.JTextField();
        btZipcode = new javax.swing.JButton();
        tfAddress1 = new javax.swing.JTextField();
        tfAddress2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfCardNo = new javax.swing.JTextField();
        tfCardCom = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPdList = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tfSumPrice = new javax.swing.JTextField();
        rbBasic = new javax.swing.JRadioButton();
        rbNew = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        btCardRegister = new javax.swing.JButton();
        tfExpiration = new javax.swing.JTextField();
        tfCvc = new javax.swing.JPasswordField();
        tfPayPwd = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("주문화면");

        btBuy.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        btBuy.setText("구매");

        jLabel3.setText("배송지 주소");

        jLabel5.setText("수령인");

        jLabel6.setText("연락처");

        btZipcode.setText("우편번호");

        jLabel4.setText("카드회사");

        jLabel7.setText("카드번호");

        jLabel8.setText("결제비밀번호");

        jLabel9.setText("CVC");

        jLabel10.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel10.setText("배송지");

        jLabel11.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel11.setText("결제정보");

        tbPdList.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbPdList);

        jLabel12.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel12.setText("상품목록");

        jLabel1.setText("총 주문금액");

        tfSumPrice.setEditable(false);

        rbgroup.add(rbBasic);
        rbBasic.setText("기본 배송지");

        rbgroup.add(rbNew);
        rbNew.setText("신규 배송지");

        jLabel2.setText("유효기간(MMYY)");

        btCardRegister.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        btCardRegister.setText("카드 등록");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfSumPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfHp, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbBasic)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbNew))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfCardCom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                        .addComponent(tfExpiration, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfCvc, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfPayPwd, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfCardNo, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfZipcodeno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btZipcode))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCardRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(342, 342, 342)
                                .addComponent(btBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfSumPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(rbBasic)
                    .addComponent(rbNew))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfReceiver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfZipcodeno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btZipcode))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfPayPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfCvc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfExpiration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfCardCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCardRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuy;
    private javax.swing.JButton btCardRegister;
    private javax.swing.JButton btZipcode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbBasic;
    private javax.swing.JRadioButton rbNew;
    private javax.swing.ButtonGroup rbgroup;
    private javax.swing.JTable tbPdList;
    public javax.swing.JTextField tfAddress1;
    private javax.swing.JTextField tfAddress2;
    public javax.swing.JTextField tfCardCom;
    public javax.swing.JTextField tfCardNo;
    public javax.swing.JPasswordField tfCvc;
    public javax.swing.JTextField tfExpiration;
    private javax.swing.JTextField tfHp;
    private javax.swing.JPasswordField tfPayPwd;
    private javax.swing.JTextField tfReceiver;
    public javax.swing.JTextField tfSumPrice;
    public javax.swing.JTextField tfZipcodeno;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        int sumPrice=MarketService.getPrice()*MarketService.getQty();
        tfSumPrice.setText(sumPrice+"");
        payDto=new PayDTO();
        rbBasic.setSelected(true);
        
        try {
            personLoad();
            cardLoad();
            if(listBasket==null || listBasket.size()==0){
                pdLoad();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }

    private void addEvent() {
        btBuy.addActionListener(this);
        btZipcode.addActionListener(this);
        rbBasic.addItemListener(this);
        rbNew.addItemListener(this);
        btCardRegister.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btBuy){
            try {
                if(listBasket!=null && listBasket.size()!=0){
                    pdChoiceBuy();
                    basketdel();
                }else{
                    pdBuy();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }else if(e.getSource()==btZipcode){
            ZipcodeGUI f = new ZipcodeGUI(this);
            f.show();
        }else if(e.getSource()==btCardRegister){
            Pay f = new Pay(this);
            f.show();
        }
    }
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==rbBasic){
            try {
                personLoad();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }else if(e.getSource()==rbNew){
            tfReceiver.setText("");
            tfHp.setText("");
            tfAddress1.setText("");
            tfZipcodeno.setText("");
            tfAddress2.setText("");
        }
    }

    private void personLoad() throws SQLException {
        
        PersonDAO personDao=new PersonDAO();
        personDto=personDao.memberLoad(id);
        
        int zipno=personDto.getZipno();
        ZipcodeDAO zipcodeDao=new ZipcodeDAO();
        
        ZipcodeDTO zipcodeDto=zipcodeDao.selectByZipno(zipno);
        
        
        String sido=zipcodeDto.getSido()+" ";
        String gugun=zipcodeDto.getGugun()+" ";
        String dong=zipcodeDto.getDong()+" ";
        String bunji=zipcodeDto.getStartbunji();
        String endBunji=zipcodeDto.getEndbunji();
        
        if(endBunji!=null && !endBunji.isEmpty()){
            bunji+=" ~ "+endBunji;
        }
        
        tfReceiver.setText(personDto.getName());
        tfHp.setText(personDto.getHp());
        tfZipcodeno.setText(zipcodeDto.getZipcodeno());
        tfAddress1.setText(sido+gugun+dong+bunji);
        tfAddress2.setText(personDto.getDetailaddress());
        
    }

    private void cardLoad() throws SQLException {
        
        PayDAO payDao=new PayDAO();
        payDto=payDao.payLoad(id);
        
        if(payDto!=null){
            tfCardNo.setText(payDto.getCardno());
            tfCardCom.setText(payDto.getCardcom());
            tfCvc.setText(payDto.getCvc()+"");
            tfExpiration.setText(payDto.getExpiration());
        }

    }

    private void pdLoad() throws SQLException{
            int pdno=MarketService.getPdno();
            
            MarketDAO marketDao = new MarketDAO();
            ViewDTO dto=marketDao.selectByPdNo(pdno);
            
            String[] colNames={"번호","상품명","수량","가격"};
            String[][] data = new String[1][colNames.length];
            for(int i=0;i<1;i++){
                data[0][0]=pdno+"";
                data[0][1]=dto.getPdName();
                data[0][2]=MarketService.getQty()+"";
                data[0][3]=dto.getPrice()+"";
            }
            model.setDataVector(data, colNames);
            tbPdList.setModel(model);
        }

        private void pdLoad2() throws SQLException {
            BasketDAO basketDao=new BasketDAO();
            int personno=PersonService.getPersonno();
            ViewDTO viewDto=null;
            
            List<ViewDTO> list=new ArrayList<>();
            for(int i=0;i<listBasket.size();i++){
                viewDto=basketDao.basketSelectChice(personno, listBasket.get(i));
                list.add(viewDto);
            }
            
            String[] colNames={"번호","상품명","수량","가격"};
            String[][] data = new String[list.size()][colNames.length];
            for(int i=0;i<list.size();i++){
                ViewDTO dto=list.get(i);
                
                data[i][0]=dto.getBasketno()+"";
                data[i][1]=dto.getPdName();
                data[i][2]=dto.getBasketqty()+"";
                data[i][3]=dto.getPrice()+"";
            }
            model.setDataVector(data, colNames);
            tbPdList.setModel(model);
        }

    private void basketdel() throws SQLException {
        int personno=PersonService.getPersonno();
        int cnt=0;
        BasketDAO basketDao= new BasketDAO();
        for(int i=0;i<listBasket.size();i++){
            cnt+=basketDao.deleteSelBasket(personno,listBasket.get(i));
        }
        
        if(cnt==listBasket.size()){
            System.out.println("장바구니 다중 선택 삭제 결과 cnt="+cnt);
        }else {
            System.out.println("삭제 실패");
        }
        
    }
    
    //1개 구매
    private void pdBuy() throws SQLException {
        int type=JOptionPane.showConfirmDialog(this, "구매하시겠습니까?","결제 여부 확인",JOptionPane.YES_NO_OPTION);
        if(type==JOptionPane.YES_OPTION){
            
            String pwd=payDto.getPaypassword();
            String userPwd=tfPayPwd.getText();
            
            if(!pwd.equals(userPwd)){
                JOptionPane.showMessageDialog(this, "비밀번호가 틀렸습니다.");
                return;
            }
            
            OrdersDTO ordersDto= new OrdersDTO();
            ordersDto.setOrderName(tfReceiver.getText());
            ordersDto.setPersonno(personDto.getPersonno());
            ordersDto.setOrderaddress(tfAddress2.getText());
            ordersDto.setZipno(personDto.getZipno());
            ordersDto.setOrderHp(tfHp.getText());
            
            OrdersDAO ordersDao = new OrdersDAO();
            int cnt=ordersDao.pdOrder(ordersDto);
            int orderno=ordersDao.findOrderNo(ordersDto);
            
            OrderdetailsDTO odDto=new OrderdetailsDTO();
            odDto.setOrderdtqty(MarketService.getQty());
            odDto.setPdno(MarketService.getPdno());
            odDto.setOrderno(orderno);
            
            OrderdetailsDAO odDao=new OrderdetailsDAO();
            
            int cnt2=odDao.insertPdDetail(odDto);
            
            if(cnt>0 || cnt2>0){
                JOptionPane.showMessageDialog(this, "구매가 완료되었습니다.");
                this.dispose();
                
            }else{
                JOptionPane.showMessageDialog(this, "구매 실패");
            }
        }
            
    }

    //장바구니 구매
    private void pdChoiceBuy() throws SQLException {
        int personno=PersonService.getPersonno();
        String receiver=tfReceiver.getText();
        String address2=tfAddress2.getText();
        int zipno=personDto.getZipno();
        String hp=tfHp.getText();
        String cardNo=tfCardNo.getText();
        
        int type=JOptionPane.showConfirmDialog(this, "구매하시겠습니까?","결제 여부 확인",JOptionPane.YES_NO_OPTION);
        if(type==JOptionPane.YES_OPTION){
            String sumPrice=tfSumPrice.getText();
            PayDAO payDao=new PayDAO();
            String pwd=payDao.findPwd(cardNo);
            String userPwd=tfPayPwd.getText();
            System.out.println("pwd="+pwd+", userPwd="+userPwd);
            
            if(!pwd.equals(userPwd)){
                JOptionPane.showMessageDialog(this, "비밀번호가 틀렸습니다.");
                return;
            }
            
            
            OrdersDTO ordersDto= new OrdersDTO();
            ordersDto.setOrderName(receiver);
            ordersDto.setPersonno(personno);
            ordersDto.setOrderaddress(address2);
            ordersDto.setZipno(zipno);
            ordersDto.setOrderHp(hp);
            
            OrdersDAO ordersDao = new OrdersDAO();
            int cnt=ordersDao.pdOrder(ordersDto);
            int orderno=ordersDao.findOrderNo(ordersDto);
            
            
            int cnt2=0;
            for(int i=0;i<listBasket.size();i++){
                BasketDAO basketDao=new BasketDAO();
                ViewDTO viewDto=basketDao.basketSelectChice(personno, listBasket.get(i));
                
                System.out.println("listBasket.size()="+listBasket.size()+", viewDto="+viewDto);
                
                OrderdetailsDTO odDto=new OrderdetailsDTO();
                odDto.setOrderdtqty(viewDto.getBasketqty());
                odDto.setPdno(viewDto.getPdno());
                odDto.setOrderno(orderno);
                
                OrderdetailsDAO odDao=new OrderdetailsDAO();
                
                System.out.println("odDto="+odDto);
                cnt2 +=odDao.insertPdDetail(odDto);
            }
            
            if(cnt>0 || cnt2==listBasket.size()){
                JOptionPane.showMessageDialog(this, "구매가 완료되었습니다.");
                this.dispose();
                
            }else{
                JOptionPane.showMessageDialog(this, "구매 실패");
            }
        }
        
    }
}
