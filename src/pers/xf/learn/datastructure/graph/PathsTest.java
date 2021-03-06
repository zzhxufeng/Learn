package pers.xf.learn.datastructure.graph;

import edu.princeton.cs.algs4.In;

public class PathsTest {
    /**
     * 找到路径.
     * BFS找到的是最短路径.
     * @param args
     *              args[0] : 文件名称
     *              args[1] : 顶点起点id
     */
    public static void main(String[] args) {
        Graph G = new Graph(new In(args[0]));
        int s = Integer.parseInt(args[1]);

        Paths search = new BreadthFirstPaths(G, s);

        for(int v = 0; v < G.V(); v++){
            System.out.print(s + " to " + v + ": ");
            if (search.hasPathTo(v)){
                for (int x : search.pathTo(v)){
                    if (x == s) System.out.print(x);
                    else System.out.print("-" + x);
                }
            }
            System.out.println();
        }
    }
}
