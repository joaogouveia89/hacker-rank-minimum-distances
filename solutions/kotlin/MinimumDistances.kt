fun minimumDistances(a: Array<Int>): Int {
    val valuesChecked = HashMap<Int, Int>()
    var minDist = -1
    var dist = minDist
    
    for(i in 0..(a.size - 1)){
        if(valuesChecked.containsKey(a[i])){
            dist = i - (valuesChecked.get(a[i]) ?: 0)
            if(minDist == -1 || minDist > dist){
                minDist = dist;
            }
        }
        valuesChecked.put(a[i], i)
    }
    return minDist
}