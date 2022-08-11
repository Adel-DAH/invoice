package com.formation.invoise.core.repository.database;
/*
import com.formation.invoise.core.entity.invoise.Invoise;
import com.formation.invoise.core.repository.InvoiseRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InvoiseRepositoryDataBase implements InvoiseRepositoryInterface {




    public Invoise save(Invoise invoise){

        KeyHolder kh = new GeneratedKeyHolder();
        jdbcTemplate.update(connexion ->{
            PreparedStatement ps = connexion.prepareStatement("INSERT INTO INVOICE (CUSTOMER_NAME,ORDER_NUMBER) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1,invoise.getCustomerName());
            ps.setString(2,invoise.getOrderNumber());
            return ps;
        },kh);
        invoise.setNumber(kh.getKey().toString());

        return invoise;
    }


    public List<Invoise> list() {

       return jdbcTemplate.query("SELECT INVOICE_NUMBER,CUSTOMER_NAME FROM INVOICE",
               (rs,rowNum) -> new Invoise(String.valueOf(rs.getLong("INVOICE_NUMBER")),rs.getString("CUSTOMER_NAME")));
    }

    @Override
    public Invoise getById(String id) {

        return jdbcTemplate.queryForObject("SELECT * FROM INVOICE WHERE INVOICE_NUMBER =?",new Object[]{id},

                (rs,rowNum) -> new Invoise(String.valueOf(rs.getLong("INVOICE_NUMBER")),rs.getString("CUSTOMER_NAME"),
                        rs.getString("ORDER_NUMBER")));
    }

}
*/