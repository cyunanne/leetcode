import java.util.Stack;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] mx = new int[numCourses][numCourses];
        Stack<Integer> stack = new Stack<>();
        int count = 0;

        for(int[] pre : prerequisites) {
            mx[pre[0]][pre[1]] = 1;
        }

        // 선수과목이 없는 과목들 먼저 수강
        for(int row=0; row<numCourses; row++) {
            
            boolean flag = false;
            for(int col=0; col<numCourses; col++) {
                if(mx[row][col] == 1) flag = true;
            }

            if(!flag) {
                stack.push(row);
                count++;
            } 
        }

        while(stack.size() != 0) {
            int cur = stack.pop();

            for(int i=0; i<numCourses; i++) {
                if(mx[i][cur] == 1) {
                    mx[i][cur] = 0;

                    boolean flag = false;
                    for(int j=0; j<numCourses; j++) {
                        if(mx[i][j] == 1) flag = true;
                    }

                    if(!flag) {
                        stack.push(i);
                        count++;
                    }
                }
            }
        }

        return count == numCourses;
    }
}