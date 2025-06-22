public class TaskManager {
    private Task head;

    public void addTask(int id, String name, String status) {
        Task newTask = new Task(id, name, status);
        if (head == null) {
            head = newTask;
        } 
        else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
        System.out.println("Task added.");
    }

    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks are available");
            return;
        }

        System.out.println("Task List:");
        Task current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }

    public void searchTask(int id) {
        Task current = head;
        while (current != null) {
            if (current.taskId == id) {
                System.out.println("Task found: " + current);
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found");
    }

    public void deleteTask(int id) {
        if (head == null) {
            System.out.println("No tasks to delete");
            return;
        }

        if (head.taskId == id) {
            head = head.next;
            System.out.println("Task deleted");
            return;
        }
        
        Task current = head;
        while (current.next != null) {
            if (current.next.taskId == id) {
                current.next = current.next.next;
                System.out.println("Task deleted");
                return;
            }
            current = current.next;
        }

        System.out.println("Task not found");
    }

    
}

