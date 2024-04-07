import Foundation

func solution(_ array:[Int], _ n:Int) -> Int {
    var answer: Int = 0
    for i in array {
        if i==n {
            answer+=1
        }
    }
    return answer
}