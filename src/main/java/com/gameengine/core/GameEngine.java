public class GameEngine {
    private boolean running;

    public void start() {
        initialize();
        run();
    }

    private void initialize() {
        // Initialization code here
    }

    private void run() {
        while (running) {
            update();
            render();
        }
    }

    private void update() {
        // Update game logic here
    }

    private void render() {
        // Render game here
    }

    public void stop() {
        running = false;
    }
}