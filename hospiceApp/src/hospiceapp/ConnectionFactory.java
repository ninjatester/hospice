/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospiceapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author workstation
 */
public class ConnectionFactory {
    String driverClassName = "org.h2.Driver";
        String connectionUrl = "jdbc:h2:students";
        String dbUser = "sa";
        String dbPwd = "";

        private static ConnectionFactory connectionFactory = null;

        private ConnectionFactory() {
                try {
                        Class.forName(driverClassName);
                } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                }
        }

        public Connection getConnection() throws SQLException {
                Connection conn = null;
                conn = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
                return conn;
        }

        public static ConnectionFactory getInstance() {
                if (connectionFactory == null) {
                        connectionFactory = new ConnectionFactory();
                }
                return connectionFactory;
        }
}
