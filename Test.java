public class Test {
    @Test
    public void testEasy() {
        RegistrationResult result = Control.registerUser(new UserDTO());
        assertNotNull(result);
    }

    @Test
    public void testWithNoPassword() {
        UserDTO user = UserBuilder.please().createDefaultUser().withNoPassword().done();
        RegistrationResult result = Control.registerUser(user);

        assertFalse(result.getResult());
        assertEquals(RegistrationResult.Reason.PASSWORD_MISSING == result.getReason());
    }

    @Test
    public void testDiverseUsers () {
        UserDTO user = UserBuilder.please().createNewUser().withNoPassword().withID(666).done();
        user = UserBuilder.please().createNewUser().withPassword("1234").done();

        RegistrationResult result = Control.registerUser(user);
    }

    @Test
    public void testSameUsers() {
        UserDTO user1 = UserBuilder.please().createDefaultUser().withPassword("1234").withUserName("name").done();
        UserDTO user2 = UserBuilder.please().createDefaultUser().withUserName("name").withPassword("1234").done();
        assertTrue(user1.equals(user2));
    }
}