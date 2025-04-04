// This will cause a compilation error because Logger is final
class ExtendedLogger extends Logger {
    public void logMessage(String message) {
        System.out.println("Extended Log: " + message);
    }
}
