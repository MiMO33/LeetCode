/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */


bool helper(struct TreeNode* root , int lower, int higher) {
    if(!root) return true;
    
    if(root->left && root->val  <= root->left->val) return false;
    if(root->right && root->val  >= root->right->val) return false;
    
    if(lower != NULL && root->val <= lower) return false;
    if(higher != NULL && root->val >= higher) return false;
    
    return helper(root->left ,lower ,root->val ) && helper(root->right , root->val, higher);
}

bool isValidBST(struct TreeNode *root){
    return helper(root, NULL, NULL);
}