public class Block<T> {

    private final int hash;
    private final T data;
    private Block<?> nextBlock = null;

    /* TODO : CONSTRUCTOR */

    public Block (int hash, T data) {
        this.hash = hash;
        this.data = data;
    }

    /* TODO : getData() */

    public T getData() {
        return this.data;
    }

    /* TODO : setNextBlock() */

    public void setNextBlock(Block<?> nextBlock) {
        this.nextBlock = nextBlock;
    }

    /* TODO : getHash() */

    public int getHash() {
        return this.hash;
    }

    /* TODO : getNextBlock() */

    public Block<?> getNextBlock() {
        return this.nextBlock;
    }
}