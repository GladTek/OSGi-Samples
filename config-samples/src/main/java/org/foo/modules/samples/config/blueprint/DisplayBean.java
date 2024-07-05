/*
 * ==========================================================================================
 * =                            JAHIA'S ENTERPRISE DISTRIBUTION                             =
 * ==========================================================================================
 *
 *                                  http://www.jahia.com
 *
 * JAHIA'S ENTERPRISE DISTRIBUTIONS LICENSING - IMPORTANT INFORMATION
 * ==========================================================================================
 *
 *     Copyright (C) 2002-2024 Jahia Solutions Group. All rights reserved.
 *
 *     This file is part of a Jahia's Enterprise Distribution.
 *
 *     Jahia's Enterprise Distributions must be used in accordance with the terms
 *     contained in the Jahia Solutions Group Terms &amp; Conditions as well as
 *     the Jahia Sustainable Enterprise License (JSEL).
 *
 *     For questions regarding licensing, support, production usage...
 *     please contact our team at sales@jahia.com or go to http://www.jahia.com/license.
 *
 * ==========================================================================================
 */
package org.foo.modules.samples.config.blueprint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Jerome Blanchard
 */
public class DisplayBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(DisplayBean.class.getName());

    private String name;
    private String password;

    public DisplayBean() {
        LOGGER.info("DisplayBean instance created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        LOGGER.info("Setting name to " + name);
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        LOGGER.info("Setting password to " + password);
        this.password = password;
    }

    public void display() {
         LOGGER.warn("Display name = " + name + " and password = " + password);
    }
}
