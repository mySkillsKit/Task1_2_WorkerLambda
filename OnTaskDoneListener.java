package Task1_2_WorkerLambda;

    @FunctionalInterface
    public interface OnTaskDoneListener {

        void onDone(String result);

    }


