package union;

public abstract class UnionFind {
    protected int[] parents;

    public UnionFind(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("capacity mast >= 1");
        parents = new int[capacity];
        for (int i = 0; i < parents.length; i++) {
            parents[i] = i;
        }
    }

    /**
     * 查找v所属的集合
     * @param v 查询元素
     * @return 所属集合
     * */
    public abstract int find(int v);

    /**
     * 合并v1, v2 两个并查集
     * */
    public abstract void union(int v1, int v2);

    /**
     * 两个元素是否在同一集合
     * */
    public boolean isSame(int v1, int v2){
        return find(v1) == find(v2);
    }

    protected void rangeCheck(int v) {
        if (v < 0 || v >= parents.length) {
            throw new IllegalArgumentException("v is out of bounds");
        }
    }
}
