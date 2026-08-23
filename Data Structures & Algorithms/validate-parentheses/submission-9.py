class Solution:
    def isValid(self, s: str) -> bool:
        a=[]
        for i in s:
            if(i=='{'):
                a.append('}')
            elif(i=='['):
                a.append(']')
            elif(i=='('):
                a.append(')')
            elif(a==[] or i!=a.pop()):
                return False
        if(len(a)==0):
            return True
        else:
            return False