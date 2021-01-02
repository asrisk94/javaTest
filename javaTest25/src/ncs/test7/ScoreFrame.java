package ncs.test7;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class ScoreFrame extends JFrame {
	
	private JTextField javaScore;
	private JTextField sqlScore;
	private JTextField total;
	private JTextField average;
	private JButton calcBtn;
	
	public ScoreFrame() {
		super();
		
		setTitle("문제 7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 400);
		setLocationRelativeTo(null);
		setLayout(null);
		
		
		
		//라벨
		JLabel calcLabel = new JLabel("점수를 입력하세요");
		calcLabel.setBounds(65, 10, 550, 100);
		calcLabel.setFont(new Font("굴림", Font.PLAIN, 65));
		calcLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(calcLabel);
		
		JLabel javaLabel = new JLabel("자바");
		javaLabel.setBounds(30, 120, 80, 40);
		javaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		javaLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		add(javaLabel);
		
		JLabel sqlLabel = new JLabel("SQL");
		sqlLabel.setBounds(380, 120, 80, 40);
		sqlLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sqlLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		add(sqlLabel);
		
		JLabel sumLabel = new JLabel("총점");
		sumLabel.setBounds(30, 280, 80, 40);
		sumLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sumLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		add(sumLabel);
		
		JLabel averageLabel = new JLabel("평균");
		averageLabel.setBounds(380, 280, 80, 40);
		averageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		averageLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		add(averageLabel);
		
		
		
		// 텍스트필드
		javaScore = new JTextField();
		javaScore.setBounds(120, 120, 170, 40);
		javaScore.setFont(new Font("굴림", Font.PLAIN, 20));
		javaScore.setColumns(10);
		add(javaScore);
		
		sqlScore = new JTextField();
		sqlScore.setBounds(470, 120, 170, 40);
		sqlScore.setFont(new Font("굴림", Font.PLAIN, 20));
		sqlScore.setColumns(10);
		add(sqlScore);
		
		total = new JTextField();
		total.setBounds(120, 280, 170, 40);
		total.setFont(new Font("굴림", Font.PLAIN, 20));
		total.setColumns(10);
		add(total);
		
		average = new JTextField();
		average.setBounds(470, 280, 170, 40);
		average.setFont(new Font("굴림", Font.PLAIN, 20));
		average.setColumns(10);
		add(average);
		
		
		
		// 계산버튼
		calcBtn = new JButton("계산하기");
		calcBtn.setBounds(270, 200, 140, 50);
		calcBtn.setFont(new Font("굴림", Font.PLAIN, 25));
		add(calcBtn);
		ActionHandler ah = new ActionHandler();
		calcBtn.addActionListener(ah);
		
		
		
		// 액션리스너 정의
		javaScore.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		sqlScore.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
		
		
		
	} // 생성자 괄호
	
	class ActionHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int jav = Integer.parseInt(javaScore.getText());
			int sql = Integer.parseInt(sqlScore.getText());
			
			int sum = jav + sql;
			double avg = ((int)(sum/2.0*10))/10.0;
			
			String sumStr = Integer.toString(sum);
			String avgStr = Double.toString(avg);
			
			total.setText(sumStr);
			average.setText(avgStr);
			
		}
		
	}
	
}
