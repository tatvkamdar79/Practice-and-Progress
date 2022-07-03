/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    Solution()
    {
        ios_base::sync_with_stdio(false);cin.tie(nullptr);cout.tie(nullptr);
    }
    vector<int> ans;
    int dfs(TreeNode* node, TreeNode* target, int k) {
        if(node == NULL)
            return -1;
        if(node == target) {
            subtreeAdd(node, k, 0);
            return 1;
        }
        int left = dfs(node->left, target, k), right = dfs(node->right, target, k);
        if(left == k) {
            ans.push_back(node->val);
            return left+1;
        }else if(left < k && left != -1) {
            subtreeAdd(node->right, k, left+1);
            return left+1;
        }else if(right == k) {
            ans.push_back(node->val);
            return right+1;
        }else if(right < k && right != -1) {
            subtreeAdd(node->left, k, right+1);
            return right+1;
        }else {
            return -1;
        }
    }
    void subtreeAdd(TreeNode* node, int k, int dist) {
        if(node == NULL)
            return;        
        if(dist == k)
            ans.push_back(node->val);
        else {
            subtreeAdd(node->left, k, dist+1);
            subtreeAdd(node->right, k, dist+1);
        }
    }
    vector<int> distanceK(TreeNode* root, TreeNode* target, int k) {
        dfs(root, target, k);
        return ans;
    }
};