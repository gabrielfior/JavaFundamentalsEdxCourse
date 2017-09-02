public class TargetInput {

    private int row;
    private int col;

    public TargetInput(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "TargetInput{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }
}
