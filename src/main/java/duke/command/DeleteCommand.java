package duke.command;

import duke.TaskList;
import duke.ui.Ui;
import duke.Task;
import duke.storage.Storage;

public class DeleteCommand extends Command {
    /**
     * Handles the appropriate tasks when performing an AddCommand by Duke.
     */
    private int taskID;

    /**
     * Constructor for DeleteCommand.
     * @param taskID integer identifier to identify the index of the task to be deleted from the list of tasks.
     */
    public DeleteCommand(int taskID) {
        this.taskID = taskID;
    }

    /**
     * Overridden method to handle the specific tasks to be carried out when performing deletion
     * @param tasks a list of tasks.
     * @param ui Ui class to handle display messages.
     * @param storage Storage to handle saving/loading of data to/from the list of task.
     */
    @Override
    public void initCommand(TaskList tasks, Ui ui, Storage storage) {
        if (tasks.size() >= taskID && !tasks.isEmpty()) {
            Task currentTask = tasks.getTask(taskID);
            tasks.deleteTask(taskID);
            storage.saveData(tasks);
            ui.displayDeleteTaskMessage(currentTask, tasks);

        } else {
            ui.displayMsg("Invalid taskID entered!");
        }
    }


}
