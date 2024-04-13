import Foundation

func solution(_ numbers:[Int]) -> [Int] {
    var arr:[Int]=[]
    for i in numbers {
        arr.append(i*2)
    }
    return arr
}