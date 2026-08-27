package class02.dto;

import java.time.LocalDate;

// 생성자와 getter 자동으로 만들어 줌 => 모든 field가 final! (immutable)
public record DataTransferObject02(
        String id,
        String password,
        String name,
        int age,
        LocalDate birthday,
        String address,
        String phone) {
}
