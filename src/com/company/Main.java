package com.company;

import helper.FruitsQuery;
import helper.JDBC;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
	// write your code here
        JDBC.openConnection();

        FruitsQuery.select(3);

        JDBC.closeConnection();
    }
}
