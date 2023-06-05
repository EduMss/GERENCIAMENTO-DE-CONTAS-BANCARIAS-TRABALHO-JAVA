package com.gerenciamento_conta.CRUD;

import java.sql.*;

public class CrudConta {
    private Connection connection;
    private int userCPF;
    private String Nome;
    private int NumeroConta;
    private float Saldo;

    public CrudConta(CrudPessoa Usuario) {
        this.userCPF = Usuario.getCPF();
        this.Nome = Usuario.getNome();

        try {
            connection = DatabaseManager.getConnection();
            if (ContaExiste()){
                this.NumeroConta = PegarNumContaBD();
                this.Saldo = PegarSaldoContaBD();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    
    //verificando se a Conta existe
    public boolean ContaExiste(){
        String sql = "SELECT * FROM conta WHERE CPF = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, Integer.toString(this.userCPF));
            ResultSet resultSet = statement.executeQuery();

            if (!resultSet.next()) {
                return false;
            } else {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch (java.lang.NullPointerException e){
            System.out.print("Error");
            return false;
        }
    }

    // criando um ContaNormal
    public void createConta(float saldo) {
        String sql = "INSERT INTO conta (CPF , Nome, saldo) VALUES (?, ?, ?)";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, Integer.toString(this.userCPF));
            statement.setString(2, this.Nome);
            statement.setString(3, saldo+"");

            statement.executeUpdate();

            this.NumeroConta = PegarNumContaBD();
            this.Saldo = PegarSaldoContaBD();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    //deletar Conta
    public void deletConta(){
        String sql = "DELETE FROM conta WHERE NumeroConta = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, Integer.toString(this.NumeroConta));

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Numero da Conta
    //Pegar o Numero da conta do banco de dados
    public int PegarNumContaBD(){
        String sql = "SELECT NumeroConta FROM conta WHERE CPF = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, Integer.toString(this.userCPF));

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                this.NumeroConta = Integer.parseInt(resultSet.getString("NumeroConta"));
                return Integer.parseInt(resultSet.getString("NumeroConta"));
            } else {
                return 0;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    //Pegar o Numero da conta da Variavel "NumeroConta"
    public int PegarNumConta(){
        return this.NumeroConta;
    }


    //Saldo
    //atualizar Alterar Saldo da Conta do banco de dados
    public void AlterarSaldo(Float saldo){
        String sql = "UPDATE conta SET saldo = ? WHERE NumeroConta = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, saldo + "");
            statement.setString(2, Integer.toString(this.NumeroConta));

            statement.executeUpdate();
            
            this.Saldo = saldo;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Pegar o Saldo da Conta do banco de dados
    public float PegarSaldoContaBD(){
        String sql = "SELECT saldo FROM conta WHERE NumeroConta = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, Integer.toString(this.NumeroConta));

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                this.Saldo = Float.parseFloat(resultSet.getString("saldo"));
                return Float.parseFloat(resultSet.getString("saldo"));
            } else {
                return 0;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    // Pegar o Saldo da Conta da Variavel "Saldo"
    public float PegarSaldoConta(){
        return this.Saldo;
    }
}
