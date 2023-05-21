package SidebarMenu;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class IconItems extends JButton{
    
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Dimension getImageSize() {
        return imageSize;
    }

    public void setImageSize(Dimension imageSize) {
        this.imageSize = imageSize;
        repaint();
    }
    
    private final Animation animation;
    private Image image; 
    private Dimension imageSize = new Dimension(40,40);
    public IconItems() {
        setContentAreaFilled(false);
        setBorder(null);
        animation = new Animation(this);
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
               animation.mouseEnter();
            }

            @Override
            public void mouseExited(MouseEvent e) {
               animation.mouseExit();
            }
            
            
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        int width = getWidth();
        int height = getHeight();
        int x = (width-imageSize.width)/2;
        int y = (height-imageSize.height)/2;
        g2.drawImage(image, x, y, imageSize.width, imageSize.height, null);
        super.paintComponent(g);
    }
    
    
}
