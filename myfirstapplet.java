import java.applet.*;

public class myfirstapplet extends Applet {
   
    int i;

    // init() is called when the applet is loaded by the browser.
    public void init() {
	try {
	    System.loadLibrary("hi java!");
	}
	catch(Exception error) {
	    System.out.println(error.getMessage());
	}
    }
}