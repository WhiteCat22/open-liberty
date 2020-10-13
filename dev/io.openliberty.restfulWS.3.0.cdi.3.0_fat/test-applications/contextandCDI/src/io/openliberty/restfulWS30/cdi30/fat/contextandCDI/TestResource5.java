/*******************************************************************************
 * Copyright (c) 2021 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package io.openliberty.restfulWS30.cdi30.fat.contextandCDI;

import java.io.Serializable;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.servlet.ServletContext;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Application;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;

@SessionScoped
@Path("resource5")
public class TestResource5 implements Serializable {
    
    @Resource(lookup = "url") private URL url;
   
    @Inject ServletContext servletContext2;
    
    @Context
    private Application appInField;
    
    private static AtomicInteger nextCounter = new AtomicInteger();
    private int instanceCounter;
    
    @PostConstruct
    public void postConstruct() {
        instanceCounter = nextCounter.incrementAndGet();
        new Throwable("POST CONSTRUCT " + this).printStackTrace();
    }
   
    @GET
    @Path("/{test}")
    public Response get(@PathParam("test") String testName, @Context Application appInParam) { 
        
      if  ((url == null) || !(url.getPath().equals( "/support/knowledgecenter/"))) {
          return Response.ok(url == null ? "Failed ... url == null" : "Failed... url path != /support/knowledgecenter/, url path = " + url.getPath()).build();
      }
      
      if (appInParam == null) {
          return Response.ok("Failed... appInParam == null").build();
      }

      if (appInField == null) {
          return Response.ok("Failed... appInField == null").build();
      }
      Map<String,Object> fieldMap = appInField.getProperties();

      Map<String,Object> paramMap = appInParam.getProperties();

      if (!((fieldMap.containsKey("TestProperty")) && ((int)(fieldMap.get("TestProperty")) == 100))) {
          return Response.ok("Failed... missing property in injected field.").build();
      }

      if (!((paramMap.containsKey("TestProperty")) && ((int)(paramMap.get("TestProperty")) == 100))) {
          return Response.ok("Failed... missing property in injected parameter.").build();
      }
      
      return Response.ok("ok").build();

    }
}
