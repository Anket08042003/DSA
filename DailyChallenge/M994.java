public class M994 {
    public static void main(String args[]) {
        int[][] grid = { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
        int ans = orangesRotting(grid);
        System.out.println(ans);
    }

    public static int orangesRotting(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 0 || grid[i][j] == 1) {
                    continue;
                }
                if (grid[i][j] == 2) {
                    if (i % grid.length == 0) {
                        if (j == 0) {
                            if ((grid[i + 1][j] == 2 || grid[i + 1][j] == 0) && (grid[i][j + 1] == 2 || grid[i][j + 1] == 0)) {
                                continue;
                            }
                            if (grid[i + 1][j] != 0) {
                                grid[i + 1][j] = 2;
                            }
                            if (grid[i][j + 1] != 0) {
                                grid[i][j + 1] = 2;
                            } 
                        } else if (j == grid[i].length - 1) {
                            if ((grid[i + 1][j] == 2 || grid[i + 1][j] == 0 ) && (grid[i][j - 1] == 2 || grid[i][j - 1] == 0) ) {
                                continue;
                            }
                            if (grid[i + 1][j] != 0) {
                                grid[i + 1][j] = 2;
                            }
                            if (grid[i][j - 1] != 0) {
                                grid[i][j - 1] = 2;
                            }
                        } else {
                            if ((grid[i + 1][j] == 2 || grid[i + 1][j] == 0) && (grid[i][j - 1] == 2 || grid[i][j - 1] == 0) && (grid[i][j + 1] == 2 || grid[i][j + 1] ==0)) {
                                continue;
                            }
                            if (grid[i + 1][j] != 0) {
                                grid[i + 1][j] = 2;
                            }
                            if (grid[i][j - 1] != 0) {
                                grid[i][j - 1] = 2;
                            }
                            if (grid[i][j + 1] != 0) {
                                grid[i][j + 1] = 2;
                            } 
                        }
                        count++;
                    } else if (i % grid.length == grid.length - 1) {
                        if (j == 0) {
                            if ((grid[i][j + 1] == 2 || grid[i][j + 1] == 0) && (grid[i - 1][j] == 2 || grid[i - 1][j] == 2)) {
                                continue;
                            }
                            if (grid[i][j + 1] != 0) {
                                grid[i ][j+1] = 2;
                            } else if (grid[i-1][j] != 0) {
                                grid[i-1][j ] = 2;
                            } 
                        } else if (j == grid[i].length - 1) {
                            if ((grid[i][j - 1] == 2 || grid[i][j - 1] == 0) && (grid[i - 1][j] == 2 || grid[i - 1][j] == 0)) {
                                continue;
                            }
                            if (grid[i][j - 1] != 0) {
                                grid[i][j-1] = 2;
                            } else if (grid[i-1][j] != 0) {
                                grid[i-1][j] = 2;
                            } 
                        } else {
                            if ((grid[i][j + 1] == 2 || grid[i][j + 1] == 0) && (grid[i][j - 1] == 2 || grid[i][j - 1] == 0) && (grid[i - 1][j] == 2 ||grid[i - 1][j] == 0)) {
                                continue;
                            }
                            if (grid[i][j + 1] != 0) {
                                grid[i][j + 1] = 2;
                            }
                            if (grid[i][j - 1] != 0) {
                                grid[i][j - 1] = 2;
                            }
                            if (grid[i - 1][j] != 0) {
                                grid[i - 1][j] = 2;
                            } 
                        }
                        count++;
                    } else {
                        if (j == 0) {
                            if ((grid[i][j + 1] == 2 || grid[i][j + 1] == 0) && (grid[i + 1][j] == 2 || grid[i + 1][j] == 0)&& (grid[i - 1][j] == 2 || grid[i - 1][j] ==0)) {
                                continue;
                            }
                            if (grid[i][j + 1] != 0) {
                                grid[i][j + 1] = 2;
                            }
                            if (grid[i + 1][j] != 0) {
                                grid[i + 1][j] = 2;
                            }
                            if (grid[i - 1][j] != 0) {
                                grid[i - 1][j] = 2;
                            } 
                        }
                        else if (j == grid[i].length - 1) {
                            if ((grid[i][j - 1] == 2 || grid[i][j - 1] == 0) && (grid[i + 1][j] == 2 || grid[i + 1][j] == 0)  && (grid[i - 1][j] == 2 || grid[i - 1][j] == 0)) {
                                continue;
                            }
                            if (grid[i][j - 1] != 0) {
                                grid[i][j - 1] = 2;
                            }
                            if (grid[i + 1][j] != 0) {
                                grid[i + 1][j] = 2;
                            }
                            if (grid[i - 1][j] != 0) {
                                grid[i - 1][j] = 2;
                            } 
                        }
                        else{
                            if ((grid[i][j - 1] == 2 || grid[i][j - 1] == 0) && (grid[i + 1][j] == 2 || grid[i + 1][j] == 0) && (grid[i - 1][j] == 2 || grid[i - 1][j] == 0) && (grid[i][j+1]==2 || grid[i][j+1]==0)) {
                                continue;
                            }
                            if (grid[i][j - 1] != 0) {
                                grid[i][j - 1] = 2;
                            }
                            if (grid[i + 1][j] != 0) {
                                grid[i + 1][j] = 2;
                            }
                            if (grid[i - 1][j] != 0) {
                                grid[i - 1][j] = 2;
                            } 
                            if(grid[i][j+1]!=0){
                                grid[i][j+1] = 2;
                            }
                        }
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
