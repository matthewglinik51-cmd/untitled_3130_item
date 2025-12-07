package Matthew_Glinik.M_trees;

public class TreeNode<E> {
    // CISC: 3130
    private class Tree1DNode_1Darray_1array<E>
    {
        E data;
        Tree1DNode_1Darray_1array<E>[] children;

        public Tree1DNode_1Darray_1array(E data)
        {
            this(data, null);
        }

        public Tree1DNode_1Darray_1array(E data, Tree1DNode_1Darray_1array<E>[] children)
        {
            this.data = data;
            this.children = children;
        }

        @SuppressWarnings("unchecked")
        public Tree1DNode_1Darray_1array(E data, int amount_of_children)
        {
            this(data, ( (Tree1DNode_1Darray_1array<E>[]) (new Object[(amount_of_children)]) ));
        }
    }

    private Tree1DNode_1Darray_1array<E> root_Tree1DNode_1Darray_1array;

    // CISC: 3130+
    private class Tree1DNode_1Darray_1array_withParent<E>
    {
        Tree1DNode_1Darray_1array_withParent<E> parent;
        E data;
        Tree1DNode_1Darray_1array_withParent<E>[] children;

        public Tree1DNode_1Darray_1array_withParent(E data)
        {
            this(data, null);
        }

        public Tree1DNode_1Darray_1array_withParent(Tree1DNode_1Darray_1array_withParent<E> parent, E data, Tree1DNode_1Darray_1array_withParent<E>[] children)
        {
            this.parent = parent;
            this.data = data;
            this.children = children;
        }

        public Tree1DNode_1Darray_1array_withParent(E data, Tree1DNode_1Darray_1array_withParent<E>[] children)
        {
            this(null, data, children);
        }

        @SuppressWarnings("unchecked")
        public Tree1DNode_1Darray_1array_withParent(E data, int amount_of_children)
        {
            this(data, ( (Tree1DNode_1Darray_1array_withParent<E>[]) (new Object[(amount_of_children)]) ));
        }

        @SuppressWarnings("unchecked")
        public Tree1DNode_1Darray_1array_withParent(Tree1DNode_1Darray_1array_withParent<E> parent, E data, int amount_of_children)
        {
            this(parent, data, ( (Tree1DNode_1Darray_1array_withParent<E>[]) (new Object[(amount_of_children)]) ));
        }
    }

    private Tree1DNode_1Darray_1array_withParent<E> root_Tree1DNode_1Darray_1array_withParent;

    // items
    private class Tree2DNode_1Darray_2arrays<E>
    {
        E data;
        Tree2DNode_1Darray_2arrays<E>[] left, right;

        public Tree2DNode_1Darray_2arrays(E data)
        {
            this(data, null, null);
        }

        public Tree2DNode_1Darray_2arrays(E data, Tree2DNode_1Darray_2arrays<E>[] left, Tree2DNode_1Darray_2arrays<E>[] right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        @SuppressWarnings("unchecked")
        public Tree2DNode_1Darray_2arrays(E data, int amount_of_left_children, int amount_of_right_children)
        {
            this(data, ( (Tree2DNode_1Darray_2arrays<E>[]) (new Object[(amount_of_left_children)]) ), ( (Tree2DNode_1Darray_2arrays<E>[]) (new Object[(amount_of_right_children)]) ));
        }
    }

    private Tree2DNode_1Darray_2arrays<E> root_Tree2DNode_1Darray_2arrays;
}
