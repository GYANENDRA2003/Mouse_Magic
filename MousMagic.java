import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class MousMagic {
	JFrame fr=new JFrame("Mouse Magic");
	JLabel la=new JLabel("TOUCH ME TO SEE MAGIC");
	Random ra=new Random();
	int c=0;
	public MousMagic()
	{
		fr.setSize(1200,650);
		fr.setLocationRelativeTo(null);
		fr.setResizable(false);
		fr.setDefaultCloseOperation(3);
		fr.setLayout(	null);
		la.setBounds(200,100,300,40);
		la.setForeground(Color.red);
		la.setFont(new Font("arial",1,22));
		fr.add(la);
		la.addMouseListener(new MagicListener());
		fr.addKeyListener(new AA());
		fr.setVisible(true);
	}
	class MagicListener implements MouseListener
	{
		public void mouseEntered(MouseEvent evt)
		{
			if(c==0)
			{
				int x=ra.nextInt(900);
				int y=ra.nextInt(550);
				la.setLocation(x,y);
			}
			c=0;
		}
		public void mouseExited(MouseEvent evt){}
		
		public void mouseClicked(MouseEvent evt) {}
		public void mousePressed(MouseEvent evt) {}
		public void mouseReleased(MouseEvent evt) {}
	}
	class AA implements KeyListener
	{
		public void keyPressed(KeyEvent evt)
		{
			char ch=evt.getKeyChar();
			if(ch=='k')
				c=1;
		}
		public void keyTyped(KeyEvent evt) {}
		public void keyReleased(KeyEvent evt) {}
	}
	public static void main(String[] args) 
	{
		new MousMagic();
	}
}
