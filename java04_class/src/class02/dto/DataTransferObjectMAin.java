package class02.dto;

import java.time.LocalDate;

public class DataTransferObjectMAin {
    public static void main(String[] args) {
        String id = "admin";
        String password = "1234";
        String name = "hong-gd";
        int age = 100;
        LocalDate birthday = LocalDate.of(2000,1,1);
        String address = "Seoul";
        String phone = "010-1111-1111";

        DataTransferObject01 dto =
                new DataTransferObject01();
        System.out.println(dto);

        DataTransferObject02 vo =
                new DataTransferObject02(id, password ,name ,age, birthday, address, phone);
        System.out.println(vo);

        dto.setId(id);
        dto.setName(name);

        System.out.println(vo.id());
    }
}
