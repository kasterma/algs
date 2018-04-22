public class Board {
    private final int[][] blocks;

    /**
     * construct a board from an n-by-n array of blocks
     * (where blocks[i][j] = block in row i, column j)
     */
    public Board(int[][] blocks) {
        this.blocks = blocks;
    }

    // board dimension n
    public int dimension() {
        return blocks.length;
    }

    // number of blocks out of place
    public int hamming() {
        int ct = 0;
        for (int i = 0; i < dimension(); i++) {
            for (int j = 0; j < dimension(); j++) {
                if (blocks[i][j] - 1 != dimension()*i + j) {
                    ct++;
                }
            }
        }
        return ct;
    }

    // sum of Manhattan distances between blocks and goal
    public int manhattan() {
        int dst = 0;
        for (int i = 0; i < dimension(); i++) {
            for (int j = 0; j < dimension(); j++) {
                int col = blocks[i][j] % dimension();
                int row = blocks[i][j] / dimension();
                dst = (row - i) + (col - j);
            }
        }
        return dst;
    }

    // is this board the goal board?
    public boolean isGoal() {
        return hamming() == 0;
    }

    // a board that is obtained by exchanging any pair of blocks
    public Board twin() {
        int[][] blocksCopy = blocks.clone();
        int tmp = blocksCopy[0][0];
        blocksCopy[0][0] = blocksCopy[0][1];
        blocksCopy[0][1] = tmp;
        return new Board(blocksCopy);
    }

    // does this board equal y?
    public boolean equals(Object y) {

    }

    // all neighboring boards
    public Iterable<Board> neighbors() {

    }

    // string representation of this board (in the output format specified below)
    public String toString() {
        StringBuilder sb = new StringBuilder(dimension());
        sb.append('\n');

        for (int i = 0; i < dimension(); i++) {
            for (int j = 0; j < dimension(); j++) {
                sb.append()
            }
    }
}