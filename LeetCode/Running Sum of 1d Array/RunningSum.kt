package com.balancehero.truebalance.commoncode.net.repository

class RunningSum {
    fun main() {
        val result = runningSum(arrayListOf(1, 2, 3, 4).toIntArray())
        result.forEach {
            println(it.toString() + "\n")
        }
    }

    fun runningSum(nums: IntArray): IntArray {
        val resultNums = arrayListOf(nums.first())
        nums.forEachIndexed { position, value ->
            if (position != 0) {
                resultNums.add(nums[position] + resultNums[position - 1])
            }
        }
        return resultNums.toIntArray()
    }
}
