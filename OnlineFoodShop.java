import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OnlineFoodShop extends JPanel {

    private BufferedImage backgroundImage;
    private BufferedImage chefImage;
    private BufferedImage foodImage;

    public OnlineFoodShop() {
        try {
            backgroundImage = ImageIO.read(new File("path/to/your/background.jpg"));
            chefImage = ImageIO.read(new File("path/to/your/chef.png"));
            foodImage = ImageIO.read(new File("path/to/your/food.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw background image
        g2d.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), null);

        // Draw text
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.BOLD, 30));
        g2d.drawString("Online FoodShop", getWidth() / 2 - 150, 50);

        g2d.setFont(new Font("Arial", Font.PLAIN, 18));
        g2d.drawString("Home", getWidth() / 2 - 200, 100);
        g2d.drawString("About", getWidth() / 2 - 100, 100);
        g2d.drawString("Menu", getWidth() / 2, 100);
        g2d.drawString("ContactUs", getWidth() / 2 + 100, 100);
