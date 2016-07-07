package sunw.demo.bean;
import java.awt.*;
import java.awt.event.*;
public class bean extends Canvas
{
int count;
public bean()
{
addMouseListener(new MouseAdapter() 
{
public void mousePressed(MouseEvent me) 
{
clicked();
}
});
count = 0;
setSize(200, 100);
}
public void clicked()
{
count++;
repaint();
}
public void paint(Graphics g)
{
Dimension dimension = getSize();
int height = dimension.height;
int width = dimension.width;
g.setColor(new Color(255, 0, 0));
g.fillRect(0, 0, --width, --height);
g.setColor(new Color(0, 0, 0));
g.drawString("Click count = " + count, 50, 50);
}
}
