/*
 * Copyright © 2015 TCS and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.cardinal.impl;

// java imports
//
import java.io.Serializable;

// jmx imports
//
import javax.management.MBeanServer;
import com.sun.management.snmp.SnmpString;
import com.sun.management.snmp.SnmpValue;
import com.sun.management.snmp.SnmpStatusException;

// jdmk imports
//
import com.sun.management.snmp.agent.SnmpMib;
import com.sun.management.snmp.agent.SnmpMibGroup;
import com.sun.management.snmp.agent.SnmpStandardObjectServer;
import com.sun.management.snmp.agent.SnmpStandardMetaServer;
import com.sun.management.snmp.agent.SnmpMibSubRequest;
import com.sun.management.snmp.agent.SnmpMibTable;


/**
 * The class is used for representing SNMP metadata for the
 * "OdlCardinalFeatureUnInstalModule" group. The group is defined with the
 * following oid: 1.3.6.1.3.1.1.3.
 */
public class OdlCardinalFeatureUnInstalModuleMeta extends SnmpMibGroup implements Serializable, SnmpStandardMetaServer {

    /**
     * Constructor for the metadata associated to
     * "OdlCardinalFeatureUnInstalModule".
     */
    public OdlCardinalFeatureUnInstalModuleMeta(SnmpMib myMib, SnmpStandardObjectServer objserv) {
        objectserver = objserv;
        try {
            registerObject(9);
            registerObject(8);
            registerObject(7);
            registerObject(6);
            registerObject(5);
            registerObject(4);
            registerObject(3);
            registerObject(2);
            registerObject(1);
            registerObject(10);
            registerObject(0);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Get the value of a scalar variable
     */
    public SnmpValue get(long var, Object data) throws SnmpStatusException {
        switch ((int) var) {
        case 9:
            return new SnmpString(node.getFeatureUnInstalled9());

        case 8:
            return new SnmpString(node.getFeatureUnInstalled8());

        case 7:
            return new SnmpString(node.getFeatureUnInstalled7());

        case 6:
            return new SnmpString(node.getFeatureUnInstalled6());

        case 5:
            return new SnmpString(node.getFeatureUnInstalled5());

        case 4:
            return new SnmpString(node.getFeatureUnInstalled4());

        case 3:
            return new SnmpString(node.getFeatureUnInstalled3());

        case 2:
            return new SnmpString(node.getFeatureUnInstalled2());

        case 1:
            return new SnmpString(node.getFeatureUnInstalled1());

        case 10:
            return new SnmpString(node.getFeatureUnInstalled10());

        case 0:
            return new SnmpString(node.getOdlKarafFeatureListUnInstalled());

        default:
            break;
        }
        throw new SnmpStatusException(SnmpStatusException.noSuchObject);
    }

    /**
     * Set the value of a scalar variable
     */
    public SnmpValue set(SnmpValue x, long var, Object data) throws SnmpStatusException {
        switch ((int) var) {
        case 9:
            if (x instanceof SnmpString) {
                node.setFeatureUnInstalled9(((SnmpString) x).toString());
                return new SnmpString(node.getFeatureUnInstalled9());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }

        case 8:
            if (x instanceof SnmpString) {
                node.setFeatureUnInstalled8(((SnmpString) x).toString());
                return new SnmpString(node.getFeatureUnInstalled8());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }

        case 7:
            if (x instanceof SnmpString) {
                node.setFeatureUnInstalled7(((SnmpString) x).toString());
                return new SnmpString(node.getFeatureUnInstalled7());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }

        case 6:
            if (x instanceof SnmpString) {
                node.setFeatureUnInstalled6(((SnmpString) x).toString());
                return new SnmpString(node.getFeatureUnInstalled6());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }

        case 5:
            if (x instanceof SnmpString) {
                node.setFeatureUnInstalled5(((SnmpString) x).toString());
                return new SnmpString(node.getFeatureUnInstalled5());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }

        case 4:
            if (x instanceof SnmpString) {
                node.setFeatureUnInstalled4(((SnmpString) x).toString());
                return new SnmpString(node.getFeatureUnInstalled4());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }

        case 3:
            if (x instanceof SnmpString) {
                node.setFeatureUnInstalled3(((SnmpString) x).toString());
                return new SnmpString(node.getFeatureUnInstalled3());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }

        case 2:
            if (x instanceof SnmpString) {
                node.setFeatureUnInstalled2(((SnmpString) x).toString());
                return new SnmpString(node.getFeatureUnInstalled2());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }

        case 1:
            if (x instanceof SnmpString) {
                node.setFeatureUnInstalled1(((SnmpString) x).toString());
                return new SnmpString(node.getFeatureUnInstalled1());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }

        case 10:
            if (x instanceof SnmpString) {
                node.setFeatureUnInstalled10(((SnmpString) x).toString());
                return new SnmpString(node.getFeatureUnInstalled10());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }

        case 0:
            if (x instanceof SnmpString) {
                node.setOdlKarafFeatureListUnInstalled(((SnmpString) x).toString());
                return new SnmpString(node.getOdlKarafFeatureListUnInstalled());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }

        default:
            break;
        }
        throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);
    }

    /**
     * Check the value of a scalar variable
     */
    public void check(SnmpValue x, long var, Object data) throws SnmpStatusException {
        switch ((int) var) {
        case 9:
            if (x instanceof SnmpString) {
                node.checkFeatureUnInstalled9(((SnmpString) x).toString());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }
            break;

        case 8:
            if (x instanceof SnmpString) {
                node.checkFeatureUnInstalled8(((SnmpString) x).toString());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }
            break;

        case 7:
            if (x instanceof SnmpString) {
                node.checkFeatureUnInstalled7(((SnmpString) x).toString());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }
            break;

        case 6:
            if (x instanceof SnmpString) {
                node.checkFeatureUnInstalled6(((SnmpString) x).toString());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }
            break;

        case 5:
            if (x instanceof SnmpString) {
                node.checkFeatureUnInstalled5(((SnmpString) x).toString());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }
            break;

        case 4:
            if (x instanceof SnmpString) {
                node.checkFeatureUnInstalled4(((SnmpString) x).toString());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }
            break;

        case 3:
            if (x instanceof SnmpString) {
                node.checkFeatureUnInstalled3(((SnmpString) x).toString());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }
            break;

        case 2:
            if (x instanceof SnmpString) {
                node.checkFeatureUnInstalled2(((SnmpString) x).toString());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }
            break;

        case 1:
            if (x instanceof SnmpString) {
                node.checkFeatureUnInstalled1(((SnmpString) x).toString());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }
            break;

        case 10:
            if (x instanceof SnmpString) {
                node.checkFeatureUnInstalled10(((SnmpString) x).toString());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }
            break;

        case 0:
            if (x instanceof SnmpString) {
                node.checkOdlKarafFeatureListUnInstalled(((SnmpString) x).toString());
            } else {
                throw new SnmpStatusException(SnmpStatusException.snmpRspWrongType);
            }
            break;

        default:
            throw new SnmpStatusException(SnmpStatusException.snmpRspNotWritable);
        }
    }

    /**
     * Allow to bind the metadata description to a specific object.
     */
    protected void setInstance(OdlCardinalFeatureUnInstalModuleMBean var) {
        node = var;
    }

    // ------------------------------------------------------------
    //
    // Implements the "get" method defined in "SnmpMibGroup".
    // See the "SnmpMibGroup" Javadoc API for more details.
    //
    // ------------------------------------------------------------

    public void get(SnmpMibSubRequest req, int depth) throws SnmpStatusException {
        objectserver.get(this, req, depth);
    }

    // ------------------------------------------------------------
    //
    // Implements the "set" method defined in "SnmpMibGroup".
    // See the "SnmpMibGroup" Javadoc API for more details.
    //
    // ------------------------------------------------------------

    public void set(SnmpMibSubRequest req, int depth) throws SnmpStatusException {
        objectserver.set(this, req, depth);
    }

    // ------------------------------------------------------------
    //
    // Implements the "check" method defined in "SnmpMibGroup".
    // See the "SnmpMibGroup" Javadoc API for more details.
    //
    // ------------------------------------------------------------

    public void check(SnmpMibSubRequest req, int depth) throws SnmpStatusException {
        objectserver.check(this, req, depth);
    }

    /**
     * Returns true if "arc" identifies a scalar object.
     */
    public boolean isVariable(long arc) {

        switch ((int) arc) {
        case 9:
        case 8:
        case 7:
        case 6:
        case 5:
        case 4:
        case 3:
        case 2:
        case 1:
        case 10:
        case 0:
            return true;
        default:
            break;
        }
        return false;
    }

    /**
     * Returns true if "arc" identifies a readable scalar object.
     */
    public boolean isReadable(long arc) {

        switch ((int) arc) {
        case 9:
        case 8:
        case 7:
        case 6:
        case 5:
        case 4:
        case 3:
        case 2:
        case 1:
        case 10:
        case 0:
            return true;
        default:
            break;
        }
        return false;
    }

    // ------------------------------------------------------------
    //
    // Implements the "skipVariable" method defined in "SnmpMibGroup".
    // See the "SnmpMibGroup" Javadoc API for more details.
    //
    // ------------------------------------------------------------

    public boolean skipVariable(long var, Object data, int pduVersion) {
        return false;
    }

    /**
     * Return the name of the attribute corresponding to the SNMP variable
     * identified by "id".
     */
    public String getAttributeName(long id) throws SnmpStatusException {
        switch ((int) id) {
        case 9:
            return "FeatureUnInstalled9";

        case 8:
            return "FeatureUnInstalled8";

        case 7:
            return "FeatureUnInstalled7";

        case 6:
            return "FeatureUnInstalled6";

        case 5:
            return "FeatureUnInstalled5";

        case 4:
            return "FeatureUnInstalled4";

        case 3:
            return "FeatureUnInstalled3";

        case 2:
            return "FeatureUnInstalled2";

        case 1:
            return "FeatureUnInstalled1";

        case 10:
            return "FeatureUnInstalled10";

        case 0:
            return "OdlKarafFeatureListUnInstalled";

        default:
            break;
        }
        throw new SnmpStatusException(SnmpStatusException.noSuchObject);
    }

    /**
     * Returns true if "arc" identifies a table object.
     */
    public boolean isTable(long arc) {

        switch ((int) arc) {
        default:
            break;
        }
        return false;
    }

    /**
     * Returns the table object identified by "arc".
     */
    public SnmpMibTable getTable(long arc) {
        return null;
    }

    /**
     * Register the group's SnmpMibTable objects with the meta-data.
     */
    public void registerTableNodes(SnmpMib mib, MBeanServer server) {
    }

    protected OdlCardinalFeatureUnInstalModuleMBean node;
    protected SnmpStandardObjectServer objectserver = null;
}