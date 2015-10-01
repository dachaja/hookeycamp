package jasper.k.game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class ImageButton extends Component{
	// constant for button's state
	public static final int ENABLED  = 0;
	public static final int DISABLED = 1;
	public static final int ENTERED  = 2;
	public static final int PRESSED  = 3;
	
	private int state; // current state of this button.
	private Rectangle rect; //button's bounds.
	
	ActionListener actionListener = null; // event Listener
	
	Image[] images; //button images
	Image offImage; // for double buffering.
	Graphics offScreen; //for double buffering.
		/*
		 * constructs a new ImageButton.
		 * */
	public ImageButton(Image[] images) {
		this.images = images;
		state = ENABLED;
		enableEvents(AWTEvent.MOUSE_EVENT_MASK);
		
	}
	/*
	 * Add ActionListener to this button. 
	 * */
	
	public void addActionListener(ActionListener l) {
		if(l==null)
			return;
		actionListener = AWTEventMulticaster.add(actionListener, l);
	}
	/*
	 *  Remove ActionListener to this button.
	 * */
	
	public void removeActionListener(ActionListener l){
		if(l==null)
			return;
		actionListener = AWTEventMulticaster.remove(actionListener, l);
	}
	
	/*
	 * Set button's state is ENABLED or DISABLED
	 * @param enable if true, state is ENABLED, Else state is DISABLED.
	 * */
	public void setEnabled (boolean enable){
		if(enable)
			state = ENABLED;
		else
			state = DISABLED;
		repaint();
	}
	public void update(Graphics g){
		if(rect == null) {
			rect = getBounds();
		}
		if(offImage == null) {
			offImage = createImage(rect.width, rect.height);
			offScreen = offImage.getGraphics();	
		}
		paint(g);
	}
	@Override
	public void paint(Graphics g) {
		if(offScreen==null) {
			update(g);
			return;
		}
		switch (state) {
		case ENABLED:
			offScreen.drawImage(images[ENABLED],0, 0, rect.width, rect.height,this);
			break;
		case DISABLED:
			offScreen.drawImage(images[DISABLED],0, 0, rect.width, rect.height,this);
			break;
		case ENTERED:
			offScreen.drawImage(images[ENTERED],0, 0, rect.width, rect.height,this);
			break;
		case PRESSED:
			offScreen.drawImage(images[PRESSED],0, 0, rect.width, rect.height,this);
			break;

		}
		g.drawImage(offImage, 0, 0, this);
	}
	@Override
	protected void processMouseEvent(MouseEvent e) {
		switch (e.getID()) {
		case MouseEvent.MOUSE_ENTERED:
			if(state==DISABLED)
				return;
			state = ENTERED;
			repaint();
			break;
		case MouseEvent.MOUSE_EXITED :
			if(state == DISABLED)
				return;
			state = ENABLED;
			repaint();
			break;
		case MouseEvent.MOUSE_PRESSED:
			if(state == DISABLED || state==PRESSED) {
				return;
			}
			state = PRESSED;
			repaint();
			break;
		case MouseEvent.MOUSE_RELEASED:
			if(state != PRESSED){
				return;
			}
			if(!rect.contains(e.getX(),e.getY())){
				state = ENABLED;
				return;
			}
			state = ENTERED;
			repaint();
			// create Action Event and dispatch
			actionListener.actionPerformed(new ActionEvent(this,ActionEvent.ACTION_PERFORMED,null));
			break;
		}
	}
}
