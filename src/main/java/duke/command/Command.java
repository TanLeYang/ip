package duke.command;

import duke.Storage;
import duke.task.TaskList;
import duke.ui.Ui;
import duke.ui.Response;
import duke.exceptions.DukeException;

import java.io.IOException;

/**
 * Represents a command entered by the user
 */
public abstract class Command {

    /**
     * Executes the appropriate action for the Command and return a Response containing data the GUI requires to
     * display feedback to the user.
     *
     * @param tasks TaskList containing all tasks
     * @param ui Ui for formatting of message Strings to be displayed to user
     * @param storage Storage to retrieve and store Tasks entered by user
     * @return Response object containing data for the GUI to use
     * @throws DukeException if there is a problem when executing the action due to invalid user input
     * @throws IOException if there is an error with storing changes into storage file
     */
    public abstract Response execute(TaskList tasks, Ui ui, Storage storage) throws DukeException, IOException;

    /**
     * Returns whether the Command causes the app to exit.
     *
     * @return true if Command causes the app to exit, false otherwise
     */
    public boolean isExit() {
        return false;
    }

}
