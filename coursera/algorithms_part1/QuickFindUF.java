public class QuickFindUF {

    private int[] id;

    public QuickFindUF(int N) {
        id = new[N];
        for (int i = 0; i < N; i++) {
            int[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void  unuon(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

}
