package lc_100

class Solution {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if (p == null && q == null) return true
        if (p?.`val` != q?.`val`) return false

        return isSameTree(p?.left, q?.left) && isSameTree(p?.right, q?.right)
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}
