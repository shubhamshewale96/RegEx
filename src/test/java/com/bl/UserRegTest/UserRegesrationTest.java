package com.bl.UserRegTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bl.UserReg.UserRegestration;

public class UserRegesrationTest {
	UserRegestration userRegistration;
    @Before
    public void before() {
        userRegistration = new UserRegestration();
    }

    @Test
    public void givenFirstNameWhenProperShouldReturnTrue() {
        boolean result = userRegistration.firstName("Shubham");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstNameWhenNotProperShouldReturnFalse() {
        boolean result = userRegistration.firstName("shubham");
        Assert.assertFalse(result);
    }
    /**
     * Unit test for validating last name
     */
    @Test
    public void givenLastNameWhenProperShouldReturnTrue() {
        boolean result = userRegistration.lastName("Shewale");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastNameWhenNotProperShouldReturnFalse() {
        boolean result = userRegistration.lastName("shewale");
        Assert.assertFalse(result);
    }
}
