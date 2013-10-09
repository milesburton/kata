package customnodes

class TreeNode implements Comparable<TreeNode> {

    TreeNode leftNode
    TreeNode rightNode
    Integer value

    TreeNode append(TreeNode newNode){

        TreeNode potentialParent = this

        while(true){

            if(newNode < potentialParent){

                // If no left node, add the new node to left
                if(!potentialParent.leftNode){
                    potentialParent.leftNode = newNode
                    return potentialParent
                }else{
                    // If a left node exists, set it to be the next potential parent and continue the loop

                    potentialParent = potentialParent.leftNode
                }

            }else{

                if(!potentialParent.rightNode){
                    potentialParent.rightNode = newNode
                    return potentialParent
                }else{
                    potentialParent = potentialParent.rightNode
                }
            }
        }
    }

    @Override
    int compareTo(TreeNode o) {
        this.value - o.value
    }
}
