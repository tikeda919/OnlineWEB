package test1;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class RequestCounter implements Serializable{
	private static final long serialVersionUID = 1L;
	private final AtomicLong count = new AtomicLong();

	public void increment() {
		count.incrementAndGet();
	}

	public long now() {
		return count.get();
	}

}
