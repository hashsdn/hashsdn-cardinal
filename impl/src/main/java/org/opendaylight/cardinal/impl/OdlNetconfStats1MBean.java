/*
 * Copyright © 2016 TCS and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.cardinal.impl;
//

// Generated by mibgen version 5.1 (03/08/07) when compiling ODL-CARDINAL-MIB in standard metadata mode.
//

// jmx imports
//
import com.sun.management.snmp.SnmpStatusException;

/**
 * This interface is used for representing the remote management interface for
 * the "OdlNetconfStats1" MBean.
 */
public interface OdlNetconfStats1MBean {

    /**
     * Getter for the "OdlNetconfStatus1" variable.
     */
    public String getOdlNetconfStatus1() throws SnmpStatusException;

    /**
     * Setter for the "OdlNetconfStatus1" variable.
     */
    public void setOdlNetconfStatus1(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlNetconfStatus1" variable.
     */
    public void checkOdlNetconfStatus1(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlNetconfPort1" variable.
     */
    public String getOdlNetconfPort1() throws SnmpStatusException;

    /**
     * Setter for the "OdlNetconfPort1" variable.
     */
    public void setOdlNetconfPort1(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlNetconfPort1" variable.
     */
    public void checkOdlNetconfPort1(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlNetconfHost1" variable.
     */
    public String getOdlNetconfHost1() throws SnmpStatusException;

    /**
     * Setter for the "OdlNetconfHost1" variable.
     */
    public void setOdlNetconfHost1(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlNetconfHost1" variable.
     */
    public void checkOdlNetconfHost1(String x) throws SnmpStatusException;

    /**
     * Getter for the "OdlNetconfNodeId1" variable.
     */
    public String getOdlNetconfNodeId1() throws SnmpStatusException;

    /**
     * Setter for the "OdlNetconfNodeId1" variable.
     */
    public void setOdlNetconfNodeId1(String x) throws SnmpStatusException;

    /**
     * Checker for the "OdlNetconfNodeId1" variable.
     */
    public void checkOdlNetconfNodeId1(String x) throws SnmpStatusException;

}
