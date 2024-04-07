import Foundation

func solution(_ n:Int) -> Int {
    var arr:Array<Int> = []
    for i in 1...n {
        if n%i==0 {
            arr.append(i)
        }
    }
    return arr.count
}