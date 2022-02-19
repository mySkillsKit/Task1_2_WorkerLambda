package Task1_2_WorkerLambda;

public class Worker {

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start(int x) {
        for (int i = 0; i < 100; i++) {
            if (i == x) {
                errorCallback.onError("Task " + i + " is error");
            }
            callback.onDone("Task " + i + " is done");
        }
    }

}
