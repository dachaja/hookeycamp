package anna.p.game;

import java.applet.Applet;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageButtonTest extends Applet implements ActionListener{
	ImageButton button;
	Image[] images = new Image[4];
	
	@Override
	public void init() {
		setLayout(null);
		
		//URL url = getCodeBase();
		//System.out.println(url.toString());
		try {
			URL url = new URL("file:/Users/adokalways/Documents/"
					+ "Projects/dachaja/hookeycamp/java8fundamentals/"
					+ "app/anna/p/game/images/");
			System.out.println(url.toString());
			
			MediaTracker tracker = new MediaTracker(this);
			
			for (int i = 0; i < 4; i++) {
				images[i] = getImage(url, "image" + i + ".gif");
				tracker.addImage(images[i], 0);
			}
			
			try {
				tracker.waitForAll();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// Why??
			while ((tracker.statusAll(true) & MediaTracker.COMPLETE) 
					== 0) {
			}
			
			button = new ImageButton(images);
			button.setBounds(0, 0, 70, 30);
			button.addActionListener(this);
			add(button);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == button)
			System.out.println("ActionEvent performed!");
		
	}

}
