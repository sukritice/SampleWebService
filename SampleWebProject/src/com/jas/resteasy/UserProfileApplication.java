package com.jas.resteasy;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class UserProfileApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();

	public UserProfileApplication() {
		singletons.add(new UserProfileService());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
