import Foundation

func solution(_ n:Int) -> [Int] {
    var arr:[Int]=[]
    for i in 0...n{
        if i%2==1 {
            arr.append(i)
        }
    }
    return arr
}