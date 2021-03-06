package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.cardinal.impl.rev141210;

import static org.junit.Assert.*;
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.opendaylight.cardinal.impl.OdlCardinalFeatureUnInstalModuleMBean;
import com.sun.management.snmp.SnmpStatusException;
import com.sun.management.snmp.agent.SnmpMib;
import com.sun.management.snmp.agent.SnmpStandardObjectServer;

public class OdlCardinalFeatureUnInstalModuleMetaTest {
    protected OdlCardinalFeatureUnInstalModuleMBean node;
    protected SnmpStandardObjectServer objectserver = null;
    SnmpMib myMib;
    SnmpStandardObjectServer objserv;

    org.opendaylight.cardinal.impl.OdlCardinalFeatureUnInstalModuleMeta OdlCardinalFeatureUnInstalModuleMeta = new org.opendaylight.cardinal.impl.OdlCardinalFeatureUnInstalModuleMeta(
            myMib, objserv);
    long var = 1;

    @Before
    public void setUp() throws IOException, InterruptedException, SnmpStatusException {
    }

    @After
    public void setDown() throws IOException, InterruptedException, SnmpStatusException {
    }

    @Test
    public void isVariableTest() {
        long arc = 1;
        boolean bool = OdlCardinalFeatureUnInstalModuleMeta.isVariable(arc);
        if (bool == true) {
            assertEquals(true, bool);
        } else {
            assertEquals(false, bool);
        }
    }

    @Test
    public void isReadableTest() {
        long arc = 1;
        boolean bool = OdlCardinalFeatureUnInstalModuleMeta.isReadable(arc);
        if (bool == true) {
            assertEquals(true, bool);
        } else {
            assertEquals(false, bool);
        }
    }

    @Test
    public void getAttributeNameTest() throws SnmpStatusException {
        long arc = 1;
        String str = OdlCardinalFeatureUnInstalModuleMeta.getAttributeName(arc);
        if (str != null) {
            assertEquals("FeatureUnInstalled1", str);
        } else {
            assertNotEquals("FeatureUnInstalled1", str);
        }
    }

    @Test
    public void isTableTest() {
        long arc = 1;
        boolean bool = OdlCardinalFeatureUnInstalModuleMeta.isTable(arc);
        if (bool == false) {
            assertEquals(false, bool);
        } else {
            assertEquals(true, bool);
        }
    }
}