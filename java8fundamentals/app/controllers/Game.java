package controllers;

import play.mvc.*;
import views.html.*;

public class Game extends Controller{
	public static Result threadsExample() {
		return ok(threadsexample.render());
	}
}
