import java.util.ArrayList;

public class solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    private ArrayList<ArrayList<Integer>> listAll=new ArrayList<>();
    private ArrayList<Integer> list=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null){
            return listAll;
        }
        list.add(root.val);
        target-=root.val;
        if(target==0&&root.left==null&&root.right==null){
            listAll.add(new ArrayList<Integer>(list));
            //每一次都是一条路径，所以要new
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size()-1);//遍历完一条路径要后退，
        return listAll;

    }
}
