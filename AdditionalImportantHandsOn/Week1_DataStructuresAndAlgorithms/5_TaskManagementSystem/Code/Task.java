public class Task {
    int taskId;
    String taskName;
    String status;
    // Next task's pointer reference
    Task next;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        // Initializing next to null
        this.next = null;
    }

    @Override
    public String toString() {
        return "TaskID: " + taskId + ", Name: " + taskName + ", Status: " + status;
    }
}
