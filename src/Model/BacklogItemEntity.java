package Model;

public class BacklogItemEntity {

    public String task;
    public String points;
    public String priority;
    public int Id;

    public BacklogItemEntity(String task, String points, String priority) {
        this.task = task;
        this.points = points;
        this.priority = priority;
    }
}
