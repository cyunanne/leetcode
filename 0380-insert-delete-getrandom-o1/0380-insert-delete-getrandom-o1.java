// 95ms, 85.6mb
import java.util.Set;
import java.util.HashSet;

class RandomizedSet {
    
    private Set<Integer> set;
    
    public RandomizedSet() {
        set = new HashSet<>();    
    }
    
    public boolean insert(int val) {
        return set.add(val);
    }
    
    public boolean remove(int val) {
        return set.remove(val);
    }
    
    public int getRandom() {
        int rand = (int)(Math.random() * set.size());
        Iterator<Integer> itor = set.iterator();
        for(int i=0; i<rand; i++)
            itor.next();
        return itor.next();
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */