package unionfind;

public class QuickUnionUF {
  private int[] id;
  
  public QuickUnionUF(int N) {
    id = new int[N];
    for (int i = 0; i < N; i++) {
      id[i] = i; // set id of each 'object' to itself (N array accesses)
    }
  }
  
  private int root(int i) {
    while (i != id[i]) {
      i = id[i]; // chase parent pointers until each root (depth of i array accesses)
    }
    return i;
  }
  
  public boolean connected(int p, int q) {
    return root(p) == root(q); // check if p and q have the same root (depth of p and q array accesses)
  }
  
  public void union(int p, int q) {
    int i = root(p);
    int j = root(q);
    id[i] = j; // change root of p to point to root of q (depth of p and q array accesses)
  }  
}
