class Solution {
    fun numberOfSteps(num: Int): Int {
        var cnt = 0
        var calNum = num
        while(calNum > 0){
            if(calNum % 2 == 1) {
                calNum--
                cnt++
                println("Log1. calNum : $calNum, cnt : $cnt")
            }
            else if(calNum != 1){
                calNum = calNum / 2
                cnt++
                println("Log2. calNum : $calNum, cnt : $cnt")
            }
            else {
                calNum = 0
            }
        }
        return cnt
    }
}