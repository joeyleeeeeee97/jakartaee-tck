/*
 * Copyright (c) 2018 Oracle and/or its affiliates. All rights reserved.
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

// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package com.sun.ts.tests.rmiiiop.ee.objecttests;

import java.rmi.UnexpectedException;
import java.util.Properties;
import javax.rmi.CORBA.Stub;
import javax.rmi.CORBA.Util;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.RemarshalException;
import org.omg.CORBA.portable.ServantObject;

public class _HelloRMIIIOPObjectIntf_Stub extends Stub
    implements HelloRMIIIOPObjectIntf {

  private static final String[] _type_ids = {
      "RMI:com.sun.ts.tests.rmiiiop.ee.objecttests.HelloRMIIIOPObjectIntf:0000000000000000" };

  public String[] _ids() {
    return _type_ids;
  }

  public String hello() throws java.rmi.RemoteException {
    if (!Util.isLocal(this)) {
      try {
        org.omg.CORBA_2_3.portable.InputStream in = null;
        try {
          OutputStream out = _request("hello", true);
          in = (org.omg.CORBA_2_3.portable.InputStream) _invoke(out);
          return (String) in.read_value(String.class);
        } catch (ApplicationException ex) {
          in = (org.omg.CORBA_2_3.portable.InputStream) ex.getInputStream();
          String $_id = in.read_string();
          throw new UnexpectedException($_id);
        } catch (RemarshalException ex) {
          return hello();
        } finally {
          _releaseReply(in);
        }
      } catch (SystemException ex) {
        throw Util.mapSystemException(ex);
      }
    } else {
      ServantObject so = _servant_preinvoke("hello",
          HelloRMIIIOPObjectIntf.class);
      if (so == null) {
        return hello();
      }
      try {
        return ((HelloRMIIIOPObjectIntf) so.servant).hello();
      } catch (Throwable ex) {
        Throwable exCopy = (Throwable) Util.copyObject(ex, _orb());
        throw Util.wrapException(exCopy);
      } finally {
        _servant_postinvoke(so);
      }
    }
  }

  public void passProperties(Properties arg0) throws java.rmi.RemoteException {
    if (!Util.isLocal(this)) {
      try {
        org.omg.CORBA_2_3.portable.InputStream in = null;
        try {
          org.omg.CORBA_2_3.portable.OutputStream out = (org.omg.CORBA_2_3.portable.OutputStream) _request(
              "passProperties", true);
          out.write_value(arg0, Properties.class);
          _invoke(out);
        } catch (ApplicationException ex) {
          in = (org.omg.CORBA_2_3.portable.InputStream) ex.getInputStream();
          String $_id = in.read_string();
          throw new UnexpectedException($_id);
        } catch (RemarshalException ex) {
          passProperties(arg0);
        } finally {
          _releaseReply(in);
        }
      } catch (SystemException ex) {
        throw Util.mapSystemException(ex);
      }
    } else {
      ServantObject so = _servant_preinvoke("passProperties",
          HelloRMIIIOPObjectIntf.class);
      if (so == null) {
        passProperties(arg0);
        return;
      }
      try {
        Properties arg0Copy = (Properties) Util.copyObject(arg0, _orb());
        ((HelloRMIIIOPObjectIntf) so.servant).passProperties(arg0Copy);
      } catch (Throwable ex) {
        Throwable exCopy = (Throwable) Util.copyObject(ex, _orb());
        throw Util.wrapException(exCopy);
      } finally {
        _servant_postinvoke(so);
      }
    }
  }

  public boolean passEjbHome(TestBeanHome arg0)
      throws java.rmi.RemoteException {
    if (!Util.isLocal(this)) {
      try {
        org.omg.CORBA.portable.InputStream in = null;
        try {
          OutputStream out = _request("passEjbHome", true);
          Util.writeRemoteObject(out, arg0);
          in = _invoke(out);
          return in.read_boolean();
        } catch (ApplicationException ex) {
          in = ex.getInputStream();
          String $_id = in.read_string();
          throw new UnexpectedException($_id);
        } catch (RemarshalException ex) {
          return passEjbHome(arg0);
        } finally {
          _releaseReply(in);
        }
      } catch (SystemException ex) {
        throw Util.mapSystemException(ex);
      }
    } else {
      ServantObject so = _servant_preinvoke("passEjbHome",
          HelloRMIIIOPObjectIntf.class);
      if (so == null) {
        return passEjbHome(arg0);
      }
      try {
        TestBeanHome arg0Copy = (TestBeanHome) Util.copyObject(arg0, _orb());
        return ((HelloRMIIIOPObjectIntf) so.servant).passEjbHome(arg0Copy);
      } catch (Throwable ex) {
        Throwable exCopy = (Throwable) Util.copyObject(ex, _orb());
        throw Util.wrapException(exCopy);
      } finally {
        _servant_postinvoke(so);
      }
    }
  }

  public boolean passEjbObject(TestBean arg0) throws java.rmi.RemoteException {
    if (!Util.isLocal(this)) {
      try {
        org.omg.CORBA.portable.InputStream in = null;
        try {
          OutputStream out = _request("passEjbObject", true);
          Util.writeRemoteObject(out, arg0);
          in = _invoke(out);
          return in.read_boolean();
        } catch (ApplicationException ex) {
          in = ex.getInputStream();
          String $_id = in.read_string();
          throw new UnexpectedException($_id);
        } catch (RemarshalException ex) {
          return passEjbObject(arg0);
        } finally {
          _releaseReply(in);
        }
      } catch (SystemException ex) {
        throw Util.mapSystemException(ex);
      }
    } else {
      ServantObject so = _servant_preinvoke("passEjbObject",
          HelloRMIIIOPObjectIntf.class);
      if (so == null) {
        return passEjbObject(arg0);
      }
      try {
        TestBean arg0Copy = (TestBean) Util.copyObject(arg0, _orb());
        return ((HelloRMIIIOPObjectIntf) so.servant).passEjbObject(arg0Copy);
      } catch (Throwable ex) {
        Throwable exCopy = (Throwable) Util.copyObject(ex, _orb());
        throw Util.wrapException(exCopy);
      } finally {
        _servant_postinvoke(so);
      }
    }
  }

  public TestBeanHome returnEjbHome(TestBeanHome arg0)
      throws java.rmi.RemoteException {
    if (!Util.isLocal(this)) {
      try {
        org.omg.CORBA.portable.InputStream in = null;
        try {
          OutputStream out = _request("returnEjbHome", true);
          Util.writeRemoteObject(out, arg0);
          in = _invoke(out);
          return (TestBeanHome) in.read_Object();
        } catch (ApplicationException ex) {
          in = ex.getInputStream();
          String $_id = in.read_string();
          throw new UnexpectedException($_id);
        } catch (RemarshalException ex) {
          return returnEjbHome(arg0);
        } finally {
          _releaseReply(in);
        }
      } catch (SystemException ex) {
        throw Util.mapSystemException(ex);
      }
    } else {
      ServantObject so = _servant_preinvoke("returnEjbHome",
          HelloRMIIIOPObjectIntf.class);
      if (so == null) {
        return returnEjbHome(arg0);
      }
      try {
        TestBeanHome arg0Copy = (TestBeanHome) Util.copyObject(arg0, _orb());
        TestBeanHome result = ((HelloRMIIIOPObjectIntf) so.servant)
            .returnEjbHome(arg0Copy);
        return (TestBeanHome) Util.copyObject(result, _orb());
      } catch (Throwable ex) {
        Throwable exCopy = (Throwable) Util.copyObject(ex, _orb());
        throw Util.wrapException(exCopy);
      } finally {
        _servant_postinvoke(so);
      }
    }
  }

  public TestBean returnEjbObject(TestBean arg0)
      throws java.rmi.RemoteException {
    if (!Util.isLocal(this)) {
      try {
        org.omg.CORBA.portable.InputStream in = null;
        try {
          OutputStream out = _request("returnEjbObject", true);
          Util.writeRemoteObject(out, arg0);
          in = _invoke(out);
          return (TestBean) in.read_Object();
        } catch (ApplicationException ex) {
          in = ex.getInputStream();
          String $_id = in.read_string();
          throw new UnexpectedException($_id);
        } catch (RemarshalException ex) {
          return returnEjbObject(arg0);
        } finally {
          _releaseReply(in);
        }
      } catch (SystemException ex) {
        throw Util.mapSystemException(ex);
      }
    } else {
      ServantObject so = _servant_preinvoke("returnEjbObject",
          HelloRMIIIOPObjectIntf.class);
      if (so == null) {
        return returnEjbObject(arg0);
      }
      try {
        TestBean arg0Copy = (TestBean) Util.copyObject(arg0, _orb());
        TestBean result = ((HelloRMIIIOPObjectIntf) so.servant)
            .returnEjbObject(arg0Copy);
        return (TestBean) Util.copyObject(result, _orb());
      } catch (Throwable ex) {
        Throwable exCopy = (Throwable) Util.copyObject(ex, _orb());
        throw Util.wrapException(exCopy);
      } finally {
        _servant_postinvoke(so);
      }
    }
  }
}
