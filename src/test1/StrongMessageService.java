package test1;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StrongMessageService implements MessageService{
	@Override
	public String create(String name) {
		return "*** " + name + " ***";
	}

}
