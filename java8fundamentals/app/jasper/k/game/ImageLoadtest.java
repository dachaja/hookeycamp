package jasper.k.game;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageLoadtest extends Applet implements Runnable {
	private ImageLoader loader;
	private Thread thread;
	private String[] images;
	
	private boolean loaded = false;
	private Image offImage;
	private Graphics offScreen;
	
	public void init() {
		setSize(300,200);
		loader = ImageLoader.getInstance();
		
		images = new String[18];
		for (int i = 1; i <=9; i++) {
			images[i-1] = "angel" + i + ".gif";
			images[i+8] = "evil" + i + ".gif";
		}
	}
	@Override
	public void start() {
		try {
			URL url = new URL("file:/home/hookey/Documents/projects/workspace/hookeycamp/java8fundamentals/app/jasper/k/game/images/imageloader/");
			loader.load(this, url, "image", images);
			
			thread = new Thread(this);
			thread.start();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	@Override
	public void update(Graphics g) {
		if(offImage==null) {
			offImage = createImage(getSize().width, getSize().height);
			offScreen = offImage.getGraphics();
		}
		paint(g);
	}
	
	@Override
	public void paint(Graphics g) {
		if(offScreen == null){
			update(g);
			return;
		}
		offScreen.setColor(getBackground());
		offScreen.fillRect(0, 0, getSize().width, getSize().height);
		if(!loaded) {
			int rate = loader.getLoadRate();
			offScreen.setColor(Color.blue);
			offScreen.drawRect(50, 50, 200, 25);
			offScreen.fillRect(50, 50, 200*rate/100, 25);
			
			if(rate== 100 ){
				loaded= true;
			}
			g.drawImage(offImage, 0, 0, this);
			return;
		}
		
		offScreen.setColor(Color.black);
		offScreen.drawString("LOADING COMPLETED", 80, 80);
		
		Image angel1 = loader.getImage("angel1");
		offScreen.drawImage(offImage, 0, 0, this);
		g.drawImage(offImage, 0, 0, this);
	}
	
	@Override
	public void run() {
		while(true) {
			repaint();
			try{
				Thread.sleep(100);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
}
