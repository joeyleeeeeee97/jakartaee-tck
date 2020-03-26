/*
 * Copyright (c) 2007, 2018, 2020 Oracle and/or its affiliates. All rights reserved.
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

/*
 * $Id$
 */

package com.sun.ts.tests.ejb30.bb.session.stateless.annotation.envsharing;

import com.sun.ts.tests.ejb30.common.annotation.resource.EnvSharingBeanBase;
import com.sun.ts.tests.ejb30.common.annotation.resource.ResourceIF;
import java.net.URL;
import jakarta.ejb.Remote;
import jakarta.ejb.Stateless;
import jakarta.ejb.SessionContext;
import javax.annotation.Resource;
import jakarta.ejb.TransactionManagement;
import jakarta.ejb.TransactionManagementType;

@Stateless(name = "ResourceSetterBean")
@Remote({ ResourceIF.class })
@TransactionManagement(TransactionManagementType.BEAN)
public class ResourceSetterBean extends EnvSharingBeanBase
    implements ResourceIF {

  private SessionContext sessionContext;

  private javax.mail.Session mailSession;

  private URL url;

  protected jakarta.ejb.EJBContext getEJBContext() {
    return sessionContext;
  }

  @Resource(name = "sessionContext", description = "session context", type = SessionContext.class)
  private void setSessionContext(SessionContext sessionContext) {
    this.sessionContext = sessionContext;
  }

  protected javax.mail.Session getMailSession() {
    return mailSession;
  }

  @Resource(name = "mailSession", shareable = false)
  private void setMailSession(javax.mail.Session mailSession) {
    this.mailSession = mailSession;
  }

  protected String getMailSessionName() {
    return "mailSession";
  }

  protected URL getUrl() {
    return url;
  }

  @Resource(name = "url", shareable = false)
  private void setUrl(URL url) {
    this.url = url;
  }

  protected String getUrlName() {
    return "url";
  }

}
