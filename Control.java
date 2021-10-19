public class Control {
    public RegistrationResult registerUser(User dto) {
        RegistrationResult result = new RegistrationResult();
        String mail = dto.getMail();

        if (dto.getPassword() == null || dto.getPassword().equals("")) {
            result.setReason(RegistrationResult.PASSWORD_MISSING);
            result.setResult(false);
        }
        else {
            result.setReason(RegistrationResult.SUCCESS);
            result.setResult(true);
        }

        return result;
    }
}