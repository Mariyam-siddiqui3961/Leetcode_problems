//---------find x-sum of all k-long subarrayII----------
import java.util.*;
import java.util.function.Consumer;

class Solution {

    static class Node implements Comparable<Node> {
        int val;
        int freq;
        Node(int v, int f) { val = v; freq = f; }