/*
 * Copyright © 2016 TCS and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.cardinal.impl;
//

// Generated by mibgen version 5.1 (03/08/07) when compiling ODL-CARDINAL-MIB.
//

// java imports
//
import java.io.Serializable;

// jmx imports
//
import com.sun.management.snmp.SnmpOidRecord;

// jdmk imports
//
import com.sun.management.snmp.SnmpOidTableSupport;

/**
 * The class contains metadata definitions for "ODL-CARDINAL-MIB". Call
 * SnmpOid.setSnmpOidTable(new ODL_CARDINAL_MIBOidTable()) to load the metadata
 * in the SnmpOidTable.
 */
public class ODL_CARDINAL_MIBOidTable extends SnmpOidTableSupport implements Serializable {

    /**
     * Default constructor. Initialize the Mib tree.
     */
    public ODL_CARDINAL_MIBOidTable() {
        super("ODL_CARDINAL_MIB");
        loadMib(varList);
    }

    static SnmpOidRecord varList[] = { new SnmpOidRecord("odlMDSALBGPBMPinfo", "1.3.6.1.3.1.1.8.17", "S"),
            new SnmpOidRecord("odlMDSALBGPRIBInfo", "1.3.6.1.3.1.1.8.16", "S"),
            new SnmpOidRecord("odlMDSALBGPPeerInfo", "1.3.6.1.3.1.1.8.15", "S"),
            new SnmpOidRecord("odlMDSALOpenFlowOVSconnectedDevices", "1.3.6.1.3.1.1.8.14", "S"),
            new SnmpOidRecord("odlMDSALIotDMlistofNodes", "1.3.6.1.3.1.1.8.13", "S"),
            new SnmpOidRecord("odlMDSALIotDMlistofAEs", "1.3.6.1.3.1.1.8.12", "S"),
            new SnmpOidRecord("odlMDSALIotDMListofcse", "1.3.6.1.3.1.1.8.11", "S"),
            new SnmpOidRecord("odlMDSALGBPPolicytenants", "1.3.6.1.3.1.1.8.10", "S"),
            new SnmpOidRecord("odlMDSALGBPFaaslogicalnetwork", "1.3.6.1.3.1.1.8.9", "S"),
            new SnmpOidRecord("odlMDSALService", "1.3.6.1.3.1.1.8.8", "S"),
            new SnmpOidRecord("odlMDSALServicefunctiontype", "1.3.6.1.3.1.1.8.7", "S"),
            new SnmpOidRecord("odlMDSALSfcfunctionAlgorithms", "1.3.6.1.3.1.1.8.6", "S"),
            new SnmpOidRecord("odlMDSALSfcfunctiongroups", "1.3.6.1.3.1.1.8.5", "S"),
            new SnmpOidRecord("odlMDSALSfcfunctionchain", "1.3.6.1.3.1.1.8.4", "S"),
            new SnmpOidRecord("odlMDSALSfcfunction", "1.3.6.1.3.1.1.8.3", "S"),
            new SnmpOidRecord("odlMDSALNetconfConnectedDevices", "1.3.6.1.3.1.1.8.2", "S"),
            new SnmpOidRecord("odlMDSALClustershardsshared", "1.3.6.1.3.1.1.8.1", "S"),
            new SnmpOidRecord("odlMDSALClusterControllerRole", "1.3.6.1.3.1.1.8.0", "S"),
            new SnmpOidRecord("odlKarafMaxHeapSize", "1.3.6.1.3.1.1.7.4", "S"),
            new SnmpOidRecord("odlKarafCurrentHeapSize", "1.3.6.1.3.1.1.7.3", "S"),
            new SnmpOidRecord("odlKarafPeakThreads", "1.3.6.1.3.1.1.7.2", "S"),
            new SnmpOidRecord("odlKarafDaemonThreads", "1.3.6.1.3.1.1.7.1", "S"),
            new SnmpOidRecord("odlKarafLiveThreads", "1.3.6.1.3.1.1.7.0", "S"),
            new SnmpOidRecord("odlNetconfTable", "1.3.6.1.3.1.1.16.1", "TA"),
            new SnmpOidRecord("odlNetconfEntry", "1.3.6.1.3.1.1.16.1.1", "EN"),
            new SnmpOidRecord("odlNetconfStatus", "1.3.6.1.3.1.1.16.1.1.4", "S"),
            new SnmpOidRecord("odlNetconfPort", "1.3.6.1.3.1.1.16.1.1.3", "S"),
            new SnmpOidRecord("odlNetconfHost", "1.3.6.1.3.1.1.16.1.1.2", "S"),
            new SnmpOidRecord("odlNetconfNodeId", "1.3.6.1.3.1.1.16.1.1.1", "S"),
            new SnmpOidRecord("resolvedBundle5", "1.3.6.1.3.1.1.6.5", "S"),
            new SnmpOidRecord("resolvedBundle4", "1.3.6.1.3.1.1.6.4", "S"),
            new SnmpOidRecord("resolvedBundle3", "1.3.6.1.3.1.1.6.3", "S"),
            new SnmpOidRecord("resolvedBundle2", "1.3.6.1.3.1.1.6.2", "S"),
            new SnmpOidRecord("resolvedBundle1", "1.3.6.1.3.1.1.6.1", "S"),
            new SnmpOidRecord("odlKarafBundleListResolved", "1.3.6.1.3.1.1.6.0", "S"),
            new SnmpOidRecord("odlNetconfStatus2", "1.3.6.1.3.1.1.15.4", "S"),
            new SnmpOidRecord("odlNetconfPort2", "1.3.6.1.3.1.1.15.3", "S"),
            new SnmpOidRecord("odlNetconfHost2", "1.3.6.1.3.1.1.15.2", "S"),
            new SnmpOidRecord("odlNetconfNodeId2", "1.3.6.1.3.1.1.15.1", "S"),
            new SnmpOidRecord("installedBundle5", "1.3.6.1.3.1.1.5.5", "S"),
            new SnmpOidRecord("installedBundle4", "1.3.6.1.3.1.1.5.4", "S"),
            new SnmpOidRecord("installedBundle3", "1.3.6.1.3.1.1.5.3", "S"),
            new SnmpOidRecord("installedBundle2", "1.3.6.1.3.1.1.5.2", "S"),
            new SnmpOidRecord("installedBundle1", "1.3.6.1.3.1.1.5.1", "S"),
            new SnmpOidRecord("odlKarafBundleListInstalled", "1.3.6.1.3.1.1.5.0", "S"),
            new SnmpOidRecord("odlNetconfStatus1", "1.3.6.1.3.1.1.14.4", "S"),
            new SnmpOidRecord("odlNetconfPort1", "1.3.6.1.3.1.1.14.3", "S"),
            new SnmpOidRecord("odlNetconfHost1", "1.3.6.1.3.1.1.14.2", "S"),
            new SnmpOidRecord("odlNetconfNodeId1", "1.3.6.1.3.1.1.14.1", "S"),
            new SnmpOidRecord("netOpenflowTable", "1.3.6.1.3.1.1.13.1", "TA"),
            new SnmpOidRecord("netOpenflowEntry", "1.3.6.1.3.1.1.13.1.1", "EN"),
            new SnmpOidRecord("odlNetOpenflowFlowstats", "1.3.6.1.3.1.1.13.1.1.6", "S"),
            new SnmpOidRecord("odlNetOpenflowManufacturer", "1.3.6.1.3.1.1.13.1.1.5", "S"),
            new SnmpOidRecord("odlNetOpenflowMacAddress", "1.3.6.1.3.1.1.13.1.1.4", "S"),
            new SnmpOidRecord("odlNetOpenflowInterface", "1.3.6.1.3.1.1.13.1.1.3", "S"),
            new SnmpOidRecord("odlNetOpenflowRowStatus", "1.3.6.1.3.1.1.13.1.1.2", "S"),
            new SnmpOidRecord("odlNetOpenflowNode", "1.3.6.1.3.1.1.13.1.1.1", "S"),
            new SnmpOidRecord("odlNetOpenflowMeterstats", "1.3.6.1.3.1.1.13.1.1.7", "S"),
            new SnmpOidRecord("activebundle9", "1.3.6.1.3.1.1.4.9", "S"),
            new SnmpOidRecord("activebundle8", "1.3.6.1.3.1.1.4.8", "S"),
            new SnmpOidRecord("activebundle7", "1.3.6.1.3.1.1.4.7", "S"),
            new SnmpOidRecord("activebundle6", "1.3.6.1.3.1.1.4.6", "S"),
            new SnmpOidRecord("activebundle5", "1.3.6.1.3.1.1.4.5", "S"),
            new SnmpOidRecord("activebundle4", "1.3.6.1.3.1.1.4.4", "S"),
            new SnmpOidRecord("activebundle3", "1.3.6.1.3.1.1.4.3", "S"),
            new SnmpOidRecord("activebundle2", "1.3.6.1.3.1.1.4.2", "S"),
            new SnmpOidRecord("activebundle10", "1.3.6.1.3.1.1.4.10", "S"),
            new SnmpOidRecord("activebundle1", "1.3.6.1.3.1.1.4.1", "S"),
            new SnmpOidRecord("odKarafBundleListActive", "1.3.6.1.3.1.1.4.0", "S"),
            new SnmpOidRecord("featureUnInstalled9", "1.3.6.1.3.1.1.3.9", "S"),
            new SnmpOidRecord("featureUnInstalled8", "1.3.6.1.3.1.1.3.8", "S"),
            new SnmpOidRecord("featureUnInstalled7", "1.3.6.1.3.1.1.3.7", "S"),
            new SnmpOidRecord("featureUnInstalled6", "1.3.6.1.3.1.1.3.6", "S"),
            new SnmpOidRecord("featureUnInstalled5", "1.3.6.1.3.1.1.3.5", "S"),
            new SnmpOidRecord("featureUnInstalled4", "1.3.6.1.3.1.1.3.4", "S"),
            new SnmpOidRecord("featureUnInstalled3", "1.3.6.1.3.1.1.3.3", "S"),
            new SnmpOidRecord("featureUnInstalled2", "1.3.6.1.3.1.1.3.2", "S"),
            new SnmpOidRecord("featureUnInstalled1", "1.3.6.1.3.1.1.3.1", "S"),
            new SnmpOidRecord("featureUnInstalled10", "1.3.6.1.3.1.1.3.10", "S"),
            new SnmpOidRecord("odlKarafFeatureListUnInstalled", "1.3.6.1.3.1.1.3.0", "S"),
            new SnmpOidRecord("odlOpenflowFlowstats2", "1.3.6.1.3.1.1.12.6", "S"),
            new SnmpOidRecord("odlOpenflowStatus2", "1.3.6.1.3.1.1.12.5", "S"),
            new SnmpOidRecord("odlOpenflowManufacturer2", "1.3.6.1.3.1.1.12.4", "S"),
            new SnmpOidRecord("odlOpenflowMacAddress2", "1.3.6.1.3.1.1.12.3", "S"),
            new SnmpOidRecord("odlOpenflowInterface2", "1.3.6.1.3.1.1.12.2", "S"),
            new SnmpOidRecord("odlOpenflowNode2", "1.3.6.1.3.1.1.12.1", "S"),
            new SnmpOidRecord("odlOpenflowMeterstats2", "1.3.6.1.3.1.1.12.7", "S"),
            new SnmpOidRecord("featureInstalled9", "1.3.6.1.3.1.1.2.9", "S"),
            new SnmpOidRecord("featureInstalled8", "1.3.6.1.3.1.1.2.8", "S"),
            new SnmpOidRecord("featureInstalled7", "1.3.6.1.3.1.1.2.7", "S"),
            new SnmpOidRecord("featureInstalled6", "1.3.6.1.3.1.1.2.6", "S"),
            new SnmpOidRecord("featureInstalled5", "1.3.6.1.3.1.1.2.5", "S"),
            new SnmpOidRecord("featureInstalled4", "1.3.6.1.3.1.1.2.4", "S"),
            new SnmpOidRecord("featureInstalled3", "1.3.6.1.3.1.1.2.3", "S"),
            new SnmpOidRecord("featureInstalled2", "1.3.6.1.3.1.1.2.2", "S"),
            new SnmpOidRecord("featureInstalled1", "1.3.6.1.3.1.1.2.1", "S"),
            new SnmpOidRecord("featureInstalled10", "1.3.6.1.3.1.1.2.10", "S"),
            new SnmpOidRecord("odlKarafFeatureListInstalled", "1.3.6.1.3.1.1.2.0", "S"),
            new SnmpOidRecord("odlOpenflowFlowstats1", "1.3.6.1.3.1.1.11.6", "S"),
            new SnmpOidRecord("odlOpenflowStatus1", "1.3.6.1.3.1.1.11.5", "S"),
            new SnmpOidRecord("odlOpenflowManufacturer1", "1.3.6.1.3.1.1.11.4", "S"),
            new SnmpOidRecord("odlOpenflowMacAddress1", "1.3.6.1.3.1.1.11.3", "S"),
            new SnmpOidRecord("odlOpenflowInterface1", "1.3.6.1.3.1.1.11.2", "S"),
            new SnmpOidRecord("odlOpenflowNode1", "1.3.6.1.3.1.1.11.1", "S"),
            new SnmpOidRecord("odlOpenflowMeterstats1", "1.3.6.1.3.1.1.11.7", "S"),
            new SnmpOidRecord("odlSystemOdlNodeInfo", "1.3.6.1.3.1.1.1.6", "S"),
            new SnmpOidRecord("odlSystemOdlUptime", "1.3.6.1.3.1.1.1.5", "S"),
            new SnmpOidRecord("odlSystemSysInfo", "1.3.6.1.3.1.1.1.4", "S"),
            new SnmpOidRecord("odlSystemHostAddress", "1.3.6.1.3.1.1.1.3", "S"),
            new SnmpOidRecord("odlSystemMemUsage", "1.3.6.1.3.1.1.1.2", "I"),
            new SnmpOidRecord("odlSystemCpuUsage", "1.3.6.1.3.1.1.1.1", "I"),
            new SnmpOidRecord("odlCardinalTrap", "1.3.6.1.3.1.1.10.1", "NT") };
}
