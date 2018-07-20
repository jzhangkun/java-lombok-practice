package com.kun.lombok;

import com.kun.lombok.model.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class lombokTest {
    @Test
    public void testNoArgsConstructorAnnotation() {
        User foo = new User();
        foo.setName("foo");
        foo.setAge(18);

        assertEquals(Integer.valueOf(18), foo.getAge());
        assertEquals("foo", foo.getName());
    }

    @Test
    public void testBuilderAnnotation() {
        User foo = User.builder().name("foo").age(18).build();
        assertEquals(foo.getName(), "foo");
    }

    @Test
    public void testToStringAnnotation() {
        User bar = dummyUser();
        System.out.println(bar.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testNullAnnotation() {
        User bar = new User();
        bar.testNotNull(null);
    }

    private User dummyUser() {
        return User.builder().name("bar").age(20).build();
    }
}
