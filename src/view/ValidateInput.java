package view;

import functions.DanhBaManage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateInput {


    Scanner scanner = new Scanner(System.in);

    public String inputPhoneNumberForAdd(DanhBaManage manage){
        String phone = inputStr("\\d{10}");
        if(manage.contain(phone)){
            System.out.print("Số điện thoại này đã tồn tại! Nhập lại: ");
            phone = inputPhoneNumberForAdd(manage);
        }
        return phone;
    }

    public String inputPhoneNumberForSearch(DanhBaManage manage){
        String phone = inputStr("\\d{10}");
        if(!manage.contain(phone)){
            System.out.print("Số điện thoại này không tồn tại! Nhập lại: ");
            phone = inputPhoneNumberForSearch(manage);
        }
        return phone;
    }


    public String inputStr(String regex){
        String result = scanner.nextLine();
        if(!isValidate(result,regex)){
            System.out.println("Your input not match the format!");
            System.out.print("Re-enter: ");
            result = inputStr(regex);
        }
        return result;
    }

    public boolean isValidate(String input,String regex){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
}
