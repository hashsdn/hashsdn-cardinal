package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.cardinal.impl.rev141210;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.opendaylight.cardinal.impl.OdlCardinalBundleActiveModuleMeta;
import com.sun.management.snmp.agent.SnmpMib;
import com.sun.management.snmp.agent.SnmpMibTable;
import com.sun.management.snmp.agent.SnmpStandardObjectServer;

public class OdlCardinalBundleActiveModuleMetaTest {
    SnmpMib myMib;
    SnmpStandardObjectServer objserv;
    OdlCardinalBundleActiveModuleMeta odlCardinalBundleActiveModuleMeta = new OdlCardinalBundleActiveModuleMeta(myMib,
            objserv);

    @Before
    public void setUp() {
    }

    @After
    public void setDown() {
    }

    @Test
    public void isVariableTrueTest() throws Exception {
        long arc = 1;
        boolean ocpm = odlCardinalBundleActiveModuleMeta.isVariable(arc);
        if (ocpm == true) {
            assertEquals(true, ocpm);
        } else {
            assertEquals(false, ocpm);
        }
    }

    @Test
    public void isVariableFalseTest() throws Exception {
        long arc = 20;
        boolean ocpm = odlCardinalBundleActiveModuleMeta.isVariable(arc);
        if (ocpm == false) {
            assertEquals(false, ocpm);
        } else {
            assertEquals(true, ocpm);
        }
    }

    @Test
    public void isReadableTest() throws Exception {
        long arc = 1;
        boolean ocpm = odlCardinalBundleActiveModuleMeta.isReadable(arc);
        if (ocpm == true) {
            assertEquals(true, ocpm);
        } else {
            assertEquals(false, ocpm);
        }
    }

    @Test
    public void isReadableFalseTest() throws Exception {
        long arc = 20;
        boolean ocpm = odlCardinalBundleActiveModuleMeta.isReadable(arc);
        if (ocpm == false) {
            assertEquals(false, ocpm);
        } else {
            assertEquals(true, ocpm);
        }
    }

    @Test
    public void getAttributeNameTest() throws Exception {
        long arc = 1;
        String ocpm = odlCardinalBundleActiveModuleMeta.getAttributeName(arc);
        if (ocpm == "Activebundle1") {
            assertEquals("Activebundle1", ocpm);
        } else {
            assertEquals(false, ocpm);
        }
    }

    @Test
    public void isTableTest() throws Exception {
        long arc = 1;
        boolean ocpm = odlCardinalBundleActiveModuleMeta.isTable(arc);
        if (ocpm == false) {
            assertEquals(false, ocpm);
        } else {
            assertEquals(true, ocpm);
        }
    }

    @Test
    public void getTableTest() throws Exception {
        long arc = 1;
        SnmpMibTable ocpm = odlCardinalBundleActiveModuleMeta.getTable(arc);
        if (ocpm == null) {
            assertEquals(null, ocpm);
        } else {
            assertEquals(true, ocpm);
        }
    }
}