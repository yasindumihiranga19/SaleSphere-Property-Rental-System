
package com.salesphere.util;

public class ConnectionData {

    public static final String DATABASE = "salesphere_db";

    public static final String USERNAME =
            System.getenv("SALESPHERE_DB_USER");

    public static final String PASSWORD =
            System.getenv("SALESPHERE_DB_PASSWORD");
}

