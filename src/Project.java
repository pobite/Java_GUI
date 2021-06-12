import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Project {

   private JFrame frame;
   private JTextField txtSellerMode;
   private JTextField txtOrderList;
   private JTable table;
   private JTextField txtInventory;
   private JTable table_1;
   private JTextField txtMode;
   private JTextField txtMobile;
   private JTextField txtTablet;
   private JTextField txtLaptop;
   private JTextField txtAccessorie;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private JTextField textField_4;
   private JTextField textField_6;
   private JTextField textField_5;
   private JTextField txtOrderForm;
   private JTextField textField_3;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Project window = new Project();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public Project() {
      initialize();
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 813, 540);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);

      ImageIcon gi12 = new ImageIcon("gimages/iphone12.jpg");
      Image chgi12 = gi12.getImage();
      Image sGi12 = chgi12.getScaledInstance(172, 150,Image.SCALE_SMOOTH);
      ImageIcon gi12Icon = new ImageIcon(sGi12);

      ImageIcon gi12pro = new ImageIcon("gimages/iphone12pro.jpg");
      Image chgi12pro = gi12pro.getImage();
      Image sGi12pro = chgi12pro.getScaledInstance(172, 150,Image.SCALE_SMOOTH);
      ImageIcon gi12proIcon = new ImageIcon(sGi12pro);

      ImageIcon gi12mini = new ImageIcon("gimages/iphone12mini.jpg");
      Image chgi12mini = gi12mini.getImage();
      Image sGi12mini = chgi12mini.getScaledInstance(172, 150,Image.SCALE_SMOOTH);
      ImageIcon gi12miniIcon = new ImageIcon(sGi12mini);


      ImageIcon gip4 = new ImageIcon("gimages/ipadair4.jpg");
      Image chgip4 = gip4.getImage();
      Image sGip4 = chgip4.getScaledInstance(172, 150,Image.SCALE_SMOOTH);
      ImageIcon gip4Icon = new ImageIcon(sGip4);

      ImageIcon gip5 = new ImageIcon("gimages/ipadpro5.jpg");
      Image chgip5 = gip5.getImage();
      Image sGip5 = chgip5.getScaledInstance(172, 150,Image.SCALE_SMOOTH);
      ImageIcon gip5Icon = new ImageIcon(sGip5);


      ImageIcon gima = new ImageIcon("gimages/imacair.jpg");
      Image chgima = gima.getImage();
      Image sGima = chgima.getScaledInstance(172, 150,Image.SCALE_SMOOTH);
      ImageIcon gimaIcon = new ImageIcon(sGima);

      ImageIcon gimp = new ImageIcon("gimages/imacpro.jpg");
      Image chgimp = gimp.getImage();
      Image sGimp = chgimp.getScaledInstance(172, 150,Image.SCALE_SMOOTH);
      ImageIcon gimpIcon = new ImageIcon(sGimp);

      ImageIcon giear = new ImageIcon("gimages/iearphone.jpg");
      Image chgiear = giear.getImage();
      Image sGiear = chgiear.getScaledInstance(172, 150,Image.SCALE_SMOOTH);
      ImageIcon giearIcon = new ImageIcon(sGiear);

      ImageIcon giear2 = new ImageIcon("gimages/iearphonepro.jpg");
      Image chgiear2 = giear2.getImage();
      Image sGiear2 = chgiear2.getScaledInstance(172, 150,Image.SCALE_SMOOTH);
      ImageIcon giear2Icon = new ImageIcon(sGiear2);

      ImageIcon gikey = new ImageIcon("gimages/ikeyboard.jpg");
      Image chgikey = gikey.getImage();
      Image sGikey = chgikey.getScaledInstance(172, 150,Image.SCALE_SMOOTH);
      ImageIcon gikeyIcon = new ImageIcon(sGikey);

      ImageIcon gimou = new ImageIcon("gimages/imouse.jpg");
      Image chgimou = gimou.getImage();
      Image sGimou = chgimou.getScaledInstance(172, 150,Image.SCALE_SMOOTH);
      ImageIcon gimouIcon = new ImageIcon(sGimou);

      //주문 상세 정보 작성페이지
      JPanel order = new JPanel();
      order.setBounds(0, 0, 797, 501);
      frame.getContentPane().add(order);
      order.setLayout(null);
      order.setVisible(false);

      textField = new JTextField();
      textField.setFont(new Font("굴림", Font.PLAIN, 14));
      textField.setBounds(297, 187, 160, 31);
      order.add(textField);
      textField.setColumns(10);

      JLabel lblNewLabel_2 = new JLabel("Name");
      lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 14));
      lblNewLabel_2.setBounds(207, 186, 120, 33);
      order.add(lblNewLabel_2);

      JLabel lblNewLabel_2_1 = new JLabel("Number");
      lblNewLabel_2_1.setFont(new Font("굴림", Font.PLAIN, 14));
      lblNewLabel_2_1.setBounds(207, 229, 120, 33);
      order.add(lblNewLabel_2_1);

      textField_1 = new JTextField();
      textField_1.setFont(new Font("굴림", Font.PLAIN, 14));
      textField_1.setColumns(10);
      textField_1.setBounds(297, 230, 55, 31);
      order.add(textField_1);

      JLabel lblNewLabel_2_2 = new JLabel("Address");
      lblNewLabel_2_2.setFont(new Font("굴림", Font.PLAIN, 14));
      lblNewLabel_2_2.setBounds(207, 272, 120, 33);
      order.add(lblNewLabel_2_2);

      textField_2 = new JTextField();
      textField_2.setFont(new Font("굴림", Font.PLAIN, 14));
      textField_2.setColumns(10);
      textField_2.setBounds(297, 272, 310, 31);
      order.add(textField_2);

      JLabel lblNewLabel_2_4 = new JLabel("Email");
      lblNewLabel_2_4.setFont(new Font("굴림", Font.PLAIN, 14));
      lblNewLabel_2_4.setBounds(207, 315, 120, 33);
      order.add(lblNewLabel_2_4);

      textField_4 = new JTextField();
      textField_4.setColumns(10);
      textField_4.setBounds(297, 316, 265, 31);
      order.add(textField_4);

      textField_6 = new JTextField();
      textField_6.setFont(new Font("굴림", Font.PLAIN, 14));
      textField_6.setColumns(10);
      textField_6.setBounds(475, 230, 55, 31);
      order.add(textField_6);

      textField_5 = new JTextField();
      textField_5.setFont(new Font("굴림", Font.PLAIN, 14));
      textField_5.setColumns(10);
      textField_5.setBounds(386, 230, 55, 31);
      order.add(textField_5);

      JLabel lblNewLabel_3 = new JLabel("-");
      lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 15));
      lblNewLabel_3.setBounds(364, 238, 57, 15);
      order.add(lblNewLabel_3);

      JLabel lblNewLabel_3_1 = new JLabel("-");
      lblNewLabel_3_1.setFont(new Font("굴림", Font.PLAIN, 15));
      lblNewLabel_3_1.setBounds(453, 238, 57, 15);
      order.add(lblNewLabel_3_1);

      txtOrderForm = new JTextField();
      txtOrderForm.setText("ORDER FORM");
      txtOrderForm.setHorizontalAlignment(SwingConstants.CENTER);
      txtOrderForm.setFont(new Font("굴림", Font.PLAIN, 20));
      txtOrderForm.setColumns(10);
      txtOrderForm.setBackground(SystemColor.inactiveCaption);
      txtOrderForm.setBounds(63, 75, 669, 59);
      order.add(txtOrderForm);

      JButton btnNewButton_6 = new JButton("TO PAY");
      btnNewButton_6.setFont(new Font("굴림", Font.PLAIN, 16));
      btnNewButton_6.setBounds(320, 390, 137, 31);
      order.add(btnNewButton_6);
      
      
   
         //phone12 cutie 상세페이지
         JPanel phone1 = new JPanel();
         phone1.setBounds(0, 0, 800, 600);
         frame.getContentPane().add(phone1);

         ImageIcon gApplemini = new ImageIcon("gimages/iphone12mini.jpg");
         Image chGapplemini = gApplemini.getImage();
         Image sGapplemini = chGapplemini.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
         ImageIcon gAppleminiicon = new ImageIcon(sGapplemini);
         phone1.setLayout(null);
         JLabel gphoneCutie = new JLabel(gAppleminiicon);
         gphoneCutie.setBounds(72, 75, 300, 300);
         phone1.add(gphoneCutie);

         String [] colors1 = {"choose the color","Space Gray","Emerald Green","Bad Red"}; 
         JComboBox<String> color1 = new JComboBox<String>(colors1);
         color1.setBounds(568, 100, 107, 23);
         phone1.add(color1);

         String [] capacities1 = {"choose the capacity","64GB","256GB"}; 
         JComboBox<String> capacity1 = new JComboBox<String>(capacities1);
         capacity1.setBounds(568, 170, 107, 23);
         phone1.add(capacity1);

         String [] quantities1 = {"0","1","2","3","4","5","6","7","8","9","10"};
         JComboBox<String> quantity1 = new JComboBox<String>(quantities1);
         quantity1.setBounds(568, 240, 107, 23);
         phone1.add(quantity1);

         JLabel colorLabel1 = new JLabel("Color:");
         colorLabel1.setFont(new Font("굴림", Font.BOLD, 14));
         colorLabel1.setBounds(434, 102, 82, 15);
         phone1.add(colorLabel1);

         JLabel capacityLabel1 = new JLabel("Capacity:");
         capacityLabel1.setFont(new Font("굴림", Font.BOLD, 14));
         capacityLabel1.setBounds(434, 174, 82, 15);
         phone1.add(capacityLabel1);

         JLabel quantityLabel1 = new JLabel("Quantity:");
         quantityLabel1.setFont(new Font("굴림", Font.BOLD, 14));
         quantityLabel1.setBounds(434, 246, 82, 15);
         phone1.add(quantityLabel1);

         JLabel nameLabel1 = new JLabel("G-Phone 13 Cutie ");
         nameLabel1.setFont(new Font("한컴 고딕", Font.BOLD, 20));
         nameLabel1.setBounds(145, 370, 250, 80);
         phone1.add(nameLabel1);

         JButton orderBtn1 = new JButton("Order");
         orderBtn1.setBackground(SystemColor.text);
         orderBtn1.setForeground(SystemColor.desktop);
         orderBtn1.setFont(new Font("굴림", Font.BOLD, 18));
         orderBtn1.setBounds(459, 337, 176, 44);
         phone1.add(orderBtn1);
         orderBtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               phone1.setVisible(false);
               order.setVisible(true);
            }
         });
         phone1.setVisible(false);

         //phone12 standard 상세페이지
         JPanel phone2 = new JPanel();
         phone2.setBounds(0, 0, 800, 600);
         frame.getContentPane().add(phone2);

         ImageIcon gApple = new ImageIcon("gimages/iphone12.jpg");
         Image chGapple = gApple.getImage();
         Image sGapple = chGapple.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
         ImageIcon gAppleicon = new ImageIcon(sGapple);
         phone2.setLayout(null);
         JLabel gphoneStandard = new JLabel(gAppleicon);
         gphoneStandard.setBounds(72, 75, 300, 300);
         phone2.add(gphoneStandard);

         String [] colors2 = {"choose the color","Space Gray","Emerald Green","Bad Red","Woody Brown"}; 
         JComboBox<String> color2 = new JComboBox<String>(colors2);
         color2.setBounds(568, 100, 107, 23);
         phone2.add(color2);

         String [] capacities2 = {"choose the capacity","64GB","256GB","512GB"}; 
         JComboBox<String> capacity2 = new JComboBox<String>(capacities2);
         capacity2.setBounds(568, 170, 107, 23);
         phone2.add(capacity2);

         String [] quantities2 = {"0","1","2","3","4","5","6","7","8","9","10"};
         JComboBox<String> quantity2 = new JComboBox<String>(quantities2);
         quantity2.setBounds(568, 240, 107, 23);
         phone2.add(quantity2);

         JLabel colorLabel2 = new JLabel("Color:");
         colorLabel2.setFont(new Font("굴림", Font.BOLD, 14));
         colorLabel2.setBounds(434, 102, 82, 15);
         phone2.add(colorLabel2);

         JLabel capacityLabel2 = new JLabel("Capacity:");
         capacityLabel2.setFont(new Font("굴림", Font.BOLD, 14));
         capacityLabel2.setBounds(434, 174, 82, 15);
         phone2.add(capacityLabel2);

         JLabel quantityLabel2 = new JLabel("Quantity:");
         quantityLabel2.setFont(new Font("굴림", Font.BOLD, 14));
         quantityLabel2.setBounds(434, 246, 82, 15);
         phone2.add(quantityLabel2);

         JLabel nameLabel2 = new JLabel("G-Phone 13 Standard ");
         nameLabel2.setFont(new Font("한컴 고딕", Font.BOLD, 20));
         nameLabel2.setBounds(145, 370, 250, 80);
         phone2.add(nameLabel2);

         JButton orderBtn2 = new JButton("Order");
         orderBtn2.setBackground(SystemColor.text);
         orderBtn2.setForeground(SystemColor.desktop);
         orderBtn2.setFont(new Font("굴림", Font.BOLD, 18));
         orderBtn2.setBounds(459, 337, 176, 44);
         phone2.add(orderBtn2);
         orderBtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               phone2.setVisible(false);
               order.setVisible(true);
            }
         });
         phone2.setVisible(false);

         //phone12 pro 상세페이지
         JPanel phone3 = new JPanel();
         phone3.setBounds(0, 0, 800, 600);
         frame.getContentPane().add(phone3);

         ImageIcon gApplePro = new ImageIcon("gimages/iphone12pro.jpg");
         Image chGapplePro = gApplePro.getImage();
         Image sGapplePro = chGapplePro.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
         ImageIcon gAppleProicon = new ImageIcon(sGapplePro);
         phone3.setLayout(null);


         JLabel gphonePro = new JLabel(gAppleProicon);
         gphonePro.setBounds(72, 75, 300, 300);
         phone3.add(gphonePro);


         String [] colors = {"choose the color","Space Gray","Emerald Green","Bad Red","Woody Brown","Sunny Gold"}; 
         JComboBox<String> color = new JComboBox<String>(colors);
         color.setBounds(568, 100, 107, 23);
         phone3.add(color);

         String [] capacitys = {"choose the capacity","64GB","256GB","512GB","1TB"}; 
         JComboBox<String> capacity = new JComboBox<String>(capacitys);
         capacity.setBounds(568, 170, 107, 23);
         phone3.add(capacity);

         String [] quantities = {"0","1","2","3","4","5","6","7","8","9","10"};
         JComboBox<String> quantity = new JComboBox<String>(quantities);
         quantity.setBounds(568, 240, 107, 23);
         phone3.add(quantity);

         JLabel colorLabel = new JLabel("Color:");
         colorLabel.setFont(new Font("굴림", Font.BOLD, 14));
         colorLabel.setBounds(434, 102, 82, 15);
         phone3.add(colorLabel);

         JLabel capacityLabel = new JLabel("Capacity:");
         capacityLabel.setFont(new Font("굴림", Font.BOLD, 14));
         capacityLabel.setBounds(434, 174, 82, 15);
         phone3.add(capacityLabel);

         JLabel quantityLabel = new JLabel("Quantity:");
         quantityLabel.setFont(new Font("굴림", Font.BOLD, 14));
         quantityLabel.setBounds(434, 246, 82, 15);
         phone3.add(quantityLabel);

         JLabel nameLabel = new JLabel("G-Phone 13 Maximus ");
         nameLabel.setFont(new Font("한컴 고딕", Font.BOLD, 20));
         nameLabel.setBounds(145, 370, 250, 80);
         phone3.add(nameLabel);

         JButton orderBtn = new JButton("Order");
         orderBtn.setBackground(SystemColor.text);
         orderBtn.setForeground(SystemColor.desktop);
         orderBtn.setFont(new Font("굴림", Font.BOLD, 18));
         orderBtn.setBounds(459, 337, 176, 44);
         phone3.add(orderBtn);
         orderBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               phone3.setVisible(false);
               order.setVisible(true);
            }
         });
         phone3.setVisible(false);

        //ipad air 상세페이지
         JPanel pad1 = new JPanel();
         pad1.setBounds(0, 0, 800, 600);
         frame.getContentPane().add(pad1);

         ImageIcon gapplePad = new ImageIcon("gimages/ipadair4.jpg");
         Image chGpadAir = gapplePad.getImage();
         Image sGpadAir = chGpadAir.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
         ImageIcon gpadAiricon = new ImageIcon(sGpadAir);
         pad1.setLayout(null);
         JLabel gPadAir = new JLabel(gpadAiricon);
         gPadAir.setBounds(72, 75, 300, 300);
         pad1.add(gPadAir);

         String [] colors7 = {"choose the color","Space Gray","Silver","Woody Brown"}; 
         JComboBox<String> color7 = new JComboBox<String>(colors7);
         color7.setBounds(568, 100, 107, 23);
         pad1.add(color7);

         String [] capacities7 = {"choose the capacity","128GB","256GB"}; 
         JComboBox<String> capacity7 = new JComboBox<String>(capacities7);
         capacity7.setBounds(568, 170, 107, 23);
         pad1.add(capacity7);

         String [] quantities7 = {"0","1","2","3","4","5","6","7","8","9","10"};
         JComboBox<String> quantity7 = new JComboBox<String>(quantities7);
         quantity7.setBounds(568, 240, 107, 23);
         pad1.add(quantity7);

         JLabel colorLabel7 = new JLabel("Color:");
         colorLabel7.setFont(new Font("굴림", Font.BOLD, 14));
         colorLabel7.setBounds(434, 102, 82, 15);
         pad1.add(colorLabel7);

         JLabel capacityLabel7 = new JLabel("Capacity:");
         capacityLabel7.setFont(new Font("굴림", Font.BOLD, 14));
         capacityLabel7.setBounds(434, 174, 82, 15);
         pad1.add(capacityLabel7);

         JLabel quantityLabel7 = new JLabel("Quantity:");
         quantityLabel7.setFont(new Font("굴림", Font.BOLD, 14));
         quantityLabel7.setBounds(434, 246, 82, 15);
         pad1.add(quantityLabel7);

         JLabel nameLabel7 = new JLabel("GPad Air ");
         nameLabel7.setFont(new Font("한컴 고딕", Font.BOLD, 20));
         nameLabel7.setBounds(145, 370, 250, 80);
         pad1.add(nameLabel7);

         JButton orderBtn7 = new JButton("Order");
         orderBtn7.setBackground(SystemColor.text);
         orderBtn7.setForeground(SystemColor.desktop);
         orderBtn7.setFont(new Font("굴림", Font.BOLD, 18));
         orderBtn7.setBounds(459, 337, 176, 44);
         pad1.add(orderBtn7);
         orderBtn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               pad1.setVisible(false);
               order.setVisible(true);
            }
         });
         pad1.setVisible(false);

         //ipad pro 상세페이지
         JPanel pad2 = new JPanel();
         pad2.setBounds(0, 0, 800, 600);
         frame.getContentPane().add(pad2);

         ImageIcon gapplePadPro = new ImageIcon("gimages/ipadpro5.jpg");
         Image chGpadPro = gapplePadPro.getImage();
         Image sGpadPro = chGpadPro.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
         ImageIcon gpadProicon = new ImageIcon(sGpadPro);
         pad2.setLayout(null);
         JLabel gPadPro = new JLabel(gpadProicon);
         gPadPro.setBounds(72, 75, 300, 300);
         pad2.add(gPadPro);

         String [] colors6 = {"choose the color","Space Gray","Silver","Woody Brown"}; 
         JComboBox<String> color6 = new JComboBox<String>(colors6);
         color6.setBounds(568, 100, 107, 23);
         pad2.add(color6);

         String [] capacities6 = {"choose the capacity","1TB","2TB"}; 
         JComboBox<String> capacity6 = new JComboBox<String>(capacities6);
         capacity6.setBounds(568, 170, 107, 23);
         pad2.add(capacity6);

         String [] quantities6 = {"0","1","2","3","4","5","6","7","8","9","10"};
         JComboBox<String> quantity6 = new JComboBox<String>(quantities6);
         quantity6.setBounds(568, 240, 107, 23);
         pad2.add(quantity6);

         JLabel colorLabel6 = new JLabel("Color:");
         colorLabel6.setFont(new Font("굴림", Font.BOLD, 14));
         colorLabel6.setBounds(434, 102, 82, 15);
         pad2.add(colorLabel6);

         JLabel capacityLabel6 = new JLabel("Capacity:");
         capacityLabel6.setFont(new Font("굴림", Font.BOLD, 14));
         capacityLabel6.setBounds(434, 174, 82, 15);
         pad2.add(capacityLabel6);

         JLabel quantityLabel6 = new JLabel("Quantity:");
         quantityLabel6.setFont(new Font("굴림", Font.BOLD, 14));
         quantityLabel6.setBounds(434, 246, 82, 15);
         pad2.add(quantityLabel6);

         JLabel nameLabel6 = new JLabel("GPad Pro ");
         nameLabel6.setFont(new Font("한컴 고딕", Font.BOLD, 20));
         nameLabel6.setBounds(145, 370, 250, 80);
         pad2.add(nameLabel6);

         JButton orderBtn6 = new JButton("Order");
         orderBtn6.setBackground(SystemColor.text);
         orderBtn6.setForeground(SystemColor.desktop);
         orderBtn6.setFont(new Font("굴림", Font.BOLD, 18));
         orderBtn6.setBounds(459, 327, 176, 44);
         pad2.add(orderBtn6);
         orderBtn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               pad2.setVisible(false);
               order.setVisible(true);
            }
         });
         pad2.setVisible(false);

         //맥북 에어 상세페이지
         JPanel book1 = new JPanel();
         book1.setBounds(0, 0, 800, 600);
         frame.getContentPane().add(book1);

         ImageIcon gBook = new ImageIcon("gimages/imacair.jpg");
         Image chGbook = gBook.getImage();
         Image sGbook = chGbook.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
         ImageIcon gBookAiricon = new ImageIcon(sGbook);
         book1.setLayout(null);
         JLabel gBookAir = new JLabel(gBookAiricon);
         gBookAir.setBounds(72, 75, 300, 300);
         book1.add(gBookAir);

         String [] colors4 = {"choose the color","Space Gray","Silver","Sunny Gold"}; 
         JComboBox<String> color4 = new JComboBox<String>(colors4);
         color4.setBounds(568, 100, 107, 23);
         book1.add(color4);

         String [] capacities4 = {"choose the capacity","64GB","256GB"}; 
         JComboBox<String> capacity4 = new JComboBox<String>(capacities4);
         capacity4.setBounds(568, 170, 107, 23);
         book1.add(capacity4);

         String [] quantities4 = {"0","1","2","3","4","5","6","7","8","9","10"};
         JComboBox<String> quantity4 = new JComboBox<String>(quantities4);
         quantity4.setBounds(568, 240, 107, 23);
         book1.add(quantity4);

         JLabel colorLabel4 = new JLabel("Color:");
         colorLabel4.setFont(new Font("굴림", Font.BOLD, 14));
         colorLabel4.setBounds(434, 102, 82, 15);
         book1.add(colorLabel4);

         JLabel capacityLabel4 = new JLabel("Capacity:");
         capacityLabel4.setFont(new Font("굴림", Font.BOLD, 14));
         capacityLabel4.setBounds(434, 174, 82, 15);
         book1.add(capacityLabel4);

         JLabel quantityLabel4 = new JLabel("Quantity:");
         quantityLabel4.setFont(new Font("굴림", Font.BOLD, 14));
         quantityLabel4.setBounds(434, 246, 82, 15);
         book1.add(quantityLabel4);

         JLabel nameLabel4 = new JLabel("Gac Book Air ");
         nameLabel4.setFont(new Font("한컴 고딕", Font.BOLD, 20));
         nameLabel4.setBounds(145, 370, 250, 80);
         book1.add(nameLabel4);

         JButton orderBtn4 = new JButton("Order");
         orderBtn4.setBackground(SystemColor.text);
         orderBtn4.setForeground(SystemColor.desktop);
         orderBtn4.setFont(new Font("굴림", Font.BOLD, 18));
         orderBtn4.setBounds(459, 337, 176, 44);
         book1.add(orderBtn4);
         orderBtn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               book1.setVisible(false);
               order.setVisible(true);
            }
         });
         book1.setVisible(false);

         //맥북 프로 상세 페이지
         JPanel book2 = new JPanel();
         book2.setBounds(0, 0, 800, 600);
         frame.getContentPane().add(book2);

         ImageIcon gmacBook = new ImageIcon("gimages/imacpro.jpg");
         Image chGbookPro = gmacBook.getImage();
         Image sGbookPro = chGbookPro.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
         ImageIcon gBookProicon = new ImageIcon(sGbookPro);
         book2.setLayout(null);
         JLabel gBookPro = new JLabel(gBookProicon);
         gBookPro.setBounds(72, 75, 300, 300);
         book2.add(gBookPro);

         String [] colors5 = {"choose the color","Space Gray","Silver","Sunny Gold"}; 
         JComboBox<String> color5 = new JComboBox<String>(colors5);
         color5.setBounds(568, 100, 107, 23);
         book2.add(color5);

         String [] capacities5 = {"choose the capacity","1TB","2TB"}; 
         JComboBox<String> capacity5 = new JComboBox<String>(capacities5);
         capacity5.setBounds(568, 170, 107, 23);
         book2.add(capacity5);

         String [] quantities5 = {"0","1","2","3","4","5","6","7","8","9","10"};
         JComboBox<String> quantity5 = new JComboBox<String>(quantities5);
         quantity5.setBounds(568, 240, 107, 23);
         book2.add(quantity5);

         JLabel colorLabel5 = new JLabel("Color:");
         colorLabel5.setFont(new Font("굴림", Font.BOLD, 14));
         colorLabel5.setBounds(434, 102, 82, 15);
         book2.add(colorLabel5);

         JLabel capacityLabel5 = new JLabel("Capacity:");
         capacityLabel5.setFont(new Font("굴림", Font.BOLD, 14));
         capacityLabel5.setBounds(434, 174, 82, 15);
         book2.add(capacityLabel5);

         JLabel quantityLabel5 = new JLabel("Quantity:");
         quantityLabel5.setFont(new Font("굴림", Font.BOLD, 14));
         quantityLabel5.setBounds(434, 246, 82, 15);
         book2.add(quantityLabel5);

         JLabel nameLabel5 = new JLabel("Gac Book Pro ");
         nameLabel5.setFont(new Font("한컴 고딕", Font.BOLD, 20));
         nameLabel5.setBounds(145, 370, 250, 80);
         book2.add(nameLabel5);

         JButton orderBtn5 = new JButton("Order");
         orderBtn5.setBackground(SystemColor.text);
         orderBtn5.setForeground(SystemColor.desktop);
         orderBtn5.setFont(new Font("굴림", Font.BOLD, 18));
         orderBtn5.setBounds(459, 337, 176, 44);
         book2.add(orderBtn5);
         orderBtn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               book2.setVisible(false);
               order.setVisible(true);
            }
         });
         book2.setVisible(false);

         //에어팟 상세페이지
         JPanel pod1 = new JPanel();
         pod1.setBounds(0, 0, 800, 600);
         frame.getContentPane().add(pod1);

         ImageIcon gapplePod = new ImageIcon("gimages/iearphone.jpg");
         Image chGpod = gapplePod.getImage();
         Image sGpod = chGpod.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
         ImageIcon gpodicon = new ImageIcon(sGpod);
         pod1.setLayout(null);
         JLabel gPodStandard = new JLabel(gpodicon);
         gPodStandard.setBounds(72, 75, 300, 300);
         pod1.add(gPodStandard);

         String [] colors8 = {"choose the color","White"}; 
         JComboBox<String> color8 = new JComboBox<String>(colors8);
         color8.setBounds(568, 154, 107, 23);
         pod1.add(color8);

         String [] quantities8 = {"0","1","2","3","4","5","6","7","8","9","10"};
         JComboBox<String> quantity8 = new JComboBox<String>(quantities8);
         quantity8.setBounds(568, 220, 107, 23);
         pod1.add(quantity8);

         JLabel colorLabel8 = new JLabel("Color:");
         colorLabel8.setFont(new Font("굴림", Font.BOLD, 14));
         colorLabel8.setBounds(434, 154, 82, 15);
         pod1.add(colorLabel8);

         JLabel quantityLabel8 = new JLabel("Quantity:");
         quantityLabel8.setFont(new Font("굴림", Font.BOLD, 14));
         quantityLabel8.setBounds(434, 220, 82, 15);
         pod1.add(quantityLabel8);

         JLabel nameLabel8 = new JLabel("GPod Standard ");
         nameLabel8.setFont(new Font("한컴 고딕", Font.BOLD, 20));
         nameLabel8.setBounds(145, 370, 250, 80);
         pod1.add(nameLabel8);

         JButton orderBtn8 = new JButton("Order");
         orderBtn8.setBackground(SystemColor.text);
         orderBtn8.setForeground(SystemColor.desktop);
         orderBtn8.setFont(new Font("굴림", Font.BOLD, 18));
         orderBtn8.setBounds(459, 337, 176, 44);
         pod1.add(orderBtn8);
         orderBtn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               pod1.setVisible(false);
               order.setVisible(true);
            }
         });
         pod1.setVisible(false);

         //에어팟 프로 상세페이지
         JPanel pod2 = new JPanel();
         pod2.setBounds(0, 0, 800, 600);
         frame.getContentPane().add(pod2);

         ImageIcon gapplePodPro = new ImageIcon("gimages/iearphonepro.jpg");
         Image chGpodPro = gapplePodPro.getImage();
         Image sGpodPro = chGpodPro.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
         ImageIcon gpodProicon = new ImageIcon(sGpodPro);
         pod2.setLayout(null);
         JLabel gPodPro = new JLabel(gpodProicon);
         gPodPro.setBounds(72, 75, 300, 300);
         pod2.add(gPodPro);

         String [] colors9 = {"choose the color","White"}; 
         JComboBox<String> color9 = new JComboBox<String>(colors9);
         color9.setBounds(568, 154, 107, 23);
         pod2.add(color9);

         String [] quantities9 = {"0","1","2","3","4","5","6","7","8","9","10"};
         JComboBox<String> quantity9 = new JComboBox<String>(quantities9);
         quantity9.setBounds(568, 220, 107, 23);
         pod2.add(quantity9);

         JLabel colorLabel9 = new JLabel("Color:");
         colorLabel9.setFont(new Font("굴림", Font.BOLD, 14));
         colorLabel9.setBounds(434, 154, 82, 15);
         pod2.add(colorLabel9);


         JLabel quantityLabel9 = new JLabel("Quantity:");
         quantityLabel9.setFont(new Font("굴림", Font.BOLD, 14));
         quantityLabel9.setBounds(434, 220, 82, 15);
         pod2.add(quantityLabel9);

         JLabel nameLabel9 = new JLabel("GPod Pro ");
         nameLabel9.setFont(new Font("한컴 고딕", Font.BOLD, 20));
         nameLabel9.setBounds(145, 370, 250, 80);
         pod2.add(nameLabel9);

         JButton orderBtn9 = new JButton("Order");
         orderBtn9.setBackground(SystemColor.text);
         orderBtn9.setForeground(SystemColor.desktop);
         orderBtn9.setFont(new Font("굴림", Font.BOLD, 18));
         orderBtn9.setBounds(459, 337, 176, 44);
         pod2.add(orderBtn9);
         orderBtn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               pod2.setVisible(false);
               order.setVisible(true);
            }
         });
         pod2.setVisible(false);

         //마우스 상세페이지
         JPanel mouse = new JPanel();
         mouse.setBounds(0, 0, 800, 600);
         frame.getContentPane().add(mouse);

         ImageIcon gapplemouse = new ImageIcon("gimages/imouse.jpg");
         Image chGmouse = gapplemouse.getImage();
         Image sGmouse = chGmouse.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
         ImageIcon gmouseicon = new ImageIcon(sGmouse);
         mouse.setLayout(null);
         JLabel gMouse = new JLabel(gmouseicon);
         gMouse.setBounds(72, 75, 300, 300);
         mouse.add(gMouse);

         String [] colors10 = {"choose the color","White"}; 
         JComboBox<String> color10 = new JComboBox<String>(colors10);
         color10.setBounds(568, 154, 107, 23);
         mouse.add(color10);

         String [] quantities10 = {"0","1","2","3","4","5","6","7","8","9","10"};
         JComboBox<String> quantity10 = new JComboBox<String>(quantities10);
         quantity10.setBounds(568, 220, 107, 23);
         mouse.add(quantity10);

         JLabel colorLabel10 = new JLabel("Color:");
         colorLabel10.setFont(new Font("굴림", Font.BOLD, 14));
         colorLabel10.setBounds(434, 154, 82, 15);
         mouse.add(colorLabel10);


         JLabel quantityLabel10 = new JLabel("Quantity:");
         quantityLabel10.setFont(new Font("굴림", Font.BOLD, 14));
         quantityLabel10.setBounds(434, 220, 82, 15);
         mouse.add(quantityLabel10);

         JLabel nameLabel10 = new JLabel("G-Mouse ");
         nameLabel10.setFont(new Font("한컴 고딕", Font.BOLD, 20));
         nameLabel10.setBounds(145, 370, 250, 80);
         mouse.add(nameLabel10);

         JButton orderBtn10 = new JButton("Order");
         orderBtn10.setBackground(SystemColor.text);
         orderBtn10.setForeground(SystemColor.desktop);
         orderBtn10.setFont(new Font("굴림", Font.BOLD, 18));
         orderBtn10.setBounds(459, 337, 176, 44);
         mouse.add(orderBtn10);
         orderBtn10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               mouse.setVisible(false);
               order.setVisible(true);
            }
         });
         mouse.setVisible(false);

         //키보드 상세페이지
         JPanel keyboard = new JPanel();
         keyboard.setBounds(0, 0, 800, 600);
         frame.getContentPane().add(keyboard);

         ImageIcon gapplekeyboard = new ImageIcon("gimages/ikeyboard.jpg");
         Image chGkeyboard = gapplekeyboard.getImage();
         Image sGkeyboard = chGkeyboard.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
         ImageIcon gkeyboardicon = new ImageIcon(sGkeyboard);
         keyboard.setLayout(null);
         JLabel gKeyboard = new JLabel(gkeyboardicon);
         gKeyboard.setBounds(72, 75, 300, 300);
         keyboard.add(gKeyboard);

         String [] colors11 = {"choose the color","White"}; 
         JComboBox<String> color11 = new JComboBox<String>(colors11);
         color11.setBounds(568, 154, 107, 23);
         keyboard.add(color11);

         String [] quantities11 = {"0","1","2","3","4","5","6","7","8","9","10"};
         JComboBox<String> quantity11 = new JComboBox<String>(quantities11);
         quantity11.setBounds(568, 220, 107, 23);
         keyboard.add(quantity11);

         JLabel colorLabel11 = new JLabel("Color:");
         colorLabel11.setFont(new Font("굴림", Font.BOLD, 14));
         colorLabel11.setBounds(434, 174, 82, 15);
         keyboard.add(colorLabel11);


         JLabel quantityLabel11 = new JLabel("Quantity:");
         quantityLabel11.setFont(new Font("굴림", Font.BOLD, 14));
         quantityLabel11.setBounds(434, 246, 82, 15);
         keyboard.add(quantityLabel11);

         JLabel nameLabel11 = new JLabel("G-Keyboard ");
         nameLabel11.setFont(new Font("한컴 고딕", Font.BOLD, 20));
         nameLabel11.setBounds(145, 370, 250, 80);
         keyboard.add(nameLabel11);

         JButton orderBtn11 = new JButton("Order");
         orderBtn11.setBackground(SystemColor.text);
         orderBtn11.setForeground(SystemColor.desktop);
         orderBtn11.setFont(new Font("굴림", Font.BOLD, 18));
         orderBtn11.setBounds(459, 337, 176, 44);
         keyboard.add(orderBtn11);
         orderBtn11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               keyboard.setVisible(false);
               order.setVisible(true);
            }
         });
         keyboard.setVisible(false);

      //악세사리 메뉴 페이지
      JPanel accessorie = new JPanel();
      accessorie.setBounds(0, 0, 797, 501);
      frame.getContentPane().add(accessorie);
      accessorie.setLayout(null);
      accessorie.setVisible(false);

      txtAccessorie = new JTextField();
      txtAccessorie.setText("ACCESSORIE");
      txtAccessorie.setHorizontalAlignment(SwingConstants.CENTER);
      txtAccessorie.setFont(new Font("굴림", Font.PLAIN, 20));
      txtAccessorie.setColumns(10);
      txtAccessorie.setBackground(SystemColor.inactiveCaption);
      txtAccessorie.setBounds(64, 74, 669, 59);
      accessorie.add(txtAccessorie);

      JButton btnNewButton_5_3_1_1 = new JButton("G-AIRPODS PRO");
      btnNewButton_5_3_1_1.setBounds(240, 364, 142, 41);
      accessorie.add(btnNewButton_5_3_1_1);
      btnNewButton_5_3_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            accessorie.setVisible(false);
            pod2.setVisible(true);
         }
      });

      JButton btnNewButton_5_1_1_1_1 = new JButton("G-KEYBOARD");
      btnNewButton_5_1_1_1_1.setBounds(411, 364, 140, 41);
      accessorie.add(btnNewButton_5_1_1_1_1);
      btnNewButton_5_1_1_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            accessorie.setVisible(false);
            keyboard.setVisible(true);
         }
      });

      JButton btnNewButton_5_2_1_1_1 = new JButton("G-MOUSE");
      btnNewButton_5_2_1_1_1.setBounds(580, 364, 153, 41);
      accessorie.add(btnNewButton_5_2_1_1_1);
      btnNewButton_5_2_1_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            accessorie.setVisible(false);
            mouse.setVisible(true);
         }
      });
      
      JButton btnNewButton_8 = new JButton("G-AIRPODS");
      btnNewButton_8.setBounds(64, 364, 142, 41);
      btnNewButton_8.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            accessorie.setVisible(false);
            pod1.setVisible(true);
         }
      });
      accessorie.add(btnNewButton_8);

      JLabel lblNewLabel_9 = new JLabel(giearIcon);
      lblNewLabel_9.setBounds(65, 196, 141, 150);
      accessorie.add(lblNewLabel_9);

      JLabel lblNewLabel_10 = new JLabel(gikeyIcon);
      lblNewLabel_10.setBounds(412, 196, 139, 150);
      accessorie.add(lblNewLabel_10);

      JLabel lblNewLabel_11 = new JLabel(gimouIcon);
      lblNewLabel_11.setBounds(581, 196, 152, 150);
      accessorie.add(lblNewLabel_11);

      JLabel lblNewLabel_12 = new JLabel(giear2Icon);
      lblNewLabel_12.setBounds(240, 196, 142, 150);
      accessorie.add(lblNewLabel_12);

      //컴퓨터 메뉴 페이지
      JPanel labtop = new JPanel();
      labtop.setBounds(0, 0, 797, 501);
      frame.getContentPane().add(labtop);
      labtop.setLayout(null);
      labtop.setVisible(false);

      txtLaptop = new JTextField();
      txtLaptop.setText("LAPTOP");
      txtLaptop.setHorizontalAlignment(SwingConstants.CENTER);
      txtLaptop.setFont(new Font("굴림", Font.PLAIN, 20));
      txtLaptop.setColumns(10);
      txtLaptop.setBackground(SystemColor.inactiveCaption);
      txtLaptop.setBounds(63, 75, 669, 59);
      labtop.add(txtLaptop);

      JButton btnNewButton_5_1_1_1 = new JButton("G-IMAC AIR");
      btnNewButton_5_1_1_1.setBounds(169, 365, 172, 41);
      labtop.add(btnNewButton_5_1_1_1);
      btnNewButton_5_1_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            labtop.setVisible(false);
            book1.setVisible(true);
         }
      });

      JButton btnNewButton_5_2_1_1 = new JButton("G-IMAC PRO");
      btnNewButton_5_2_1_1.setBounds(464, 365, 172, 41);
      labtop.add(btnNewButton_5_2_1_1);
      btnNewButton_5_2_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            labtop.setVisible(false);
            book2.setVisible(true);
         }
      });

      JLabel lblNewLabel_7 = new JLabel(gimaIcon);
      lblNewLabel_7.setBounds(169, 196, 172, 150);
      labtop.add(lblNewLabel_7);

      JLabel lblNewLabel_8 = new JLabel(gimpIcon);
      lblNewLabel_8.setBounds(464, 196, 172, 150);
      labtop.add(lblNewLabel_8);

      //태블릿 메뉴페이지
      JPanel tablet = new JPanel();
      tablet.setBounds(0, 0, 797, 501);
      frame.getContentPane().add(tablet);
      tablet.setLayout(null);
      tablet.setVisible(false);

      txtTablet = new JTextField();
      txtTablet.setText("TABLET");
      txtTablet.setHorizontalAlignment(SwingConstants.CENTER);
      txtTablet.setFont(new Font("굴림", Font.PLAIN, 20));
      txtTablet.setColumns(10);
      txtTablet.setBackground(SystemColor.inactiveCaption);
      txtTablet.setBounds(65, 74, 669, 59);
      tablet.add(txtTablet);

      JButton btnNewButton_5_1_1 = new JButton("G-IPAD AIR 4");
      btnNewButton_5_1_1.setBounds(169, 364, 172, 41);
      tablet.add(btnNewButton_5_1_1);
      btnNewButton_5_1_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            tablet.setVisible(false);
            pad1.setVisible(true);
         }
      });

      JButton btnNewButton_5_2_1 = new JButton("G-IPAD PRO 5");
      btnNewButton_5_2_1.setBounds(464, 364, 172, 41);
      tablet.add(btnNewButton_5_2_1);
      btnNewButton_5_2_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            tablet.setVisible(false);
            pad2.setVisible(true);
         }
      });

      JLabel lblNewLabel_1_4 = new JLabel(gip4Icon);
      lblNewLabel_1_4.setBounds(169, 196, 172, 150);
      tablet.add(lblNewLabel_1_4);

      JLabel lblNewLabel_1_5 = new JLabel(gip5Icon);
      lblNewLabel_1_5.setBounds(464, 196, 172, 150);
      tablet.add(lblNewLabel_1_5);

      //핸드폰 메뉴 페이지
      JPanel mobile = new JPanel();
      mobile.setBounds(0, 0, 797, 501);
      frame.getContentPane().add(mobile);
      mobile.setLayout(null);
      mobile.setVisible(false);

      txtMobile = new JTextField();
      txtMobile.setText("MOBILE");
      txtMobile.setHorizontalAlignment(SwingConstants.CENTER);
      txtMobile.setFont(new Font("굴림", Font.PLAIN, 20));
      txtMobile.setColumns(10);
      txtMobile.setBackground(SystemColor.inactiveCaption);
      txtMobile.setBounds(65, 74, 669, 59);
      mobile.add(txtMobile);

      JButton btnNewButton_5 = new JButton("G-IPHONE 12");
      btnNewButton_5.setBounds(84, 364, 172, 41);
      mobile.add(btnNewButton_5);
      btnNewButton_5.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mobile.setVisible(false);
            phone2.setVisible(true);
         }
      });

      JButton btnNewButton_5_1 = new JButton("G-IPHONE 12 PRO");
      btnNewButton_5_1.setBounds(311, 364, 172, 41);
      mobile.add(btnNewButton_5_1);
      btnNewButton_5_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mobile.setVisible(false);
            phone3.setVisible(true);
         }
      });

      JButton btnNewButton_5_2 = new JButton("G-IPHONE 12 MINI");
      btnNewButton_5_2.setBounds(537, 364, 172, 41);
      mobile.add(btnNewButton_5_2);
      btnNewButton_5_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mobile.setVisible(false);
            phone1.setVisible(true);
         }
      });
      
      
      JLabel lblNewLabel_1 = new JLabel(gi12Icon);
      lblNewLabel_1.setBounds(84, 169, 172, 150);
      mobile.add(lblNewLabel_1);
      JLabel lblNewLabel_1_1 = new JLabel(gi12proIcon);
      lblNewLabel_1_1.setBounds(311, 169, 172, 150);
      mobile.add(lblNewLabel_1_1);
      JLabel lblNewLabel_1_2 = new JLabel(gi12miniIcon);
      lblNewLabel_1_2.setBounds(537, 169, 172, 150);
      mobile.add(lblNewLabel_1_2);
      
      //유저전용 메뉴 페이지
      JPanel menu = new JPanel();
      menu.setForeground(SystemColor.desktop);
      menu.setBounds(0, 0, 797, 501);
      frame.getContentPane().add(menu);
      menu.setLayout(null);
      menu.setVisible(false);


      JButton btnNewButton_7 = new JButton("MOBLIE");
      btnNewButton_7.setBounds(91, 215, 136, 222);
      menu.add(btnNewButton_7);
      btnNewButton_7.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            menu.setVisible(false);
            mobile.setVisible(true);
         }
      });

      JButton btnNewButton_7_1 = new JButton("TABLET");
      btnNewButton_7_1.setBounds(252, 215, 136, 222);
      menu.add(btnNewButton_7_1);
      btnNewButton_7_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            menu.setVisible(false);
            tablet.setVisible(true);
         }
      });

      JButton btnNewButton_7_2 = new JButton("LABTOP");
      btnNewButton_7_2.setBounds(415, 215, 136, 222);
      menu.add(btnNewButton_7_2);
      btnNewButton_7_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            menu.setVisible(false);
            labtop.setVisible(true);
         }
      });

      JButton btnNewButton_7_3 = new JButton("ACCESSORIE");
      btnNewButton_7_3.setBounds(577, 215, 136, 222);
      menu.add(btnNewButton_7_3);
      btnNewButton_7_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            menu.setVisible(false);
            accessorie.setVisible(true);
         }
      });

      textField_3 = new JTextField();
      textField_3.setText("ACCESSORIE");
      textField_3.setHorizontalAlignment(SwingConstants.CENTER);
      textField_3.setFont(new Font("굴림", Font.PLAIN, 20));
      textField_3.setColumns(10);
      textField_3.setBackground(SystemColor.inactiveCaption);
      textField_3.setBounds(64, 74, 669, 59);
      menu.add(textField_3);
      menu.setVisible(false);

      JPanel inventory = new JPanel();
      inventory.setBounds(0, 0, 797, 501);
      frame.getContentPane().add(inventory);
      inventory.setLayout(null);
      inventory.setVisible(false);

      txtInventory = new JTextField();
      txtInventory.setText("INVENTORY");
      txtInventory.setHorizontalAlignment(SwingConstants.CENTER);
      txtInventory.setFont(new Font("굴림", Font.PLAIN, 20));
      txtInventory.setColumns(10);
      txtInventory.setBackground(SystemColor.inactiveCaption);
      txtInventory.setBounds(65, 74, 669, 59);
      inventory.add(txtInventory);

      table_1 = new JTable();
      table_1.setBounds(65, 165, 669, 287);
      inventory.add(table_1);
      
      //셀러전용 주문정보 리스트 페이지
      JPanel orderlist = new JPanel();
      orderlist.setBounds(0, 0, 797, 501);
      frame.getContentPane().add(orderlist);
      orderlist.setLayout(null);
      orderlist.setVisible(false);

      txtOrderList = new JTextField();
      txtOrderList.setText("ORDER LIST");
      txtOrderList.setHorizontalAlignment(SwingConstants.CENTER);
      txtOrderList.setFont(new Font("굴림", Font.PLAIN, 20));
      txtOrderList.setColumns(10);
      txtOrderList.setBackground(SystemColor.inactiveCaption);
      txtOrderList.setBounds(65, 74, 669, 59);
      orderlist.add(txtOrderList);

      table = new JTable();
      table.setBounds(65, 165, 669, 287);
      orderlist.add(table);

      JButton btnNewButton = new JButton("EXPORT FILES");
      btnNewButton.setBounds(608, 33, 126, 23);
      orderlist.add(btnNewButton);
      
      //셀러전용 패스워드 수정 페이지
      JPanel password = new JPanel();
      password.setBounds(0, 0, 797, 501);
      frame.getContentPane().add(password);
      password.setLayout(null);
      password.setVisible(false);

      JLabel lblNewLabel = new JLabel("PASSWORD");
      lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 18));
      lblNewLabel.setBounds(163, 215, 342, 53);
      password.add(lblNewLabel);
      
      //셀러전용 메뉴 페이지
      JPanel sellermode = new JPanel();
      sellermode.setBounds(0, 0, 797, 501);
      frame.getContentPane().add(sellermode);
      sellermode.setLayout(null);
      sellermode.setVisible(false);

      JButton btnNewButton_1 = new JButton("ORDER LIST");
      btnNewButton_1.setBackground(SystemColor.activeCaption);
      btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 15));
      btnNewButton_1.setBounds(65, 194, 181, 232);
      sellermode.add(btnNewButton_1);
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            sellermode.setVisible(false);
            orderlist.setVisible(true);
         }
      });

      JButton btnNewButton_3 = new JButton("INVENTORY");
      btnNewButton_3.setBackground(SystemColor.activeCaption);
      btnNewButton_3.setFont(new Font("굴림", Font.PLAIN, 15));
      btnNewButton_3.setBounds(313, 194, 181, 232);
      sellermode.add(btnNewButton_3);
      btnNewButton_3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            sellermode.setVisible(false);
            inventory.setVisible(true);
         }
      });

      JButton btnNewButton_4 = new JButton("CHANGE PASSWORD");
      btnNewButton_4.setBackground(SystemColor.activeCaption);
      btnNewButton_4.setFont(new Font("굴림", Font.PLAIN, 15));
      btnNewButton_4.setBounds(553, 194, 181, 232);
      sellermode.add(btnNewButton_4);
      btnNewButton_4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg2) {
            sellermode.setVisible(false);
            password.setVisible(true);
         }
      });
      

      txtSellerMode = new JTextField();
      txtSellerMode.setHorizontalAlignment(SwingConstants.CENTER);
      txtSellerMode.setFont(new Font("굴림", Font.PLAIN, 20));
      txtSellerMode.setText("SELLER MODE");
      txtSellerMode.setBackground(SystemColor.inactiveCaption);
      txtSellerMode.setBounds(65, 74, 669, 59);
      sellermode.add(txtSellerMode);
      txtSellerMode.setColumns(10);

      //시작페이지(메인페이지)
      JPanel main = new JPanel();
      main.setBounds(0, 0, 797, 501);
      frame.getContentPane().add(main);
      main.setLayout(null);

      JButton userBtn = new JButton("USER");
      userBtn.setFont(new Font("굴림", Font.PLAIN, 17));
      userBtn.setBounds(87, 192, 294, 235);
      main.add(userBtn);
      userBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg1) {
            main.setVisible(false);
            menu.setVisible(true);
         }
      });

      JButton btnNewButton_2 = new JButton("SELLER");
      btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 17));
      btnNewButton_2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            main.setVisible(false);
            sellermode.setVisible(true);
         }
      });
      btnNewButton_2.setBounds(412, 192, 294, 235);
      main.add(btnNewButton_2);

      txtMode = new JTextField();
      txtMode.setText("MODE");
      txtMode.setHorizontalAlignment(SwingConstants.CENTER);
      txtMode.setFont(new Font("굴림", Font.PLAIN, 20));
      txtMode.setColumns(10);
      txtMode.setBackground(SystemColor.inactiveCaption);
      txtMode.setBounds(65, 74, 669, 59);
      main.add(txtMode);
   }
}
