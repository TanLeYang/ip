import exceptions.DukeException;

import java.time.LocalDateTime;

public class EventCommand extends Command {

    private final String description;
    private final String dateStr;

    public EventCommand(String description, String dateStr) {
        this.description = description;
        this.dateStr = dateStr;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        LocalDateTime eventDateTime = DateParser.parseString(dateStr);
        Event event = new Event(description, eventDateTime);
        tasks.addTask(event);
        ui.printMessage(String.format("Okay, I've added the following event: \n %s", event.toString()));
        storage.updateTasks(tasks.getListOfTasks());
    }
}
