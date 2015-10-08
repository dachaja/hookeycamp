package anna.p.game;

import java.applet.Applet;
import java.awt.Image;
import java.awt.MediaTracker;
import java.net.URL;
import java.util.Hashtable;

public class ImageLoader implements Runnable{
	// Singleton
	private static ImageLoader loader;
	
	// Repository for Images
	private Hashtable<String, Image> images;
	// MediaTracker
	private MediaTracker tracker;
	// Total number of images to load
	private int nTotal;
	// number of loaded images
	private int nLoaded;
	// thread for loading
	private Thread thread;
	
	// constructor
	private ImageLoader() {
		images = new Hashtable<>();
	}
	
	// get instance
	public static ImageLoader getInstance() {
		if(loader == null) {
			loader = new ImageLoader();
		}
		return loader;
	}
	
	// load images
	public void load(Applet applet, URL url, String dir, String type, String[] name) {
		tracker = new MediaTracker(applet);
		nTotal = name.length;
		nLoaded = 0;
		
		Image image = null;
		for (int i = 0; i < nTotal; i++) {
			image = applet.getImage(url, dir + "/" + name[i] + "." + type);
			tracker.addImage(image, i);
			images.put(name[i], image);
		}
		thread = new Thread(this);
		thread.start();
	}
	
	// load images
	public void load(Applet applet, URL url, String dir, String[] name) {
		tracker = new MediaTracker(applet);
		nTotal = name.length;
		nLoaded = 0;
		
		Image image = null;
		int index = 0;
		for (int i = 0; i < nTotal; i++) {
			image = applet.getImage(url, dir + "/" + name[i]);
			tracker.addImage(image, i);
			
			index = name[i].lastIndexOf(".");
			images.put(name[i].substring(0, index),image);
		}
		thread = new Thread(this);
		thread.start();
	}
	
	// get image
	public Image getImage(String name) {
		return images.get(name);
	}
	
	// get loading rate
	public int getLoadRate() {
		return (int)(100 * nLoaded / nTotal);
	}

	@Override
	public void run() {
		for (int i = 0; i < nTotal; i++) {
			try {
				tracker.waitForID(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			while((tracker.statusID(i, true) & MediaTracker.COMPLETE) == 0) {
				// loop.
			}
			nLoaded++;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
