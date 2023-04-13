package com.thuanthanh.vegetables.StringUtil;

import org.hibernate.validator.internal.engine.messageinterpolation.parser.MessageDescriptorFormatException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public String checkPhone(String str) {
        // Bieu thuc chinh quy mo ta dinh dang so dien thoai
        String reg = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";

        // Kiem tra dinh dang
        boolean kt = str.matches(reg);
        if (kt == false) {
            throw new MessageDescriptorFormatException("Loi: Khong dung dinh dang!");
        }
        return str;
    }
    public String checkEmail(String str) {
        // Bieu thuc chinh quy mo ta dinh dang email
        String reg = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";

        // Kiem tra dinh dang
        boolean kt = str.matches(reg);
        if (kt == false) {
            throw new MessageDescriptorFormatException("Loi: Khong dung dinh dang!");
        }
        return str;
    }
    public String conVertDate(String date) throws ParseException {
        Date Da = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        return String.valueOf(Da);
    }
}
