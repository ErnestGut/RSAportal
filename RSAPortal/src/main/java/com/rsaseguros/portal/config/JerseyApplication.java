package com.rsaseguros.portal.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
 
@ApplicationPath("services")
public class JerseyApplication extends ResourceConfig {
	public JerseyApplication() {
		packages("com.rsaseguros.portal.apiServices");
	}
}
