package jasper.k.game;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageButtonTest extends Applet implements ActionListener {
	ImageButton button;
	Image[] images = new Image[4];
	
	@Override
	public void init() {
		setLayout(null);
		
//		URL url = getCodeBase();
//		System.out.println(url.toString());

		try {
			URL url1 = new URL("file:/home/hookey/Documents/projects/workspace/hookeycamp/java8fundamentals/app/jasper/k/game/images/");
			System.out.println(url1.toString());
			
			MediaTracker tracker = new MediaTracker(this);
			
			for(int i =0;i<4;i++){
				images[i] = getImage(url1,"image"+i+".gif");
				tracker.addImage(images[i], 0);
			}
			try {
				tracker.waitForAll();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// Why ??
			while ((tracker.statusAll(true) & MediaTracker.COMPLETE) == 0){
			}
			
			button = new ImageButton(images);
			button .setBounds(0, 0, 70, 30);
			button.addActionListener(this);
			add(button);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == button){
			System.out.println("ActionEvent performed!");
		}
	}
	
}
