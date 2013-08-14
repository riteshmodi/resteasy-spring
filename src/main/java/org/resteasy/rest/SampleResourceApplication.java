/**
 * 
 */
package org.resteasy.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class SampleResourceApplication extends Application {

	HashSet<Object> singletons = new HashSet<Object>();

	   public SampleResourceApplication()
	   {
	      singletons.add(new SampleResource());
	   }

	   @Override
	   public Set<Class<?>> getClasses()
	   {
	      HashSet<Class<?>> set = new HashSet<Class<?>>();
	      return set;
	   }

	   @Override
	   public Set<Object> getSingletons()
	   {
	      return singletons;  
	   }
}
