package com.investment.portfolio.init;

import com.investment.portfolio.dao.BondDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Класс  DataInit выполняет интерфейс  ApplicationRunner,
 * он будет автоматически работать во время старта приложения.
 * В данном классе мы вставим некоторые записи (record) в таблицу.
 */

@Component
public class DataInit implements ApplicationRunner {
    @Autowired
    public BondDAO bondDAO;

    @Override
    public void run(ApplicationArguments arguments) throws Exception {
        long c = bondDAO.count();
        System.out.println("krev numb of rows = " + c);
    }

}
