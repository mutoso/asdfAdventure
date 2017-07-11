import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;

import javax.imageio.ImageIO;
import javax.swing.*;
 
public class MapWindow extends JPanel
{
	private static final long serialVersionUID = -1324565298611507470L;
	Image image;
 
    public MapWindow() 
    {
    	
    	Path path = FileSystems.getDefault().getPath("full.png");
    	BufferedImage image = null;
		try {
			image = ImageIO.read(path.toFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
        this.image = image;
        this.setOpaque(true);
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setContentPane(this);
        f.setSize(Player.mapWidth,Player.mapHeight);
        f.setLocation(Player.mapSpwanX,Player.mapSpwanY);
        f.setVisible(true);
    }
 
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        Image scaledImage = image.getScaledInstance(getWidth(),getHeight(), Image.SCALE_SMOOTH);
        g.drawImage(scaledImage, 0, 0, getWidth(), getHeight(),this);
    }
}