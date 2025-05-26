public class ratInMaze {
    public static int maze(int sr, int sc, int er, int ec ){
        if(sr > er || sc>ec) return 0;
        if(sr == er || sc == ec) return 1;
        int downWards = maze(sr+1, sc, er, ec);
        int rightWards = maze(sr, sc+1, er, ec);
        int totalWays = downWards + rightWards;
        return totalWays;
  }

  public static void path(int sr, int sc, int er, int ec, String s ){
        if(sr >er || sc>ec) return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        path(sr+1, sc, er, ec, s+"D");
        path(sr, sc+1, er, ec, s+"R");
  }
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        // int count = maze(1, 1, rows, cols);
        // System.out.println(count);
        path(1, 1, rows, cols, "");
    }
}