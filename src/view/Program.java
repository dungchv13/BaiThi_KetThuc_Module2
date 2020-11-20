package view;

import functions.DanhBaManage;

public class Program {
    public static void main(String[] args) {
        DanhBaManage manage = new DanhBaManage();
        ValidateInput input = new ValidateInput();
        Menus menu = new Menus();
        do{
            System.out.println("--------------MENU--------------");
            System.out.println("1.Xem danh sách.");
            System.out.println("2.Thêm mới.");
            System.out.println("3.Cập nhật.");
            System.out.println("4.Xóa.");
            System.out.println("5.Tìm kiếm.");
            System.out.println("6.Đọc từ file.");
            System.out.println("7.Ghi vào file.");
            System.out.println("0.Thoát.");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(input.inputStr("[0-7]"));
            switch (choice){
                case 1:
                    manage.display();
                    break;
                case 2:
                    menu.menu2(manage);
                    break;
                case 3:
                    menu.menu3(manage);
                    break;
                case 4:
                    System.out.print("Nhập số điện thoại bạn muốn xóa thông tin (10 chữ số): ");
                    String phone4 = input.inputPhoneNumberForSearch(manage);
                    manage.delete(phone4);
                    break;
                case 5:
                    System.out.print("Nhập số điện thoại bạn muốn tìm kiếm thông tin (10 chữ số): ");
                    String phone5 = input.inputPhoneNumberForSearch(manage);
                    System.out.println(manage.search(phone5).toString());
                    break;
                case 6:
                    System.out.print("Các thay đổi có thể chưa được lưu, bạn có muốn tiếp tục (0 /Quay lại | 1 /Tiếp tục):");
                    String select = input.inputStr("[0-1]");
                    if(select.equals("0")){
                        break;
                    }else{
                        manage.readFromFile();
                    }
                    break;
                case 7:
                    manage.saveChangeToFile();
                    break;
                case 0:
                    System.exit(0);
            }
        }while (true);

    }
}
