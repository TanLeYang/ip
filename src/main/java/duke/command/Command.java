package duke.command;

import duke.Storage;
import duke.task.TaskList;
import duke.Ui;
import duke.exceptions.DukeException;

public abstract class Command {

    public abstract void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException;

    public boolean isExit() {
        return false;
    }

}