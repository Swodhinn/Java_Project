package org.example;

import java.util.Scanner;
import models.Bill;
import models.Stock;
import java.sql.*;

public class Main {
    public static final String BILL_TABLE = "BILL";
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String url = "jdbc:sqlite:mydb.db";
        System.out.println("Enter Name, Address and Phone Number");
        String Name= sc.next();
        String Address=sc.next();
        String pnum=sc.next();
        Bill b1=new Bill(2,0,0);
        String createStatementSql = "CREATE TABLE IF NOT EXISTS " + BILL_TABLE + "(" +
                "id INTEGER PRIMARY KEY , " +
                "Name TEXT, " +
                "Address TEXT, " +
                "PhoneNum TEXT, " +
                "MomoQuantity INTEGER, " +
                "BurgerQuantity INTEGER, " +
                "PizzaQuantity INTEGER)";

        System.out.println(createStatementSql);

        try {
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected");


            Statement statement = connection.createStatement();

            statement.execute(createStatementSql);



            String insertRecordSQL = "INSERT INTO " + BILL_TABLE + " (Name, Address, PhoneNum, MomoQuantity, BurgerQuantity, PizzaQuantity) " +
                    "VALUES (?, ?, ?, ?, ?, ?)";



            PreparedStatement preparedStatement = connection.prepareStatement(insertRecordSQL);

            preparedStatement.setString(1, Name);
            preparedStatement.setString(2, Address);
            preparedStatement.setString(3,pnum);
            preparedStatement.setInt(4,b1.getMomoquantity());
            preparedStatement.setInt(5, b1.getBurgerquantity());
            preparedStatement.setInt(6, b1.getPizzaquantity());
            // Execute the prepared statement
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }





        double momoPrice = 400.0;
        double burgerPrice = 800.0;
        double pizzaPrice = 1200.0;



        Stock stock = new Stock();
        stock.addItem("Momo", 10);
        stock.addItem("Burger", 15);
        stock.addItem("Pizza", 20);

        stock.displayStock();


            b1.billgen();
        }


    }

