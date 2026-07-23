package Day29;
import java.util.*;
public class Problem2 {
    class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }

    public Node(int val, ArrayList<Node> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }
}

        private HashMap<Node, Node> map = new HashMap<>();
    
        public Node cloneGraph(Node node) {
            if (node == null)
                return null;
    
            if (map.containsKey(node))
                return map.get(node);
    
            Node clone = new Node(node.val);
            map.put(node, clone);
    
            for (Node neighbor : node.neighbors) {
                clone.neighbors.add(cloneGraph(neighbor));
            }
    
            return clone;
        }
    }


    

