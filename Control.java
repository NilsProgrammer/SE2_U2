public class Control {
    public static RegistrationResult registerUser(UserDTO dto) {
        RegistrationResult result = new RegistrationResult();
        //String mail = dto.getEmail();
        String password = dto.getPassword();

        if (password == null || password.equals("")) {
            result.setReason(RegistrationResult.Reason.PASSWORD_MISSING);
            result.setResult(false);
        }
        else {
            result.setReason(RegistrationResult.Reason.SUCCESS);
            result.setResult(true);
        }

        return result;
    }
}