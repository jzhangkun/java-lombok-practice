// https://projectlombok.org/features/all
package com.kun.lombok.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;

    public void testNotNull(@NonNull User user) {
        System.out.println(user);
    }

    public static void main(String... args) {
        User foo = new User();
        foo.setName("foo");
        foo.setAge(18);
        System.out.println(foo);
    }
}
