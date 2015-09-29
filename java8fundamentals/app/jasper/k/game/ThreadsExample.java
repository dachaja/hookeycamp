package jasper.k.game;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThreadsExample extends Applet{
	ThreadRunner[] runners;
	
	public void init() {
		runners = new ThreadRunner[4];
		
		setLayout(null);
		for(int i=0;i<runners.length;i++){
			runners[i] = new ThreadRunner();
			runners[i].setBounds(0, i *25 +5, 315, 25);
			add(runners[i]);
		}
	}
	@Override
	public void start() {
		repaint();
	}
}
class ThreadRunner extends Panel implements Runnable, ActionListener{
	Thread thread;
	
	Button startOrStop, suspendOrResume;
	
	boolean isRun = false;
	boolean isSuspend = false;
	
	int position;
	
	public ThreadRunner() {
		super();
		setupGUI();
	}
	
	private void setupGUI() {
		setLayout(null);
		
		startOrStop = new Button("start");
		startOrStop.setBounds(205, 0, 50, 20);
		startOrStop.addActionListener(this);
		add(startOrStop);
		
		suspendOrResume = new Button("suspend");
		suspendOrResume.setBounds(260, 0, 50, 20);
		suspendOrResume.addActionListener(this);
		suspendOrResume.setEnabled(false);
		add(suspendOrResume);
		
		
	}
	
	public void start() {
		isRun= true;
		
		thread = new Thread(this);
		thread.start();
	}
	
	public void stop() {
		isRun = false;
		isSuspend = false;
		
		if(thread != null)
			thread.interrupt();
	}
	
	public void suspend() {
		isSuspend = true;
		
		if(thread != null)
			thread.interrupt();
	}
	
	public void resume(){
		synchronized (thread) {
			isSuspend = false;
			thread.notify();
		}
	}
	public void update(Graphics g) {
		paint(g);	
	}
	
	public void paint(Graphics g){
		g.setColor(Color.gray);
		g.fillRect(0, 0, 200, 20);
		g.setColor(Color.black);
		g.drawRect(0, 0, 200, 20);
		g.setColor(Color.red);
		g.fillRect(0, 5, position * 2, 10);
		
		if(position >= 100) {
			g.setColor(Color.blue);
			g.drawString("finish", 80, 15);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
				if("start".equals(cmd)){
					position = 0;
					startOrStop.setLabel("stop");
					suspendOrResume.setLabel("suspend");
					suspendOrResume.setEnabled(true);
					start();
				} else if ( "stop".equals(cmd)) {
					position = 0;
					startOrStop.setLabel("stop");
					suspendOrResume.setLabel("suspend");
					suspendOrResume.setEnabled(false);
					stop();
				} else if("suspend".equals(cmd)){
					suspendOrResume.setLabel("resume");
					suspend();
				} else if("resume".equals(cmd)){
					suspendOrResume.setLabel("suspend");
					resume();
				}
	}

	@Override
	public void run() {
		while(isRun) {
			position++;
			repaint(0);
			
			while(isSuspend == true){
				synchronized (thread) {
					try {
					thread.wait();
					} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}	
				}
			}
			
			try {
				if(!thread.interrupted())
				thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(position >= 100)
				break;
		}
		repaint();
		startOrStop.setLabel("start");
		suspendOrResume.setLabel("suspend");
		suspendOrResume.setEnabled(false);
		
		thread = null;		
	}
	
}
