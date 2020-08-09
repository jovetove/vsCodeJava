package algorithm.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

    /**
     * 建立二叉树
     * @param list
     * @return
     */
    public static TreeNode getTreeNode(List<Integer> list){
        if(list ==null || list.size() == 0){
            return null;
        }
        int index = 0;
        int len = list.size();
        TreeNode root = new TreeNode(list.get(index++));
        Queue<TreeNode> queue = new LinkedList<>();      
        queue.offer(root);
        
        while(index < len){
            TreeNode node = queue.poll();
            if(index < len && list.get(index) != null){
                node.left = new TreeNode(list.get(index++));
                queue.offer(node.left);
            }else{
                index += 1;
            }
            if(index < len && list.get(index) != null){
                node.right = new TreeNode(list.get(index++));
                queue.offer(node.right);
            }else{
                index += 1;
            }
        }
        return root;
    }

    public static TreeNode getTreeNode(String[] list){
        List<Integer> listArr = new ArrayList<>();
        for(String s: list){
            if(s == "null"){
                listArr.add(null);
            }else{
                listArr.add(Integer.valueOf(s));
            }
        }
        return getTreeNode(listArr);
    }


    @Override
    public String toString() {
        return "[val=" + val + ", left=" + left + ", right=" + right + "]";
    }
}