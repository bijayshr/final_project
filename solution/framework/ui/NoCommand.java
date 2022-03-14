package final_project.solution.framework.ui;

//TODO: Singleton Design Pattern (Lazy Initialization)
public class NoCommand implements Command {
    private static volatile NoCommand instance;

    private NoCommand() {
    }

    public static NoCommand getInstance() {
        if (instance == null) {
            synchronized (NoCommand.class) {
                if (instance == null) {
                    instance = new NoCommand();
                }
            }
        }
        return instance;
    }
    @Override
    public void execute(UIControl control) {
    }
}
