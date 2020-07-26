package com.pavlobu;

/**
 * Created by Pavlo (Paul) Buidenkov on 2020-07-26
 */
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DateUtils{

    private static final Logger logger = LoggerFactory.getLogger(DateUtils.class);

    public static void main(String[] args) {

        logger.debug("[MAIN] Current Date : {}", getCurrentDate());
        System.out.println(getCurrentDate());

        System.out.println("---------");
        new TextTestPrint().print();
    }

    private static Date getCurrentDate(){
        return new Date();
    }

}