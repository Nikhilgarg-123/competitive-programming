package backtracing;

public class mazepath {
	public static void mazePath(int[][]maze,int r, int c,String ans){
        if(r==maze.length-1 || c==maze[0].length-1){
            System.out.println(ans);
        }
        else if(r<0 || r >= maze.length || c<0 || c>=maze[0].length || maze[r][c]!=0){
            return;
        }
        else{
            maze[r][c]=1;
            mazePath(maze,r,c-1,ans+"L");
            mazePath(maze,r,c+1,ans+"R");
            mazePath(maze,r-1,c,ans+"U");
            mazePath(maze,r+1,c,ans+"D");
            maze[r][c]=0;
        }
    }
	public static void main(String[] args) {
		int arr[][]= new int[3][3];
		arr[1][1]=2;
		mazePath(arr, 0, 0, "");
	}
}
