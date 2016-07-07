package com.kogent.ejb;
import javax.ejb.Stateless;
@Stateless
public class HelloBean implements HelloRemote {
      public String hello(String h)
{
	return  "Hello" + h + "!";
}
}
