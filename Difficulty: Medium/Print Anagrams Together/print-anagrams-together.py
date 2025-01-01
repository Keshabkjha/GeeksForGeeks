#User function Template for python3


class Solution:
    def anagrams(self, arr):
        d={}
        for s in arr:
            so="".join(sorted(s))
            if so in d.keys(): d[so].append(s)
            else: d[so]=[s]
        return d.values()



#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__':
    t = int(input())
    for tcs in range(t):
        words = input().split()

        ob = Solution()
        ans = ob.anagrams(words)

        for grp in sorted(ans):
            for word in grp:
                print(word, end=' ')
            print()

        print("~")

# } Driver Code Ends