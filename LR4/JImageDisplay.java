import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class JImageDisplay extends JPanel 
{
	
	private int width;
	private int height;
	
	// �������� � ������� ��� ���������
	private BufferedImage bImg;
	
	// ����� ��� ���������
	private Graphics g;
	
    //������������
	public JImageDisplay() 
	{
		
	}
	
	public JImageDisplay(int size) 
	{
		this(size, size);
	}
	
	public JImageDisplay(int width, int height) 
	{
		this.width = width;
		this.height = height;	
		
		// �������� �������� ��������
		bImg = new BufferedImage(this.width, this.height, BufferedImage.TYPE_INT_RGB);
		
		// ��������� ������� Graphics �� ������� BufferedImage
		g = bImg.getGraphics();
		
		// ��������� �������� �����������
		this.setStartImage();
		this.repaint();
	}
	
	// ���� ���������
	public void drawPixel(int x, int y, Color color) 
	{
		// ��������� �����
		g.setColor(color);
		
		// ����������� �������
		g.fillRect(x, y, 1, 1);
		
		this.repaint();
	}
	
	//������� �� ��������� �� ��������, ����� ���������� ��� ��������� frame, � ��� ������ repaint()

    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        g.drawImage(bImg, 0, 0, null);
    }
	
	//������� ����������� - ������ �����
	public void clearImage() 
	{
		g.setColor(Color.black);
		g.fillRect(0, 0, bImg.getWidth(), bImg.getHeight());
		this.repaint();
	}
	
	public void setStartImage() 
	{
		g.setColor(Color.orange);
		g.fillRect(bImg.getWidth() / 2 - 51, bImg.getHeight() / 2 - 51, 100, 100);	
		g.setColor(Color.white);
		g.fillRect(bImg.getWidth() / 2 - 25, bImg.getHeight() / 2 - 25, 50, 50);
		
		g.setColor(Color.orange);
		g.fillRect(bImg.getWidth() / 2 - 13, bImg.getHeight() / 2 - 13, 25, 25);	
		g.setColor(Color.white);
		g.fillRect(bImg.getWidth() / 2 - 7, bImg.getHeight() / 2 - 7, 13, 13);
		this.repaint();
	}
}