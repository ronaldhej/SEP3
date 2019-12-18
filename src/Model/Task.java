package Model;

public class Task {
    public int taskID;
    public String task;

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskID=" + taskID +
                ", task='" + task + '\'' +
                '}';
    }
}
