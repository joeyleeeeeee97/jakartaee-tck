/*
 * Copyright (c) 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.ts.lib.deliverable.servlet;

import com.sun.ts.lib.deliverable.AbstractDeliverable;
import com.sun.ts.lib.deliverable.PropertyManagerInterface;
import com.sun.javatest.TestEnvironment;
import com.sun.ts.lib.deliverable.tck.TCKDeliverable;

import java.util.Map;
import java.util.Properties;

/**
 * This class serves as a default implementation of the Deliverable interface
 * for a generic TCK. TCKs are free to use this impl if it suits their needs.
 * Otherwise, it should be extended.
 * 
 * @author
 */
public class ServletDeliverable extends TCKDeliverable {
  public PropertyManagerInterface createPropertyManager(TestEnvironment te)
      throws Exception {
    return ServletPropertyManager.getServletPropertyManager(te);
  }

  public PropertyManagerInterface createPropertyManager(Properties p)
      throws Exception {
    return ServletPropertyManager.getServletPropertyManager(p);
  }

  public PropertyManagerInterface getPropertyManager() throws Exception {
    return ServletPropertyManager.getServletPropertyManager();
  }

  public boolean supportsAutoDeployment() {
    return false;
  }

  public boolean supportsAutoJMSAdmin() {
    return false;
  }

  public boolean supportsInterop() {
    return false;
  }

  public Map getValidVehicles() {
    super.getValidVehicles();

    // add default values
    htTSValidVehicles.put("tests.service_eetest.vehicles",
        new String[] { "standalone" });

    return htTSValidVehicles;
  }
}
