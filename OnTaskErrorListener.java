package Task1_2_WorkerLambda;

    @FunctionalInterface
    public interface OnTaskErrorListener {

        void onError(String result);

    }


