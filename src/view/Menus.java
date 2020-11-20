package view;

import entities.DanhBa;
import functions.DanhBaManage;

public class Menus {

    ValidateInput input = new ValidateInput();

    public void menu2(DanhBaManage manage){
        //String phone, String name, String gender, String address

        System.out.print("Nhập số điện thoại (10 chữ số): ");
        String phone = input.inputPhoneNumberForAdd(manage);



        System.out.print("Nhập tên (Viết hoa chữ cái đầu): ");
        String name = input.inputStr("[A-Z].+");
        System.out.print("Nhập giới tính (0 /Nữ | 1 /Nam): ");
        String str = input.inputStr("[0-1]");
        String gender = "male";
        if(str.equals("0")){
            gender = "female";
        }
        System.out.print("Nhập địa chỉ (Viết hoa chữ cái đầu): ");
        String address = input.inputStr("[A-Z].+");

        boolean add = manage.add(new DanhBa(phone,name,gender,address));
        if(add){
            System.out.println("thành công!");
        }else{
            System.out.println("thất bại!");
        }
    }

    public void menu3(DanhBaManage manage){
        System.out.print("Nhập số điện thoại bạn muốn cập nhật thông tin (10 chữ số): ");
        String phone = input.inputPhoneNumberForSearch(manage);

        System.out.print("Nhập tên (Viết hoa chữ cái đầu): ");
        String name = input.inputStr("[A-Z].+");
        System.out.print("Nhập giới tính (0 /Nữ | 1 /Nam): ");
        String str = input.inputStr("[0-1]");
        String gender = "male";
        if(str.equals("0")){
            gender = "female";
        }
        System.out.print("Nhập địa chỉ (Viết hoa chữ cái đầu): ");
        String address = input.inputStr("[A-Z].+");

        boolean update = manage.update(phone,name,gender,address);

        if(update){
            System.out.println("thành công!");
        }else{
            System.out.println("thất bại!");
        }

    }
}
