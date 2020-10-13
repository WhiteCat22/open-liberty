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

//@Dependent
//@Dependent scope providers call @PostConstruct method to be called twice.  https://github.com/OpenLiberty/open-liberty/issues/10633 
public class CDIFilter3 /* implements ContainerRequestFilter, ContainerResponseFilter*/ {
/*
    @Context ServletContext servletContext;

    @PostConstruct
    public void init() {
        System.out.println("CDIFilter3#init: servletContext.getContextPath " + servletContext.getContextPath() );         
        System.out.println("CDIFilter3#init: servletContext.getServletContextName " + servletContext.getServletContextName() );
        new Exception("CDIFilter3#init ").printStackTrace(System.out);
    }

    public void filter(ContainerRequestContext requestContext) throws IOException {        
        System.out.println("CDIFilter3#filter#requestContext: servletContext.getServletContextName " + servletContext.getServletContextName() );        
        new Exception("CDIFilter3#filter ").printStackTrace(System.out);
    }
    
    public void filter(ContainerRequestContext reqContext, ContainerResponseContext responseContext) throws IOException {        
        System.out.println("CDIFilter3#filter#responseContext: servletContext.getServletContextName "  + servletContext.getServletContextName());        
    }
*/
}
