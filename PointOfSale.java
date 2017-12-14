import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PointOfSale {
	int a=10;
	int m=6;
	int o=8;
	int p=4;
	int b=2;
	int ap,mp,op,pp,bp;
	int tp;
	int tin;
	public PointOfSale(){
		JFrame frame=new JFrame();
		frame.setTitle("IIITD Fruit Stall");
		frame.setLayout(null);
		frame.setSize(1250,1500);
		
		JLabel label1=new JLabel();
		label1.setBounds(250,0,250,250);
		label1.setText("<html><font size=16>Inventory</font></html>");
		frame.add(label1);
		
		JLabel label2=new JLabel();
		label2.setBounds(750,0,250,250);
		label2.setText("<html><font size=16>User</font></html>");
		frame.add(label2);
		
		JLabel label3=new JLabel();
		label3.setBounds(100,125,250,250);
		label3.setText("<html><font size=12>Items</font></html>");
		frame.add(label3);
		
		JLabel label4=new JLabel();
		label4.setBounds(300,125,250,250);
		label4.setText("<html><font size=12>Quantity</font></html>");
		frame.add(label4);
		
		JLabel label5=new JLabel();
		label5.setBounds(700,125,250,250);
		label5.setText("<html><font size=12>Items</font></html>");
		frame.add(label5);
		
		JLabel label6=new JLabel();
		label6.setBounds(900,125,250,250);
		label6.setText("<html><font size=12>Quantity</font></html>");
		frame.add(label6);
		
		JLabel label7=new JLabel();    
		label7.setBounds(100,250,250,250);
		label7.setText("<html><font size=10>Apple</font></html>");
		frame.add(label7);
		
		JLabel label8=new JLabel();    
		label8.setBounds(100,375,250,250);
		label8.setText("<html><font size=10>Mango</font></html>");
		frame.add(label8);
		
		JLabel label9=new JLabel();    
		label9.setBounds(100,500,250,250);
		label9.setText("<html><font size=10>Orange</font></html>");
		frame.add(label9);
		
		JLabel label10=new JLabel();    
		label10.setBounds(100,625,250,250);
		label10.setText("<html><font size=10>Pineapple</font></html>");
		frame.add(label10);
		
		JLabel label11=new JLabel();    
		label11.setBounds(100,750,250,250);
		label11.setText("<html><font size=10>Banana</font></html>");
		frame.add(label11);
		
		JLabel label12=new JLabel();    
		label12.setBounds(100,875,250,250);
		label12.setText("<html><font size=10>Total</font></html>");
		frame.add(label12);
		
		JLabel label13=new JLabel();    
		label13.setBounds(700,250,250,250);
		label13.setText("<html><font size=10>Apple</font></html>");
		frame.add(label13);
		
		JLabel label14=new JLabel();    
		label14.setBounds(700,375,250,250);
		label14.setText("<html><font size=10>Mango</font></html>");
		frame.add(label14);
		
		JLabel label15=new JLabel();    
		label15.setBounds(700,500,250,250);
		label15.setText("<html><font size=10>Orange</font></html>");
		frame.add(label15);
		
		JLabel label16=new JLabel();    
		label16.setBounds(700,625,250,250);
		label16.setText("<html><font size=10>Pineapple</font></html>");
		frame.add(label16);
		
		JLabel label17=new JLabel();    
		label17.setBounds(700,750,250,250);
		label17.setText("<html><font size=10>Banana</font></html>");
		frame.add(label17);
		
		JLabel label18=new JLabel();    
		label18.setBounds(700,875,250,250);
		label18.setText("<html><font size=10>Total</font></html>");
		frame.add(label18);
		
		JLabel apples_left=new JLabel();    
		apples_left.setBounds(300,250,250,250);
		apples_left.setText("<html><font size=10>10</font></html>");
		frame.add(apples_left);
		
		JLabel mangoes_left=new JLabel();    
		mangoes_left.setBounds(300,375,250,250);
		mangoes_left.setText("<html><font size=10>6</font></html>");
		frame.add(mangoes_left);
		
		JLabel oranges_left=new JLabel();    
		oranges_left.setBounds(300,500,250,250);
		oranges_left.setText("<html><font size=10>8</font></html>");
		frame.add(oranges_left);
		
		JLabel pines_left=new JLabel();    
		pines_left.setBounds(300,625,250,250);
		pines_left.setText("<html><font size=10>4</font></html>");
		frame.add(pines_left);
		
		JLabel bans_left=new JLabel();    
		bans_left.setBounds(300,750,250,250);
		bans_left.setText("<html><font size=10>2</font></html>");
		frame.add(bans_left);
		
		JLabel tot=new JLabel();    
		tot.setBounds(300,875,250,250);
		tot.setText("<html><font size=10>22</font></html>");
		frame.add(tot);
		
		JLabel tot_pur=new JLabel();    
		tot_pur.setBounds(900,875,250,250);
		frame.add(tot_pur);
		
		JTextField apple=new JTextField();
		apple.setBounds(900,340,50,50);
		frame.add(apple);
		
		JTextField mango=new JTextField();
		mango.setBounds(900,465,50,50);
		frame.add(mango);
		
		JTextField orange=new JTextField();
		orange.setBounds(900,590,50,50);
		frame.add(orange);
		
		JTextField pine=new JTextField();
		pine.setBounds(900,715,50,50);
		frame.add(pine);
		
		JTextField ban=new JTextField();
		ban.setBounds(900,840,50,50);
		frame.add(ban);
		
		JButton sub=new JButton("<html><font size=6>submit</font></html>");
		sub.setBounds(980,900,100,70);
		frame.add(sub);
		sub.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ap=Integer.parseInt(apple.getText());
				mp=Integer.parseInt(mango.getText());
				op=Integer.parseInt(orange.getText());
				pp=Integer.parseInt(pine.getText());
				bp=Integer.parseInt(ban.getText());
				tp=0;
				if(ap<=a){
					a=a-ap;
					tp=tp+ap
				}
				if(mp<=m){
					m=m-mp;
					tp=tp+mp	
				}
				if(op<=o){
					o=o-op;
					tp=tp+op
				}
				if(pp<=p){
					p=p-pp;
					tp=tp+pp;
				}
				if(bp<=b){
					b=b-bp;
					tp=tp+bp;
				}
				tin=a+m+o+p+b;
				
				apples_left.setText(a+"");
				oranges_left.setText(o+"");
				mangoes_left.setText(m+"");
				pines_left.setText(p+"");
				bans_left.setText(b+"");
				tot_pur.setText(tp+"");
				tot.setText(tin+"");
				
			}
		});
		
		frame.setVisible(true);
		
	}
	
	
	
	public static void main(String args[]){
		PointOfSale pos=new PointOfSale();
	}
}
