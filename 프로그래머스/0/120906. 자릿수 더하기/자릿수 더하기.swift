import Foundation

func solution(_ n:Int) -> Int {
    var tmp = 0
    for i in String(n){
        tmp+=i.wholeNumberValue!
    }
    return tmp
}