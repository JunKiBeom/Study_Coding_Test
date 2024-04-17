import Foundation

func solution(_ cipher:String, _ code:Int) -> String {
    var answer = ""
    var cnt = 0
    for i in cipher {
        if cnt % code == code-1 {
            answer += String(i)
        }
        cnt+=1
    }
            
    return answer
}