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

import java.util.LinkedHashSet;
import java.util.Set;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
@ApplicationPath("contextandCDI12")
public class CDIApplication12 extends Application {

    @Override
    public Set<Class<?>> getClasses() {

        LinkedHashSet<Class<?>> classes = new LinkedHashSet<>();
        classes.add(CDIFilter.class);
        return classes;
        
    }
    
    @Override
    public Set<Object> getSingletons() {
       
        LinkedHashSet<Object> classes = new LinkedHashSet<>();
        TestResource resource = CDIUtils.getBean(TestResource.class);
        classes.add(resource);
        return classes;
    } 
}

