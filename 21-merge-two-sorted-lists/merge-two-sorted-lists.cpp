/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
       ListNode *a = new ListNode(0);
        ListNode *b = a;

        while (list1 && list2) {
            if (list1->val <= list2->val) {
                b->next = list1;
                list1 = list1->next;
            } else {
                b->next = list2;
                list2 = list2->next;
            }
            b = b->next;
        }
        b->next = list1 ? list1 : list2;
        return a->next;

        


    }
};