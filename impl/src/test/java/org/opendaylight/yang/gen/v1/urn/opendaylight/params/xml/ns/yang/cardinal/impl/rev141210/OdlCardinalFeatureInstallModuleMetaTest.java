package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.cardinal.impl.rev141210;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.opendaylight.cardinal.impl.OdlCardinalFeatureInstallModuleMBean;
import com.sun.management.snmp.SnmpStatusException;
import com.sun.management.snmp.agent.SnmpMib;
import com.sun.management.snmp.agent.SnmpStandardObjectServer;

public class OdlCardinalFeatureInstallModuleMetaTest {
    protected OdlCardinalFeatureInstallModuleMBean node;
    protected SnmpStandardObjectServer objectserver = null;
    SnmpMib myMib;
    SnmpStandardObjectServer objserv;
    org.opendaylight.cardinal.impl.OdlCardinalFeatureInstallModuleMeta OdlCardinalFeatureInstallModuleMeta = new org.opendaylight.cardinal.impl.OdlCardinalFeatureInstallModuleMeta(
            myMib, objserv);
    long var = 1;
    Object data = null;

    @Before
    public void setUp() throws IOException, InterruptedException {
    }

    @After
    public void setDown() throws IOException, InterruptedException {
    }

    @Test
    public void isVariableTest() {
        long arc = 1;
        boolean bool = OdlCardinalFeatureInstallModuleMeta.isVariable(arc);
        if (bool == true) {
            assertEquals(true, bool);
        } else {
            assertEquals(false, bool);
        }
    }

    @Test
    public void isReadableTest() {
        long arc = 1;
        boolean bool = OdlCardinalFeatureInstallModuleMeta.isReadable(arc);
        if (bool == true) {
            assertEquals(true, bool);
        } else {
            assertEquals(false, bool);
        }
    }

    @Test
    public void getAttributeNameTest() throws SnmpStatusException {
        long arc = 1;
        String str = OdlCardinalFeatureInstallModuleMeta.getAttributeName(arc);
        if (str != null) {
            assertEquals("FeatureInstalled1", str);
        } else {
            assertNotEquals("FeatureInstalled1", str);
        }
    }

    @Test
    public void isTableTest() {
        long arc = 1;
        boolean bool = OdlCardinalFeatureInstallModuleMeta.isTable(arc);
        if (bool == false) {
            assertEquals(false, bool);
        } else {
            assertEquals(true, bool);
        }
    }
}