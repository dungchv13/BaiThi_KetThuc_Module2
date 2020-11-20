package functions;

import entities.DanhBa;

import java.util.ArrayList;

//String phone, String name, String gender, String address

public class DanhBaManage {
    private final String PATH = "E:\\on_tap\\DanhBa";
    FileProcess fileProcess = new FileProcess();
    ArrayList<DanhBa> list = fileProcess.readFile(PATH);

    public boolean add(DanhBa db){
        return list.add(db);
    }

    public boolean update(String phone, String nameU, String genderU, String addressU){
        try{
            DanhBa d = search(phone);
            d.setName(nameU);
            d.setGender(genderU);
            d.setAddress(addressU);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public void display(){
        for (DanhBa d:list) {
            System.out.println(d.toString());
        }
    }

    public boolean delete(String phone){
        try {
            return list.remove(search(phone));
        }catch (Exception e){
            return false;
        }
    }

    public DanhBa search(String phone){
        for (DanhBa d:list) {
            if(d.getPhone().equals(phone)){
                return d;
            }
        }
        return null;
    }

    public boolean saveChangeToFile(){
        try{
            fileProcess.writeFile(list,PATH);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean readFromFile(){
        try{
            list = fileProcess.readFile(PATH);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean contain(String phone){
        for (DanhBa d:list) {
            if(d.getPhone().equals(phone)){
                return true;
            }
        }
        return false;
    }
}
