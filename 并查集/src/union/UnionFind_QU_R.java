package union;

/**
 * 
 * QuickUnion 
 * 基于 rank(树高) 的优化
 * 
 * */
public class UnionFind_QU_R extends UnionFind_QU{

    int [] ranks;
    public UnionFind_QU_R(int capacity) {
        super(capacity);
        ranks = new int[capacity];
        for (int i = 0; i < ranks.length; i++) {
            ranks[i] = 1;
        }
    }

    @Override
    public void union(int v1, int v2) {
        int p1 = find(v1);
        int p2 = find(v2);
        if (p1 == p2) return;

        if (ranks[p1] < ranks[p2]){
            // p1树高比较矮
            parents[p1] = p2;
        }else if (ranks[p1] > ranks[p2]){
            // p1树高高
            parents[p2] = p1;
        }else {
            // 两棵树高相等
            parents[p1] = p2;
            ranks[p2] += 1;
        }
    }
}
