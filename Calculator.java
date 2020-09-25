/*
������Ʈ�� : �Ӽ����� ���� 
�Ҽ�  :  IT���������к�
�й�  : 201814096
�̸�  :  �Ӽ���
������Ʈ �Ⱓ  :  2020�� 9�� 15��  ~ 2020�� 9�� 23�� 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Calculator extends JFrame{
	
	JLabel showlabel = new JLabel("0");  // �Է��ϴ� ���İ� ��� ��� ���� ��Ÿ��

	JButton btdel; //  �� ��ư
	JButton btclear; //  C ��ư 
	JButton btpercent; // % ��ư  
	JButton btplus; //  + ��ư
	JButton btmin; //  - ��ư
	JButton btmul; //  �� ��ư
	JButton btdiv; //  �� ��ư
	JButton btdot; // �Ҽ��� ��ư
	JButton btequal; // = ��ư
	JButton btleft; //  ( ��ư
	JButton btright; // ) ��ư

	JButton btfact; //  x! ��ư
 
	JButton bt0; // 0 ��ư
	JButton bt1; // 1 ��ư
	JButton bt2; // 2 ��ư
	JButton bt3; // 3 ��ư
	JButton bt4; // 4 ��ư
	JButton bt5; // 5 ��ư
	JButton bt6; // 6 ��ư
	JButton bt7; // 7 ��ư
	JButton bt8; // 8 ��ư
	JButton bt9; // 9 ��ư

	Font font = new Font("���� ���", Font.BOLD, 60);
	Font font2 = new Font("���� ���", Font.BOLD, 60);
	Font font3 = new Font("���� ���", Font.BOLD, 70);

	Color darkorange = new Color(255, 140, 000);  // ����Ȳ��
	Color darkgray = new Color(169, 169, 169);  // ��ȸ��
	Color lightgray = new Color(211, 211, 211); // ��ȸ��
	Color silver = new Color(192, 192, 192);  // �ǹ���

	String numStr = "0"; // ���İ� ��갪�� �����ϴ� ���� 

	public Calculator() {
	
		setTitle("�Ӽ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.BLACK);  
		
		showlabel.setLocation(10,10);  // �Է��ϴ� ���İ� ��� ��� ���� ���̴� â ����
		showlabel.setSize(550,80);
		showlabel.setFont(font);
		showlabel.setHorizontalAlignment(SwingConstants.RIGHT);
		showlabel.setBackground(Color.BLACK);
		showlabel.setForeground(Color.white);
		
		
		// 1��° ��
		
		btclear = new JButton("C");  //  C ��ư ����
		btclear.setSize(135,100);
		btclear.setLocation(10,200);
		btclear.setFont(font);
		btclear.setBackground(Color.RED);
		btclear.setForeground(Color.WHITE);
		btclear.addActionListener(new MyActionListener());
		
		btfact= new JButton("x!");  //  x! ��ư ����
		btfact.setSize(135,100);
		btfact.setLocation(153,200);
		btfact.setFont(font2);
		btfact.setBackground(lightgray);
		btfact.setForeground(Color.WHITE);
		btfact.addActionListener(new MyActionListener());
		
		btpercent = new JButton("%");  //  % ��ư ����
		btpercent.setSize(135,100);
		btpercent.setLocation(297,200);
		btpercent.setFont(font);
		btpercent.setBackground(lightgray);
		btpercent.setForeground(Color.WHITE);
		btpercent.addActionListener(new MyActionListener());
		
		btplus = new JButton("+");  // + ��ư ����
		btplus.setSize(135,100);
		btplus.setLocation(440,200);
		btplus.setFont(font2);
		btplus.setBackground(darkorange); 
		btplus.setForeground(Color.WHITE);
		btplus.addActionListener(new MyActionListener());
		
		
		// 2��° ��
		
		btdel= new JButton("��");  //  �� ��ư ����
		btdel.setSize(135,100);
		btdel.setLocation(10,310);
		btdel.setFont(font);
		btdel.setBackground(lightgray);
		btdel.setForeground(Color.WHITE);
		btdel.addActionListener(new MyActionListener());
		
		btleft= new JButton("(");  // ���� ��ȣ ��ư ����
		btleft.setSize(135,100);
		btleft.setLocation(153,310);
		btleft.setFont(font);
		btleft.setBackground(lightgray);
		btleft.setForeground(Color.WHITE);
		btleft.addActionListener(new MyActionListener());
		
		
		btright= new JButton(")");  // ������ ��ȣ ��ư ����
		btright.setSize(135,100);
		btright.setLocation(297,310);
		btright.setFont(font);
		btright.setBackground(lightgray);
		btright.setForeground(Color.WHITE);
		btright.addActionListener(new MyActionListener());
		
		btmin= new JButton("-");  // ���� ��ư ����
		btmin.setSize(135,100);
		btmin.setLocation(440,310);
		btmin.setFont(font2);
		btmin.setBackground(darkorange);
		btmin.setForeground(Color.WHITE);
		btmin.addActionListener(new MyActionListener());
		
		
		// 3��° ��
		
		bt7= new JButton("7");  // 7 ��ư ����
		bt7.setSize(135,100);
		bt7.setLocation(10,420);
		bt7.setFont(font);
		bt7.setBackground(darkgray);
		bt7.setForeground(Color.WHITE);
		bt7.addActionListener(new MyActionListener());
		
		bt8= new JButton("8");  // 8 ��ư ����
		bt8.setSize(135,100);
		bt8.setLocation(153,420);
		bt8.setFont(font);
		bt8.setBackground(darkgray);
		bt8.setForeground(Color.WHITE);
		bt8.addActionListener(new MyActionListener());
		
		bt9= new JButton("9");   // 9 ��ư ����
		bt9.setSize(135,100);
		bt9.setLocation(297,420);
		bt9.setFont(font);
		bt9.setBackground(darkgray);
		bt9.setForeground(Color.WHITE);
		bt9.addActionListener(new MyActionListener());
		
		btmul= new JButton("��");  // ���ϱ� ��ư ����
		btmul.setSize(135,100);
		btmul.setLocation(440,420);
		btmul.setFont(font2);
		btmul.setBackground(darkorange);
		btmul.setForeground(Color.WHITE);
		btmul.addActionListener(new MyActionListener());
		
		
		// 4��° ��
		
		bt4= new JButton("4");  // 4��ư ����
		bt4.setSize(135,100);
		bt4.setLocation(10,530);
		bt4.setFont(font);
		bt4.setBackground(darkgray);
		bt4.setForeground(Color.WHITE);
		bt4.addActionListener(new MyActionListener());
		
		bt5= new JButton("5");  // 5��ư ����
		bt5.setSize(135,100);
		bt5.setLocation(153,530);
		bt5.setFont(font);
		bt5.setBackground(darkgray);
		bt5.setForeground(Color.WHITE);
		bt5.addActionListener(new MyActionListener());
		 
		bt6= new JButton("6");  // 6��ư ����
		bt6.setSize(135,100);
		bt6.setLocation(297,530);
		bt6.setFont(font);
		bt6.setBackground(darkgray);
		bt6.setForeground(Color.WHITE);
		bt6.addActionListener(new MyActionListener());
		
		btdiv= new JButton("��");  // ������ ��ư ����
		btdiv.setSize(135,100);
		btdiv.setLocation(440,530);
		btdiv.setFont(font2);
		btdiv.setBackground(darkorange);
		btdiv.setForeground(Color.WHITE);
		btdiv.addActionListener(new MyActionListener());
		
		
		//5��° ��
		
		bt1= new JButton("1");   // 1��ư ����
		bt1.setSize(135,100);
		bt1.setLocation(10,640);
		bt1.setFont(font);
		bt1.setBackground(darkgray);
		bt1.setForeground(Color.WHITE);
		bt1.addActionListener(new MyActionListener());
		
		bt2= new JButton("2");   // 2��ư ����
		bt2.setSize(135,100);
		bt2.setLocation(153,640);
		bt2.setFont(font);
		bt2.setBackground(darkgray);
		bt2.setForeground(Color.WHITE);
		bt2.addActionListener(new MyActionListener());
		
		bt3= new JButton("3");   // 3��ư ����
		bt3.setSize(135,100);
		bt3.setLocation(297,640);
		bt3.setFont(font);
		bt3.setBackground(darkgray);
		bt3.setForeground(Color.WHITE);
		bt3.addActionListener(new MyActionListener());
		
		
		// 6��° ��
		
		bt0= new JButton("0");   // 0��ư ����
		bt0.setSize(279,100);
		bt0.setLocation(10,750);
		bt0.setFont(font);
		bt0.setBackground(darkgray);
		bt0.setForeground(Color.WHITE);
		bt0.addActionListener(new MyActionListener());
		
		
		btdot= new JButton(".");   //  �Ҽ��� ��ư ����
		btdot.setSize(135,100);
		btdot.setLocation(297,750);
		btdot.setFont(font3);
		btdot.setBackground(darkgray);
		btdot.setForeground(Color.WHITE);
		btdot.addActionListener(new MyActionListener());
		
		
		btequal= new JButton("=");  //  = ��ư ����
		btequal.setSize(135,210);
		btequal.setLocation(440,640);
		btequal.setFont(font3);
		btequal.setBackground(darkorange);
		btequal.setForeground(Color.WHITE);
		btequal.addActionListener(new MyActionListener());
		
		
		//  ��ư����  Container�� �����Ѵ�.
		
		c.add(showlabel);
		
		c.add(btclear);
		c.add(btfact);
		c.add(btpercent);
		c.add(btplus);
		
		c.add(btdel);
		c.add(btleft);
		c.add(btright);
		c.add(btdiv);
		c.add(btmin);
		
		
		c.add(bt7);
		c.add(bt8);
		c.add(bt9);
		c.add(btmul);
		
		c.add(bt4);
		c.add(bt5);
		c.add(bt6);
		c.add(btdiv);
		
		c.add(bt1);
		c.add(bt2);
		c.add(bt3);
		

		c.add(bt0);
		c.add(btdot);
		
		c.add(btequal);
		
		
		// Container ����
		setSize(600,900);   
		setLocation(630,35);
		setVisible(true);
	}

	private class MyActionListener implements ActionListener {  

		public void actionPerformed(ActionEvent e) {

			String str = e.getActionCommand();

			if (str.equals("C")) {  // �������� ��ư�� ������
				numStr = "";    //  �Է��� ������ ��� �ʱ�ȭ
				showlabel.setText(numStr);  // �ʱ�ȭ�� ������ ȭ�鿡 ���̵��� ����
			}

			else if (str.equals("��")) { // ��� ���� �� ���� ����� ��ư�� ������

				if (!numStr.equals("")) { // ������� ������ �ִ°��

					StringTokenizer first = new StringTokenizer(numStr, "+-����%.0123456789()!", true); // �Էµ� ������ �и��Ѵ�.

					ArrayList<String> second = new ArrayList<String>();  // �и��� ���ڵ��� �����ϴ� ����Ʈ

					String change = "";  // ������ ������ �����ϴ� ���ڿ� ���� 

					while (first.hasMoreTokens()) {

						second.add(first.nextToken());  // ����Ʈ�� �и��� ���ڵ��� �ϳ��� �����Ѵ�.
					}

					second.remove(second.size() - 1);  // �� ������ ���ڸ� �����.

					for (int i = 0; i < second.size(); i++) {

						change += second.get(i);  //  change �������ٰ�  ������ ���ڵ��� �����Ѵ�.
					}

					numStr = change;  // ������ �������� �����ϰ�
					showlabel.setText(numStr);  // ȭ�鿡 ���̵��� �����Ѵ�.
				}
			}

			else if (str.equals("x!")) {  // ���丮�� ��ư�� ���� ��� 

				numStr += "!";   //  ���Ŀ�  ! ���ڸ� �����ϰ� 
				showlabel.setText(numStr);  // ȭ�鿡 ���̵��� �����Ѵ�.

			}

			else if (!str.equals("=")) {  // '=', 'C', '��', 'x!' ������  �ٸ� ��ư�� �������
				
				if(numStr.equals("0")) {  // ���� ������ 0�϶� 
					
					
					// ���ϱ�, ���ϱ�, ������, �ۼ�Ʈ, �Ҽ�����  ������ �ٸ� ��ư�� ������
					if(!str.equals("+") && !str.equals("��") && !str.equals("��") && !str.equals("%") && !str.equals(".")) {  
						
						numStr=str;  // 0�� ����� ���� �Է��� ������ �����Ѵ�.
					}
						
					else {   //  ���ϱ�, ���ϱ� , ������ , �ۼ�Ʈ , �Ҽ��� ��ư�� ������
						
						numStr += str;  // ���� ���Ŀ� �����δ�. 
					}
				}
				
				else {
					
					numStr += str;  // �Է��� ������ �����Ѵ�.
				}
				
				showlabel.setText(numStr);  // ���� ȭ�鿡 ���̵��� �����Ѵ�.
			}

			
			///////////////////////////////////// ������ ����Ѵ�.

			else if (str.equals("=") && !numStr.equals("")) {  //  ������ �Է��� ���¿���  '=' ��ư��  ���������  

				StringTokenizer st = new StringTokenizer(numStr, "!+-����%()", true); // �Է��� ������  ������,����,��ȣ�� �������� �и��Ѵ�.

				ArrayList<String> init = new ArrayList<String>();   // ��ȣ�� �ִ� ������ �����ϴ� ����Ʈ
				ArrayList<String> intest = new ArrayList<String>(); // ��ȣ ���� ���Ŀ��� ������ �켱������ ó���ϰ� �� ��갪�� �����ϴ� ����Ʈ

				ArrayList<String> before = new ArrayList<String>(); // ��ȣ���� ����ϰ�  ���ϱ� ������ �����ڰ� �ִ� ������ �����ϴ� ����Ʈ
				ArrayList<String> after = new ArrayList<String>(); // ��ȣ�Ȱ� ���ϱ� ������ ������ �켱������ ó���ϰ� ���� ������ �����ϴ� ����Ʈ
				
				int leftseq = 0;  // ��ȣ���� ������ ���� ������ ��� ���� 
				int rightseq = 0;  // ��ȣ�ݱ� ������ ���� ������ ��� ���� 

				try {   

					///////////////////////////////////// ���� ���

					while (st.hasMoreTokens()) {

						init.add(st.nextToken()); // �Է��� ���Ŀ��� ������,����,��ȣ�� �������� �и��� ����  init ����Ʈ�� �����Ѵ�.
					}
					
					
					if(init.get(0).equals("-")) {   // ��ó�� ������ ������  �տ� 0�� �ٿ��� ��� ������ �����Ѵ�.
						
						ArrayList<String> init2 = new ArrayList<String>();  // �Է��� ������ �Ǿտ� 0�� �ٿ��� ������ init2 ����Ʈ
						
						init2.add("0");   // �� ó����  ���� 0 ����
						
						for(int i=0;i<init.size();i++) {
							
							init2.add(init.get(i));  //  init ����Ʈ�� ��ҵ���  init2 ����Ʈ�� �����Ѵ�.
						}
						
						init = init2;	// �� �տ� 0�� �߰��� ������  init ����Ʈ�� ���� �����Ѵ�. 
					}
					
					
					for (int i = 0; i < init.size(); i++) {  
			
						if(init.get(i).equals("+") && init.get(i+1).equals("-")) {  //  '+' ������ �ڿ�  '-' �����ڰ� ���� ���  ���� �������� ��ü
							
							init.set(i, "-");
							init.remove(i+1);
						}
						
						else if(init.get(i).equals("(")) {  // ��ȣ���� ���� ����
							
							leftseq++;
						}
						
						else if(init.get(i).equals(")")) {  // ��ȣ �ݱ� ���� ����
							
							rightseq++;
						}
					}
					
					if(leftseq != rightseq) {  // ��ȣ����� �ݱ��� ������ Ʋ���� ����ó��
						
						throw new Exception();
					}

					
					for (int i = 0; i < init.size(); i++) { // ���丮�� ����� �ϱ� ���� �ݺ���

						if (init.get(i).equals("!")) {  // '!' �������� ��� 

							if (i + 1 != init.size()) { //  '!' ������ �ڿ� ������ �� �ִ� ���
								
								// '!' ������ �ڿ�  ��Ģ����, �ۼ�Ʈ,  ��ȣ �ݱⰡ �ƴ�  �ٸ� ������ ������
								if (!init.get(i + 1).equals("+") && !init.get(i + 1).equals("-")
										&& !init.get(i + 1).equals("��") && !init.get(i + 1).equals("��")
										&& !init.get(i + 1).equals("%") && !init.get(i + 1).equals(")")) { 
									
									throw new Exception(); // ������ ����ó��
								}
							}

							if (i == 1) { // '!' ������ �տ� �ٸ� ���ľ��� ���� �ϳ��� �ִ� ��� 
								//  �������,  5! �� ���  ���� 5�� �ε����� 0,  '!' ������ �ε����� 1

								long n = Long.parseLong(init.get(i - 1));  // ���ڸ� long Ÿ������ ��ȯ�Ͽ� ����
								long fact = 1;   //  ���丮�� ��갪�� ������ ���� 
								
								for (long j = n; j >= 1; j--) {   // ���丮�� ����� �Ѵ�. 
									
									fact *= j;
									
								}

								init.set(i - 1, String.valueOf(fact));  // ���� �ڸ���  ���丮�� ��� ������� �ִ´�. 
								init.remove(i);   //  '!' �����ڸ�  �����.								 
							}

							
							else if (!init.get(i - 2).equals(".")) { // '!' ������ �հ� �ڿ� �ٸ� ������ �ְ� �Ǽ��� �ƴϸ�

								long n = Long.parseLong(init.get(i - 1));  // ���ڸ� long Ÿ������ ��ȯ�Ͽ� ����
								long fact = 1;    //  ���丮�� ��갪�� ������ ���� 

								for (long j = n; j >= 1; j--) {    // ���丮�� ����� �Ѵ�.

									fact *= j;

								}

								init.set(i - 1, String.valueOf(fact));   // ���� �ڸ���  ���丮�� ��� ������� �ִ´�
								init.remove(i);   //  '!' �����ڸ�  �����. 
							} 
						}
					}
					
					
					for(int i=0; i<init.size();i++) {
										
						if(init.get(i).equals("%")) {   // �ۼ�Ʈ �������� ���
							
							
							if(i+1 != init.size()) {  // �ڿ� ������ �� ������ 
								
								if(isNumber(init.get(i+1))) {  // �װ��� ������ ���    ��  :  5%2 = 0.1
									
									ArrayList<String> init2 = new ArrayList<String>(); 
									
									
									for(int j=0;j<i-1;j++) {  // �ۼ�Ʈ ������ �տ� �ִ� ���� ������ ����
										
										init2.add(init.get(j));  
									}
									
									// �ۼ�Ʈ�� ���� ���ڿ��� 100�� ������  �ۼ�Ʈ ���� ���ڿ� ���Ѵ�.
									double n = Double.parseDouble(init.get(i-1))/100 * Double.parseDouble(init.get(i+1));  
									
									init2.add(String.valueOf(n));  // �� ������� ����
								
									for(int j=i+2;j<init.size();j++) {  // �ۼ�Ʈ ���� ���� �ٷ�  ���� ���ĺ��� ����
										
										init2.add(init.get(j)); 
									}

									init = init2;  // ������ ������ �����Ѵ�.
								}
													
								else {  // ���ڰ� �ƴ� ���   �� :  5% x 2  = 0.1
									
									double n = Double.parseDouble(init.get(i-1))/100;  // �ۼ�Ʈ ���� ���ڸ� 100 ������ 
									
									init.set(i-1, String.valueOf(n));  // �����Ѵ�.
									init.remove(i);  //  % ����
									i = i-1;  // % �� ���������� ������ ��츦 �����.  �� :  88%% 
								}
							}

								
							else {  // �ڿ� ������ ���� ���    �� :  5%  = 0.05
								
								double n = Double.parseDouble(init.get(i-1))/100;  // �ۼ�Ʈ ���� ���ڸ� 100 ������ 
								
								init.set(i-1, String.valueOf(n));  // �����Ѵ�.
								init.remove(i);  //  %  ����
							}
						}
					}

					
					int k = 0;  // init ����Ʈ��  �ε��� ���� 
					double innum = 0;   // ��ȣ���� ���Ŀ��� ������ �켱ó���� ��  ������� �����ϴ� ����
					
					while (k < init.size()) {  // init ����Ʈ ���̸�ŭ �ݺ��Ѵ�.

						if (init.get(k).equals("(")) { // ��ȣ���Ⱑ ������
						
														
							///////////////////////////////////// ��ȣ ���� ���� ��� ����

							while (true) { // ���ѹݺ�
								

								if (init.get(k).equals("(") && init.get(k+1).equals("-")) {  // ��ȣ���� ���Ŀ��� ó������ ������ ������ ��� 
									
									
									ArrayList<String> init2 = new ArrayList<String>(); 
									
									
									for(int i=0;i<k;i++) {
										
										init2.add(init.get(i));  //  ��ȣ ���� �������� init�� ������ �����Ѵ�.
									}
									
									init2.add(init.get(k));  // ��ȣ ����
									init2.add("0");   // ���� 0 ����
									
									for(int i=k+1;i<init.size();i++) {
										
										init2.add(init.get(i));  //  ��ȣ���� ������ �����Ѵ�.
									}
									
									init = init2;	// �� �տ� 0�� �߰��� ������ ���� �����Ѵ�. 
									k++;   // init ����Ʈ�� �ε�����  1 ������Ų��. 
								}
								
								
								if (init.get(k).equals("(") && !init.get(k+1).equals("-")) {  // ��ȣ���� ���Ŀ��� ó������ ������ ������ ������
									
									k++;   // init ����Ʈ�� �ε�����  1 ������Ų��. 
									
								}

								if (init.get(k).equals(")")) { // ��ȣ�ݱⰡ ������

									double inresult = Double.parseDouble(intest.get(0)); // ��ȣ���� ���Ŀ��� ������ �켱ó���� ���ϰ� �� �� ���� ������ ����Ͽ� ������� �����ϴ� �����̴�.
		
									int inpoint = 1; // ��ȣ�ȿ��� ������ �켱ó�����ϰ� ���� ���Ŀ��� 1��° �����ڸ� ����Ű�� �ε���, 0��° �ڸ��� �����̴�. 

									while (inpoint < intest.size()) {  

										if (intest.get(inpoint).equals("+")) { // ���ϱⰡ ������

											inresult += Double.parseDouble(intest.get(inpoint + 1)); // ���Ѵ�.
											inpoint += 2; // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.
										}

										else if (intest.get(inpoint).equals("-")) { // ���Ⱑ ������
											
											inresult -= Double.parseDouble(intest.get(inpoint + 1)); // ����.
											inpoint += 2; // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.
										}
									}
									

									before.add(String.valueOf(inresult)); // ��ȣ���� ����� ��������  before ����Ʈ�� �߰��Ѵ�.
		
									k++;  // init ����Ʈ �ε����� 1 ������Ų��.
									
									intest.clear(); // ��ȣ���� ������ ����� ������� ������ ����Ʈ�� �ʱ�ȭ�Ѵ�.

									break;
								}
														
								///////  ��ȣ ���� ���Ŀ��� ������ �켱������ ����Ѵ�.
								
								else if (init.get(k).equals("��")) {  // ���ϱⰡ ������ ���    
									

									if (innum == 0) { // ���ϱ� , ������ �����ڰ� ���������� ���� ������  
										
										if(init.get(k+1).equals("-")) {   // ���ϱ� �ڿ� �����̸�   �� : ( 6 x -3 ) = -18
											
											double n1 = Double.parseDouble(init.get(k - 1)); // ���ϱ� ������ ���� ����

											double n2 = (-1)*Double.parseDouble(init.get(k + 2)); // ���̳ʽ� ��ȣ ���� ����
											
											init.remove(k+1);

											intest.set(intest.size() - 1, String.valueOf(n1 * n2)); // intest�� ������ ���� ��ü�Ѵ�.

											innum = n1 * n2; // ����� ���� �����Ѵ�.
											
											
											k += 2;  // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.
										}
										

										else {   //  �� :  ( 1 + 2 x 5 - 3 ) = 8
											
											double n1 = Double.parseDouble(init.get(k - 1)); // ���ϱ� ������ ���� ����

											double n2 = Double.parseDouble(init.get(k + 1)); // ���ϱ� ������ ���� ����

											intest.set(intest.size() - 1, String.valueOf(n1 * n2)); // intest�� ������ ���� ��ü�Ѵ�.

											innum = n1 * n2; // ����� ���� �����Ѵ�.
											
											
											k += 2;  // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.		
										}
										
										continue;

									}

									else { // ���ϱ� , ������ �����ڰ� ���������� ������    
										
										if(init.get(k+1).equals("-")) {  // ���ϱ� �ڿ� �����̸�   �� :  ( 2 �� 2 x -3 )  = -3
											
											double n2 = (-1)*Double.parseDouble(init.get(k + 2)); // ���̳ʽ� ��ȣ ���� ����
											
											init.remove(k+1);  

											intest.set(intest.size() - 1, String.valueOf(innum * n2)); // ������ ����� �����ٰ� �߰��� ���Ͽ�  intest�� ������ ���� ��ü�Ѵ�.
											innum = innum * n2; // ����� ���� �����Ѵ�.
											k += 2;  // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.
											
										}
										
										
										else {   //   �� :  ( 1 + 2 �� 2 x 3 ) = 4
											
											double n2 = Double.parseDouble(init.get(k + 1)); // ���ϱ� ������ ���� ����

											intest.set(intest.size() - 1, String.valueOf(innum * n2)); // ������ ����� �����ٰ� �߰��� ���Ͽ�  intest�� ������ ���� ��ü�Ѵ�.
											innum = innum * n2; // ����� ���� �����Ѵ�.
											k += 2;  // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.										
										}

										continue;
									}
								}

								else if (init.get(k).equals("��")) { // �����Ⱑ ������ ��� 

									if (innum == 0) { // ���ϱ� , ������ �����ڰ� ���������� ���� ������   
										
										if(init.get(k+1).equals("-")) {  // ������ �ڿ� �����̸�    �� :  ( 6 �� -3 ) = -2
													
											double n1 = Double.parseDouble(init.get(k - 1)); // ������ ������ ���� ����

											double n2 = (-1)*Double.parseDouble(init.get(k + 2)); // ���̳ʽ� ��ȣ ���� ����
											
											init.remove(k+1);

											intest.set(intest.size() - 1, String.valueOf(n1 / n2)); // intest�� ������ ���� ��ü�Ѵ�.

											innum = n1 / n2; // ����� ���� �����Ѵ�.
											k += 2;  // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.
											
										}
										
										
										else {   //  �� : ( 6 �� 3 + 1 )  = 3

											double n1 = Double.parseDouble(init.get(k - 1)); // ������ ������ ���� ����

											double n2 = Double.parseDouble(init.get(k + 1)); // ������ ������ ���� ����

											intest.set(intest.size() - 1, String.valueOf(n1 / n2)); // intest�� ������ ���� ��ü�Ѵ�.

											innum = n1 / n2; // ����� ���� �����Ѵ�.
											k += 2;  // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.
											
										}
						
										continue;

									}

									else { // ���ϱ� , ������ �����ڰ� ���������� ������   
										
										
										if(init.get(k+1).equals("-")) {  // ������ �ڿ� �����̸�    �� : ( 9 x 2 �� -3 )  = -6
											
											double n2 = (-1)*Double.parseDouble(init.get(k + 2)); // ���̳ʽ� ��ȣ ���� ����
											
											init.remove(k+1);  

											intest.set(intest.size() - 1, String.valueOf(innum / n2)); // ������ ����� �����ٰ� �߰��� ������ intest�� ������ ���� ��ü�Ѵ�.
											innum = innum / n2; // ����� ���� �����Ѵ�.
											k += 2;  // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.
											
										}
										
										
										else {   //  ��  :  ( 1 - 9 x 2 �� 3 )  =  -5
											 
											double n2 = Double.parseDouble(init.get(k + 1)); // ������ ������ ���� ����

											intest.set(intest.size() - 1, String.valueOf(innum / n2)); // ������ ����� �����ٰ� �߰��� ������ intest�� ������ ���� ��ü�Ѵ�.
											innum = innum / n2; // ����� ���� �����Ѵ�.
											k += 2;  // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.			
											
										}

										continue;
									}
								}
								
						

								else { // ���ϱ� , ������ , ���ڰ� �ƴϸ� 

									intest.add(init.get(k)); // intest�� �߰��Ѵ�.
									innum = 0; // ������ �켱������ �����  ������� �ʱ�ȭ�Ѵ�.
									k++;  // init ����Ʈ�� �ε����� 1 ������Ų��.
								}
							}
						}  ///////////////////////////////////// ��ȣ ���� ���� ��� ��
						

						else {  // ��ȣ���� �ƴϸ�

							before.add(init.get(k)); //  before ����Ʈ��  �߰��Ѵ�.
							k++;  // init ����Ʈ�� �ε����� 1 ������Ų��.

						}
					}

					
					///////////////////////////////////// ��ȣ���� ��� ����ϰ�  ���� ���Ŀ��� ���ϱ�,������ , �ۼ�Ʈ ����� �켱ó���� �Ѵ�. 

					int i = 0;  //  before ����Ʈ�� �ε��� ����
					double num = 0; // ������ �켱������ ó���ϰ� ������� ������ ����

					while (i < before.size()) { // ������ �켱���� ����
						
						
						//////  ���ڰ� �ƴ� ��� 
						if( !isNumber(before.get(i)) ) { 

							if (before.get(i).equals("��")) { // ���ϱ� ������

								if (num == 0) { // ���ϱ� , ������  �����ڰ� ���������� ���� ������
									
									if(before.get(i+1).equals("-")) {  // ���ϱ� �ڿ� �����̸�   �� :  6 x -3 = -18
										
										
										double n1 = Double.parseDouble(before.get(i - 1)); // ���ϱ� ������ ���� ����

										double n2 = (-1)*Double.parseDouble(before.get(i + 2)); // ���̳ʽ� ��ȣ ���� ����
										
										before.remove(i+1);

										after.set(after.size() - 1, String.valueOf(n1 * n2)); // after�� ������ ���� ��ü�Ѵ�.

										num = n1 * n2; // ����� ���� �����Ѵ�.
										i +=2; // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.
										
									}
									
									else {    // �� :  6 x 3 = 18
										
										double n1 = Double.parseDouble(before.get(i - 1)); // ���ϱ� ������ ���� ����

										double n2 = Double.parseDouble(before.get(i + 1)); // ���ϱ� ������ ���� ����

										after.set(after.size() - 1, String.valueOf(n1 * n2)); // after�� ������ ���� ��ü�Ѵ�.

										num = n1 * n2; // ����� ���� �����Ѵ�.
										i +=2; // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.
										
									}
									
									continue;
								}

								else { // ���ϱ� , ������ �����ڰ� ���������� ������
									
									
									if(before.get(i+1).equals("-")) {  // ���ϱ� �ڿ� �����̸�   �� : 6 �� 2 x -3  = -9
										
										double n2 = (-1)*Double.parseDouble(before.get(i + 2)); // ���̳ʽ� ��ȣ ���� ����
										
										before.remove(i+1);  

										after.set(after.size() - 1, String.valueOf(num * n2)); // ������ ����� �����ٰ� �߰��� ���Ͽ� after�� ������ ���� ��ü�Ѵ�.
										
										num = num * n2; // ����� ���� �����Ѵ�.
										i +=2; // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.
										
									}
									

									else {    //  �� :  6 �� 2 x 3  = 9
										
										double n2 = Double.parseDouble(before.get(i + 1)); // ���ϱ� ������ ���� ����

										after.set(after.size() - 1, String.valueOf(num * n2)); // ������ ����� �����ٰ� �߰��� ���Ͽ� after�� ������ ���� ��ü�Ѵ�.
										
										num = num * n2; // ����� ���� �����Ѵ�.
										i +=2;  // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.
									}
									
									
									continue;
								}
							}

							else if (before.get(i).equals("��")) { // ������ ������

								if (num == 0) { // ���ϱ� , ������ �����ڰ� ���������� ���� ������
									
									
									if(before.get(i+1).equals("-")) {  // ������ �ڿ� �����̸�   �� :  6 �� -3 = -2
										
										
										double n1 = Double.parseDouble(before.get(i - 1)); // ������ ������ ���� ����

										double n2 = (-1)*Double.parseDouble(before.get(i + 2)); // ���̳ʽ� ��ȣ ���� ����
										
										before.remove(i+1);

										after.set(after.size() - 1, String.valueOf(n1 / n2)); // after�� ������ ���� ��ü�Ѵ�.

										num = n1 / n2; // ����� ���� �����Ѵ�.
										i +=2; // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.
										
									}
									
									else {   //  �� :  6 �� 3 = 2
										
										double n1 = Double.parseDouble(before.get(i - 1)); // ������ ������ ���� ����
										
										double n2 = Double.parseDouble(before.get(i + 1)); // ������ ������ ���� ����

										after.set(after.size() - 1, String.valueOf(n1 / n2)); // after�� ������ ���� ��ü�Ѵ�.

										num = n1 / n2; // ����� ���� �����Ѵ�.
										i +=2;  // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.
									}
									
									continue;

								}

								else { // ���ϱ� , ������ �����ڰ� ���������� ������
									
									if(before.get(i+1).equals("-")) {  // ������ �ڿ� �����̸�  �� :  9 x 2 �� -3  = -6
										
										double n2 = (-1)*Double.parseDouble(before.get(i + 2)); // ���̳ʽ� ��ȣ ���� ����
										
										before.remove(i+1);  

										after.set(after.size() - 1, String.valueOf(num / n2)); // ������ ����� �����ٰ� �߰��� ������ after�� ������ ���� ��ü�Ѵ�.
										
										num = num / n2; // ����� ���� �����Ѵ�.
										i +=2; // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.
										
									}
									
									else {   //  �� :  9 x 2 �� 3  = 6
										
										double n2 = Double.parseDouble(before.get(i + 1)); // ������ ������ ���� ����
										
										after.set(after.size() - 1, String.valueOf(num / n2)); // ������ ����� �����ٰ� �߰��� ������ after�� ������ ���� ��ü�Ѵ�.
			
										num = num / n2; // ����� ���� �����Ѵ�.
										i +=2;    // �״��� �����ڰ� �ִ� �ڸ��� �ε����� �����Ѵ�.
										
									}
	
									continue;
								}
								
							}


							else {  // ���ϱ� , ������  �����ڰ� �ƴ� ���

								num = 0; // ����� ���� �ʱ�ȭ�Ѵ�.
								
								after.add(before.get(i)); // after�� �߰��Ѵ�.
								
								i++;  //  before ����Ʈ�� �ε����� 1 ������Ų��.
							}
						}

						else { // ������ ��� 

							after.add(before.get(i)); // after�� �߰��Ѵ�.
							
							i++;   //  before ����Ʈ�� �ε����� 1 ������Ų��.

						}
					}

					///////////////////////////////////// ���ϱ�,������ ������ �켱ó���ϰ� ���� ������ ����Ͽ� ���� ������� ���Ѵ�.

					double result = Double.parseDouble(after.get(0));  // ���� ��� ������� �����ϴ� ���� after�� ù��° ���ڸ� �����Ѵ�.

					for (int j = 1; j < after.size(); j++) {

						if (after.get(j).equals("+")) { // ���ϱ�
							
							result += Double.parseDouble(after.get(j + 1)); // �״��� ���ڸ� ���Ѵ�.
						}

						else if (after.get(j).equals("-")) { // ����

							result -= Double.parseDouble(after.get(j + 1)); // �״��� ���ڸ� ����.
						}

						else if (after.get(j).equals("!")) { // '!' �����ڰ� ������

							throw new Exception(); // ����ó��
						}
					}
					
					if (!isDouble(result)) { // ���� ������� �����̸�

						int result2 = (int) result; // �Ҽ��κ��� ���ְ� �����κи� ���� ����������� ���ϰ� 
						numStr = String.valueOf(result2); // ������ �����ϴ� ������ ���� ������� �����Ѵ�.

					}

					else if (isDouble(result)) { // ���� ������� �Ǽ��̸�

						numStr = String.valueOf(result); // ������ �����ϴ� ������ ���� ������� �����Ѵ�.

					}

					showlabel.setText(numStr); //  ���� ������� ȭ�鿡 ���̰��Ѵ�.
				}

				catch (Exception e2) {   // ����ó��
					showlabel.setText("���Ŀ���");  // ȭ�鿡  "���Ŀ���" ���  ������ ���̰� �Ѵ�.
					numStr = "";   //  ������ �����ϴ� ������ �ʱ�ȭ�Ѵ�. 
				}
			}
		}
	}
		
	public boolean isDouble(double n) { // �Ǽ��̸� true �����ϰ�  �����̸� false �����Ѵ�.

		int n2 = (int) n;  // �����κ��� �����Ѵ�.

		if (n - n2 != 0.0) {  // �Ҽ��κ��� 0.0�� �ƴϸ�  �Ǽ��̹Ƿ�
			 
			return true;   // true ����
		}

		else   //  �Ҽ��κ���  0.0 �̸�  �����̹Ƿ� 
			return false;   //  false ����
	}
	
	public boolean isNumber(String s) {   // �������� �Ǻ��ϴ� �Լ� 
		
		try {    
			
			Double.parseDouble(s);   
			return true;   //  �����̸�  True ����
		
		} 
		catch (NumberFormatException e) { 
			return false;   // �ƴϸ�  False ����
			
		} 
	}
	
	public static void main(String[] args) {  // main �Լ� 
		new Calculator();   
	}
}
