package com.gerenciamento_conta.CRUD;
import java.sql.*;

public class DatabaseManager {
    //URL do banco de dados, com o USERNAME e PASSWORD
    private static final String URL = "jdbc:mysql://localhost:3306/gerenciamentocontas";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    //ele pega a conexão do Banco de dados
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexão estabelecida com o Banco de dados!!");
        } catch (SQLException e) {
            System.err.println("Falha ao estabelecer conexão com o banco de dados:");
            e.printStackTrace();
        }
        return connection;
    }
}