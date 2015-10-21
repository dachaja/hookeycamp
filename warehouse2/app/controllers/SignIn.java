package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

public class SignIn extends Controller{
	public Result signin() {
		return ok(signin.render());
	}
}
