package lesson33._01_trainig;

import lombok.Getter;

public class TrainingException extends Exception {
    @Getter
    private String errorLine;


    public TrainingException(String errorLine, Throwable cause) {
        super(cause);
        this.errorLine = errorLine;
    }

    @Override
    public String toString() {
        return "ErrorLine: " + errorLine;
    }
}
