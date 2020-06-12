class RandomizedSet {
private List<Integer> _nums;
private Map<Integer, Integer> _positions;
    /** Initialize your data structure here. */
    public RandomizedSet() {
         _nums = new ArrayList();
        _positions = new HashMap();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(_positions.containsKey(val)){return false;}
        _nums.add(val);
        _positions.put(val,_nums.size()-1);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!_positions.containsKey(val)){return false;}
        int pos = _positions.get(val);
        _nums.set(pos,_nums.get(_nums.size()-1));
        _positions.put(_nums.get(pos),pos);
        _nums.remove(_nums.size()-1);
        _positions.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return _nums.get((int)(Math.random() * _nums.size()));
    }
}
