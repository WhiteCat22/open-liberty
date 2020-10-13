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

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Response;
import jakarta.enterprise.context.SessionScoped;
import jakarta.servlet.ServletContext;
import jakarta.inject.Inject;

import java.io.Serializable;

@SessionScoped
@Path("resource4")
public class TestResource4 implements Serializable {
    
    @Context ServletContext servletContext;
    @Inject ServletContext servletContext2;
    
    @GET
    @Path("/{test}")
    public Response get(@PathParam("test") String testName) { 
        System.out.println(testName + " TestResource4#get: servletContext.getServletContextName " + servletContext.getServletContextName() );
        System.out.println(testName + " TestResource4#get: servletContext.getServletContextName2 " + servletContext2.getServletContextName() );
        return Response.ok("ok").build();
    }
}
