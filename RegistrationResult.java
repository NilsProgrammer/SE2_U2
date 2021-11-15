public class RegistrationResult {
    public enum Reason {
        SUCCESS,
        PASSWORD_MISSING,
        FAILED
    }

    boolean result;
    Reason reason;

    public boolean getResult() {return this.result;}
    public void setResult(boolean result) {
        this.result = result;
    }

    public Reason getReason() {return this.reason;}
    public void setReason(Reason callback) {
        this.reason = callback;
    }
}