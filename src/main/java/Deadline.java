import java.time.LocalDateTime;

public class Deadline extends Task {

    private LocalDateTime dueDate;

    public Deadline(String description, LocalDateTime dueDate) {
        super(description);
        super.symbol = 'D';
        this.dueDate = dueDate;
    }

    public Deadline(String description, LocalDateTime dueDate, boolean isCompleted) {
        super(description, isCompleted);
        super.symbol = 'D';
        this.dueDate = dueDate;
    }

    @Override
    public Deadline markCompleted() {
        return new Deadline(description, dueDate, true);
    }

    @Override
    public String getStorageString() {
        String baseString = super.getStorageString();
        return String.format("%s | %s", baseString, dueDate);
    }

    @Override
    public String toString() {
        return String.format("[%s]%s (by: %s)", symbol, super.toString(), dueDate);
    }
}
