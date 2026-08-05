bool isVowel(char ch){
    if(ch=='a' ||ch=='A' ||ch=='e'||ch=='E'||ch=='i' ||ch=='I' ||ch=='o'||ch=='O'||
    ch=='u'||ch=='U')
        return true;
    return false;
}
char* reverseVowels(char* s) {
    int st = 0;
    int end = strlen(s)-1;
    while(st<end){
        while(st<end && !isVowel(s[st])){
            st++;
        }
        while(st<end && !isVowel(s[end])){
            end--;
        }
        char temp = s[st];
        s[st] = s[end];
        s[end] = temp;
        st++;
        end--;
    }
    return s;
}