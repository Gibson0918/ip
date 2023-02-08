package duke.command;

import duke.TaskList;
import duke.ui.Ui;
import duke.storage.Storage;

public class ExitCommand extends Command {

    /**
     * Overridden method to handle the specific tasks to be carried out when performing deletion
     * @param tasks a list of tasks.
     * @param ui Ui class to handle display messages.
     * @param storage Storage to handle saving/loading of data to/from the list of task.
     * @return Duke's response message
     */
    @Override
    public String initCommand(TaskList tasks, Ui ui, Storage storage) {
        storage.saveData(tasks);
        return ui.displayGoodbyeMessage();
    }

}