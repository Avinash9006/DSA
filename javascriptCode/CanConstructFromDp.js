function canConstruct(targetWord,wordBank,memo={}){
    if(targetWord == '') return true
    if(wordBank.length == 0) return false
    if(memo[targetWord]) return memo[targetWord]
    let res = false
    for(let i=0;i<wordBank.length;i++){
        let  c= removePrefix(targetWord,wordBank[i])
        if(c!=null){
        res = canConstruct(c,wordBank.filter((item,index)=>index!=i)) || res
        memo[targetWord] = res
        }
    }
    return memo[targetWord]
}

function removePrefix(targetWord,current){
    if(current.length > targetWord.length) return null
    let str = "",i=0
    for(i=0;i<current.length;i++){
        if(targetWord[i] != current[i]){
            return null
        }
    }
    for(let j = i;j<targetWord.length;j++){
        str = str + targetWord[j]
    }
    return str
}
console.log(canConstruct("abcd",["cde","ab","cde","ce","d","bc" , 'a','d']))