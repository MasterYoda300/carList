package test;
import data.Connector;
import java.sql.Connection;
import java.sql.SQLException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class ConnectorTest {
    
@Test
    public void testGetConnection() throws  ClassNotFoundException, SQLException {
        Connector singleton = new Connector();
        Connection con = singleton.connection();
        boolean expResult = true;
        boolean result = con != null;
        assertEquals(expResult, result);
    }
}
