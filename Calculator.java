/*
프로젝트명 : 임수빈의 계산기 
소속  :  IT융합자율학부
학번  : 201814096
이름  :  임수빈
프로젝트 기간  :  2020년 9월 15일  ~ 2020년 9월 23일 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Calculator extends JFrame{
	
	JLabel showlabel = new JLabel("0");  // 입력하는 수식과 계산 결과 값을 나타냄

	JButton btdel; //  ← 버튼
	JButton btclear; //  C 버튼 
	JButton btpercent; // % 버튼  
	JButton btplus; //  + 버튼
	JButton btmin; //  - 버튼
	JButton btmul; //  × 버튼
	JButton btdiv; //  ÷ 버튼
	JButton btdot; // 소수점 버튼
	JButton btequal; // = 버튼
	JButton btleft; //  ( 버튼
	JButton btright; // ) 버튼

	JButton btfact; //  x! 버튼
 
	JButton bt0; // 0 버튼
	JButton bt1; // 1 버튼
	JButton bt2; // 2 버튼
	JButton bt3; // 3 버튼
	JButton bt4; // 4 버튼
	JButton bt5; // 5 버튼
	JButton bt6; // 6 버튼
	JButton bt7; // 7 버튼
	JButton bt8; // 8 버튼
	JButton bt9; // 9 버튼

	Font font = new Font("맑은 고딕", Font.BOLD, 60);
	Font font2 = new Font("한컴 고딕", Font.BOLD, 60);
	Font font3 = new Font("한컴 고딕", Font.BOLD, 70);

	Color darkorange = new Color(255, 140, 000);  // 진주황색
	Color darkgray = new Color(169, 169, 169);  // 진회색
	Color lightgray = new Color(211, 211, 211); // 연회색
	Color silver = new Color(192, 192, 192);  // 실버색

	String numStr = "0"; // 수식과 계산값을 저장하는 변수 

	public Calculator() {
	
		setTitle("임수빈의 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.BLACK);  
		
		showlabel.setLocation(10,10);  // 입력하는 수식과 계산 결과 값이 보이는 창 설정
		showlabel.setSize(550,80);
		showlabel.setFont(font);
		showlabel.setHorizontalAlignment(SwingConstants.RIGHT);
		showlabel.setBackground(Color.BLACK);
		showlabel.setForeground(Color.white);
		
		
		// 1번째 줄
		
		btclear = new JButton("C");  //  C 버튼 설정
		btclear.setSize(135,100);
		btclear.setLocation(10,200);
		btclear.setFont(font);
		btclear.setBackground(Color.RED);
		btclear.setForeground(Color.WHITE);
		btclear.addActionListener(new MyActionListener());
		
		btfact= new JButton("x!");  //  x! 버튼 설정
		btfact.setSize(135,100);
		btfact.setLocation(153,200);
		btfact.setFont(font2);
		btfact.setBackground(lightgray);
		btfact.setForeground(Color.WHITE);
		btfact.addActionListener(new MyActionListener());
		
		btpercent = new JButton("%");  //  % 버튼 설정
		btpercent.setSize(135,100);
		btpercent.setLocation(297,200);
		btpercent.setFont(font);
		btpercent.setBackground(lightgray);
		btpercent.setForeground(Color.WHITE);
		btpercent.addActionListener(new MyActionListener());
		
		btplus = new JButton("+");  // + 버튼 설정
		btplus.setSize(135,100);
		btplus.setLocation(440,200);
		btplus.setFont(font2);
		btplus.setBackground(darkorange); 
		btplus.setForeground(Color.WHITE);
		btplus.addActionListener(new MyActionListener());
		
		
		// 2번째 줄
		
		btdel= new JButton("←");  //  ← 버튼 설정
		btdel.setSize(135,100);
		btdel.setLocation(10,310);
		btdel.setFont(font);
		btdel.setBackground(lightgray);
		btdel.setForeground(Color.WHITE);
		btdel.addActionListener(new MyActionListener());
		
		btleft= new JButton("(");  // 왼쪽 괄호 버튼 설정
		btleft.setSize(135,100);
		btleft.setLocation(153,310);
		btleft.setFont(font);
		btleft.setBackground(lightgray);
		btleft.setForeground(Color.WHITE);
		btleft.addActionListener(new MyActionListener());
		
		
		btright= new JButton(")");  // 오른쪽 괄호 버튼 설정
		btright.setSize(135,100);
		btright.setLocation(297,310);
		btright.setFont(font);
		btright.setBackground(lightgray);
		btright.setForeground(Color.WHITE);
		btright.addActionListener(new MyActionListener());
		
		btmin= new JButton("-");  // 빼기 버튼 설정
		btmin.setSize(135,100);
		btmin.setLocation(440,310);
		btmin.setFont(font2);
		btmin.setBackground(darkorange);
		btmin.setForeground(Color.WHITE);
		btmin.addActionListener(new MyActionListener());
		
		
		// 3번째 줄
		
		bt7= new JButton("7");  // 7 버튼 설정
		bt7.setSize(135,100);
		bt7.setLocation(10,420);
		bt7.setFont(font);
		bt7.setBackground(darkgray);
		bt7.setForeground(Color.WHITE);
		bt7.addActionListener(new MyActionListener());
		
		bt8= new JButton("8");  // 8 버튼 설정
		bt8.setSize(135,100);
		bt8.setLocation(153,420);
		bt8.setFont(font);
		bt8.setBackground(darkgray);
		bt8.setForeground(Color.WHITE);
		bt8.addActionListener(new MyActionListener());
		
		bt9= new JButton("9");   // 9 버튼 설정
		bt9.setSize(135,100);
		bt9.setLocation(297,420);
		bt9.setFont(font);
		bt9.setBackground(darkgray);
		bt9.setForeground(Color.WHITE);
		bt9.addActionListener(new MyActionListener());
		
		btmul= new JButton("×");  // 곱하기 버튼 설정
		btmul.setSize(135,100);
		btmul.setLocation(440,420);
		btmul.setFont(font2);
		btmul.setBackground(darkorange);
		btmul.setForeground(Color.WHITE);
		btmul.addActionListener(new MyActionListener());
		
		
		// 4번째 줄
		
		bt4= new JButton("4");  // 4버튼 설정
		bt4.setSize(135,100);
		bt4.setLocation(10,530);
		bt4.setFont(font);
		bt4.setBackground(darkgray);
		bt4.setForeground(Color.WHITE);
		bt4.addActionListener(new MyActionListener());
		
		bt5= new JButton("5");  // 5버튼 설정
		bt5.setSize(135,100);
		bt5.setLocation(153,530);
		bt5.setFont(font);
		bt5.setBackground(darkgray);
		bt5.setForeground(Color.WHITE);
		bt5.addActionListener(new MyActionListener());
		 
		bt6= new JButton("6");  // 6버튼 설정
		bt6.setSize(135,100);
		bt6.setLocation(297,530);
		bt6.setFont(font);
		bt6.setBackground(darkgray);
		bt6.setForeground(Color.WHITE);
		bt6.addActionListener(new MyActionListener());
		
		btdiv= new JButton("÷");  // 나누기 버튼 설정
		btdiv.setSize(135,100);
		btdiv.setLocation(440,530);
		btdiv.setFont(font2);
		btdiv.setBackground(darkorange);
		btdiv.setForeground(Color.WHITE);
		btdiv.addActionListener(new MyActionListener());
		
		
		//5번째 줄
		
		bt1= new JButton("1");   // 1버튼 설정
		bt1.setSize(135,100);
		bt1.setLocation(10,640);
		bt1.setFont(font);
		bt1.setBackground(darkgray);
		bt1.setForeground(Color.WHITE);
		bt1.addActionListener(new MyActionListener());
		
		bt2= new JButton("2");   // 2버튼 설정
		bt2.setSize(135,100);
		bt2.setLocation(153,640);
		bt2.setFont(font);
		bt2.setBackground(darkgray);
		bt2.setForeground(Color.WHITE);
		bt2.addActionListener(new MyActionListener());
		
		bt3= new JButton("3");   // 3버튼 설정
		bt3.setSize(135,100);
		bt3.setLocation(297,640);
		bt3.setFont(font);
		bt3.setBackground(darkgray);
		bt3.setForeground(Color.WHITE);
		bt3.addActionListener(new MyActionListener());
		
		
		// 6번째 줄
		
		bt0= new JButton("0");   // 0버튼 설정
		bt0.setSize(279,100);
		bt0.setLocation(10,750);
		bt0.setFont(font);
		bt0.setBackground(darkgray);
		bt0.setForeground(Color.WHITE);
		bt0.addActionListener(new MyActionListener());
		
		
		btdot= new JButton(".");   //  소수점 버튼 설정
		btdot.setSize(135,100);
		btdot.setLocation(297,750);
		btdot.setFont(font3);
		btdot.setBackground(darkgray);
		btdot.setForeground(Color.WHITE);
		btdot.addActionListener(new MyActionListener());
		
		
		btequal= new JButton("=");  //  = 버튼 설정
		btequal.setSize(135,210);
		btequal.setLocation(440,640);
		btequal.setFont(font3);
		btequal.setBackground(darkorange);
		btequal.setForeground(Color.WHITE);
		btequal.addActionListener(new MyActionListener());
		
		
		//  버튼들을  Container에 부착한다.
		
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
		
		
		// Container 설정
		setSize(600,900);   
		setLocation(630,35);
		setVisible(true);
	}

	private class MyActionListener implements ActionListener {  

		public void actionPerformed(ActionEvent e) {

			String str = e.getActionCommand();

			if (str.equals("C")) {  // 모두지우는 버튼을 누르면
				numStr = "";    //  입력한 수식을 모두 초기화
				showlabel.setText(numStr);  // 초기화된 수식을 화면에 보이도록 설정
			}

			else if (str.equals("←")) { // 방금 전에 쓴 것을 지우는 버튼을 누르면

				if (!numStr.equals("")) { // 지우려는 수식이 있는경우

					StringTokenizer first = new StringTokenizer(numStr, "+-×÷%.0123456789()!", true); // 입력된 수식을 분리한다.

					ArrayList<String> second = new ArrayList<String>();  // 분리된 문자들을 저장하는 리스트

					String change = "";  // 수정된 수식을 저장하는 문자열 변수 

					while (first.hasMoreTokens()) {

						second.add(first.nextToken());  // 리스트에 분리된 문자들을 하나씩 저장한다.
					}

					second.remove(second.size() - 1);  // 맨 마지막 문자를 지운다.

					for (int i = 0; i < second.size(); i++) {

						change += second.get(i);  //  change 변수에다가  수정된 문자들을 대입한다.
					}

					numStr = change;  // 수정된 수식으로 설정하고
					showlabel.setText(numStr);  // 화면에 보이도록 설정한다.
				}
			}

			else if (str.equals("x!")) {  // 팩토리얼 버튼을 누른 경우 

				numStr += "!";   //  수식에  ! 문자를 저장하고 
				showlabel.setText(numStr);  // 화면에 보이도록 설정한다.

			}

			else if (!str.equals("=")) {  // '=', 'C', '←', 'x!' 제외한  다른 버튼을 누른경우
				
				if(numStr.equals("0")) {  // 현재 수식이 0일때 
					
					
					// 더하기, 곱하기, 나누기, 퍼센트, 소수점을  제외한 다른 버튼을 누르면
					if(!str.equals("+") && !str.equals("×") && !str.equals("÷") && !str.equals("%") && !str.equals(".")) {  
						
						numStr=str;  // 0을 지우고 새로 입력한 수식을 대입한다.
					}
						
					else {   //  더하기, 곱하기 , 나누기 , 퍼센트 , 소수점 버튼을 누르면
						
						numStr += str;  // 현재 수식에 덧붙인다. 
					}
				}
				
				else {
					
					numStr += str;  // 입력한 수식을 저장한다.
				}
				
				showlabel.setText(numStr);  // 현재 화면에 보이도록 설정한다.
			}

			
			///////////////////////////////////// 수식을 계산한다.

			else if (str.equals("=") && !numStr.equals("")) {  //  수식을 입력한 상태에서  '=' 버튼을  눌렀을경우  

				StringTokenizer st = new StringTokenizer(numStr, "!+-×÷%()", true); // 입력한 수식을  연산자,숫자,괄호를 기준으로 분리한다.

				ArrayList<String> init = new ArrayList<String>();   // 괄호가 있는 수식을 저장하는 리스트
				ArrayList<String> intest = new ArrayList<String>(); // 괄호 안의 수식에서 연산자 우선순위를 처리하고 그 계산값을 저장하는 리스트

				ArrayList<String> before = new ArrayList<String>(); // 괄호안을 계산하고  곱하기 나누기 연산자가 있는 수식을 저장하는 리스트
				ArrayList<String> after = new ArrayList<String>(); // 괄호안과 곱하기 나누기 연산자 우선순위를 처리하고 남은 수식을 저장하는 리스트
				
				int leftseq = 0;  // 괄호열기 개수를 세어 오류를 잡는 변수 
				int rightseq = 0;  // 괄호닫기 개수를 세어 오류를 잡는 변수 

				try {   

					///////////////////////////////////// 수식 계산

					while (st.hasMoreTokens()) {

						init.add(st.nextToken()); // 입력한 수식에서 연산자,숫자,괄호를 기준으로 분리한 것을  init 리스트에 저장한다.
					}
					
					
					if(init.get(0).equals("-")) {   // 맨처음 음수가 나오면  앞에 0을 붙여서 계산 오류를 방지한다.
						
						ArrayList<String> init2 = new ArrayList<String>();  // 입력한 수식의 맨앞에 0을 붙여서 저장할 init2 리스트
						
						init2.add("0");   // 맨 처음에  숫자 0 저장
						
						for(int i=0;i<init.size();i++) {
							
							init2.add(init.get(i));  //  init 리스트의 요소들을  init2 리스트에 저장한다.
						}
						
						init = init2;	// 맨 앞에 0을 추가한 수식을  init 리스트에 새로 대입한다. 
					}
					
					
					for (int i = 0; i < init.size(); i++) {  
			
						if(init.get(i).equals("+") && init.get(i+1).equals("-")) {  //  '+' 연산자 뒤에  '-' 연산자가 나온 경우  빼기 연산으로 교체
							
							init.set(i, "-");
							init.remove(i+1);
						}
						
						else if(init.get(i).equals("(")) {  // 괄호열기 개수 세기
							
							leftseq++;
						}
						
						else if(init.get(i).equals(")")) {  // 괄호 닫기 개수 세기
							
							rightseq++;
						}
					}
					
					if(leftseq != rightseq) {  // 괄호열기와 닫기의 개수가 틀리면 예외처리
						
						throw new Exception();
					}

					
					for (int i = 0; i < init.size(); i++) { // 팩토리얼 계산을 하기 위한 반복문

						if (init.get(i).equals("!")) {  // '!' 연산자일 경우 

							if (i + 1 != init.size()) { //  '!' 연산자 뒤에 수식이 더 있는 경우
								
								// '!' 연산자 뒤에  사칙연산, 퍼센트,  괄호 닫기가 아닌  다른 수식이 있으면
								if (!init.get(i + 1).equals("+") && !init.get(i + 1).equals("-")
										&& !init.get(i + 1).equals("×") && !init.get(i + 1).equals("÷")
										&& !init.get(i + 1).equals("%") && !init.get(i + 1).equals(")")) { 
									
									throw new Exception(); // 오류로 예외처리
								}
							}

							if (i == 1) { // '!' 연산자 앞에 다른 수식없이 숫자 하나만 있는 경우 
								//  예를들어,  5! 인 경우  숫자 5의 인덱스는 0,  '!' 연산자 인덱스는 1

								long n = Long.parseLong(init.get(i - 1));  // 숫자를 long 타입으로 변환하여 대입
								long fact = 1;   //  팩토리얼 계산값을 저장할 변수 
								
								for (long j = n; j >= 1; j--) {   // 팩토리얼 계산을 한다. 
									
									fact *= j;
									
								}

								init.set(i - 1, String.valueOf(fact));  // 숫자 자리에  팩토리얼 계산 결과값을 넣는다. 
								init.remove(i);   //  '!' 연산자를  지운다.								 
							}

							
							else if (!init.get(i - 2).equals(".")) { // '!' 연산자 앞과 뒤에 다른 수식이 있고 실수가 아니면

								long n = Long.parseLong(init.get(i - 1));  // 숫자를 long 타입으로 변환하여 대입
								long fact = 1;    //  팩토리얼 계산값을 저장할 변수 

								for (long j = n; j >= 1; j--) {    // 팩토리얼 계산을 한다.

									fact *= j;

								}

								init.set(i - 1, String.valueOf(fact));   // 숫자 자리에  팩토리얼 계산 결과값을 넣는다
								init.remove(i);   //  '!' 연산자를  지운다. 
							} 
						}
					}
					
					
					for(int i=0; i<init.size();i++) {
										
						if(init.get(i).equals("%")) {   // 퍼센트 연산자일 경우
							
							
							if(i+1 != init.size()) {  // 뒤에 수식이 더 있을때 
								
								if(isNumber(init.get(i+1))) {  // 그것이 숫자일 경우    예  :  5%2 = 0.1
									
									ArrayList<String> init2 = new ArrayList<String>(); 
									
									
									for(int j=0;j<i-1;j++) {  // 퍼센트 연산자 앞에 있는 숫자 전까지 대입
										
										init2.add(init.get(j));  
									}
									
									// 퍼센트의 앞의 숫자에서 100을 나눈후  퍼센트 뒤의 숫자와 곱한다.
									double n = Double.parseDouble(init.get(i-1))/100 * Double.parseDouble(init.get(i+1));  
									
									init2.add(String.valueOf(n));  // 그 결과값을 대입
								
									for(int j=i+2;j<init.size();j++) {  // 퍼센트 뒤의 숫자 바로  다음 수식부터 대입
										
										init2.add(init.get(j)); 
									}

									init = init2;  // 수정한 수식을 대입한다.
								}
													
								else {  // 숫자가 아닐 경우   예 :  5% x 2  = 0.1
									
									double n = Double.parseDouble(init.get(i-1))/100;  // 퍼센트 앞의 숫자를 100 나눠서 
									
									init.set(i-1, String.valueOf(n));  // 대입한다.
									init.remove(i);  //  % 삭제
									i = i-1;  // % 가 연속적으로 나오는 경우를 대비함.  예 :  88%% 
								}
							}

								
							else {  // 뒤에 수식이 없는 경우    예 :  5%  = 0.05
								
								double n = Double.parseDouble(init.get(i-1))/100;  // 퍼센트 앞의 숫자를 100 나눠서 
								
								init.set(i-1, String.valueOf(n));  // 대입한다.
								init.remove(i);  //  %  삭제
							}
						}
					}

					
					int k = 0;  // init 리스트의  인덱스 변수 
					double innum = 0;   // 괄호안의 수식에서 연산자 우선처리를 한  결과값을 저장하는 변수
					
					while (k < init.size()) {  // init 리스트 길이만큼 반복한다.

						if (init.get(k).equals("(")) { // 괄호열기가 나오면
						
														
							///////////////////////////////////// 괄호 안의 수식 계산 시작

							while (true) { // 무한반복
								

								if (init.get(k).equals("(") && init.get(k+1).equals("-")) {  // 괄호안의 수식에서 처음으로 음수가 나오는 경우 
									
									
									ArrayList<String> init2 = new ArrayList<String>(); 
									
									
									for(int i=0;i<k;i++) {
										
										init2.add(init.get(i));  //  괄호 열기 전까지의 init의 수식을 저장한다.
									}
									
									init2.add(init.get(k));  // 괄호 저장
									init2.add("0");   // 숫자 0 저장
									
									for(int i=k+1;i<init.size();i++) {
										
										init2.add(init.get(i));  //  괄호안의 수식을 저장한다.
									}
									
									init = init2;	// 맨 앞에 0을 추가한 수식을 새로 대입한다. 
									k++;   // init 리스트의 인덱스를  1 증가시킨다. 
								}
								
								
								if (init.get(k).equals("(") && !init.get(k+1).equals("-")) {  // 괄호안의 수식에서 처음으로 음수가 나오지 않으면
									
									k++;   // init 리스트의 인덱스를  1 증가시킨다. 
									
								}

								if (init.get(k).equals(")")) { // 괄호닫기가 나오면

									double inresult = Double.parseDouble(intest.get(0)); // 괄호안의 수식에서 연산자 우선처리를 다하고 난 후 남은 수식을 계산하여 결과값을 저장하는 변수이다.
		
									int inpoint = 1; // 괄호안에서 연산자 우선처리를하고 남은 수식에서 1번째 연산자를 가리키는 인덱스, 0번째 자리는 숫자이다. 

									while (inpoint < intest.size()) {  

										if (intest.get(inpoint).equals("+")) { // 더하기가 나오면

											inresult += Double.parseDouble(intest.get(inpoint + 1)); // 더한다.
											inpoint += 2; // 그다음 연산자가 있는 자리로 인덱스를 설정한다.
										}

										else if (intest.get(inpoint).equals("-")) { // 빼기가 나오면
											
											inresult -= Double.parseDouble(intest.get(inpoint + 1)); // 뺀다.
											inpoint += 2; // 그다음 연산자가 있는 자리로 인덱스를 설정한다.
										}
									}
									

									before.add(String.valueOf(inresult)); // 괄호안을 계산한 최종값을  before 리스트에 추가한다.
		
									k++;  // init 리스트 인덱스를 1 증가시킨다.
									
									intest.clear(); // 괄호안의 수식을 계산한 결과값을 저장한 리스트를 초기화한다.

									break;
								}
														
								///////  괄호 안의 수식에서 연산자 우선순위를 계산한다.
								
								else if (init.get(k).equals("×")) {  // 곱하기가 나오는 경우    
									

									if (innum == 0) { // 곱하기 , 나누기 연산자가 연속적으로 있지 않으면  
										
										if(init.get(k+1).equals("-")) {   // 곱하기 뒤에 음수이면   예 : ( 6 x -3 ) = -18
											
											double n1 = Double.parseDouble(init.get(k - 1)); // 곱하기 연산자 앞의 숫자

											double n2 = (-1)*Double.parseDouble(init.get(k + 2)); // 마이너스 부호 뒤의 숫자
											
											init.remove(k+1);

											intest.set(intest.size() - 1, String.valueOf(n1 * n2)); // intest의 마지막 값을 교체한다.

											innum = n1 * n2; // 계산한 값을 대입한다.
											
											
											k += 2;  // 그다음 연산자가 있는 자리로 인덱스를 설정한다.
										}
										

										else {   //  예 :  ( 1 + 2 x 5 - 3 ) = 8
											
											double n1 = Double.parseDouble(init.get(k - 1)); // 곱하기 연산자 앞의 숫자

											double n2 = Double.parseDouble(init.get(k + 1)); // 곱하기 연산자 뒤의 숫자

											intest.set(intest.size() - 1, String.valueOf(n1 * n2)); // intest의 마지막 값을 교체한다.

											innum = n1 * n2; // 계산한 값을 대입한다.
											
											
											k += 2;  // 그다음 연산자가 있는 자리로 인덱스를 설정한다.		
										}
										
										continue;

									}

									else { // 곱하기 , 나누기 연산자가 연속적으로 있으면    
										
										if(init.get(k+1).equals("-")) {  // 곱하기 뒤에 음수이면   예 :  ( 2 ÷ 2 x -3 )  = -3
											
											double n2 = (-1)*Double.parseDouble(init.get(k + 2)); // 마이너스 부호 뒤의 숫자
											
											init.remove(k+1);  

											intest.set(intest.size() - 1, String.valueOf(innum * n2)); // 기존에 계산한 값에다가 추가로 곱하여  intest의 마지막 값과 교체한다.
											innum = innum * n2; // 계산한 값을 대입한다.
											k += 2;  // 그다음 연산자가 있는 자리로 인덱스를 설정한다.
											
										}
										
										
										else {   //   예 :  ( 1 + 2 ÷ 2 x 3 ) = 4
											
											double n2 = Double.parseDouble(init.get(k + 1)); // 곱하기 연산자 뒤의 숫자

											intest.set(intest.size() - 1, String.valueOf(innum * n2)); // 기존에 계산한 값에다가 추가로 곱하여  intest의 마지막 값과 교체한다.
											innum = innum * n2; // 계산한 값을 대입한다.
											k += 2;  // 그다음 연산자가 있는 자리로 인덱스를 설정한다.										
										}

										continue;
									}
								}

								else if (init.get(k).equals("÷")) { // 나누기가 나오는 경우 

									if (innum == 0) { // 곱하기 , 나누기 연산자가 연속적으로 있지 않으면   
										
										if(init.get(k+1).equals("-")) {  // 나누기 뒤에 음수이면    예 :  ( 6 ÷ -3 ) = -2
													
											double n1 = Double.parseDouble(init.get(k - 1)); // 나누기 연산자 앞의 숫자

											double n2 = (-1)*Double.parseDouble(init.get(k + 2)); // 마이너스 부호 뒤의 숫자
											
											init.remove(k+1);

											intest.set(intest.size() - 1, String.valueOf(n1 / n2)); // intest의 마지막 값을 교체한다.

											innum = n1 / n2; // 계산한 값을 대입한다.
											k += 2;  // 그다음 연산자가 있는 자리로 인덱스를 설정한다.
											
										}
										
										
										else {   //  예 : ( 6 ÷ 3 + 1 )  = 3

											double n1 = Double.parseDouble(init.get(k - 1)); // 나누기 연산자 앞의 숫자

											double n2 = Double.parseDouble(init.get(k + 1)); // 나누기 연산자 뒤의 숫자

											intest.set(intest.size() - 1, String.valueOf(n1 / n2)); // intest의 마지막 값을 교체한다.

											innum = n1 / n2; // 계산한 값을 대입한다.
											k += 2;  // 그다음 연산자가 있는 자리로 인덱스를 설정한다.
											
										}
						
										continue;

									}

									else { // 곱하기 , 나누기 연산자가 연속적으로 있으면   
										
										
										if(init.get(k+1).equals("-")) {  // 나누기 뒤에 음수이면    예 : ( 9 x 2 ÷ -3 )  = -6
											
											double n2 = (-1)*Double.parseDouble(init.get(k + 2)); // 마이너스 부호 뒤의 숫자
											
											init.remove(k+1);  

											intest.set(intest.size() - 1, String.valueOf(innum / n2)); // 기존에 계산한 값에다가 추가로 나누어 intest의 마지막 값과 교체한다.
											innum = innum / n2; // 계산한 값을 대입한다.
											k += 2;  // 그다음 연산자가 있는 자리로 인덱스를 설정한다.
											
										}
										
										
										else {   //  예  :  ( 1 - 9 x 2 ÷ 3 )  =  -5
											 
											double n2 = Double.parseDouble(init.get(k + 1)); // 나누기 연산자 뒤의 숫자

											intest.set(intest.size() - 1, String.valueOf(innum / n2)); // 기존에 계산한 값에다가 추가로 나누어 intest의 마지막 값과 교체한다.
											innum = innum / n2; // 계산한 값을 대입한다.
											k += 2;  // 그다음 연산자가 있는 자리로 인덱스를 설정한다.			
											
										}

										continue;
									}
								}
								
						

								else { // 곱하기 , 나누기 , 숫자가 아니면 

									intest.add(init.get(k)); // intest에 추가한다.
									innum = 0; // 연산자 우선순위를 계산한  결과값을 초기화한다.
									k++;  // init 리스트의 인덱스를 1 증가시킨다.
								}
							}
						}  ///////////////////////////////////// 괄호 안의 수식 계산 끝
						

						else {  // 괄호안이 아니면

							before.add(init.get(k)); //  before 리스트에  추가한다.
							k++;  // init 리스트의 인덱스를 1 증가시킨다.

						}
					}

					
					///////////////////////////////////// 괄호안을 모두 계산하고  남은 수식에서 곱하기,나누기 , 퍼센트 계산을 우선처리를 한다. 

					int i = 0;  //  before 리스트의 인덱스 변수
					double num = 0; // 연산자 우선순위를 처리하고 결과값을 저장할 변수

					while (i < before.size()) { // 연산자 우선순위 설정
						
						
						//////  숫자가 아닌 경우 
						if( !isNumber(before.get(i)) ) { 

							if (before.get(i).equals("×")) { // 곱하기 연산자

								if (num == 0) { // 곱하기 , 나누기  연산자가 연속적으로 있지 않으면
									
									if(before.get(i+1).equals("-")) {  // 곱하기 뒤에 음수이면   예 :  6 x -3 = -18
										
										
										double n1 = Double.parseDouble(before.get(i - 1)); // 곱하기 연산자 앞의 숫자

										double n2 = (-1)*Double.parseDouble(before.get(i + 2)); // 마이너스 부호 뒤의 숫자
										
										before.remove(i+1);

										after.set(after.size() - 1, String.valueOf(n1 * n2)); // after의 마지막 값을 교체한다.

										num = n1 * n2; // 계산한 값을 대입한다.
										i +=2; // 그다음 연산자가 있는 자리로 인덱스를 설정한다.
										
									}
									
									else {    // 예 :  6 x 3 = 18
										
										double n1 = Double.parseDouble(before.get(i - 1)); // 곱하기 연산자 앞의 숫자

										double n2 = Double.parseDouble(before.get(i + 1)); // 곱하기 연산자 뒤의 숫자

										after.set(after.size() - 1, String.valueOf(n1 * n2)); // after의 마지막 값을 교체한다.

										num = n1 * n2; // 계산한 값을 대입한다.
										i +=2; // 그다음 연산자가 있는 자리로 인덱스를 설정한다.
										
									}
									
									continue;
								}

								else { // 곱하기 , 나누기 연산자가 연속적으로 있으면
									
									
									if(before.get(i+1).equals("-")) {  // 곱하기 뒤에 음수이면   예 : 6 ÷ 2 x -3  = -9
										
										double n2 = (-1)*Double.parseDouble(before.get(i + 2)); // 마이너스 부호 뒤의 숫자
										
										before.remove(i+1);  

										after.set(after.size() - 1, String.valueOf(num * n2)); // 기존에 계산한 값에다가 추가로 곱하여 after의 마지막 값과 교체한다.
										
										num = num * n2; // 계산한 값을 대입한다.
										i +=2; // 그다음 연산자가 있는 자리로 인덱스를 설정한다.
										
									}
									

									else {    //  예 :  6 ÷ 2 x 3  = 9
										
										double n2 = Double.parseDouble(before.get(i + 1)); // 곱하기 연산자 뒤의 숫자

										after.set(after.size() - 1, String.valueOf(num * n2)); // 기존에 계산한 값에다가 추가로 곱하여 after의 마지막 값과 교체한다.
										
										num = num * n2; // 계산한 값을 대입한다.
										i +=2;  // 그다음 연산자가 있는 자리로 인덱스를 설정한다.
									}
									
									
									continue;
								}
							}

							else if (before.get(i).equals("÷")) { // 나누기 연산자

								if (num == 0) { // 곱하기 , 나누기 연산자가 연속적으로 있지 않으면
									
									
									if(before.get(i+1).equals("-")) {  // 나누기 뒤에 음수이면   예 :  6 ÷ -3 = -2
										
										
										double n1 = Double.parseDouble(before.get(i - 1)); // 나누기 연산자 앞의 숫자

										double n2 = (-1)*Double.parseDouble(before.get(i + 2)); // 마이너스 부호 뒤의 숫자
										
										before.remove(i+1);

										after.set(after.size() - 1, String.valueOf(n1 / n2)); // after의 마지막 값을 교체한다.

										num = n1 / n2; // 계산한 값을 대입한다.
										i +=2; // 그다음 연산자가 있는 자리로 인덱스를 설정한다.
										
									}
									
									else {   //  예 :  6 ÷ 3 = 2
										
										double n1 = Double.parseDouble(before.get(i - 1)); // 나누기 연산자 앞의 숫자
										
										double n2 = Double.parseDouble(before.get(i + 1)); // 나누기 연산자 뒤의 숫자

										after.set(after.size() - 1, String.valueOf(n1 / n2)); // after의 마지막 값을 교체한다.

										num = n1 / n2; // 계산한 값을 대입한다.
										i +=2;  // 그다음 연산자가 있는 자리로 인덱스를 설정한다.
									}
									
									continue;

								}

								else { // 곱하기 , 나누기 연산자가 연속적으로 있으면
									
									if(before.get(i+1).equals("-")) {  // 나누기 뒤에 음수이면  예 :  9 x 2 ÷ -3  = -6
										
										double n2 = (-1)*Double.parseDouble(before.get(i + 2)); // 마이너스 부호 뒤의 숫자
										
										before.remove(i+1);  

										after.set(after.size() - 1, String.valueOf(num / n2)); // 기존에 계산한 값에다가 추가로 나누어 after의 마지막 값과 교체한다.
										
										num = num / n2; // 계산한 값을 대입한다.
										i +=2; // 그다음 연산자가 있는 자리로 인덱스를 설정한다.
										
									}
									
									else {   //  예 :  9 x 2 ÷ 3  = 6
										
										double n2 = Double.parseDouble(before.get(i + 1)); // 나누기 연산자 뒤의 숫자
										
										after.set(after.size() - 1, String.valueOf(num / n2)); // 기존에 계산한 값에다가 추가로 나누어 after의 마지막 값과 교체한다.
			
										num = num / n2; // 계산한 값을 대입한다.
										i +=2;    // 그다음 연산자가 있는 자리로 인덱스를 설정한다.
										
									}
	
									continue;
								}
								
							}


							else {  // 곱하기 , 나누기  연산자가 아닌 경우

								num = 0; // 계산한 값을 초기화한다.
								
								after.add(before.get(i)); // after에 추가한다.
								
								i++;  //  before 리스트의 인덱스를 1 증가시킨다.
							}
						}

						else { // 숫자일 경우 

							after.add(before.get(i)); // after에 추가한다.
							
							i++;   //  before 리스트의 인덱스를 1 증가시킨다.

						}
					}

					///////////////////////////////////// 곱하기,나누기 연산자 우선처리하고 남은 수식을 계산하여 최종 결과값을 구한다.

					double result = Double.parseDouble(after.get(0));  // 최종 계산 결과값을 저장하는 변수 after의 첫번째 숫자를 대입한다.

					for (int j = 1; j < after.size(); j++) {

						if (after.get(j).equals("+")) { // 더하기
							
							result += Double.parseDouble(after.get(j + 1)); // 그다음 숫자를 더한다.
						}

						else if (after.get(j).equals("-")) { // 빼기

							result -= Double.parseDouble(after.get(j + 1)); // 그다음 숫자를 뺀다.
						}

						else if (after.get(j).equals("!")) { // '!' 연산자가 있으면

							throw new Exception(); // 예외처리
						}
					}
					
					if (!isDouble(result)) { // 최종 결과값이 정수이면

						int result2 = (int) result; // 소수부분을 없애고 정수부분만 남겨 최종결과값을 구하고 
						numStr = String.valueOf(result2); // 수식을 저장하는 변수에 최종 결과값을 대입한다.

					}

					else if (isDouble(result)) { // 최종 결과값이 실수이면

						numStr = String.valueOf(result); // 수식을 저장하는 변수에 최종 결과값을 대입한다.

					}

					showlabel.setText(numStr); //  최종 결과값을 화면에 보이게한다.
				}

				catch (Exception e2) {   // 예외처리
					showlabel.setText("수식오류");  // 화면에  "수식오류" 라는  문구를 보이게 한다.
					numStr = "";   //  수식을 저장하는 변수를 초기화한다. 
				}
			}
		}
	}
		
	public boolean isDouble(double n) { // 실수이면 true 리턴하고  정수이면 false 리턴한다.

		int n2 = (int) n;  // 정수부분을 대입한다.

		if (n - n2 != 0.0) {  // 소수부분이 0.0이 아니면  실수이므로
			 
			return true;   // true 리턴
		}

		else   //  소수부분이  0.0 이면  정수이므로 
			return false;   //  false 리턴
	}
	
	public boolean isNumber(String s) {   // 숫자인지 판별하는 함수 
		
		try {    
			
			Double.parseDouble(s);   
			return true;   //  숫자이면  True 리턴
		
		} 
		catch (NumberFormatException e) { 
			return false;   // 아니면  False 리턴
			
		} 
	}
	
	public static void main(String[] args) {  // main 함수 
		new Calculator();   
	}
}
