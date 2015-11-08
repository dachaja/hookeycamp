package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class Apocalypse extends Controller{
	public Result original() {
		return ok(ApocalypsePage_Original.render());
	}
}
