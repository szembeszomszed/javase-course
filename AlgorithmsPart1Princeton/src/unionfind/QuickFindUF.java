package unionfind;

public class QuickFindUF {
  private int[] id;
  
  public QuickFindUF(int N) {
    id = new int[N];
    for (int i = 0; i < N; i++) {
      id[i] = i; // set id of each 'object' to itself (N array accesses)
    }
  }
  
  public boolean connected(int p, int q) {
    return id[p] == id[q]; // check whether p and q are in the same component (2 array accesses)
  }
  
  public void union(int p, int q) {
    int pid = id[p];
    int qid = id[q];
    for (int i = 0; i < id.length; i++) {
      if (id[i] == pid) { //  put ID of p here rather than first picking out that value would be a bug
        id[i] = qid;
      }      
    }
  }
}

// Quick Find is two slow for huge problems
