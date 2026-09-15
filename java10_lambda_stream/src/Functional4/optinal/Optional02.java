package Functional4.optinal;

import java.util.List;
import java.util.Optional;

public class Optional02 {
    void main() {
        handlingList();
        chaining();
    }

    public static void chaining() {
        Optional<String> primary = Optional.empty();
        Optional<String> secondary = Optional.of("guest@guest.com");

        String email = primary
                .or(() -> secondary)
                .orElse("nanager@manager.com");
        IO.println(email);

        Optional<String> opt = Optional.of("hello");
        long count = opt.stream()
                .count();
        IO.println(count);
    }

    public static void handlingList() {
        List<User> users = List.of(
                new User("1", "hond-gd", "hong@aver.com"),
                new User("2", "kim-sd", null)
        );

        users.stream()
                .filter(u -> u.id().equals("2"))
                .findFirst()
                .map(User::email)
                .ifPresentOrElse((email) -> IO.println(email),
                        () -> IO.println("email이 없습니다..."));
    }
}
