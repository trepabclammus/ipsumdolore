public class Task {
    private String name;
    private boolean isCompleted;

    public Task(String name) {
        this.name = name;
        this.isCompleted = false;
    }

    public void start() {
        System.out.println("Starting task: " + this.name);
        // Some logic to start the task
    }

    public void finish() {
        this.isCompleted = true;
        System.out.println("Task \"" + this.name + "\" is finished.");
    }

    public static void main(String[] args) {
        Task myTask = new Task("Write report");
        myTask.start();
        myTask.finish();  // Calls the finish method on the instance myTask
    }
}
