// List<Integer> res = new ArrayList<>();
// 		if(root==null){
// 			return res;
// 		}
// 		Deque<TreeNode> deq = new LinkedList<>();
// 		deq.add(root);
// 		boolean leftToRight = true;
// 		while(!deq.isEmpty()){
// 			int size = deq.size();
// 			for(int i=0;i<size;i++){
// 				if(leftToRight){
// 					TreeNode curr = deq.removeFirst();
// 					res.add(curr.val);

// 					if(curr.left!=null) deq.addLast(curr.left);
// 					if(deq.right!=null) deq.addLast(curr.right);

// 					leftToRight = false;
// 				}
// 				else{
// 					TreeNode curr = deq.removeLast();
// 					res.add(curr.val);

// 					if(curr.left!=null) deq.addLast(curr.left);
// 					if(deq.right!=null) deq.addLast(curr.right);

// 					leftToRight = true;
// 				}
// 			}
// 		}
// 		return res;