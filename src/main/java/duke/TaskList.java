package duke;

import java.util.ArrayList;
import java.util.List;


public class TaskList extends ArrayList<Task> {
    /**
     * TaskList class to handle all operations relating to tasks.
     */
    private List<Task> taskList;

    /**
     * Constructor for TaskList
     */
    public TaskList() {
        taskList = new ArrayList<Task>();
    }

    /**
     * Constructor for TaskList.
     * @param taskList a list of tasks
     */
    public TaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    /**
     * Retrieves the task within the list.
     * @param taskID index of the task to be retrieved.
     * @return task retrieved
     */
    public Task getTask(int taskID) {
        return taskList.get(--taskID);
    }

    /**
     * Add the task to the list.
     * @param task task to be added.
     */
    public void addTask(Task task) {
        this.taskList.add(task);
    }

    /**
     * Delete the task from the list.
     * @param taskID index of task to be deleted.
     * @return task removed from the list.
     */
    public Task deleteTask(int taskID) {
        Task task = taskList.remove(--taskID);
        return task;
    }

    /**
     * Gets the size of the list
     * @return size of list
     */
    @Override
    public int size() {
        return taskList.size();
    }

    /**
     * Determine if list is empty
     * @return true if empty, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return taskList.isEmpty();
    }

    /**
     * Prints out all tasks in the list
     * @return String representation of all tasks in the list
     */
    @Override
    public String toString() {
        String output = "";
        if (!taskList.isEmpty()) {
            output = "Here are the tasks in your list: \n";
            int count = 1;
            for (Task t : taskList) {
                output += count++ + "." + t.toString() + "\n";
            }
        } else {
            output = "You have no tasks";
        }
        return output;
    }
}
