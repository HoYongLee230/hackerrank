/*
   class Node 
       int data;
       Node left;
       Node right;
*/
void top_view(Node root)
{
   top_left_view(root.left);
   System.out.print(root.data + " ");
   top_right_view(root.right);  
}

void top_left_view(Node root) {
    if(root != null) {
        top_left_view(root.left);
        System.out.print(root.data + " ");
    }
}

void top_right_view(Node root) {
    if(root != null) {
        System.out.print(root.data + " ");
        top_right_view(root.right);
    }
}
